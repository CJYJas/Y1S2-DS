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
        Graph<String, Integer> graph = new Graph<>();
        
        String[] cities = {"a", "b", "x"};
        for(String s : cities){
            graph.addVertex(s);
        }
        
        graph.addDirectedEdge("a", "b", 1);
        graph.addDirectedEdge("b", "c", 2);
        graph.addDirectedEdge("b", "x", 2);
        
        graph.printEdges();
        
        graph.removeEdge("a", "b");
        graph.printEdges();
    }
}
