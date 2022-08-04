package com.xworkz.job.dto;

import com.xworkz.job.constants.job_Designation;
import com.xworkz.job.constants.job_Qualification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class JobDTO {
	private int id;
	private  job_Designation type =job_Designation .SOFTWARE_ENGINEER;
	private Double Package;
	private job_Qualification name =job_Qualification .BE;
	private Double percentage;
	private Boolean fresher;
	
}
