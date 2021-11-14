package com.xworkz.Inverter;

import com.xworkz.Inverter.DAO.InverterDao;
import com.xworkz.Inverter.DTO.InverterDto;

public class TesterInverter {

	public static void main(String[] args) {
		
		InverterDao inverterDao = new InverterDao();
		InverterDto luminous = new InverterDto("luminous",7000,12);
		inverterDao.saveDto(luminous);
		
		InverterDto exide = new InverterDto("exide",5000,90);
		inverterDao.saveDto(exide);
		InverterDto vguard = new InverterDto("vguard",8000,90);
		inverterDao.saveDto(vguard);
		InverterDto crompton = new InverterDto("crompton",9000,12);
		inverterDao.saveDto(crompton);
		
		inverterDao.displayAll();
		
		inverterDao.displayByBrandName("exide");
		System.out.println("--------------");
		System.out.println("Before update");
		inverterDao.displayByBrandName("luminous");
		System.out.println("--------------");
		inverterDao.updateByBrand("luminous", 6000);
		System.out.println("After update");
		inverterDao.displayByBrandName("luminous");
		System.out.println("--------------");
		inverterDao.deleteByBrand("crompton");
	}

}
