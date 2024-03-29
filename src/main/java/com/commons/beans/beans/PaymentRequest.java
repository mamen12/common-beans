package com.commons.beans.beans;


import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class PaymentRequest extends BaseRequest {

	@JsonProperty(value ="id_user")
	private String idUser;
	
	@JsonProperty(value = "id_payment")
	private String idPayment;
	
	@JsonProperty(value = "acct_no")
	private String accountNo;
	
	@JsonProperty(value ="effective_date")
	private Date effectiveDate;
	
	@JsonProperty(value = "amount")
	private BigDecimal amount;
	
	@JsonProperty(value= "tran_code")
	private String tranCode;
	
	
	public String getIdPayment() {
		return idPayment;
	}

	public void setIdPayment(String idPayment) {
		this.idPayment = idPayment;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getTranCode() {
		return tranCode;
	}

	public void setTranCode(String tranCode) {
		this.tranCode = tranCode;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	
}
