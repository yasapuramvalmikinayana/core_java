package com.xworkz.bar.constants;

public enum bartype {
	WINE_SHOP("wine"),
	MSIL("msil"),
	BARANDRESTAURANT("bar and restaurant"),
	RESORT("resort"),
	DEFAULT("restaurant");
	
	private String name;
	
	private bartype(String name)
	{
		this.name=name;
	}
	public String getBar() 
	{
		return name;
	}
	public String gettyfe() {
		return name;
	}
	public static bartype getbyvalue(String value) {
		bartype[] Bartype=bartype.values();
		for(bartype bartype2:Bartype) {
			System.out.println(bartype2.name+"comparing");
			if(bartype2.name.equals(value)) {
				return bartype2;
			}
		}
		return null;
	}
}
	


