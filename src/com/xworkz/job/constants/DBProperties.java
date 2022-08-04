package com.xworkz.job.constants;

public enum DBProperties {
	url("jdbc:mysql://localhost:3306/"), 
	username("root"),
	password("@Nayana123");
	
	private String value;
	DBProperties(String value){
	this.value=value;
	

}
	public String getvalue()
	{
return value;
}
}