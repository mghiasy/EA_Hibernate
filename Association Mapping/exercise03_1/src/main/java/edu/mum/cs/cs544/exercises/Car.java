package edu.mum.cs.cs544.exercises;

import javax.persistence.*;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;
	@Column(name = "Brand",nullable = false,length = 255)
	private String brand;
	@Column(name = "Year",nullable = false,length = 10)
	private String year;
	@Column(name = "Price",nullable = false)
	private double price;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="owner_id")
	private Owner owner;
	public Car() {
	}

	public Car(String brand, String year, double price,Owner owner) {
		this.brand = brand;
		this.year = year;
		this.price = price;
		this.owner=owner;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getYear() {
		return year;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

}
