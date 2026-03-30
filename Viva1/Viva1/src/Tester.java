/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
* The Tester class acts as the Driver for the Course management system.
 * It demonstrates object creation, polymorphism, and the CourseManager's 
 * ability to handle various course types.
 */
public class Tester {
    public static void main(String[] args) {
        // --- 1. Object Instantiation ---
        // Creating LectureCourse objects (Generic type E = Integer)
        LectureCourse lectureCourse1 = new LectureCourse("CS101", "Intro to Programming", "Dr. Smith", 3);
        LectureCourse lectureCourse2 = new LectureCourse("CS102", "OOP", "Prof. Lee", 4);
        
        // Creating LabCourse objects (Generic type E = Double)
        LabCourse labCourse1 = new LabCourse("CS201", "Data Structures Lab", "Prof. Jones", 2.5, 2);
        LabCourse labCourse2 = new LabCourse("CS202", "Algorithms Lab", "Dr.Brown", 2.0, 1);
        
        
        // --- 2. Collection Management ---
        // Create the manager and an array to facilitate bulk addition
        CourseManager courseManager = new CourseManager();
        
        // Polymorphism in action: Both Lab and Lecture courses fit in a Course array
        Course[] courseList = {lectureCourse1, lectureCourse2, labCourse1, labCourse2};
        
        
        // Populate the manager's internal collection
        for(Course c : courseList){
            courseManager.addCourse(c);
        }
        
        // --- 3. Business Logic: Finding Highest Workload ---
        System.out.println("Course with Highest WorkLoad");
        
        // The manager handles the comparison between Integer and Double workloads
        Course courseWithHighestWorkLoad = courseManager.getCourseWithHighestWorkload();
        courseWithHighestWorkLoad.printCourseDetails();
        
        System.out.println("");
        
        // --- 4. Business Logic: Sorting ---
        // Rearranges the internal list based on calculated workload values
        courseManager.sortCourseByWorkLoad();
        
        // --- 5. Business Logic: Removal and Display ---
        // Search by course code and remove from the list
        System.out.println("Course left after remove couse CS101");
        courseManager.removeCourse("CS101");
        
        // Final display of all remaining courses
        courseManager.printAllCourse();
    }   
}
