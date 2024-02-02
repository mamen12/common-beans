package com.commons.beans.beans;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class WalletRequest extends BaseRequest{

	@JsonProperty(value = "")
	private String idWallet;
	
	@JsonProperty(value = "account_no")
	private String accountNo;
	
	private BigDecimal ballance;

	public String getIdWallet() {
		return idWallet;
	}
	public void setIdWallet(String idWallet) {
		this.idWallet = idWallet;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public BigDecimal getBallance() {
		return ballance;
	}
	public void setBallance(BigDecimal ballance) {
		this.ballance = ballance;
	}
	
}
