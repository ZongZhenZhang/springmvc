package com.zhang.springmvc.domain.security;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;

public class User {

	private int id;

	private String username;

	private String password;

	private int status;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date lastLoginTime;

	private String createUser;

	private String mail;

	private Set<Role> roles;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", status=" + status + ", createTime="
				+ createTime + ", lastLoginTime=" + lastLoginTime + ", createUser=" + createUser + ", mail=" + mail
				+ ", roles=" + roles + "]";
	}

}
