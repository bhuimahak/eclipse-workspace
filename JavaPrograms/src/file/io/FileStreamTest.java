package file.io;

import java.io.*;

public class FileStreamTest {

	public static void main(String args[]) throws IOException {

		
			byte bWrite[] = { 67, 98, 48, 105, 86};
			OutputStream os = new FileOutputStream("test.txt");
			for (int x = 0; x < bWrite.length; x++) {
				os.write(bWrite[x]); // writes the bytes
			}
			os.close();
			

			InputStream in = new FileInputStream("test.txt");
			int size;
			while((size = in.read()) != -1){
				char c = (char) size;
				System.out.println(c);
			}
				
		}
}
