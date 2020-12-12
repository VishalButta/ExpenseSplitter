package com.cybrilla.expensesplitter.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Item {
	@Id
	private String name;
	private int amount;
	private String paid_by;
	private String split_by;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Item() {
		super();
	}
	public String getPaid_by() {
		return paid_by;
	}
	public void setPaid_by(String paid_by) {
		this.paid_by = paid_by;
	}
	public Item(String name, int amount, String paid_by, String split_by) {
		super();
		this.name = name;
		this.amount = amount;
		this.paid_by = paid_by;
		this.split_by = split_by;
	}
	public String getSplit_by() {
		return split_by;
	}
	public void setSplit_by(String split_by) {
		this.split_by = split_by;
	}

}
