package com.ryan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long userId;
	
	@Column(name="emulation_id")
	private String emulationId;
	
	@Column(name="login_id")
	private String loginId;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getEmulationId() {
		return emulationId;
	}
	public void setEmulationId(String emulationId) {
		this.emulationId = emulationId;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", emulationId=" + emulationId
				+ ", loginId=" + loginId + "]";
	}
}
