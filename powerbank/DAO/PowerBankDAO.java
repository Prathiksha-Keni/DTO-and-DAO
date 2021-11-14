package com.xworkz.powerbank.DAO;
import com.xworkz.powerbank.DTO.PowerBankDTO;
public class PowerBankDAO 
{

	public PowerBankDAO() {
		System.out.println("Inside PowerBankDAO constructor");
	}
	
	public void displayPowerbankDTO(PowerBankDTO dto)
	{
		System.out.println(dto.getBrand());
		System.out.println(dto.getColor());
		System.out.println(dto.getPrice());
		System.out.println(dto.getMah());
	}
	
	public PowerBankDTO createpowerbank(String brand, String color, int price, int mah) {
		System.out.println("Inside create power bank method");
		PowerBankDTO powerBankDTO = new PowerBankDTO(brand, color, price, mah);
		return powerBankDTO;
	}

	
}
