package com.xworkz.Runner;

import com.xworkz.DAO.PoliticianDAO;

import com.xworkz.DAO.PoliticianDAOImpl;
import com.xworkz.DTO.PoliticianDTO;
import com.xworkz.constants.PartyName;
import com.xworkz.constants.PartySymbol;

public class PoliticianRunner {

	public static void main(String[] args) {
		PoliticianDTO pdto = new PoliticianDTO(9, PartyName.LDP, "vanita", 450.0D, PartySymbol.LDPSYMBOL,
				"yellow", "chinna", "nepal", 30000.0D);
		

		PoliticianDAO pdao = new PoliticianDAOImpl();
		
		
//		pdao.save(pdto);
		
//		PoliticianDTO pda1=pdao.findById(4);
//       System.out.println(pda1);
		
//		PoliticianDTO pda2 =pdao.findByIdandPresident(7,"parthasarathi");
//     	System.out.println(pda2);
//		PoliticianDTO pda3 =pdao.findByIdAndpresidentAndName(1,"Dropadi murmu","BJP");
//		System.out.println(pda3);
//		PoliticianDTO pda4 =pdao.findByIdAndName(3,"CONGRESS");
//		System.out.println(pda4);
		
//		String pda5=pdao.findNamebyId(5);
//		System.out.println(pda5);
		
//		String pda6=pdao.findpresidentByIdAndName(7,"PDP");
//	System.out.println(pda6);
	
//		int pda7=pdao.getTotal();
//		System.out.println(pda7);
		 
		PoliticianDTO pda8=pdao.findPartyByMaxMembers();
      System.out.println(pda8);
		
		
	}

}
	