package com.cts.training.mavenweb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Blockeduser {
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // foreign key and Auti Increment
	private Integer userid;
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // foreign key,unique key and Auti Increment
	private Integer blockeduserid;
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getBlockeduserid() {
		return blockeduserid;
	}
	public void setBlockeduserid(Integer blockeduserid) {
		this.blockeduserid = blockeduserid;
	}

	@Override
	public String toString() {
		return "Blockeduser [userid=" + userid + ", blockeduserid=" + blockeduserid + "]";
	}
}
