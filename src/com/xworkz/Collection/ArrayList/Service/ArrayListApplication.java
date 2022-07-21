package com.xworkz.Collection.ArrayList.Service;

import com.xworkz.Collection.ArrayList.DTO;

public class ArrayListApplication {
		public static void main(String[] args) {
	     	DTO hornett = new DTO();
			hornett.setModelNo(15685);
			hornett.setCompanyName("Honda");
			hornett.setCubicCapacity("180cc");
			hornett.setColor("Matt-Orange");
			hornett.setPrice(180000.00);
			hornett.setTopSpeed(153);
			
			DTO apache = new DTO();
			apache.setModelNo(15675);
			apache.setCompanyName("TVS");
			apache.setCubicCapacity("160cc");
			apache.setColor("Blue");
			apache.setPrice(14700.00);
			apache.setTopSpeed(140);
			
			DTO extreme = new DTO();
			extreme.setModelNo(15677);
			extreme.setCompanyName("Hero");
			extreme.setCubicCapacity("160cc");
			extreme.setColor("White-Red");
			extreme.setPrice(144000);
			extreme.setTopSpeed(125);
			
			DTO fZ = new DTO();
			fZ.setModelNo(156525);
			fZ.setCompanyName("Yamaha");
			fZ.setCubicCapacity("149cc");
			fZ.setColor("Blue");
			fZ.setPrice(141000.00);
			fZ.setTopSpeed(125);
			
			DTO gixxer = new DTO();
			gixxer.setModelNo(156775);
			gixxer.setCompanyName("Suzuki");
			gixxer.setCubicCapacity("155cc");
			gixxer.setColor("Black");
			gixxer.setPrice(169000.00);
			gixxer.setTopSpeed(134);
			
			BikeService service = new BikeServiceImpl();
			service.addBike(hornett);
			service.addBike(apache);
			service.addBike(extreme);
			service.addBike(fZ);
			service.addBike(gixxer);
			
			System.out.println("");
			
			service.getBike("Yamaha");
			
			System.out.println("");
			
			gixxer.setCompanyName("Suzuki-GixxerSF");
			service.updateBike(gixxer);
			
			System.out.println("");
			
			service.deleteBike(fZ);
		}
	}


