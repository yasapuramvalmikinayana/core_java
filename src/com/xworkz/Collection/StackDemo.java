package com.xworkz.Collection;

import java.util.Stack;

public class StackDemo{
	 StackDemo(){
		 System.out.println("This is default constructor");
	 }
	 public static void main(String[] args) {
		 Stack stack=new Stack();
		  stack.add("nayan");
		  stack.add("navin");
		  stack.add("vanita");
		  stack.add("prashant");
		  System.out.println(stack);
		 //stack.pop();//remove element and show previous element
		 System.out.println(stack.pop());
		 //stack.pop();//remove element and show previous element
		 System.out.println(stack);
		 // stack.peek();//show the top of the element
		 System.out.println(stack);
		 // stack.search("prashant");
		  System.out.println("the searched element is:"+stack.search("prashant"));
		  stack.firstElement();
		 System.out.println("the first element :"+stack.firstElement());
		 stack.empty();
		 System.out.println("stack is full :" +stack.empty());
		  
		  
		  
		  
		  
		
	}
}
	
