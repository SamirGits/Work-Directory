package com.cts.training.mavenweb.entity;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.util.MimeType;



/*@Getter
@Setter
@AllArgsConstructor
@ToString*/

// to convert into JPA entity
@Entity // Registers the class as entity
// Define the mappings
@Table(name = "user")
public class Users {

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // unique key and Auti Increment
	private Integer id;
	
	@Column(name = "username")
	private String username;
	@Column
	private String password;
	@Column
	private String email;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private Date dob;
	
	@Column
	private MimeType profilepic;
	
	@CreationTimestamp
	@Column 
	private LocalDate createdon;
	@UpdateTimestamp
	@Column
	private LocalDate updatedon;
	@Column
	private boolean enabled;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public MimeType getProfilepic() {
		return profilepic;
	}
	public void setProfilepic(MimeType profilepic) {
		this.profilepic = profilepic;
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
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	
	
	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", dob=" + dob + ", profilepic=" + profilepic
				+ ", createdon=" + createdon + ", updatedon=" + updatedon + ", enabled=" + enabled + "]";
	}
	
	
	
}
