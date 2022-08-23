package com.xworkz.combs.Runner;

import java.time.LocalDate;

import com.xworkz.combs.entity.CombEntity;
import com.xworkz.combs.service.ServiceComb;
import com.xworkz.combs.service.ServiceImpl;

public class Runner {

	public static void main(String[] args) {
		CombEntity entity =new CombEntity();
		entity.setId(1);
		entity.setName("darbar");
		entity.setPrice(25000D);
		entity.setLocation("mumbai");
		entity.setNoofcombs(200);
		entity.setMaxCapacity(1002);
		entity.setCreatedBy("nayana");
		entity.setUpdatedBy("vanita");
		entity.setCreatedDate(LocalDate.now());
		entity.setUpdatedDate(LocalDate.of(2022,8, 7));
		
		CombEntity entity1 =new CombEntity();//invalid details
		
		entity1.setId(2);
		entity1.setName("Bhagamati");
		entity1.setPrice(15000D);
		entity1.setLocation("chennai");
		entity1.setNoofcombs(250);
		entity1.setMaxCapacity(40000);
		entity1.setCreatedBy("yoga");
		entity1.setUpdatedBy("naveen");
		entity1.setCreatedDate(LocalDate.now());
		entity1.setUpdatedDate(LocalDate.of(2023,8, 6));
		
		ServiceComb dao=new ServiceImpl();
		dao.validateAndSave(entity1);
		
	}

}
