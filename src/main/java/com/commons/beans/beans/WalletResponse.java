package com.commons.beans.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class WalletResponse{
	
	@JsonProperty(value = "insufficient")
	private String isInsufficient;

	@JsonProperty(value = "reduced")
	private Boolean reduced;
	
	public String getIsInsufficient() {
		return isInsufficient;
	}

	public void setIsInsufficient(String isInsufficient) {
		this.isInsufficient = isInsufficient;
	}

	public Boolean getReduced() {
		return reduced;
	}

	public void setReduced(Boolean reduced) {
		this.reduced = reduced;
	}
	
}
