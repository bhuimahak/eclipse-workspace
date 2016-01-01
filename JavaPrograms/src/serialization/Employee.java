package serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private static final long serialVersionUID = -8737159497604670162L;
	private String name;
	private int empId;
	private String city;
	private transient int salary;
	
	Employee(int empId, String name, String city, int salary){
		this.name = name;
		this.empId = empId;
		this.city = city;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}

}
