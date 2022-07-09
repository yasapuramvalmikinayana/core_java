package com.xworkz.DAODTOfirst;

public class Studenttest {
	public static void main(String[]args) {
		StudentDto dto=new StudentDto("naveen",7);
		StudentDao dao=new StudentDaoTest();
		dao.save(dto);
		System.out.println(dto);
		
		
	}

}
