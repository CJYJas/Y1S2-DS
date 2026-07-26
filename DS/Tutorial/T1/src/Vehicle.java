/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
abstract class Vehicle {
    private double maxSpeed;
    protected double currentSpeed = 0.0;
    
    public Vehicle(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    
    public abstract void accelerate();
    
    public double getMaxSpeed(){
        return maxSpeed;
    }
    
    public double getCurrentSpeed(){
        return currentSpeed;
    }
    
    public void pedalToMetal(){
        while(maxSpeed < currentSpeed){
            accelerate();
        }
    }
}
