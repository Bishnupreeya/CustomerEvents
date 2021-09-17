package com.featurespace.customerEvents.enity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
//@Table(name="marchant")
public class Marchant {
	@Id
	//@Column(name = "trasanction_id", unique=true, nullable = false)
	private String trasanctionId;
	//@Column(name = "customer_id", nullable = false)
	private String customerId;
	//@Column(name = "marchant_id", nullable = false)
	private String marchantId;
	//@Column(name = "trasanction_time", nullable = false)
	private Date time;
	//@Column(name = "trasanction_amount", nullable = false)
	private Double amount;
	public String getTrasanctionId() {
		return trasanctionId;
	}
	public void setTrasanctionId(String trasanctionId) {
		this.trasanctionId = trasanctionId;
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
		return "Marchant [trasanctionId=" + trasanctionId + ", customerid=" + customerId + ", marchantid=" + marchantId
				+ ", time=" + time + ", amount=" + amount + "]";
	}

}
