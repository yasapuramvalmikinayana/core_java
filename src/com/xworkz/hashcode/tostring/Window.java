package com.xworkz.hashcode.tostring;

public class Window {
	String type;
	double height;
	double width;
	
	Window(String type,double height,double width){
		this.type=type;
		this.height=height;
		this.width=width;

	}

	@Override
	public String toString() {
		return "Window [type=" + type + ", height=" + height + ", width=" + width + "]";
	}

}
