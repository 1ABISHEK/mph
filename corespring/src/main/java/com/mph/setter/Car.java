package com.mph.setter;

import org.springframework.beans.factory.annotation.Value;

public class Car {
    @Value("BMW")
	private String name;
    @Value("M3")
	private String model;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + "]";
	}
	
}
