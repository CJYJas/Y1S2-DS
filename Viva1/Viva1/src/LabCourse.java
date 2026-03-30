/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
* Implementation of the Course interface for a standard Lab-based course.
 * This class uses Double as the generic type for workload calculations.
 */
public class LabCourse implements Course<Double>{
    private String courseCode;
    private String courseTitle;
    private String instructorName;
    private double labHoursPerWeek;
    private int numberOfSessions;
    
    /**
     * Constructs a new LectureCourse with specified details.
     * * @param courseCode The unique identifier for the course.
     * @param courseCode
     * @param courseTitle The full name of the course.
     * @param instructorName The name of the professor teaching the course.
     * @param labHoursPerWeek The number of hours spent in class each week.
     * @param numberOfSessions The number of sessions of class each week
     */
    public LabCourse(String courseCode, String courseTitle, String instructorName, double labHoursPerWeek, int numberOfSessions) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.instructorName = instructorName;
        this.labHoursPerWeek = labHoursPerWeek;
        this.numberOfSessions = numberOfSessions;
    }
    
     /**
     * Retrieves the code of the lab.
     * @return The course code String.
     */
    @Override
    public String getCourseCode() {
        return courseCode;
    }
    
    /**
     * Retrieves the full title of the lab.
     * @return The course title String.
     */
    @Override
    public String getCourseTitle() {
    return courseTitle;
    }

     /**
     * Calculates the workload based on a standard 14-week semester.
     * @return The total lecture hours as an Double.
     */
    @Override
    public Double calculateTotalWorkload() {
        return labHoursPerWeek * numberOfSessions * 14;
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
     * Prints a formatted summary of the lab course details to the console.
     */
    @Override
    public void printCourseDetails() {
        System.out.println("Lecture Course: " + courseTitle + " (" + courseCode + ")");
        System.out.println("Instructor: " + instructorName);
        System.out.println("Lecture Hours/Week: " + labHoursPerWeek);
        System.out.println("Total Workload (Semester): " + calculateTotalWorkload() + "hours");
    }

}
