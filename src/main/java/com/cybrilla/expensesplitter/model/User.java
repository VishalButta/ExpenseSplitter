package com.cybrilla.expensesplitter.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int userId;
	private String name;
	private String groupId;
	
	public User(int userId, String name, String groupId) {
		super();
		this.userId = userId;
		this.name = name;
		this.groupId = groupId;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public User() {
		super();
	}

}
