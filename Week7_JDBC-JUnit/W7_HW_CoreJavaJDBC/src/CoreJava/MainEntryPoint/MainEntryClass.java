package CoreJava.MainEntryPoint;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CoreJava.CustomExceptions.StudentRegistrationException;
import CoreJava.DAO.AttendingDAO;
import CoreJava.DAO.CourseDAO;
import CoreJava.DAO.InstructorDAO;
import CoreJava.DAO.StudentDAO;
import CoreJava.DAO.TeachingDAO;
import CoreJava.Models.Attending;
import CoreJava.Models.Course;
import CoreJava.Models.Instructor;
import CoreJava.Models.Student;
import CoreJava.Models.Teaching;



public class MainEntryClass
{
    //Seesion ONE
//    public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
//       Scanner in = new Scanner(System.in);
//       StudentDAO sDAO1 = new StudentDAO();
//       Student stu1 = new Student();
//       
//       InstructorDAO iDAO1 = new InstructorDAO();
//       Instructor ins1 = new Instructor();
//       List<Instructor> instructors = new ArrayList<Instructor>();
//       
//       CourseDAO cDAO1 = new CourseDAO();
//       Course crs1 = new Course();
//       List<Course> courses = new ArrayList<Course>();
//       
//       AttendingDAO aDAO1 = new AttendingDAO();
//       Attending atd1 = new Attending();
//       List<Attending> attendings = new ArrayList<Attending>();
//       
//       TeachingDAO tDAO1 = new TeachingDAO();
//       Teaching teach1 = new Teaching();
//       List<Teaching> teachings = new ArrayList<Teaching>();
       
//       stu1 = sDAO1.getStudentByGmail("y@gmail.com");
       // StudentDAO.getStudentByGmail() check
//       System.out.println("Student ID: " + stu1.getStudent_id());
//       System.out.println("Student FullName: " + stu1.getFull_name());
//       System.out.println("Student Email: " + stu1.getEmail());
//       System.out.println("Student GPA: " + stu1.getGpa());
//       System.out.println("Student Role: " + stu1.getStudent_role());
      
       // StudentDAO.validateUser() check
//       System.out.println("Type Users Password");
//       String passInput;
//       passInput = in.nextLine();
//       System.out.println(sDAO1.validateUser(stu1.getPass(), passInput));
       
       // InstructorDAO.getAllInstructors() check
//       instructors = iDAO1.getAllInstructors();
//       for(Instructor ins: instructors) {
//    	   System.out.println("Instructor ID: " + ins.getIntrcutor_id());
//    	   System.out.println("Instructor Name: " + ins.getFull_name());
//    	   System.out.println("Instructor Email: " + ins.getEmail());
//    	   System.out.println("Instructor Speciality: " + ins.getSpeciality());
//    	   System.out.println("Admin Role: " + ins.getInstructor_role());
//    	   System.out.println("Pass: " + ins.getPass());
//    	   System.out.println();
//       }
       
       // InstructorDAO.getInstructoByGmail() check
//       String ins_email = "lance@gmail.com";
//       System.out.println("Searching Instrucotr by e mail...");
//       ins1 = iDAO1.getInstructoByGmail(ins_email);
//	   System.out.println("Instructor ID: " + ins1.getIntrcutor_id());
//	   System.out.println("Instructor Name: " + ins1.getFull_name());
//	   System.out.println("Instructor Email: " + ins1.getEmail());
//	   System.out.println("Instructor Speciality: " + ins1.getSpeciality());
//	   System.out.println("Admin Role: " + ins1.getInstructor_role());
//	   System.out.println("Pass: " + ins1.getPass());
	   
       // InstructorDAO.validateUser() check
//       instructors = iDAO1.getAllInstructors();
//       System.out.println(iDAO1.validateUser (instructors.get(2), "666"));
//       System.out.println(iDAO1.validateUser (instructors.get(1), "555"));
//       System.out.println(iDAO1.validateUser (instructors.get(1), "444"));
       
       // CourseDAO.getAllCourses() check
//       System.out.println("Getting All Courses From Database...");
//       courses = cDAO1.getAllCourses();
//       for(Course course: courses) {
//    	   System.out.println("Course ID: " + course.getCourse_id());
//    	   System.out.println("Course Name: " + course.getCourse_name());
//    	   System.out.println("Course Minimum GPA: " + course.getMinimum_gpa());
//    	   System.out.println();
//       }
       
       // CourseDAO.getCourseByInstructor() check
//       System.out.println("Getting courses by instructor id...");
//       courses = cDAO1.getCourseByInstructor(2);
//       for(Course course: courses) {
//    	   System.out.println("Course ID: " + course.getCourse_id());
//    	   System.out.println("Course Name: " + course.getCourse_name());
//    	   System.out.println("Course Minimum GPA: " + course.getMinimum_gpa());
//    	   System.out.println();
//       }
       
