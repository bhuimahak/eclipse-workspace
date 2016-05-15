 package database;

//STEP 1. Import required packages
import java.sql.*;

public class DBTest {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/mahak";

	// Database credentials
	static final String USER = "mahak";
	static final String PASS = "arslan";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName(JDBC_DRIVER);

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql = "SELECT * FROM employee;";
			rs = stmt.executeQuery(sql);

			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				int id = rs.getInt("EmpID");
				String empName = rs.getString("EmpName");
				int salary = rs.getInt("salary");

				// Display values
				System.out.print("ID: " + id);
				System.out.print(", EmpName: " + empName);
				System.out.println(", Salary: " + salary);
			}
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			// STEP 6: Clean-up environment
			try {
				if(rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
				se2.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}// end try
		System.out.println("Goodbye!");
	}// end main
}// end FirstExample