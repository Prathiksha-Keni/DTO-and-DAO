package com.xworkz.MicroOven.DTO;

public class MicroOvenDto {

	private String brand;
	private String color;
	private int modelNo;
	private int price;
	public MicroOvenDto(String brand, String color, int modelNo, int price) {
		System.out.println("DTO created");;
		this.brand = brand;
		this.color = color;
		this.modelNo = modelNo;
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
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
