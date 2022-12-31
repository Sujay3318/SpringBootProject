package com.example.Project;

import java.util.HashMap;
import java.util.List;

@jakarta.persistence.Entity
public class Product {

	@jakarta.persistence.Id
	@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	public int[] getData() {
		return data;
	}

	public void setData(int[] data) {
		this.data = data;
	}

	private int price;
	private List<String> city;
private int[] data;
	
	public List<String> getCity() {
		return city;
	}

	public void setCity(List<String> city) {
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
