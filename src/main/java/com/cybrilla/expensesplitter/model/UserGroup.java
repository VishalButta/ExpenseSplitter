package com.cybrilla.expensesplitter.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserGroup {
	@Id
	private int groupId;
	private String groupName;
	private List<User> userList;

	public UserGroup() {
		super();
	}

	public UserGroup(int groupId, String groupName, List<User> userList) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.userList = userList;
	}

	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
}
