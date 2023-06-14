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
	@Column(name = "supported_memory")
	private String supported_memory;
	// Constructors, getters, and setters

	public Motherboard(Long id, String componentType, String partNumber, String name, String socket, Double price, String supported_memory) {
		this.id = id;
		this.componentType = componentType;
		this.partNumber = partNumber;
		this.name = name;
		this.socket = socket;
		this.price = price;
		this.supported_memory = supported_memory;
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

	public String getSupported_memory() {
		return supported_memory;
	}

	public void setSupported_memory(String supported_memory) {
		this.supported_memory = supported_memory;
	}

	@Override
	public String toString() {
		return "Motherboard{" +
				"id=" + id +
				", componentType='" + componentType + '\'' +
				", partNumber='" + partNumber + '\'' +
				", name='" + name + '\'' +
				", socket='" + socket + '\'' +
				", price=" + price + '\'' +
				", Supported Memory='" + supported_memory +
				'}';
	}
}
