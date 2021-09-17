package com.featurespace.customerEvents.enity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
@Entity
//@Table(name="customer", uniqueConstraints = {
//        @UniqueConstraint(name = "uk_deposit_id", columnNames = {"deposit_id"})}
//        )
public class Customer {
	
    
	//@Column(name = "customerId", nullable = false)
	private String customerId;
	@Id
	//@Column(name = "depositId",unique=true, nullable = false)
	private String depositId;//unique
	//@Column(name = "time", nullable = false)
	private Date time;
	//@Column(name = "amount", nullable = false)
	private Double amount;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getDepositId() {
		return depositId;
	}
	public void setDepositId(String depositId) {
		this.depositId = depositId;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", depositId=" + depositId + ", amount=" + amount + "]";
	}
	
}
