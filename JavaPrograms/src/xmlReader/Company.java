package xmlReader;

import java.util.List;

public class Company {

	List<Staff> staffList;

	public List<Staff> getStaffList() {
		return staffList;
	}

	public void setStaffList(List<Staff> staffList) {
		this.staffList = staffList;
	}

	@Override
	public String toString() {
		return "Company [staffList=" + staffList + "]";
	}
	

}
