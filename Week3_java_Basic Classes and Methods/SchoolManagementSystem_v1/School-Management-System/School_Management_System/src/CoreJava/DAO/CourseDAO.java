package CoreJava.DAO;

import CoreJava.Models.Course;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseDAO {
	
	/**
	 * @return List<Course> returns every Course in the table
	 */
    public List<Course> getAllCourses(){
    	ArrayList<Course> crs_arr = new ArrayList<Course>();
    	String path = "C:\\Users\\arccy\\Desktop\\courses.csv";
    	File file = new File(path);
    	
    	try {
	    	Scanner in = new Scanner(file);
	    	while(in.hasNextLine()) {
	    		String[] course_info = in.nextLine().split(",");
	    		
	    		Course crs = new Course();
	    		crs.setCourseID(Integer.parseInt(course_info[0]));
	    		crs.setCourseName(course_info[1]);
	    		crs.setInstructorName(course_info[2]);
	    		crs_arr.add(crs);
    	}
    	in.close();
			
    	} catch (FileNotFoundException e) {
    		e.printStackTrace();
    	}
    	
    	return crs_arr;
    }
}
