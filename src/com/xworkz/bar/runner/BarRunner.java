package com.xworkz.bar.runner;

import com.xworkz.bar.constants.bartype;
import com.xworkz.dao.BarDAO;
import com.xworkz.dao.BarDAOImpl;
import com.xworkz.dto.BarDTO;

public class BarRunner {

	public static void main(String[] args) {
		BarDTO bardto =new BarDTO(7,"priya","kadiri",bartype.WINE_SHOP,100000D,60000*60D);
		BarDAO bardao = new BarDAOImpl();
		bardao.save(bardto);

	}

}
