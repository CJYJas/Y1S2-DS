/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
public class Circle implements Comparable<Circle>{
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public int compareTo(Circle o) {
       return Double.compare(this.radius, o.radius);
    }
    
    @Override
    public String toString(){
        return String.valueOf(radius);
    }
}
