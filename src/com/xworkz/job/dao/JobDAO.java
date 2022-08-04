package com.xworkz.job.dao;

import com.xworkz.job.dto.JobDTO;

public interface JobDAO {
	boolean save(JobDTO jobDto);
	JobDTO findById(int id);
	JobDTO findByIdAndDesignation(int id,String designation);
	JobDTO findByIdAndDesignationAndQualification(Integer id,String designation,String Qualification);
	int getTotal();
	String isFresherById(int id);
	Double getMaxPercentage();
	

}
