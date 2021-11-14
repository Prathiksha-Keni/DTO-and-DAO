package com.xworkz.Inverter.DAO;

import com.xworkz.Inverter.DTO.InverterDto;

public class InverterDao {

	InverterDto inverter[]=new InverterDto[4];
	int index=0;
	public InverterDao() {
		System.out.println("DAO created");
	}
	public void saveDto(InverterDto obj) {
		System.out.println("Inside save method");
		inverter[index]=obj;
		index++;
	}
	
	public void displayAll() {
		for (int i = 0; i < inverter.length; i++) {
			System.out.println(inverter[i].getBrand());
			System.out.println(inverter[i].getVolt());
			System.out.println(inverter[i].getPrice());
			System.out.println("--------------------");
		}
	}
	public void displayByBrandName(String brandName) {
		for (int i = 0; i < inverter.length; i++) {
			if(inverter[i].getBrand().equals(brandName)) {
				System.out.println(inverter[i].getBrand());
				System.out.println(inverter[i].getVolt());
				System.out.println(inverter[i].getPrice());
			}
		}
	}
	
	public void updateByBrand(String brand,int newPrice) {
		for (int i = 0; i < inverter.length; i++) {
			if (inverter[i].getBrand().equals(brand)) {
				inverter[i].setPrice(newPrice);
			}
		}
	}
	public void deleteByBrand(String brand) {
		for (int i = 0; i < inverter.length; i++) {
			if (inverter[i].getBrand().equals(brand)) {
				inverter[i]=null;
			}
		}
	}
}
