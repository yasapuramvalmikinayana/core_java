package com.xworkz.bar.constants;

public enum dbproperties {
	url("jdbc:mysql://localhost:3306/bar"), 
	username("root"),
	password("@Nayana123");
	
	private String value;
	
  private dbproperties(String value){
	this.value=value;
	

}
	public String getvalue()
	{
		return value;
	}

}
