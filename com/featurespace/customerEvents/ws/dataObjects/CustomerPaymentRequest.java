package com.featurespace.customerEvents.ws.dataObjects;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CustomerPaymentRequest {
	private EventType eventType;
	private String transactionId;
	private String customerId;
	private String marchantId;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
	private Date transactionTime;
	private double amount;
	public EventType getEventType() {
		return eventType;
	}
	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getMarchantId() {
		return marchantId;
	}
	public void setMarchantId(String marchantId) {
		this.marchantId = marchantId;
	}
	public Date getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(Date transactionTime) {
		this.transactionTime = transactionTime;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "CustomerPaymentRequest [eventType=" + eventType + ", transactionId=" + transactionId + ", customerId="
				+ customerId + ", marchantId=" + marchantId + ", transactionTime=" + transactionTime + ", amount="
				+ amount + "]";
	}
	
	
	

}
