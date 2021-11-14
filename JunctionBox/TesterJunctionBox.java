package com.xworkz.JunctionBox;

import com.xworkz.JunctionBox.DAO.JunctionBoxDao;
import com.xworkz.JunctionBox.DTO.JunctionBoxDto;

public class TesterJunctionBox {

	public static void main(String[] args) {
		
		
		JunctionBoxDao junctionBoxDao = new JunctionBoxDao();
		
		JunctionBoxDto philips = new JunctionBoxDto("philips",250,5);
		junctionBoxDao.saveDto(philips);
		JunctionBoxDto gm = new JunctionBoxDto("gm",550,8);
		junctionBoxDao.saveDto(gm);
		JunctionBoxDto syska = new JunctionBoxDto("syska",700,4);
		junctionBoxDao.saveDto(syska);
		JunctionBoxDto anchor = new JunctionBoxDto("anchor",200,6);
		junctionBoxDao.saveDto(anchor);
		JunctionBoxDto gold = new JunctionBoxDto("gold",350,10);
		junctionBoxDao.saveDto(gold);
		
		junctionBoxDao.displayAll();
		
		junctionBoxDao.displayByBrandName("gm");
		System.out.println("--------------");
		System.out.println("Before update");
		junctionBoxDao.displayByBrandName("syska");
		System.out.println("--------------");
		junctionBoxDao.updateByBrand("syska", 650);
		System.out.println("After update");
		junctionBoxDao.displayByBrandName("syska");
		System.out.println("--------------");
		junctionBoxDao.deleteByBrand("gold");
	}

}
