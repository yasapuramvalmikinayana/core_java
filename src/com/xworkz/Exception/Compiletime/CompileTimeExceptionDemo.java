package com.xworkz.Exception.Compiletime;

		import java.io.BufferedReader;
		import java.io.FileReader;
		import java.io.IOException;

		public class CompileTimeExceptionDemo 
		{
			
			
			public static void main(String[]args) {
				try {
					FileReader fd=new FileReader("E:\\Test\\Test.txt");
					BufferedReader br=new BufferedReader(fd);
					System.out.println(br.readLine());
				}
				
					
					
			 catch (IOException e) {
					e.printStackTrace();
					System.out.println("Exception caught");
					
				}
				
				
			}

		

	}

