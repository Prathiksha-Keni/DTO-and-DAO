package com.xworkz.JunctionBox.DAO;

import com.xworkz.JunctionBox.DTO.JunctionBoxDto;

public class JunctionBoxDao {

	
	JunctionBoxDto junction[]=new JunctionBoxDto[5];
	int index=0;
	public JunctionBoxDao() {
		System.out.println("DAO created");
	}
	public void saveDto(JunctionBoxDto obj) {
		System.out.println("Inside save method");
		junction[index]=obj;
		index++;
	}
	
	public void displayAll() {
		for (int i = 0; i < junction.length; i++) {
			System.out.println(junction[i].getBrand());
			System.out.println(junction[i].getNoOfSwitch());
			System.out.println(junction[i].getPrice());
			System.out.println("--------------------");
		}
	}
	
	public void displayByBrandName(String brandName) {
		for (int i = 0; i < junction.length; i++) {
			if(junction[i].getBrand().equals(brandName)) {
				System.out.println(junction[i].getBrand());
				System.out.println(junction[i].getNoOfSwitch());
				System.out.println(junction[i].getPrice());
			}
		}
	}
	
	public void updateByBrand(String brand,int newPrice) {
		for (int i = 0; i < junction.length; i++) {
			if (junction[i].getBrand().equals(brand)) {
				junction[i].setPrice(newPrice);
			}
		}
	}
	
	public void deleteByBrand(String brand) {
		for (int i = 0; i < junction.length; i++) {
			if (junction[i].getBrand().equals(brand)) {
				junction[i]=null;
			}
		}
	}

}
