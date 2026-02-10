package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlLink {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//step 1 register the driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	// Establish connection
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "ridu");
	
}
}
