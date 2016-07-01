package com.dy.cy.main;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream  finput = new FileInputStream("/D£º/À¶Å¸ÊµÑµ/b.txt");
			
			InputStreamReader  reader = new InputStreamReader(finput, "UTF-8");
			
			char[] a = new char[10];
			
			int readlength = 0;
			
			while((readlength=reader.read(a))!=-1){
				
				String str = new String(a, 0, readlength);
				
				System.out.println(str);
				
			}
			reader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
