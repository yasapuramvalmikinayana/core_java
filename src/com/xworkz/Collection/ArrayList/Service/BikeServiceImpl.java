package com.xworkz.Collection.ArrayList.Service;

import com.xworkz.Collection.ArrayList.DTO;
import com.xworkz.Collection.ArrayList.DAOBike.DAOBike;
import com.xworkz.Collection.ArrayList.DAOBike.DAOBikeImplementation;

public class BikeServiceImpl implements BikeService {
	DAOBike bikes=new DAOBikeImplementation();

	@Override
	@Override
	public void addBike(DTO dto) {
		bikes.addBike(dto);
		
	}

	@Override
	public DTO getBike(String companyName) {
		
		return null;
	}

	@Override
	public void updateBike(DTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBike(DTO dto) {
		// TODO Auto-generated method stub
		
	}
     
}

	