       // AttendingDAO.registerStudentToCourse() check
//       stu1 = sDAO1.getStudentByGmail("A@gmail.com");
//       courses = cDAO1.getAllCourses();
//       System.out.println("You registered course. Attending ID: " + aDAO1.registerStudentToCourse(stu1, courses.get(1)));
       
       // AttendingDAO.getStudentCourse() check
//       attendings = aDAO1.getStudentCourse(1);
//	   for(Attending att: attendings) {
//		   System.out.println("Course Name: " + att.getCourse_name());
//		   System.out.println("Instructor's Name: " + att.getFull_name());
//		   System.out.println("Instractor's Email " + att.getEmail());
//		   System.out.println();
//	   }
       
       // TeachingDAO.assignInstructorToCourse(); check
//       int a = 2;
//       int b = 1;
//       System.out.println("You registered course. "
//    		+ "Course ID : " + a + "\n"
//    		+ "Instructor ID : " + b + "\n"
//       		+ "Teaching ID: " + tDAO1.assignInstructorToCourse(a, b));
       
       // TeachingDAO.getIntructorsCourses(); check
//     teachings = tDAO1.getIntructorsCourses();
//	   for(Teaching teach: teachings) {
//		   System.out.println("Course Name: " + teach.getCourse_name());
//		   System.out.println("Minimum GPA for taking the course: " + teach.getMinimum_gpa());
//		   System.out.println("Instractor's Full Name: " + teach.getFull_name());
//		   System.out.println("Instractor's Email: " + teach.getEmail());
//		   System.out.println();
//	   }
     
//    }
	
//    ================================================================================================================================
//    =====================================================     Seperator      =======================================================
//    ================================================================================================================================
    public void allIntructors() throws ClassNotFoundException, IOException, SQLException {
        InstructorDAO insDAO = new InstructorDAO();
        
        List<Instructor> allIns = insDAO.getAllInstructors();
        System.out.printf("\nInstructors:\n======================================================================\n");
        System.out.printf("%-3s INTRUCTOR NAME \t INSTRUCTOR EMAIL \t INSTRUCTOR SPECIALITY\n","ID");
        
        for(Instructor insAGN : allIns) {
            System.out.printf("%-3s %-20s %-23s %s\n",insAGN.getInstructor_id(),  insAGN.getFull_name(), insAGN.getEmail(), insAGN.getSpeciality());
        }
        
    }
    
    public void allCourse() throws ClassNotFoundException, IOException, SQLException {
        CourseDAO coDAO = new CourseDAO();
        
        List<Course> allCo = coDAO.getAllCourses();
        System.out.printf("\nCourses:\n===============================================\n");
        System.out.printf("%-3s COURSE NAME \t MINIMUN GPA\n", "ID");
        
        for(Course coAGN : allCo) {
            System.out.printf("%-3s %-20s %s\n",coAGN.getCourse_id(),  coAGN.getCourse_name(), coAGN.getMinimum_gpa());
        }
        
    }
    
    public void allCoursesWithInstructor() throws SQLException {
        TeachingDAO teaDAO = new TeachingDAO();
        List<Teaching> teaList = teaDAO.getInstructorsCourses();
        System.out.printf("COURSE NAME \t COURSE MINIMUN GPA \t INTRUCTOR NAME \t INSTRUCTOR EMAIL\n\n");
        for(Teaching teaAGN : teaList) {
            System.out.printf("%-16s %-23s %-23s %s\n", teaAGN.getCourse_name(), teaAGN.getMinimum_gpa(), 
                    teaAGN.getFull_name(), teaAGN.getEmail());
        }
    }
    
    public void StudentCourses(List<Attending> attList) {
        int counter = 1;
        System.out.printf("\nMy Classes:\n");
        System.out.printf("%-3s COURSE NAME \t INTRUCTOR NAME \t INSTRUCTOR EMAIL\n", "#");
        for(Attending att : attList) {
            System.out.printf("%-3s %-20s %-23s %s\n", counter, att.getCourse_name(), att.getFull_name(), att.getEmail());
            counter++;
            
        }
    }
    
    public void allCourses(List<Course> coList) {
        int counter = 1;
        System.out.printf("\nAll Courses:\n");
        System.out.printf("%-3s COURSE NAME \t MINIMUN GPA\n", "ID");
        for(Course co : coList) {
            System.out.printf("%-3s %-20s %s\n", counter, co.getCourse_name(), co.getMinimum_gpa());
            counter++;
        }
    }
    
