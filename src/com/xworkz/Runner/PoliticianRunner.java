package com.xworkz.Runner;

import com.xworkz.DAO.PoliticianDAO;
import com.xworkz.DAO.PoliticianDAOImpl;
import com.xworkz.DTO.PoliticianDTO;
import com.xworkz.constants.PartyName;
import com.xworkz.constants.PartySymbol;

public class PoliticianRunner {

	public static void main(String[] args) {
		PoliticianDTO pdto1 = new PoliticianDTO(9, PartyName.LDP, "vanita", 450.0D, PartySymbol.LDPSYMBOL,
				"yellow", "chinna", "nepal", 30000.0D);
		

		PoliticianDAO pdao = new PoliticianDAOImpl();
//		pdao.save(pdto1);
		
//		PoliticianDAO pdao1 = new PoliticianDAOImpl();
//        System.out.println(pdao1);
		
		//PoliticianDTO pdao2 =pdao.findByIdandPresident(9,"vanita");
		//System.out.println(pdao2);
		//PoliticianDTO pdao3 =pdao.findByIdandPresident(5,"nithin");
		//System.out.println(pdao3);
		PoliticianDTO pdao4 =pdao.findByIdandPresident(8,"prashant");
		System.out.println(pdao4);
		
	}

}
	