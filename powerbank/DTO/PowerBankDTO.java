package com.xworkz.powerbank.DTO;

public class PowerBankDTO 
{

	private String brand;
	private String color;
	private int price;
	private int mah;
	
	public PowerBankDTO(String brand, String color, int price, int mah) {
		System.out.println("Inside PowerBank DTO constructor");
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.mah = mah;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMah() {
		return mah;
	}

	public void setMah(int mah) {
		this.mah = mah;
	}
}