    public static void main(String[] args) throws ClassNotFoundException, IOException, StudentRegistrationException, SQLException {
        boolean quit = false;
        Scanner reader = new Scanner(System.in);
        MainEntryClass mainObj = new MainEntryClass();
        int InsOrStu = -1;
        Instructor ins = null;  InstructorDAO insDAO = null;   String insROLE = "";
        
        
        Student stu = null;     StudentDAO stuDAO = null;
        
        Course co = null;       CourseDAO coDAO = null;
        
        Attending att = null;   AttendingDAO attDAO = null;
        
        Teaching tea = null;    TeachingDAO teaDAO = null;
        
        String email = "";
        String password = "";
        while(!quit) {
            System.out.println("Are you a(n)\n1. Instructor \n2. Student \n3. quit \nPlease, enter 1, 2 or 3 \n");
            InsOrStu = reader.nextInt();
            if(InsOrStu == 1) {
                boolean logout = false;
                while(!logout) {
                    System.out.println("Enter Your Email:\n");
                    email = reader.next();
                    System.out.println("Enter Your Password:\n");
                    password = reader.next();
                    insDAO = new InstructorDAO();
                    ins = insDAO.getInstructoByGmail(email);
                    
                    insROLE = insDAO.validateUser(ins, password);
                    
                    
                    if("Admin".equals(insROLE)) {
                        teaDAO = new TeachingDAO();
                        mainObj.allCoursesWithInstructor();
                        String out = "-1";
                        while(!out.equals("2")) {
                            System.out.printf("\n\n");
                            System.out.println("1. Assign Instructor to Course");
                            System.out.println("2. Logout");
                            out = reader.next();  
                            
                            if(out.equals("1")) {
                                int instructor_id = -1;
                                int course_id = -1;
                                mainObj.allIntructors();
                                System.out.println("\nWhat Instructor?\n");
                                instructor_id = reader.nextInt();
                                mainObj.allCourse();
                                System.out.println("\nWhich Course?\n");
                                course_id = reader.nextInt();
                                int assignId =  teaDAO.assignInstructorToCourse(course_id, instructor_id);
                                if(assignId != -1) {
                                    System.out.println("\n -->Instructor Assigned<--\nNew Record Id: "+ assignId+"\n");
                                }
                                mainObj.allCoursesWithInstructor();
                            }
                        }
                        System.out.printf("\n\n");
                        logout = true;
                    }else if("Instructor".equals(insROLE)) {
                        coDAO = new CourseDAO();
                        List<Course> coList = coDAO.getCourseByInstructor(ins.getInstructor_id());
                        System.out.printf("COURSE NAME \t COURSE MINIMUN GPA\n");
                        for(Course insCO : coList) {
                            System.out.printf("%s \t\t %s\n", insCO.getCourse_name(), insCO.getMinimum_gpa());
                        }
                        String out = "-1";
                        while(!out.equals("1")) {
                            System.out.println("1. Logout");
                            out = reader.next();  
                        }
                        ins = null;
                        logout = true;
                    }else if("Wrong Credentials".equals(insROLE)) {
                        System.out.println(insROLE);
                        continue;
                    }
                
                }
                
            }else if(InsOrStu == 2) {
                stuDAO = new StudentDAO();
                attDAO = new AttendingDAO();
                boolean logout = false;
                while(!logout) {
                    System.out.println("Enter Your Email:\n");
                    email = reader.next();
                    System.out.println("Enter Your Password:\n");
                    password = reader.next();
                    
                    List<Attending> attList = null;
                    stu = stuDAO.getStudentByGmail(email);
                    
                    if(stu != null && stu.getStudent_role() == -1 && stuDAO.validateUser(stu.getPass(), password)) {
                        
                        String classesTo = "";
                        while(!classesTo.equals("2")) {
                            attList = attDAO.getStudentCourse(stu.getStudent_id());
                            mainObj.StudentCourses(attList);
                            System.out.printf("\n1. Register to Class");
                            System.out.printf("\n2. Logout\n");
                            classesTo = reader.next();
                            if(classesTo.equals("1")) {
                                coDAO = new CourseDAO();
                                attDAO = new AttendingDAO();
                                List<Course> coList = coDAO.getAllCourses();
                                mainObj.allCourses(coList);
                                System.out.println("\nWhich Course?\n");
                                int course_idForStudent = reader.nextInt();
                                attDAO.registerStudentToCourse(stu, coList.get(course_idForStudent - 1));
                                classesTo = "";
                            }
                        }
                        logout = true;
                    }else {
                        System.out.printf("\nWrong Credentials\n");
                        continue;
                    }
                }
                
            }else if(InsOrStu == 3) {
                quit = true;
            }
        }
        
    }
}
