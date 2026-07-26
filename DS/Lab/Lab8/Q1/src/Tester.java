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
        System.out.println("Creating a graph with 7 vertices and 6 edges");
        
        Graph<Character, Integer> graph = new Graph();
        Character[] vertices = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        
        for(Character v : vertices){
            graph.addVertex(v);
        }
        
        graph.addDirectedEdge('A', 'B');
        graph.addDirectedEdge('A', 'C');
        graph.addDirectedEdge('B', 'D');
        graph.addDirectedEdge('B', 'E');
        graph.addDirectedEdge('C', 'F');
        graph.addDirectedEdge('F', 'G');
        
        graph.printEdge();
        
        System.out.println("Find the path from A to G");
        List<Character> path = graph.findPath('A', 'G');
        System.out.println(path.toString());
    }   
}
