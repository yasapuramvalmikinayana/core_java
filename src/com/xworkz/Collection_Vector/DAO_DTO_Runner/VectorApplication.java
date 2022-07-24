package com.xworkz.Collection_Vector.DAO_DTO_Runner;

import com.xworkz.Collection_Vector_DTO.DTO;

public class VectorApplication {

	public static void main(String[] args) {
		DTO dtoflight=new DTO();
		dtoflight.setName("indianairlines");
		dtoflight.setSource("mumbai");
		dtoflight.setType("legacy");
		dtoflight.setPrice(100000.00);
		dtoflight.setDestination("dehli");
		
		DTO dft=new DTO();
        dft.setName("ameriacanairlines");
		dft.setSource("america");
		dft.setType("economy class flights");
		dft.setPrice(200000.00);
		dft.setDestination("chicago"); 
		
		Service_flight sf =new ServiceflightImpl();
		sf.addflight(dtoflight);
		sf.addflight(dft);
		System.out.println(sf);
		

	}

}
