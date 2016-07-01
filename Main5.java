package com.dy.cy.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream finput = new FileInputStream("/D:/À¶Å¸ÊµÏ°/a.txt");
			
			InputStreamReader reader = new InputStreamReader(finput,"UTF-8");
			
			BufferedReader breader = new BufferedReader(reader);
			
			String strline = "";
			
			while((strline = breader.readLine())!=null){
				
				System.out.println(strline);
			}
			breader.close();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
