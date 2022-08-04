package com.xworkz.job.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.job.dto.JobDTO;

import static com.xworkz.job.constants.DBProperties.*;


public class JobDAOImpl implements JobDAO {

	@Override
	public boolean save(JobDTO jobDto) {
		
		try {
			Connection	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","@Nayana123");
			String insert ="insert into  job.job_info values(?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(insert);
			statement.setInt(1,jobDto.getId());
			statement.setString(2,jobDto.getType().getjob());
			statement.setDouble(3,jobDto.getPackage());
			statement.setString(4,jobDto.getName().getjob());
			statement.setDouble(5,jobDto.getPercentage());
			statement.setBoolean(6,jobDto.getFresher());
			int rowsAffected =statement.executeUpdate();
			if(rowsAffected>0) {
				System.out.println("Data saved:"+insert);
			}
			else {
				System.out.println("Data not saved");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		return false;
	}

	@Override
	public JobDTO findById(int id) {
		
		return null;
	}

	@Override
	public JobDTO findByIdAndDesignation(int id, String designation) {
		
		return null;
	}

	@Override
	public JobDTO findByIdAndDesignationAndQualification(Integer id, String designation, String Qualification) {
		
		return null;
	}

	@Override
	public int getTotal() {
		
		return 0;
	}

	@Override
	public String isFresherById(int id) {
		
		return null;
	}

	@Override
	public Double getMaxPercentage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isFresherById(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	}

	

	