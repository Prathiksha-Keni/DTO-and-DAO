package com.xworkz.MicroOven;

import com.xworkz.MicroOven.DAO.MicroOvenDao;
import com.xworkz.MicroOven.DTO.MicroOvenDto;

public class TestOven {

	public static void main(String[] args) {
		
		MicroOvenDao microOvenDao = new MicroOvenDao();
		MicroOvenDto samsung = new MicroOvenDto("samsung","black",774,25000);
		microOvenDao.saveDto(samsung);
		MicroOvenDto lg = new MicroOvenDto("lg","white",785,30000);
		microOvenDao.saveDto(lg);
		MicroOvenDto ifb = new MicroOvenDto("ifb","grey",881,45000);
		microOvenDao.saveDto(ifb);
		MicroOvenDto bajaj = new MicroOvenDto("bajaj","black",125,55000);
		microOvenDao.saveDto(bajaj);
		MicroOvenDto haier = new MicroOvenDto("haier","blwhiteack",996,60000);
		microOvenDao.saveDto(haier);
		
		microOvenDao.displayAll();
		
		microOvenDao.displayByBrandName("lg");
		System.out.println("--------------");
		System.out.println("Before update");
		microOvenDao.displayByBrandName("samsung");
		System.out.println("--------------");
		microOvenDao.updateByBrand("samsung", 60000);
		System.out.println("After update");
		microOvenDao.displayByBrandName("samsung");
		System.out.println("--------------");
		microOvenDao.deleteByModelNo(996);
	}

}
