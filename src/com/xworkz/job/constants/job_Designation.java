package com.xworkz.job.constants;

public enum job_Designation {
	SOFTWARE_ENGINEER("softwareengineer"),
	ASSOCIATE_SOFTWARE_ENGINEER("associatesoftwareengineer"),
	FULL_STACK_ENGINEER("full stackengineer"),
	TRANIEE("traniee");
	
private String name;
	
	private job_Designation(String name)
	{
		this.name=name;
	}
	

	public String getjob()
	
	{
return name;


}
	
		
		
	}

