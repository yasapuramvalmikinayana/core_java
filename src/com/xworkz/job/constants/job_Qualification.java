package com.xworkz.job.constants;

public enum job_Qualification {
	BE("be"),
	BCA("bca"),
	BTECH("btech"),
	MTECH("mtech");
	private String name;
	
	private job_Qualification(String name)
	{
		this.name=name;
	}
	

	public String getjob()
	
	{
return name;

}
}