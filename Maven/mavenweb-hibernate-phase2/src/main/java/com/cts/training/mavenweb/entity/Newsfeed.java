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
public class Newsfeed {
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // primary key and Auti Increment
	private Integer id;
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // foreign key and Auti Increment
	private Integer userid;
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // foreign key and Auti Increment
	private Integer mediaid;
	@Column
	private  String feed;
	
	@CreationTimestamp
	@Column
	private LocalDate createdon;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getMediaid() {
		return mediaid;
	}
	public void setMediaid(Integer mediaid) {
		this.mediaid = mediaid;
	}
	public String getFeed() {
		return feed;
	}
	public void setFeed(String feed) {
		this.feed = feed;
	}
	public LocalDate getCreatedon() {
		return createdon;
	}
	public void setCreatedon(LocalDate createdon) {
		this.createdon = createdon;
	}
	@Override
	public String toString() {
		return "Newsfeed [id=" + id + ", userid=" + userid + ", mediaid=" + mediaid + ", feed=" + feed + ", createdon="
				+ createdon + "]";
	}
}

