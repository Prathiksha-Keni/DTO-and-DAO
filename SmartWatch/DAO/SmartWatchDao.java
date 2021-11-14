package com.xworkz.SmartWatch.DAO;

import com.xworkz.SmartWatch.DTO.SmartWatchDto;

public class SmartWatchDao {

	SmartWatchDto smartwatch[]=new SmartWatchDto[5];
	int index=0;
	public SmartWatchDao() {
		System.out.println("DAO created");
	}
	
	public void saveDto(SmartWatchDto obj) {
		System.out.println("Inside save method");
		smartwatch[index]=obj;
		index++;
	}
	
	public void displayAll() {
		for (int i = 0; i < smartwatch.length; i++) {
			System.out.println(smartwatch[i].getBrand());
			System.out.println(smartwatch[i].getColor());
			System.out.println(smartwatch[i].getSerialNo());
			System.out.println(smartwatch[i].getPrice());
			System.out.println("--------------------");
		}
	}
	
	public void displayByBrandName(String brandName) {
		for (int i = 0; i < smartwatch.length; i++) {
			if(smartwatch[i].getBrand().equals(brandName)) {
				System.out.println(smartwatch[i].getBrand());
				System.out.println(smartwatch[i].getColor());
				System.out.println(smartwatch[i].getSerialNo());
				System.out.println(smartwatch[i].getPrice());
			}
		}
	}
	
	public void updateByBrand(String brand,int newPrice) {
		for (int i = 0; i < smartwatch.length; i++) {
			if (smartwatch[i].getBrand().equals(brand)) {
				smartwatch[i].setPrice(newPrice);
			}
		}
	}
	
	public void updateByBrandByBrandName(String brand,String newBrandName) {
		for (int i = 0; i < smartwatch.length; i++) {
			if (smartwatch[i].getBrand().equals(brand)) {
				smartwatch[i].setBrand(newBrandName);
			}
	}
	}

	public void deleteBySerialNo(int serialNo) {
		for (int i = 0; i < smartwatch.length; i++) {
			if (smartwatch[i].getSerialNo()==serialNo) {
				smartwatch[i]=null;
			}
		}
	}
	
}
