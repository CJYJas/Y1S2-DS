/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Tester {
    public static void main(String[] args) {
        Graph<Character, Double> graph = new Graph<>();
        
        Character[] vertex = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        for(Character c : vertex){
            graph.addVertex(c);
        }
        
        graph.addDirectedEdge('A', 'B', 0.4);
        graph.addDirectedEdge('A', 'C', 0.7);
        graph.addDirectedEdge('A', 'G', 0.8);
        graph.addDirectedEdge('B', 'C', 0.1);
        graph.addDirectedEdge('B', 'D', 0.2);
        graph.addDirectedEdge('B', 'E', 0.7);
        graph.addDirectedEdge('C', 'F', 0.3);
        graph.addDirectedEdge('E', 'H', 0.5);
        graph.addDirectedEdge('F', 'H', 0.4);
        graph.addDirectedEdge('G', 'H', 0.8);
        
        System.out.println("Creating a graph with 8 vertices and 10 edges");
        graph.printEdge();
        
        System.out.println("The shortest path from A to H by node count");
        List<Character> shortestPathByNode = graph.findShortestPathByNodeBFS('A', 'H');
        System.out.println(shortestPathByNode.toString());
        
        System.out.println("The shortest path from A to H by node distance");
        List<Character> shortestPathByWeight = graph.getShortestPathByWeight('A', 'H');
        System.out.println(shortestPathByWeight.toString());
    } 
}
