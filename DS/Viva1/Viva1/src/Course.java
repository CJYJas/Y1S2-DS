/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 ** A generic interface representing an Abstract Data Type (ADT) for a Course.
 * @param <E> The numeric type used for workload calculations (e.g., Integer, Double).
 */
public interface Course<E>{
    
    /**
     * Get course unique code
     * @return the course code
     */
    public String getCourseCode();
    
    /**
     * Get course title
     * @return the course title
     */
    public String getCourseTitle();
    
    /**
     * Calculates the total time commitment required for the course.
     * @return calculateTotalWorkload
     */
    public E calculateTotalWorkload();
    
    /**Get course instructor name
     * @return the course instructor name
     */
    public String getInstructorName();
    
    /**
     * Show course details
     */
    public void printCourseDetails();
}
