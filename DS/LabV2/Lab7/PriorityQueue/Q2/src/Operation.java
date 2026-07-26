/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
class Operation<T extends Comparable<T>>{
    private final PriorityQueue<T> list1;
    private final PriorityQueue<T> list2;
    
    public Operation(PriorityQueue<T> list1, PriorityQueue<T> list2){
        this.list1 = list1;
        this.list2 = list2;
    }
    
    public String Union(){
        Set<T> unionSet = new HashSet<>(list1);
        unionSet.addAll(list2);

        // Put back into a PQ if you want them in priority order
        PriorityQueue<T> result = new PriorityQueue<>(unionSet);
        return result.toString();
    }
    
    public String Intersection(){
        PriorityQueue<T> tempList1 = new PriorityQueue<>(list1);
        PriorityQueue<T> tempList2 = new PriorityQueue<>(list2);
        PriorityQueue<T> result = new PriorityQueue<>();
        
        while(!tempList1.isEmpty() && !tempList2.isEmpty()){
            T head1 = tempList1.peek();
            T head2 = tempList2.peek();
            
            if(head1.equals(head2)){
                result.add(tempList1.poll());
                tempList2.poll();
            }else if(head1.compareTo(head2) < 0){
                tempList1.poll();
            }else{
                tempList2.poll();
            }
        }
        
        return result.toString();
    }
    
    public String Difference(int main){
        PriorityQueue<T> tempList1 = new PriorityQueue<>(list1);
        PriorityQueue<T> tempList2 = new PriorityQueue<>(list2);
        PriorityQueue<T> result = new PriorityQueue<>();
        
        while(!tempList1.isEmpty() && !tempList2.isEmpty()){
            T head1 = tempList1.peek();
            T head2 = tempList2.peek();

            if (head1.equals(head2)) {
                tempList1.poll();
                tempList2.poll();
            } else if (head1.compareTo(head2) < 0) {
                if (main == 1) result.add(head1);
                tempList1.poll();
            } else {
                if (main == 2) result.add(head2);
                tempList2.poll();
            }
        }
        
        if (main == 1) result.addAll(tempList1);
        else if (main == 2) result.addAll(tempList2);
        
        return result.toString();
    }
}
