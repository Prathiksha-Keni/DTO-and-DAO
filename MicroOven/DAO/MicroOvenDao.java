package com.xworkz.MicroOven.DAO;

import com.xworkz.MicroOven.DTO.MicroOvenDto;

public class MicroOvenDao {

	
	MicroOvenDto microoven[]=new MicroOvenDto[5];
	int index=0;
	public MicroOvenDao() {
		System.out.println("DAO created");
	}
	public void saveDto(MicroOvenDto obj) {
		System.out.println("Inside save method");
		microoven[index]=obj;
		index++;
	}
	public void displayAll() {
		for (int i = 0; i < microoven.length; i++) {
			System.out.println(microoven[i].getBrand());
			System.out.println(microoven[i].getColor());
			System.out.println(microoven[i].getModelNo());
			System.out.println(microoven[i].getPrice());
			System.out.println("--------------------");
		}
	}
	public void displayByBrandName(String brandName) {
		for (int i = 0; i < microoven.length; i++) {
			if(microoven[i].getBrand().equals(brandName)) {
				System.out.println(microoven[i].getBrand());
				System.out.println(microoven[i].getColor());
				System.out.println(microoven[i].getModelNo());
				System.out.println(microoven[i].getPrice());
			}
		}
	}
	public void updateByBrand(String brand,int newPrice) {
		for (int i = 0; i < microoven.length; i++) {
			if (microoven[i].getBrand().equals(brand)) {
				microoven[i].setPrice(newPrice);
			}
		}
	}
	public void deleteByModelNo(int modelNo) {
		for (int i = 0; i < microoven.length; i++) {
			if (microoven[i].getModelNo()==modelNo) {
				microoven[i]=null;
			}
		}
	}
}
