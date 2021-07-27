package com.natwest.fruitexercise.persistence.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fruit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;

	@Column
	private String type;

	@Column
	private String colour;

	@Column
	private double price;

	public Fruit() {
		super();
		}

	public Fruit(Long id, String name, String type, String colour, double price) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.colour = colour;
		this.price = price;
	}

	public Fruit(String name, String type, String colour, double price) {
		super();
		this.name = name;
		this.type = type;
		this.colour = colour;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

//	public void setId(Long id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [id=" + id + ", name=" + name + ", type=" + type + ", colour=" + colour + ", price=" + price
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(colour, id, name, price, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(colour, other.colour) && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(type, other.type);
	}
	
	
	

}
