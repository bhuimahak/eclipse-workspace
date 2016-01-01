package file.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		String path = "C:\\Users\\mahak\\Desktop\\testData.xls";
		File f = new File(path);
		if (!f.exists() || !f.isFile()) {
			System.out.println("file doesnt exist");
			throw new FileNotFoundException("file '" + path + "'  not found");
		} else {
			System.out.println("file exists");
		}

		try {
			in = new FileInputStream(path);
			// InputStreamReader ir = new InputStreamReader(in);
			// BufferedReader buff = new BufferedReader(in);

			out = new FileOutputStream("C:\\Users\\mahak\\Desktop\\copiedtestData.xls");

			int c = 0;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("File Copied.");
		} finally {
			if(in != null){
			in.close();
			}
			if(out != null){
			out.close();
			}
		}
	}

}
