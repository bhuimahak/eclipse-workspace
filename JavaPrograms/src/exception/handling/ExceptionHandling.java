package exception.handling;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.text.ParseException;

public class ExceptionHandling {

	public static void main(String[] args) {
		ExceptionHandling exHan = new ExceptionHandling();
		try {
			exHan.computeFriendList1();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("----------------------------------------------------------");

		try {
			exHan.computeFriendList2();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

	public void computeFriendList1() throws FileNotFoundException, SQLException, ParseException {
		externalMethod1();
		externalMethod2();
		externalMethod3();
	}

	public void computeFriendList2() throws MyException {
		try {
			externalMethod1();
			externalMethod2();
			externalMethod3();
		} catch (FileNotFoundException | SQLException | ParseException e) {
			throw new MyException("Exception in computing friend list.", e);
		}

	}

	public void externalMethod1() throws FileNotFoundException {
		boolean someCondition = true;
		if(someCondition == false) {
			throw new FileNotFoundException("File not available.");
		}
	}

	public void externalMethod2() throws SQLException {
		boolean someCondition = false;
		if(someCondition == false) {
			throw new SQLException("Database not available.");
		}
	}

	public void externalMethod3() throws ParseException {
		boolean someCondition = false;
		if(someCondition == false) {
			throw new ParseException("Invalid numbers.", 100);
		}
	}
}
