import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.student_manage.Student;
import com.student_manage.StudentDao;
public class start {

	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("WELCOME TO STUDENT MANAGEMENT SYSTEM");
      while(true) {
    	  System.out.println(" PRESS 1 to ADD student\n PRESS 2 to DELETE student \n PRESS 3 to DISPLAY student \n PRESS 4 to EXIT");
     int c = Integer.parseInt(br.readLine());
//     sc.nextLine();
     if(c==1){
      
    	  System.out.println("Enter Student Name");
//    	  sc.nextLine();
    	  String name = br.readLine();
//    	  sc.nextLine();
    	  System.out.println("Enter Student Phone");
    	  String phone= br.readLine();
    	  System.out.println("Enter Student City");
    	  String city = br.readLine();
    	  Student st = new Student(name,phone,city);
    	  System.out.println(st);
    	boolean ans = StudentDao.insertStudentToDB(st);
    	if(ans) {
    		System.out.println("Student is added successfully..");
//    		System.out.println(st);
    	}
    	else {
    		System.out.println("Something went wrong try again");
    	}
      }
     
     else if(c==2) {
    	 System.out.println("Enter Student id to delete");
    	 int userId = Integer.parseInt(br.readLine());
    	 boolean f = StudentDao.deleteStudent(userId);
    	 if(f) {
    		 System.out.println("Successfully deleted");
    	 }
    	 else {
    		 System.out.println("Something went wrong");
    	 }
    	 
     }
     else if(c==3) {
    	 System.out.println("Show All Student Data");
    	 System.out.println();
    	 StudentDao.showAllStudent();
     }
     else if(c==4) {
    	 break;
     }
     else {
    	 System.out.println("Invalid data Pls Enter valid input");
     }
      }

	}

}
