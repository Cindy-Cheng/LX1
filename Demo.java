package com.dy.cy.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		
		System.out.println("��������Ҫѡ�����ļ����ļ�����");
		
		boolean flag = true;
		
		while(flag){
		
		String inputdirname = s.next();
		
		File file = new File(inputdirname);
		
		if(file.exists()){
			
			if(file.isDirectory()){
				
				File[] files = file.listFiles();
				
				for(File f:files){
					
					if(f.isFile()){
						
						System.out.println(f.getName());
					}
				}
				System.out.println("��ѡ����Ҫ���Ƶ��ļ�����");
				
				String cstr =s.next();
				
				boolean flag1 = true;
				
				String cdirname = null;
				
				while(flag1){
					System.out.println("��������Ҫ���Ƶ��ĸ��ļ���");
					
					cdirname = s.next();
					
					File checkfile = new File(cdirname);
					
					if(checkfile.exists()&&checkfile.isDirectory()){
						
						break;
					}
					else{
						
						System.out.println("������������������");
						
						continue;
					}
				}
				try {
					FileInputStream finput = new FileInputStream(inputdirname+"/"+cstr);
					
					FileOutputStream fout = new FileOutputStream(cdirname+"/"+cstr);
					
					int read = 0;
					
					while((read=finput.read())!=-1){
						
						fout.write(read);
					}
					fout.flush();
					
					fout.close();
					
					finput.close();
					
					System.out.println("���Ƿ����yes����");
					
					String userinput = s.next();
					
					if(!"yes".equalsIgnoreCase(userinput)){
						
						break;
					}
				} 
				catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			else{
				
				System.out.println("�Բ�����Ҫ�����ļ��в����ļ�����������");
				
				continue;
			}
		}
		else{
			
			System.out.println("��������ļ��в���������������");
			
			continue;
		}
				
	}
  }

}
