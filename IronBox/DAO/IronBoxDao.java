package com.xworkz.IronBox.DAO;

import com.xworkz.IronBox.DTO.IronBoxDto;

public class IronBoxDao {

	IronBoxDto iron[]=new IronBoxDto[4];
	int index=0;
	public IronBoxDao() {
		System.out.println("DAO created");
	}
	public void saveDto(IronBoxDto obj) {
		System.out.println("Inside save method");
		iron[index]=obj;
		index++;
	}
	
	public void displayAll() {
		for (int i = 0; i < iron.length; i++) {
			System.out.println(iron[i].getBrand());
			System.out.println(iron[i].getWatt());
			System.out.println(iron[i].getPrice());
			System.out.println("--------------------");
		}
	}
	
	public void displayByBrandName(String brandName) {
		for (int i = 0; i < iron.length; i++) {
			if(iron[i].getBrand().equals(brandName)) {
				System.out.println(iron[i].getBrand());
				System.out.println(iron[i].getWatt());
				System.out.println(iron[i].getPrice());
			}
		}
	}
	
	public void updateByBrand(String brand,int newPrice) {
		for (int i = 0; i < iron.length; i++) {
			if (iron[i].getBrand().equals(brand)) {
				iron[i].setPrice(newPrice);
			}
		}
	}
	public void deleteByBrand(String brand) {
		for (int i = 0; i < iron.length; i++) {
			if (iron[i].getBrand().equals(brand)) {
				iron[i]=null;
			}
		}
	}
}
