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
        Graph<String> graph = new Graph<>();
        String[] cities = {"a", "b", "c", "d", "e"};
        
        for(String c : cities){
            graph.addVertex(c);
        }
        
        graph.addUndirectedEdge("a", "b");
        graph.addUndirectedEdge("a", "e");
        graph.printUndirectedEdge();
        
        graph.removeEdge("a", "b");
        graph.removeEdge("a", "e");
        
        graph.addEdge("b", "c");
        graph.addEdge("d", "e");
        graph.printDirectedEdge();
    }  
}
