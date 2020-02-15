package com.cts.training.mavenweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Authorities {
@Column
private String username;
@Column
private String authority;

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getAuthority() {
	return authority;
}
public void setAuthority(String authority) {
	this.authority = authority;
}
@Override
public String toString() {
	return "Authorities [username=" + username + ", authority=" + authority + "]";
}
}
