package com.xworkz.Collection_Vector.DAO_DTO_Runner;
import com.xworkz.Collection_Vector_DAO.DAO_Flight;
import com.xworkz.Collection_Vector_DAO.DAO_flightImplementation;
import com.xworkz.Collection_Vector_DTO.DTO;

public class ServiceflightImpl implements Service_flight {
	DAO_Flight df=new DAO_flightImplementation();

	@Override
	public void addflight(DTO dto) {
		df.addflight(dto);
		
	}

	@Override
	public void updateflight(DTO dto) {
		df.updateflight(dto);
		
	}

	@Override
	public void deleteFlight(DTO dto) {
		df.deleteFlight(dto);
		
	}
}


		

