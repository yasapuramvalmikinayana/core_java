package com.xworkz.Collection_Vector_DTO;

public class DTO {
	private String name;
    private String source;
    private String destination;
    private String type;
    private double price;
    
    public DTO(){

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "DTO [name=" + name + ", source=" + source + ", destination=" + destination + ", type=" + type
				+ ", price=" + price + "]";
	}
    

}
