/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class Edge<T extends Comparable<T>, N extends Comparable<N>>{
    private Vertex<T, N> toVertex;
    private Edge<T, N> nextEdge;
    
    public Edge(){
        this.nextEdge = null;
        this.toVertex = null;
    }
    
    public Edge(Vertex<T, N> toVertex, Edge<T, N> nextEdge){
        this.toVertex = toVertex;
        this.nextEdge = nextEdge;
    }
    
    public Vertex<T, N> getToVertex(){
        return this.toVertex;
    }
    
    public Edge<T, N> getNextEdge(){
        return this.nextEdge;
    }
}
