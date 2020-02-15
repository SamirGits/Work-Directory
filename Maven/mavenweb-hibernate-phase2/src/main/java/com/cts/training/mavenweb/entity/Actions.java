package com.cts.training.mavenweb.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table
public class Actions {
	
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // primary key and Auto Increment
	private Integer id;
	
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // foreign key from media and Auti Increment
	private Integer mediaid;
	
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // foreign key from users and Auti Increment
	private Integer userid;
	
	@Column
	private boolean status;
	
	@CreationTimestamp
	@Column
	private LocalDate createdon;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMediaid() {
		return mediaid;
	}
	public void setMediaid(Integer mediaid) {
		this.mediaid = mediaid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public LocalDate getCreatedon() {
		return createdon;
	}
	public void setCreatedon(LocalDate createdon) {
		this.createdon = createdon;
	}
	
	
	@Override
	public String toString() {
		return "Actions [id=" + id + ", mediaid=" + mediaid + ", userid=" + userid + ", status=" + status
				+ ", createdon=" + createdon + "]";
	}
	
	 
}
