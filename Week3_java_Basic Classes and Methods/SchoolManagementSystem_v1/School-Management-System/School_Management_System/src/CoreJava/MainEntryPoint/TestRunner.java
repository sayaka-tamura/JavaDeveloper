package CoreJava.MainEntryPoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CoreJava.DAO.AttendingDAO;
import CoreJava.DAO.CourseDAO;
import CoreJava.DAO.StudentDAO;
import CoreJava.Models.Attending;
import CoreJava.Models.Course;
import CoreJava.Models.Student;

public class TestRunner {
    public static void main(String[] args) {
         
        /** ------------------- Start check StudentDAO ------------------- */
//        StudentDAO studao1 = new StudentDAO();
//        List<Student> stu_arr = new ArrayList<Student>();   
    	
//        stu_arr = studao1.getStudents();
//        for(Student s : stu_arr) {
//        	System.out.format("%-20s | %-20s | %-10s \n", s.getEmail(),s.getName(), s.getPass());
//        }
//        
//        
//        Student stu = studao1.getStudentByEmail(stu_arr, "E.leota@gmail.com");
//        if(stu != null)
//        	System.out.println(stu.getName() + "\'s info is found at the list");
//        else
//        	System.out.println("Could not find the Student info from the e-mail.");
//        
//        
//        boolean valid1 = studao1.validateUser(stu_arr, "D.leota@gmail.com", "leonaldlove0624");
//        if(valid1)
//        	System.out.println("Student email or password is valid");
//        else
//        	System.out.println("Student email or password is not valid");
        
        /** ------------------- End check StudentDAO ------------------- */
    	
    	/** ------------------- Start check CourseDAO ------------------- */
        CourseDAO crsdao1 = new CourseDAO(); 
        List<Course> crs_arr = new ArrayList<Course>();
        crs_arr = crsdao1.getAllCourses();
        
//        for(Course c: crs_arr)
//        	System.out.format("%-6s | %-20s | %-20s \n", c.getCourseID(),c.getCourseName(), c.getInstructorName());
        
        /** ------------------- End check CourseDAO ------------------- */      
        
        /** ------------------- Start check AttendingDAO ------------------- */
    	
        AttendingDAO atddao1 = new AttendingDAO();
        List<Attending> att_arr = new ArrayList<Attending>();
        att_arr = atddao1.getAttending();
        
        for(Attending a: att_arr)
        	System.out.format("%-6s | %-20s \n", a.getCourseID(),a.getStudentEmail());
        
        /** registerStudentToCourse */
        atddao1.registerStudentToCourse(att_arr, "arccycle@gmail.com", 235);
        for(Attending a: att_arr)
        	System.out.format("%-6s | %-20s \n", a.getCourseID(),a.getStudentEmail());
        
        /** getStudentCourses() */
        List<Course> courses_attending = new ArrayList<Course>();
        courses_attending = atddao1.getStudentCourses(crs_arr, att_arr, "Kris@gmail.com");
        for(Course c:courses_attending)
        	System.out.format("%-6s | %-20s | %-20s \n", c.getCourseID(),c.getCourseName(), c.getInstructorName());
        
        /** ------------------- End check AttendingDAO ------------------- */
        
        

        
        
    }
}
