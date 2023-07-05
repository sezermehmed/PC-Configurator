package com.restful.restful.model;

import jakarta.persistence.*;

@Entity
@Table(name = "motherboard")
public class Motherboard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;


	@Column(name = "name")
	private String name;

	@Column(name = "price")
	private Double price;
	@Column(name = "supported_memory")
	private String supported_memory;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice() {
		this.price = price;
	}

	public String getSupported_memory() {
		return supported_memory;
	}

	public void setSupported_memory(String supported_memory) {
		this.supported_memory = supported_memory;
	}

}
