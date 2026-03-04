/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class LinkedList {
    ListNode head;
    
     public void originalList(String s){
        ListNode newNode = new ListNode(s);
        
        if(head ==  null){
            head = newNode;
        }else{
            ListNode curr = head;
            
            while(curr.next != null){
                curr = curr.next;
            }
            
            curr.next = newNode;
        }
    }
     
    public void display(){
        ListNode curr = head;
        int count = 0;
        
        while(curr != null){
            int column = count % 4;
            
            switch (column) {
                case 0 -> System.out.print("Course : " + curr.data + " ");
                case 1 -> System.out.print("(" + curr.data + ") ");
                case 2 -> System.out.print("- " + curr.data + " credit hours.");
                default -> System.out.println(" Grade : " + curr.data + " -->");
            }
            
            curr = curr.next;
            count ++;
        }
    }
    
    public int totalCreditHour(){
        ListNode curr = head;
        int totalCreditHour = 0;
        int count = 0;
        
        while(curr != null){
            int column = count % 4;
            
            if(column == 2){
                totalCreditHour += Integer.parseInt(curr.data);
            }
            
            curr = curr.next;
            count ++;
        }
        
        return totalCreditHour;
    }
    
    public int totalPoint(){
        ListNode curr = head;
        int totalPoint = 0;
        int count = 0;
        
        while(curr != null){
            int column = count % 4;
            
            if(column == 3){
                String grade = curr.data;
                switch(grade){
                    case "A" -> totalPoint += 4;
                    case "B" -> totalPoint += 3;
                    case "C" -> totalPoint += 2;
                    case "D" -> totalPoint += 1;
                    default -> totalPoint += 0;
                }
            }
            
            curr = curr.next;
            count ++;
        }
        return totalPoint;
    }
}
