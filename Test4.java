package com.dy.cy.main;


import java.io.BufferedOutputStream;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;


public class Test4 {
	

	public static void main(String[] args){


	try {
	
	     FileInputStream finput = new FileInputStream("/D:/À¶Å¸ÊµÑµ/a.txt");
	
	     ObjectInputStream oinput = new ObjectInputStream(finput);
	     
	   	     Position p =  (Position) oinput.readObject();
	     
	     	     System.out.println(p.left);
	

	} catch (Exception e) {
	
	// TODO Auto-generated catch block
		
	     e.printStackTrace();

	}
		

    }
	

}
