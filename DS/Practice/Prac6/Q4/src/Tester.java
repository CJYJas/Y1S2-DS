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
        Graph<Character> graph = new Graph<>();
        
        char[] vertex = {'a', 'b', 'c', 'd', 'e'};
        for(char v : vertex){
            graph.addVertex(v);
        }
        
        graph.addEdge('a', 'b');
        graph.addEdge('b', 'c');
        graph.addEdge('c', 'd');
        graph.addEdge('b', 'a');
        graph.addEdge('d', 'e');
        
        if(graph.hasCycle()){
            System.out.println("Graph has a cycle");
        }else{
            System.out.println("Graph do not have a cycle");
        }     
    }  
}
