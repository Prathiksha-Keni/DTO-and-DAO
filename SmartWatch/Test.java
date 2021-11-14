package com.xworkz.SmartWatch;

import com.xworkz.SmartWatch.DAO.SmartWatchDao;
import com.xworkz.SmartWatch.DTO.SmartWatchDto;

public class Test {

	public static void main(String[] args) {
		
		SmartWatchDao smartWatchDao = new SmartWatchDao();
		SmartWatchDto mi =new SmartWatchDto(12,"red","mi",15000);
		smartWatchDao.saveDto(mi);
		SmartWatchDto samsung =new SmartWatchDto(13,"black","samsung",18000);
		smartWatchDao.saveDto(samsung);
		SmartWatchDto fitbit =new SmartWatchDto(14,"blue","fitbit",20000);
		smartWatchDao.saveDto(fitbit);
		SmartWatchDto apple =new SmartWatchDto(15,"white","apple",25000);
		smartWatchDao.saveDto(apple);
		SmartWatchDto oneplus =new SmartWatchDto(16,"grey","oneplus",35000);
		smartWatchDao.saveDto(oneplus);
		System.out.println("Before Update");
		smartWatchDao.displayAll();
		smartWatchDao.displayByBrandName("fitbit");
		smartWatchDao.updateByBrand("mi", 20000);
		smartWatchDao.updateByBrandByBrandName("samsung","samsung pro");
		System.out.println("After update");
		smartWatchDao.displayByBrandName("samsung pro");
		smartWatchDao.deleteBySerialNo(16);
		smartWatchDao.displayByBrandName("oneplus");
	}
}
