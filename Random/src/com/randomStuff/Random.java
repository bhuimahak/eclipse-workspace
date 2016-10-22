package com.randomStuff;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Random {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f = null;
		try {
			 f = new FileInputStream(new File("edsd.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(f != null){
				f.close();
			}
		}

	}

}
