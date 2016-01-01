package file.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedEx {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\mahak\\Desktop\\testin.txt";
		FileInputStream fin = new FileInputStream(path);
		InputStreamReader in = new InputStreamReader(fin);
		BufferedReader buff = new BufferedReader(in);
		
		FileWriter fwriter = new FileWriter("C:\\Users\\mahak\\Desktop\\testin_copied.txt");
		BufferedWriter out = new BufferedWriter(fwriter);
		
		//for reading
//		BufferedReader buffered = new BufferedReader(new FileReader("C:\\Users\\mahak\\Desktop\\testin.txt"));
//		String line1 = buffered.readLine();
		
		String line;
		while((line = buff.readLine()) != null){
			System.out.println(line);
			out.write(line);
			out.newLine();
		}
		out.flush();
		
		
		

	}

}
