package com.xworkz.job;

import com.xworkz.job.constants.job_Designation;


import com.xworkz.job.constants.job_Qualification;
import com.xworkz.job.dao.JobDAO;
import com.xworkz.job.dao.JobDAOImpl;
import com.xworkz.job.dto.JobDTO;

public class Runner {

	public static void main(String[] args) {
		JobDTO jobDto =new JobDTO(1,job_Designation.SOFTWARE_ENGINEER,50000.00D,job_Qualification.BE,40000.00D,"yes");
		JobDAO jobdao=new JobDAOImpl();
		jobdao.save(jobDto);
		jobdao.findById(1);
		

	}

}
