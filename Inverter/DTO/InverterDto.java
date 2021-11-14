package com.xworkz.Inverter.DTO;

public class InverterDto {

	private String brand;
	private int price;
	private int volt;
	public InverterDto(String brand, int price, int volt) {
		System.out.println("DTO created");
		this.brand = brand;
		this.price = price;
		this.volt = volt;
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
	public int getVolt() {
		return volt;
	}
	public void setVolt(int volt) {
		this.volt = volt;
	}
	
	
	
}
