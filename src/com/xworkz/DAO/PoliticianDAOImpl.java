package com.xworkz.DAO;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.DTO.PoliticianDTO;
import static com.xworkz.constants.DBProperties.*;

public class PoliticianDAOImpl implements PoliticianDAO {

	@Override
	public boolean save(PoliticianDTO politiciandto) {
		try {
			Connection connection = DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(), SECRET.getvalue());
			String quary = "insert into politician.politician values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(quary);
			statement.setInt(1, politiciandto.getId());
			statement.setString(2, politiciandto.getPartyName().getPartyName());
			statement.setString(3, politiciandto.getPresident());
			statement.setDouble(4, politiciandto.getTotalMembers());
			statement.setString(5, politiciandto.getPartySymbol().getPartySymbol());
			statement.setString(6, politiciandto.getPartylocation());
			statement.setString(7, politiciandto.getPartycolour());
			statement.setString(8, politiciandto.getPartystate());
			statement.setDouble(9, politiciandto.getPartybudget());

			int rowsAffected = statement.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("data saved:" + rowsAffected);
				return true;
			} else {
				System.out.println("data not saved");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public PoliticianDTO findById(int id) {

		return null;
	}

	@Override
	public PoliticianDTO findByIdandPresident(int id, String president) {

		return null;
	}

	@Override
	public PoliticianDTO findByIdAndpresidentAndName(int id, String president, String name) {

		return null;
	}

	@Override
	public PoliticianDTO findByIdAndName(int id, String name) {

		return null;
	}

	@Override
	public String findNamebyId(int id) {

		return null;
	}

	@Override
	public String findpresidentByIdAndName(String name, int id) {

		return null;
	}

	@Override
	public int getTotal() {

		return 0;
	}

	@Override
	public PoliticianDAO findPartyByMaxMembers() {

		return null;
	}

}
