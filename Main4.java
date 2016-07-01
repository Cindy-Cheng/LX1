package com.dy.cy.main;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout =new FileOutputStream("/D:/蓝鸥实习/b.txt");
			
			OutputStreamWriter  writer = new OutputStreamWriter(fout, "UTF-8");
			
			BufferedWriter bwriter = new BufferedWriter(writer);
			
			bwriter.write("白日依山尽，");
		    bwriter.newLine();
		    bwriter.write("黄河入海流，");
		    bwriter.newLine();
		    bwriter.write("欲穷千里目，");
		    bwriter.newLine();
		    bwriter.write("更上一层楼。");
		    
		    bwriter.flush();
		    bwriter.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
