package com.xworkz.Collection.ArrayList.Service;

import com.xworkz.Collection.ArrayList.DTO;
import com.xworkz.Collection.ArrayList.DAOBike.DAOBike;
import com.xworkz.Collection.ArrayList.DAOBike.DAOBikeImplementation;

public class BikeServiceImpl implements BikeService {
	DAOBike bikes=new DAOBikeImplementation();

	@Override
	
	public void addBike(DTO dto) {
		// TODO Auto-generated method stub
		bikes.addBike(dto);
		
	}

	@Override
	public DTO getBike(String companyName) {
		bikes.getBike(companyName);
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBike(DTO dto) {
		bikes.updateBike(dto);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBike(DTO dto) {
		bikes.deleteBike(dto);
		// TODO Auto-generated method stub
		
	}
	

}
