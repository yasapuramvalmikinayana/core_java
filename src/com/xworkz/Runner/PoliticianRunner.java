package com.xworkz.Runner;

import com.xworkz.DAO.PoliticianDAO;
import com.xworkz.DAO.PoliticianDAOImpl;
import com.xworkz.DTO.PoliticianDTO;
import com.xworkz.constants.PartyName;
import com.xworkz.constants.PartySymbol;

public class PoliticianRunner {

	public static void main(String[] args) {
		PoliticianDTO pdto1 = new PoliticianDTO(2, PartyName.TDP, "Chandra babu naidu", 450.0D, PartySymbol.TDPSYMBOL,
				"cycle", "vijayawada", "Andhrapradesh", 30000.0D);
		PoliticianDAO pdao = new PoliticianDAOImpl();
		pdao.save(pdto1);

	}

}
