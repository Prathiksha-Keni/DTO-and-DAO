package com.xworkz.Clock.DTO;

public class ClockDto {

	private String brand;
	private String color;
	private String shape;
	private int price;
	public ClockDto(String brand, String color, String shape, int price) {
		System.out.println("DTO created");
		this.brand = brand;
		this.color = color;
		this.shape = shape;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
