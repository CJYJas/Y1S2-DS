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
        System.out.printf("%-10s | %-20s | %s%n", "Token", "Content in Stack", "Current Output");
        System.out.println("-------------------------------------------------------------------");
        String result = ExpressionParser.infixToPostFix("A*(B+C)/D");
        System.out.println("Final Postfix Result : " + result);
    }
}
