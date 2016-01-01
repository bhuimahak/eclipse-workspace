package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import propertiesEx.PropertiesUtil;

public class SerializationEx {
	public static void main(String[] args) {
		Employee emp = new Employee(1, "A", "Hyderabad", 10000);
		System.out.println(emp);
		
		//String filePath = "resources\\Employee.ser";
		
		String filePath = PropertiesUtil.getProperty("serialization_file_path");
		try {
			serialize(emp, filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Employee empCopy = null;
		try {
			empCopy = deserialize(filePath);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		System.out.println(empCopy);
	}
	
	private static void serialize(Employee e, String filePath) throws IOException {
		FileOutputStream fout = new FileOutputStream(filePath);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(e);
		out.close();
		fout.close();
		System.out.println("Serialized successfully.");
	}
	
	private static Employee deserialize(String filePath) throws IOException, ClassNotFoundException {
		File f = new File(filePath);
		if(!f.exists() || !f.isFile()) {
			return null;
		}
		FileInputStream fin = new FileInputStream(f);
		ObjectInputStream in = new ObjectInputStream(fin);
		Employee e = (Employee) in.readObject();
		in.close();
		fin.close();
		System.out.println("Deserialized successfully.");
		return e;
	}


}
