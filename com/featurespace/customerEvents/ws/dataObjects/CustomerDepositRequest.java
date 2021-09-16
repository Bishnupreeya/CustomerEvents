package com.featurespace.customerEvents.ws.dataObjects;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerDepositRequest {
	
	private EventType eventType;
	private String depositId;
	private String customerId;
	@JsonProperty("time")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
	private Date depositTime;
	@JsonProperty("amount")
	private double depositAmount;
	
	//{ "eventType" : "deposit", "depositId" : "def", "customerId" :"Cust123", "time" : "2021-01-01T14:00:00Z", "amount" : 100 }
	public EventType getEventType() {
		return eventType;
	}
	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}
	public String getDepositId() {
		return depositId;
	}
	public void setDepositId(String depositId) {
		this.depositId = depositId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public Date getDepositTime() {
		return depositTime;
	}
	public void setDepositTime(Date depositTime) {
		this.depositTime = depositTime;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	@Override
	public String toString() {
		return "CustomerDepositRequest [eventType=" + eventType + ", depositId=" + depositId + ", customerId="
				+ customerId + ", depositTime=" + depositTime + ", depositAmount=" + depositAmount + "]";
	}

}
