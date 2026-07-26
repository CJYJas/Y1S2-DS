/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Tester {
    public static void main(String[] args) {
        Integer[] list = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        Order<Integer> order = new Order<>(list);
        
        order.ChangeOrder(4);
    }
}
