/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <A>
 * @param <B>
 */
public class Duo<A, B>{
    private A first;
    private B second;
    
    public Duo(A first, B second){
        this.first = first;
        this.second = second;
    }
    
    public static void main(String[] args) {
        Duo<String, Integer> sideShape = new Duo("ABC", 1);
        Duo<Double, Double> points = new Duo(1.0, 1.0);
    }
}
