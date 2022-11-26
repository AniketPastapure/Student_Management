package com.student_manage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.mysql.jdbc.ResultSet;
public class StudentDao {
 
	public static boolean insertStudentToDB(Student st) {
		boolean f = false;
	    try {
	    	//jdbc to insert code...
			Connection con = CP.createC();
			String q = "insert into students(sname,sphone,scity) values(?,?,?)";
			
			//Prepared statement
//			PreparedStatement pstmt = con.prepareStatement(q);
			PreparedStatement pstmt =con.prepareStatement(q);
			
			//set the value ofparametr
			pstmt.setString(1,st.getStudentName());
			pstmt.setString(2,st.getStudentPhone());
			pstmt.setString(3,st.getStudentCity());
			
			//execute
			pstmt.executeUpdate();
			f =  true;

	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	    
	    return f;
	
	}

//

	public static boolean deleteStudent(int userId) {
		boolean f = false;
	    try {
	    	//jdbc to insert code...
			Connection con = CP.createC();
			String q = "delete from students where sid=?";
			
			//Prepared statement
//			PreparedStatement pstmt = con.prepareStatement(q);
			PreparedStatement pstmt =con.prepareStatement(q);
			
			//set the value ofparametr
			pstmt.setInt(1,userId);
//			
			
			//execute
			pstmt.executeUpdate();
			f =  true;

	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	    
	    return f;
	}

	public static void showAllStudent() {
		boolean f = false;
	    try {
	    	//jdbc to insert code...
			Connection con = CP.createC();
			String q = "select * from students";
			
			Statement stmt = con.createStatement();
			
			ResultSet set=(ResultSet) stmt.executeQuery(q);
			
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone=  set.getString(3);
				String city = set.getString(4);
				
				System.out.println(" ID " + id+" Name "+name+" phone "+phone+" city "+city);
				System.out.println("****************************");
			}
			
			//Prepared statement
//			PreparedStatement pstmt = con.prepareStatement(q);
//			PreparedStatement pstmt =con.prepareStatement(q);
//			
//			//set the value ofparametr
//			pstmt.setString(1,userId);
////			
//			
//			//execute
//			pstmt.executeUpdate();
//			f =  true;

	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	    
	   
		
	}
	
}
