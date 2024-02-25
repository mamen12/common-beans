package com.commons.beans.utils;

import java.io.IOException;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import com.commons.beans.beans.PayloadProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class HttpLoggingFilter  extends OncePerRequestFilter {

    private static final Logger logger = LoggerFactory.getLogger(HttpLoggingFilter.class);

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		ContentCachingRequestWrapper rqWrapper = new ContentCachingRequestWrapper(request);
		ContentCachingResponseWrapper rsWrapper = new ContentCachingResponseWrapper(response);
		
		filterChain.doFilter(rqWrapper, rsWrapper);
		
		
		String requestBody = getStringValue(rqWrapper.getContentAsByteArray(), request.getCharacterEncoding());
		String responseBody = getStringValue(rsWrapper.getContentAsByteArray(), request.getCharacterEncoding());
		logReqRes(requestBody, responseBody, rqWrapper.getRequestURI(), rqWrapper.getMethod()); 
		rsWrapper.copyBodyToResponse();
	}

	private String getStringValue(byte[] contentAsByteArray, String characterEncoding) {
		try {
			return new String(contentAsByteArray, characterEncoding);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	@Async
	private void logReqRes(String request, String response, String uri, String httpMethod) throws JsonMappingException, JsonProcessingException {
		PayloadProperties payload = new PayloadProperties();
		JsonNode node = new ObjectMapper().readTree(request);
		payload.setIdRequest(node.get("request_header").get("request_id").asText());
		payload.setPayloadRequest(request);
		payload.setPayloadResponse(response);
		payload.setUrl(uri);
		payload.setTimeCreated(new Date());
		
		logger.info(new ObjectMapper().writeValueAsString(payload));
	}
    

    
}
