/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class Polynomial {
    private double x;
    
    public Polynomial(double x){
        this.x = x;
    }
    
    public double calculate(){
        double answer = (4.0 * (x * x * x)) + (2.0 * (x * x)) - (0.5 * x) - 20.0;
        return answer;
    }
}

class Tester{
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial(2.0);
        System.out.println("The polynomial is 4.0x^3 + 2.0x^2 - 0.5x - 20.0 when x = 2.0 = " + p1.calculate());
        Polynomial p2 = new Polynomial(-3.5);
        System.out.println("The polynomial is 4.0x^3 + 2.0x^2 - 0.5x - 20.0 when x = -3.5 = " + p2.calculate());
    }
}