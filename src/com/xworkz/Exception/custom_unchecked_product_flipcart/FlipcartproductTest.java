package com.xworkz.Exception.custom_unchecked_product_flipcart;

public class FlipcartproductTest {
	public static void main(String[] args) {
		Product soap=new Product("soap",20.00);  
		Product lipstick=new Product("lipstick",1000);  
		Product chair=new Product("chair",400);  
		Product bag=new Product("bag",500);  
		Product laptop=new Product("laptop",40000);
	  
	  Filpcartproduct Fp=new Filpcartproduct();
	  Fp.addProduct(soap);
	  Fp.addProduct(lipstick);
	  Fp.addProduct(chair);
	  Fp.addProduct(bag);
	  Fp.addProduct(laptop);
	  
	  try {
		  Product product=Fp.getProduct("soap");
		System.out.println(product);
		} 
	  catch (FlipcartException e) {
	System.out.println(e);
	}

	}

}

