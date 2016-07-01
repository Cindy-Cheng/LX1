package com.dy.cy.main;


import java.io.BufferedInputStream;

import java.io.DataInput;

import java.io.DataInputStream;

import java.io.DataOutputStream;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;


public class Test3 {


	public static void main(String[] args) {
	
	// TODO Auto-generated method stub

	
	try {
		
 	     FileInputStream finput =new  FileInputStream("/D:/蓝鸥实训/a.txt");
		     BufferedInputStream  binput = new BufferedInputStream(finput);
			
     DataInputStream  dinput = new DataInputStream(binput);
			
	
     int t1 = dinput.readInt();
			
			
	
     String t2  = dinput.readUTF();
			
				
     boolean t3  = dinput.readBoolean();
			
			
     System.out.println(t1);
			
				
     System.out.println(t2);
			
			
	
     System.out.println(t3);
			
				
     dinput.close();
			

	} catch (Exception e) {
	
		// TODO Auto-generated catch block
				
         e.printStackTrace();

		}


	}


}
