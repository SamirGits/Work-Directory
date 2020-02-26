package com.cts.training.casestudy.mediaservice.entity;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.util.MimeType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@ToString
@Entity
@Table

public class Media {
	
	public Media() {
		// TODO Auto-generated constructor stub
	}
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // unique key and Auti Increment
	private Integer id;
	
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // unique key and Auti Increment
	private Integer userid;
	
	@Column 
	private String title;
	@Column 
	private String description;
	@Column
	private MimeType mediaupload;
	@Column
	private Size size;
	@Column 
	private String posterfileurl;
	@Column 
	private String fileurl;
	@Column
	private boolean hide;
	
	@CreationTimestamp
	@Column
	private LocalDate createdon;
	
	@UpdateTimestamp
	@Column 
	private LocalDate updatedon;
	@Column
	private String tags;
	
	
}
