package CoreJava.DAO;

import CoreJava.Models.Attending;
import CoreJava.Models.Course;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendingDAO {
	
	String path = "C:\\Users\\arccy\\Desktop\\attending.csv";
	File file = new File(path);
	
	/**
	 * reads the Attending.csv file and returns the data as a List<Attending>
	 * @return List<Attending> all Attending object info
	 */
    public List<Attending> getAttending(){    	
    	ArrayList<Attending> att_arr = new ArrayList<Attending>();

    	try {
    		Scanner in = new Scanner(file);
    		while(in.hasNextLine()) {
    			String [] attending_info = in.nextLine().split(",");
    			
    			Attending att = new Attending();
    			att.setCourseID(Integer.parseInt(attending_info[0]));
    			att.setStudentEmail(attending_info[1]);
    			
    			att_arr.add(att);
    		}
    		in.close();
    	}
    	catch(FileNotFoundException e) {
    		e.printStackTrace();
    	}	
		return att_arr;
    }
    
    /**
     * It checks if a Student with that Email is currently attending a Course with that ID.
     * If the Student is not attending that Course, 
     * add a new Attending object with the Student’s Email and Course ID to the List.
     * @param attending
     * @param studentEmail
     * @param courseID
     */
    public void registerStudentToCourse(List<Attending> attending, String studentEmail, int courseID){
    	boolean attended = false;			// check whether a student with e-mail attending a course with the ID
    	
    	for(Attending a:attending) {
	    	if(a.getStudentEmail().equals(studentEmail) && a.getCourseID()==courseID) {	    		
	    		attended = true;
	    	}
    	}
    	
    	if(attended)
    		System.out.println("The Student with \"" + studentEmail + "\" is currently attending to the course: " + courseID);
    	else {
    		System.out.println("The Student with \"" + studentEmail + "\" was registered on to the course: " + courseID + " now");
    		// add a new Attending object with the Student’s Email and Course ID to the List.
    		Attending nowattend = new Attending();
    		nowattend.setStudentEmail(studentEmail);
    		nowattend.setCourseID(courseID);
    		
    		attending.add(nowattend);
    		saveAttending(attending);
    	}
    }
    
    /**
     * This method takes a Student’s Email as a parameter 
     * and would search the Attending List for all the courses 
     * that a student is registered to base on the Id.
     * 
     * Each of these is added to a new List of courses. 
     * This list of courses the Student is attending is returned
     * @param courseList the contents of course.csv
     * @param attending the contents of attending.csv
     * @param studentEmail for search attending list
     * @return List<Course> This list of courses the Student is attending is returned
     */
    public List<Course> getStudentCourses(List<Course> courseList, List<Attending> attending, String studentEmail)
    {
    	
    	List<Course> courses_attending = new ArrayList<Course>();			// this arrayList will be return
    	
    	for(Attending a:attending) {
    		for(Course c: courseList) {
		    	if(a.getStudentEmail().equals(studentEmail) && c.getCourseID() == a.getCourseID()) {	    		
	        		
	        		courses_attending.add(c);
		    	}
    		}
    	}   		
    	
		return courses_attending;
    }

    /**
     * This method overwrites the original Attending.csv file with the new data
     * @param attending
     */
    public void saveAttending(List<Attending> attending){
    	try {
    		FileWriter writer = new FileWriter(file, true);
    		
    		for(Attending at: attending) {
	    		writer.write(at.getCourseID() + "," + at.getStudentEmail() + "\r\n");
    		}			
			writer.close();
    	}
    	catch (IOException e) {
    		e.printStackTrace();
    	}
    	   	    	
    }

}
