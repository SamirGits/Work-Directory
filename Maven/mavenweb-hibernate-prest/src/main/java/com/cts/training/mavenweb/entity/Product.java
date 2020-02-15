package com.cts.training.mavenweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/*@Getter
@Setter
@AllArgsConstructor
@ToString*/

// to convert into JPA entity
@Entity // Registers the class as entity
// Define the mappings
@Table(name = "product")
public class Product {

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // unique key and Auti Increment
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "category")
	private String category;
	
	@Column
	private Integer cost;
	
	public Product() {}

	
	public Product(Integer id, String name, String category,Integer cost) {
		
		this.id = id;
		this.name = name;
		this.category = category;
		this.cost=cost;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public Integer getCost() {
		return cost;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ",+ cost=" + cost +"]";
	}
	
	
	
}
