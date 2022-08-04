package com.xworkz.bottle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection mysql=DriverManager.getConnection("jdbc:mysql://Localhost:3306/","root","N@y@n@");
    System.out.println(mysql);
	}

}
