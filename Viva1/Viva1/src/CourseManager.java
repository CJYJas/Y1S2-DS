/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
import java.util.*;
public class CourseManager<T extends Course>{
    private List<T> courseList = new ArrayList<>();
    
    public void addCourse(T course){
        courseList.add(course);
    }
    
    public void removeCourse(String courseCode){
        for(T c : courseList){
            if(c.getCourseCode().equals(courseCode)){
                courseList.remove(c);
            }
        }
    }
    
    public T getCourseWithHighestWorkload(){
        Number highestWorkLoad = Integer.MIN_VALUE;
        T highestWorkLoadCourse = courseList.getFirst();
        
        for(T c : courseList){
            Number workload = (Number) c.calculateTotalWorkload();
            
            if(workload.doubleValue() > highestWorkLoad.doubleValue()){
                highestWorkLoad = (Number) workload;
                highestWorkLoadCourse = c;
            }
        }
        
        return highestWorkLoadCourse;
    }
    
    public void sortCourseByWorkLoad(){
        for(int i = 0; i < courseList.size(); i++){
            Number workLoad = (Number) courseList.get(i).calculateTotalWorkload();
            for(int j = i; j < courseList.size(); j++){
                Number workLoad2 = (Number) courseList.get(j).calculateTotalWorkload();
                if(workLoad.doubleValue() > workLoad2.doubleValue()){
                    T temp = courseList.get(i);
                    courseList.set(i, courseList.get(j));
                    courseList.set(j, temp);
                }
            }
        }
        
        System.out.println("Sorted course by total workload in ascending order");
        for(T c : courseList){
            c.printCourseDetails();
            System.out.println("");
        }
        System.out.println("");
    }
    
    public void printAllCourse(){
        for(T c : courseList){
            c.printCourseDetails();
            System.out.println("");
        }
    }
}
