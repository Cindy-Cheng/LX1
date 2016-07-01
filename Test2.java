package com.dy.cy.main;


import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;


public class Test2 {

	
public static void main(String[] args){
		

		try {

	
  		     FileInputStream input = new FileInputStream("/D:/À¶Å¸ÊµÑµ/a.txt");
			
     		     String hello = "ÄãºÃ";
			 
	
		     byte[] bs = hello.getBytes();
			 
	
		     byte[] newbs = new byte[bs.length];
			 
			 		     input.read(newbs);
			 

		     String str = new String(newbs);
			 
			 
			             System.out.println(str);


		} catch (Exception e) {
	
		// TODO Auto-generated catch block

			e.printStackTrace();

		}


	}


}
