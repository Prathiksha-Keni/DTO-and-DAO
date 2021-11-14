package com.xworkz.SmartWatch.DTO;

public class SmartWatchDto
{
	private int serialNo;
	private String color;
	private String brand;
	private int price;
	public SmartWatchDto(int serialNo, String color, String brand, int price) {
		System.out.println("DTO created");
		this.serialNo = serialNo;
		this.color = color;
		this.brand = brand;
		this.price = price;
	}
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
