package com.commons.beans.beans;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class PaymentResponse {

	@JsonProperty(value = "id_payment")
	private String idPayment;
	
	@JsonProperty(value = "acct_no")
	private String accountNo;
	
	@JsonProperty(value ="effective_date")
	private Date effectiveDate;
	
	@JsonProperty(value = "amount")
	private BigDecimal amount;
	
	@JsonProperty(value= "payment_desc")
	private String paymentDesc;
	
	@JsonProperty(value = "name_user")
	private String name;

	@JsonProperty(value = "status")
	private String statusTransaction;
	
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

	public String getPaymentDesc() {
		return paymentDesc;
	}

	public void setPaymentDesc(String paymentDesc) {
		this.paymentDesc = paymentDesc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatusTransaction() {
		return statusTransaction;
	}

	public void setStatusTransaction(String statusTransaction) {
		this.statusTransaction = statusTransaction;
	}
	
	
}
