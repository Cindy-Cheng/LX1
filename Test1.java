package com.dy.cy.main;

import java.io.BufferedInputStream;

import java.io.BufferedOutputStream;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.InputStream;

import java.net.HttpURLConnection;

import java.net.MalformedURLException;

import java.net.URL;

import java.util.Date;


public class Test1 {


   public static void main(String[] args) {

     // TODO Auto-generated method stub


	try {
		
	
	      String downurl = "";
	
	
      URL  url = new URL(downurl);

	   
   HttpURLConnection conn = 	(HttpURLConnection) url.openConnection();
	     
	      conn.connect();

	  
    String path = "/D:/蓝鸥实训/a.txt";
	
     
	      String type = downurl.substring(downurl.lastIndexOf("."));
	  
	              Date date = new Date();
	  

	      long time = date.getTime();

	      
String filename = path+"/"+time+type;
	
   
	      InputStream input = conn.getInputStream();
	  
	    	      BufferedInputStream binput = new BufferedInputStream(input);
	  
	 	      FileOutputStream fout = new FileOutputStream(filename);
	  
	  	      BufferedOutputStream bout = new BufferedOutputStream(fout);
	  
		      long t1 =   System.currentTimeMillis();
	  
	  
	      int read = 0;
	  
	  
	      while((read=binput.read())!=-1){		  
		   
			      bout.write(read);		  
		  
	
        }
	  
	  
	      fout.flush();
	  
	  
	      fout.close();
	  
	  
	      input.close();
	  
	  
	      long t2 = System.currentTimeMillis();
	  	  
	  	      System.out.println(t2-t1);
	

	} catch (Exception e) {
	
	// TODO Auto-generated catch block
		
	      e.printStackTrace();

	 }
	
		

	}


}
