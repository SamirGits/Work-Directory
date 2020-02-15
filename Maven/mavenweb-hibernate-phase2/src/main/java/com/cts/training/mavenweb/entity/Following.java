package com.cts.training.mavenweb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Following {
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getFollowerid() {
		return followerid;
	}
	public void setFollowerid(Integer followerid) {
		this.followerid = followerid;
	}
	
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // foreign  key and Auto Increment
	private Integer userid;
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // unique key and Auti Increment
	private Integer followerid;
	
	@Override
	public String toString() {
		return "Following [userid=" + userid + ", followerid=" + followerid + "]";
	}

}
