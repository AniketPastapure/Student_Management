package com.student_manage;
import java.sql.Connection;
import java.sql.DriverManager;
public class CP {
	static Connection con;
public static Connection createC() {
	
	
	
	try {
		//load the driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//create connection
		String user = "root";
		String password = "yourpassword";
//		String url = "jdbc:mysql://localhost:3306/student_manage";
		String url="jdbc:mysql://localhost:3306/student_manage?characterEncoding=utf8";
		
		//getConnection
		con = DriverManager.getConnection(url,user,password);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return con;
}
}
