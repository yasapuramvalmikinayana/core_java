package com.xworkz.Collection_Vector_DAO;

import java.util.Vector;

import com.xworkz.Collection_Vector_DTO.DTO;



public class DAO_flightImplementation implements DAO_Flight {
	Vector<DTO> vector =new Vector<DTO>();

	@Override
	public void addflight(DTO dto) {
		vector.add(dto);
		System.out.println("added flight is:"+dto);
	
		
	}

	@Override
	public void updateflight(DTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFlight(DTO dto) {
			int count = 0;
			for (int i=0; i< vector.size(); i++) {
				if( vector.get(i) != null && vector.get(i).getName() == dto.getName()) {
					vector.remove(i);
						count++;
					}
		
	}

	}
}
