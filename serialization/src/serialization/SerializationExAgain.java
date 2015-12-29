package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExAgain {
	public static void main(String[] args) {
		Employee emp = new Employee(1, "A", "Hyderabad", 10000);
		System.out.println(emp);

		String filePath = "Employee.ser";
		serialize(emp, filePath);

		Employee empCopy = deserialize(filePath);
		System.out.println(empCopy);
	}

	private static void serialize(Employee e, String filePath) {
		FileOutputStream fout = null;
		ObjectOutputStream out = null;
		try {
			fout = new FileOutputStream(filePath);
			out = new ObjectOutputStream(fout);
			out.writeObject(e);
		} 
		catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} 
		catch (IOException e1) {
			e1.printStackTrace();
		} 
		finally {
			try {
				if(out != null) {
					out.close();
				}
				if(fout != null) {
					fout.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		System.out.println("Serialized successfully.");
	}

	private static Employee deserialize(String filePath) {
		File f = new File(filePath);
		if (!f.exists() || !f.isFile()) {
			return null;
		}
		FileInputStream fin = null;
		ObjectInputStream in = null;
		Employee e = null;
		try {
			fin = new FileInputStream(f);
			in = new ObjectInputStream(fin);
			e = (Employee) in.readObject();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		finally {
			try {
				if(in != null) {
					in.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			try {
				if(fin != null) {
					fin.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		System.out.println("Deserialized successfully.");
		return e;
	}

}
