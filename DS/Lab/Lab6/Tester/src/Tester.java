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
        QueueList<String> list = new QueueList<>();
        System.out.println("Enter transactions :D 400 | W 300 | W 700 | D 200 | D 450 | W 120");
        
        String[] transaction = {"D 400" , "W 300" , "W 700" , "D 200" , "D 450" , "W 120"};
        for(String s : transaction){
            list.enqueue(s);
        }
        
        list.showList();
        
        double initialBalance = 500;
        System.out.println("Initital Balance : " + initialBalance);
        
        Logic(list, initialBalance);
    }

   public static void Logic(QueueList<String> list, double initialBalance) {

    while (list.getSize() != 0) {
        String transaction = list.dequeue();
        String[] split = transaction.split(" ");
        String action = split[0];
        int val = Integer.parseInt(split[1]);

        if (action.equals("D")) {
            initialBalance += val;
            System.out.printf("%-10s %-8d %-12s New Balance: %.2f\n", "Deposit", val, "", initialBalance);
        } else if (action.equals("W")) {
            if (val > initialBalance) {
                System.out.printf("%-10s %-8d %-12s New Balance: %.2f\n", "Withdraw", val, "Rejected", initialBalance);
            } else {
                initialBalance -= val;
                System.out.printf("%-10s %-8d %-12s New Balance: %.2f\n", "Withdraw", val, "", initialBalance);
            }
        }
    }
}
}


