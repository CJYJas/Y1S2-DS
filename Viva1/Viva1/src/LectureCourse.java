/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Implementation of the Course interface for a standard Lecture-based course.
 * This class uses Integer as the generic type for workload calculations.
 */
public class LectureCourse implements Course<Integer>{
    private String courseCode;
    private String courseTitle;
    private String instructorName;
    private int lectureHoursPerWeek;
    
    /**
     * Constructs a new LectureCourse with specified details.
     * * @param courseCode The unique identifier for the course.
     * @param courseCode
     * @param courseTitle The full name of the course.
     * @param instructorName The name of the professor teaching the course.
     * @param lectureHoursPerWeek The number of hours spent in class each week.
     */
    public LectureCourse(String courseCode, String courseTitle, String instructorName, int lectureHoursPerWeek){
         this.courseCode = courseCode;
         this.courseTitle = courseTitle;
         this.instructorName = instructorName;
         this.lectureHoursPerWeek = lectureHoursPerWeek;
    }
    
    /**
     * Retrieves the code of the lecture.
     * @return The course code String.
     */
    @Override
    public String getCourseCode() {
        return courseCode;
    }
    
    /**
     * Retrieves the full title of the lecture.
     * @return The course title String.
     */
    @Override
    public String getCourseTitle() {
        return courseTitle;
    }
    
    /**
     * Calculates the workload based on a standard 14-week semester.
     * @return The total lecture hours as an Integer.
     */
    @Override
    public Integer calculateTotalWorkload() {
        return lectureHoursPerWeek * 14;
    }
    
    /**
     * Retrieves the name of the instructor.
     * @return The instructor's name String.
     */
    @Override
    public String getInstructorName() {
        return instructorName;
    }
    
    /**
     * Prints a formatted summary of the lecture course details to the console.
     */
    @Override
    public void printCourseDetails() {
        System.out.println("Lecture Course: " + courseTitle + " (" + courseCode + ")");
        System.out.println("Instructor: " + instructorName);
        System.out.println("Lecture Hours/Week: " + lectureHoursPerWeek);
        System.out.println("Total Workload (Semester): " + calculateTotalWorkload() + "hours");
    }
    
}
