package com.xworkz.DAODTOfirst;

public class StudentDto {
	String name;
	int id;
	public StudentDto(String name,int id)
	{
		this.name=name;
		this.id=id;
		System.out.println("string & int parameters");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "StudentDto [name=" + name + ", id=" + id + "]";
	}

}
