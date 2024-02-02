package com.commons.beans.beans.utils;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.lang3.StringUtils;

public final class RandomNumberUtils {

	
	public static String generate(Long random) {
		Random rand =new Random();
		BigInteger beforeNumber = new BigInteger("100000000000");
		
		Long randomNumber = rand.nextLong(beforeNumber.longValue(), random);
		
		if (randomNumber.toString().length() < 13) {
			String format13 = StringUtils.leftPad(String.valueOf(randomNumber), 13, "0");
			return format13;
		}else {
			return String.valueOf(randomNumber);
		}
	}
	
	
	public static long getCurrentTime() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	    String specifiedDateString = sdf.format(new Date());
	    long actualTimestamp = sdf.parse(specifiedDateString).getTime();
	    return actualTimestamp;
	}
}
