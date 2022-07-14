package com.xworkz.Exception.custom_unchecked_product_flipcart;

public class Filpcartproduct {
	Product [] Products=new Product[10];
	void addProduct(Product Product) {
		for (int i = 0; i < Filpcartproduct.this.Products.length;i++) {
			if(Products[i]==null) {
				Products[i]=Product;
				System.out.println("product added:"+Products[i]);
				break;
			}
		}
	}
	Product getProduct(String Productname)  {
			Product product=null;
			for (int i = 0; i < Products.length; i++) {
				if(Products[i]!=null&& Products[i].getProductname().equals(Productname)) {
					product=Products[i];
				}}
			if(product !=null) {
				return product;
			}
			else {
				FlipcartException fe=new FlipcartException();
				throw fe;
			}
		}
		
	}


