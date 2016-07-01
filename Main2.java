package com.dy.cy.main;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("/D：/蓝鸥实训/a");
		
		  OutputStreamWriter writer = new OutputStreamWriter(fout, "UTF-8");
		  
		   writer.write("大家好!我是字符流.");
		   
		   writer.write("\n");
		   
		   writer.write("我很好");
		   
		   writer.flush();
		   
		   writer.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
