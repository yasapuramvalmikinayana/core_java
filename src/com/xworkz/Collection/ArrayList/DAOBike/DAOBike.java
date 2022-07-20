package com.xworkz.Collection.ArrayList.DAOBike;

import com.xworkz.Collection.ArrayList.DTO;

public interface DAOBike {
	void addBike(DTO dto);
	DTO getBike(String companyName);
	void updateBike(DTO dto);
	void deleteBike(DTO dto);

}
