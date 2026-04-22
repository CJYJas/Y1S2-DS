/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class Edge<T extends Comparable <T>>{
    Vertex<T> toVertex;
    Edge<T> nextEdge;
    
    public Edge(){
        toVertex = null;
        nextEdge = null;
    }
    
    public Edge(Vertex<T> vertex, Edge<T> edge){
        toVertex = vertex;
        nextEdge = edge;
    }
}
