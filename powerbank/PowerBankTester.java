package com.xworkz.powerbank;

import com.xworkz.powerbank.DAO.PowerBankDAO;
import com.xworkz.powerbank.DTO.PowerBankDTO;

public class PowerBankTester {

	public static void main(String[] args) {
//		PowerBankDTO powerBankDTO = new PowerBankDTO("mi", "red", 1500, 10000);
//		PowerBankDAO powerBankDAO = new PowerBankDAO();
//		powerBankDAO.displayPowerbankDTO(powerBankDTO);
		
		PowerBankDAO powerBankDAO = new PowerBankDAO();
		//powerBankDAO.createpowerbank("mi", "red", 1500, 10000);	
		
		PowerBankDTO obj=powerBankDAO.createpowerbank("mi", "red", 1500, 10000);
		
	}

}
