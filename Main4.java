package com.dy.cy.main;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout =new FileOutputStream("/D:/��Ÿʵϰ/b.txt");
			
			OutputStreamWriter  writer = new OutputStreamWriter(fout, "UTF-8");
			
			BufferedWriter bwriter = new BufferedWriter(writer);
			
			bwriter.write("������ɽ����");
		    bwriter.newLine();
		    bwriter.write("�ƺ��뺣����");
		    bwriter.newLine();
		    bwriter.write("����ǧ��Ŀ��");
		    bwriter.newLine();
		    bwriter.write("����һ��¥��");
		    
		    bwriter.flush();
		    bwriter.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
