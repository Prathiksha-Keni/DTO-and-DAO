package com.xworkz.Clock;

import com.xworkz.Clock.DAO.ClockDao;
import com.xworkz.Clock.DTO.ClockDto;

public class TesterClock {

	public static void main(String[] args) {
		
		ClockDao clockDao = new ClockDao();
		ClockDto timex = new ClockDto("timex","black","circle",1500);
		clockDao.saveDto(timex);
		ClockDto fastTrack = new ClockDto("fastTrack","white","oval",2000);
		clockDao.saveDto(fastTrack);
		ClockDto titan = new ClockDto("titan","blue","square",2500);
		clockDao.saveDto(titan);
		ClockDto sonata = new ClockDto("sonata","red","circle",3500);
		clockDao.saveDto(sonata);
		ClockDto casio = new ClockDto("casio","white","square",3000);
		clockDao.saveDto(casio);
		
		clockDao.displayAll();
		
		clockDao.displayByBrandName("timex");
		System.out.println("--------------");
		System.out.println("Before update");
		clockDao.displayByBrandName("titan");
		System.out.println("--------------");
		clockDao.updateByBrand("titan", 6000);
		System.out.println("After update");
		clockDao.displayByBrandName("titan");
		System.out.println("--------------");
		clockDao.deleteByBrand("casio");
	}

}
