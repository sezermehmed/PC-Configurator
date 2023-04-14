package com.restful.restful.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "cpu")
public class Cpu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "componenttype")
    private String componentType;

    @Column(name = "partnumber")
    private String partNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "supportedmemory")
    private String supportedMemory;

    @Column(name = "socket")
    private String socket;

    @Column(name = "price")
    private BigDecimal price;

    // Getters and setters...

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getSupportedMemory() {
        return supportedMemory;
    }

    public void setSupportedMemory(String supportedMemory) {
        this.supportedMemory = supportedMemory;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
