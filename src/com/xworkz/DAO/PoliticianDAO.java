package com.xworkz.DAO;

import com.xworkz.DTO.PoliticianDTO;

public interface PoliticianDAO {
	boolean save(PoliticianDTO politiciandto);
	PoliticianDTO findById(int id);
	PoliticianDTO findByIdandPresident(int id,String president);
	PoliticianDTO findByIdAndpresidentAndName(int id,String president,String name);
	PoliticianDTO findByIdAndName(int id,String name);
	String findNamebyId(int id);
	String findpresidentByIdAndName(String name,int id);
	int getTotal();
	PoliticianDAO findPartyByMaxMembers();
	
	
	
	
	

}
