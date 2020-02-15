package com.cts.training.mavenweb.entity;

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

@Entity
@Table

public class Media {
	
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public MimeType getMediaupload() {
		return mediaupload;
	}
	public void setMediaupload(MimeType mediaupload) {
		this.mediaupload = mediaupload;
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public String getPosterfileurl() {
		return posterfileurl;
	}
	public void setPosterfileurl(String posterfileurl) {
		this.posterfileurl = posterfileurl;
	}
	public String getFileurl() {
		return fileurl;
	}
	public void setFileurl(String fileurl) {
		this.fileurl = fileurl;
	}
	public boolean isHide() {
		return hide;
	}
	public void setHide(boolean hide) {
		this.hide = hide;
	}
	public LocalDate getCreatedon() {
		return createdon;
	}
	public void setCreatedon(LocalDate createdon) {
		this.createdon = createdon;
	}
	public LocalDate getUpdatedon() {
		return updatedon;
	}
	public void setUpdatedon(LocalDate updatedon) {
		this.updatedon = updatedon;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	
	
	@Override
	public String toString() {
		return "Media [id=" + id + ", userid=" + userid + ", title=" + title + ", description=" + description
				+ ", mediaupload=" + mediaupload + ", size=" + size + ", posterfileurl=" + posterfileurl + ", fileurl="
				+ fileurl + ", hide=" + hide + ", createdon=" + createdon + ", updatedon=" + updatedon + ", tags="
				+ tags + "]";
	}
}
