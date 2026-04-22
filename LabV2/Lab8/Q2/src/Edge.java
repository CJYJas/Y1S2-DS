/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class Edge<T extends Comparable<T>, N extends Comparable<N>>{
    Vertex<T,N> toVertex;
    Edge<T, N> nextEdge;
    N weight;
    
    public Edge(){
        weight = null;
        toVertex = null;
        nextEdge = null;
    }
    
    public Edge(Vertex<T, N> destination, N w, Edge<T,N> a){
        toVertex = destination;
        nextEdge = a;
        weight = w;
    }
}
