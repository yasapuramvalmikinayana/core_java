package com.xworkz.constants;

public enum DBProperties {
	URL("jdbc:mysql://localhost:3306/politician"),
	USERNAME("root"),
	SECRET("@Nayana123");
	
	private String value;
	private DBProperties(String value) {
		this.value=value;
	}
	public String getvalue() {
		return value;
	}

}
