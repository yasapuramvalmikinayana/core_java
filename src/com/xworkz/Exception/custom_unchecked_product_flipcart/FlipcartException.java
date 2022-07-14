package com.xworkz.Exception.custom_unchecked_product_flipcart;

public class FlipcartException extends RuntimeException {
	@Override
	public String toString() {
		return "product not found";
	}

}
