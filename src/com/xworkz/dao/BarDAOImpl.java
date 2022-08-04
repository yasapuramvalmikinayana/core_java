package com.xworkz.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import static com.xworkz.bar.constants.dbproperties.*;

import com.xworkz.bar.constants.dbproperties;
import com.xworkz.dto.BarDTO;

public class BarDAOImpl implements BarDAO{

	@Override
	public boolean save(BarDTO barDTO) {
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bar","root","@Nayana123");
			String insert ="insert into bar.bar_info values("+barDTO.getId()+","+ "'"+barDTO.getName()+"',"
					+ "'"+barDTO.getLocation()+"','"+barDTO.getType().getBar()+"',"
					+ "'"+barDTO.getAvgCollectionperDay()+"',"
							+ "'"+barDTO.getAvgCollectionperMonth()+"')";
			Statement statement =connection.createStatement();
			Integer affected =statement.executeUpdate(insert);
			if(affected>0) {
				System.out.println("Data found :"+insert);
				return true;
				
			}
			else {
				System.out.println("Data not found");
				return false;
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	try {
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bar","root","@Nayana123");
		
	}

	
}





