package com.xworkz.Clock.DAO;

import com.xworkz.Clock.DTO.ClockDto;

public class ClockDao {
	
	ClockDto clock[]=new ClockDto[5];
	int index=0;
	public ClockDao() {
		System.out.println("DAO created");
	}
	public void saveDto(ClockDto obj) {
		System.out.println("Inside save method");
		clock[index]=obj;
		index++;
	}
	
	public void displayAll() {
		for (int i = 0; i < clock.length; i++) {
			System.out.println(clock[i].getBrand());
			System.out.println(clock[i].getColor());
			System.out.println(clock[i].getShape());
			System.out.println(clock[i].getPrice());
			System.out.println("--------------------");
		}
	}
	
	public void displayByBrandName(String brandName) {
		for (int i = 0; i < clock.length; i++) {
			if(clock[i].getBrand().equals(brandName)) {
				System.out.println(clock[i].getBrand());
				System.out.println(clock[i].getColor());
				System.out.println(clock[i].getShape());
				System.out.println(clock[i].getPrice());
			}
		}
	}
	
	public void updateByBrand(String brand,int newPrice) {
		for (int i = 0; i < clock.length; i++) {
			if (clock[i].getBrand().equals(brand)) {
				clock[i].setPrice(newPrice);
			}
		}
	}
	
	public void deleteByBrand(String brand) {
		for (int i = 0; i < clock.length; i++) {
			if (clock[i].getBrand().equals(brand)) {
				clock[i]=null;
			}
		}
	}
	
	
}
