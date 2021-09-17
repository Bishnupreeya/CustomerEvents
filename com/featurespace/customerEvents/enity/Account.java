package com.featurespace.customerEvents.enity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.featurespace.customerEvents.ws.dataObjects.EventType;
@Entity
//@Table(name="account")
public class Account {
	@Id
	// @Column(name = "customer_id", nullable = false)
	private String customerId;
	// @Column(name = "amount", nullable = false)
	private Double amount;
	// @Column(name = "event_type", nullable = false)
	private EventType eventType;

	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public EventType getEventType() {
		return eventType;
	}
	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}
	@Override
	public String toString() {
		return "Account [customerId=" + customerId + ", amount=" + amount + ", eventType=" + eventType + "]";
	}
	

}
