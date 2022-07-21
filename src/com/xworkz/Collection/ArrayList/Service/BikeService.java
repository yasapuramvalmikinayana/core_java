package com.xworkz.Collection.ArrayList.Service;

import com.xworkz.Collection.ArrayList.DTO;

public interface BikeService {
	void addBike(DTO dto);
	DTO getBike(String companyName);
	void updateBike(DTO dto);
	void deleteBike(DTO dto);

}
