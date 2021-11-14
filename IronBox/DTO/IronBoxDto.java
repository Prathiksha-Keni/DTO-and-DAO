package com.xworkz.IronBox.DTO;

public class IronBoxDto {

	private String brand;
	private int price;
	private int watt;
	public IronBoxDto(String brand, int price, int watt) {
		System.out.println("DTO created");
		this.brand = brand;
		this.price = price;
		this.watt = watt;
		
		
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
	public int getWatt() {
		return watt;
	}
	public void setWatt(int watt) {
		this.watt = watt;
	}
	
	
}
