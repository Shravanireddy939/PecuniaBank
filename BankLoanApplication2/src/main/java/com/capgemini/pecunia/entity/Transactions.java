package com.capgemini.pecunia.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Transactions") 
public class Transactions {
	@Id
	@Column(length=8)
	private int transId;
	@Column(length=20)
	private String transType;
	@Column(length=8)
	private Double transAmount;
	@Column(length = 20)
	private Date transDate;
	@Column(length=12)
	private String transFrom;
	@Column(length=12)
	private String transTo;
	@Column(length = 12)
	private String accountId;
	
	
	//getters and setters

	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public Double getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(Double transAmount) {
		this.transAmount = transAmount;
	}
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	public String getTransFrom() {
		return transFrom;
	}
	public void setTransFrom(String transFrom) {
		this.transFrom = transFrom;
	}
	public String getTransTo() {
		return transTo;
	}
	public void setTransTo(String transTo) {
		this.transTo = transTo;
	}
	public int getTransId() {
		return transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Transactions() {
		super();	
	}
	
	
	
	
}

