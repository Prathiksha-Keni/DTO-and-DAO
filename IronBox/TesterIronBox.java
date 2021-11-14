package com.xworkz.IronBox;

import com.xworkz.IronBox.DAO.IronBoxDao;
import com.xworkz.IronBox.DTO.IronBoxDto;

public class TesterIronBox {

	public static void main(String[] args) {

		
		IronBoxDao ironBoxDao = new IronBoxDao();
		IronBoxDto usha = new IronBoxDto("usha",800,750);
		ironBoxDao.saveDto(usha);
		IronBoxDto havells = new IronBoxDto("havells",1000,1000);
		ironBoxDao.saveDto(havells);
		IronBoxDto bajaj = new IronBoxDto("bajaj",500,750);
		ironBoxDao.saveDto(bajaj);
		IronBoxDto philips = new IronBoxDto("philips",1200,1000);
		ironBoxDao.saveDto(philips);
		
		ironBoxDao.displayAll();
		
		ironBoxDao.displayByBrandName("usha");
		System.out.println("--------------");
		System.out.println("Before update");
		ironBoxDao.displayByBrandName("havells");
		System.out.println("--------------");
		ironBoxDao.updateByBrand("havells", 600);
		System.out.println("After update");
		ironBoxDao.displayByBrandName("havells");
		System.out.println("--------------");
		ironBoxDao.deleteByBrand("philips");
	}

}
