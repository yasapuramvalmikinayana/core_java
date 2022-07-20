package com.xworkz.Collection.ArrayList.DAOBike;

import java.util.ArrayList;

import com.xworkz.Collection.ArrayList.DTO;

public class DAOBikeImplementation implements DAOBike {
	ArrayList<DTO> bikes = new ArrayList<DTO>();

	@Override
	public void addBike(DTO dto) {
		bikes.add(dto);
		System.out.println("Added bike is:"+dto);
		// TODO Auto-generated method stub
		
	}

	@Override
	public DTO getBike(String companyName) {
		for(int i = 0; i<bikes.size();i++) {
			if(bikes.get(i).getCompanyName() == companyName) {
				System.out.println("The Bike Details are: " + bikes.get(i));
				return bikes.get(i);
			}
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBike(DTO dto) {
		int count = 0;
		for(int i = 0; i<bikes.size();i++) {
		if(bikes.get(i).getCompanyName() == dto.getCompanyName()) {
			count++;
			bikes.get(i).setCompanyName(dto.getCompanyName());
			System.out.println("Updated CompanyName is:" + bikes.get(i));
		}
	}
		if(count == 0) {
			System.out.println("Invalid Search Details Entered");
		}
}
		// TODO Auto-generated method stub
		
	

	@Override
	public void deleteBike(DTO dto) {
		int count = 0;
		for (int i=0; i< bikes.size(); i++) {
			if( bikes.get(i) != null && bikes.get(i).getCompanyName() == dto.getCompanyName()) {
				bikes.remove(i);
					count++;
				}
		
			}	
		if(count > 0) {
			System.out.println("The Mentioned CompanyName and Model Number Bike is " +dto.getCompanyName() +" " + dto.getModelNo() + " being deleted from the ArrayList" );
		}
		
		else {
			System.out.println("Invalid Input");
		}
		
	}

		// TODO Auto-generated method stub
		
	}


