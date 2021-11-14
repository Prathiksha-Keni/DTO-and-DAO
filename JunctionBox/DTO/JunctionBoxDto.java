package com.xworkz.JunctionBox.DTO;

public class JunctionBoxDto {

	
	private String brand;
	private int price;
	private int NoOfSwitch;
	public JunctionBoxDto(String brand, int price, int noOfSwitch) {
		System.out.println("DTO created");
		this.brand = brand;
		this.price = price;
		NoOfSwitch = noOfSwitch;
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
	public int getNoOfSwitch() {
		return NoOfSwitch;
	}
	public void setNoOfSwitch(int noOfSwitch) {
		NoOfSwitch = noOfSwitch;
	}
	
	
	
	
}
