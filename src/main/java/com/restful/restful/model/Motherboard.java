package com.restful.restful.model;

import jakarta.persistence.*;

@Entity
@Table(name = "motherboard")
public class Motherboard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "component_type")
	private String componentType;

	@Column(name = "part_number")
	private String partNumber;

	@Column(name = "name")
	private String name;

	@Column(name = "socket")
	private String socket;

	@Column(name = "price")
	private Double price;

	// Constructors, getters, and setters

	public Motherboard(Long id, String componentType, String partNumber, String name, String socket, Double price) {
		this.id = id;
		this.componentType = componentType;
		this.partNumber = partNumber;
		this.name = name;
		this.socket = socket;
		this.price = price;
	}

	public Motherboard() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComponentType() {
		return componentType;
	}

	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSocket() {
		return socket;
	}

	public void setSocket(String socket) {
		this.socket = socket;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Motherboard{" +
				"id=" + id +
				", componentType='" + componentType + '\'' +
				", partNumber='" + partNumber + '\'' +
				", name='" + name + '\'' +
				", socket='" + socket + '\'' +
				", price=" + price +
				'}';
	}
}
