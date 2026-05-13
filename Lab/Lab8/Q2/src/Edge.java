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
    private N weight;
    
    public Edge(){
        this.nextEdge = null;
        this.toVertex = null;
        this.weight = null;
    }
    
    public Edge(Vertex<T, N> toVertex, Edge<T, N> nextEdge, N weight){
        this.nextEdge = nextEdge;
        this.toVertex = toVertex;
        this.weight = weight;
    }
    
    public Vertex<T, N> getToVertex(){
        return this.toVertex;
    }
    
    public Edge<T, N> getnextEdge(){
        return nextEdge;
    }
    
    public N getWeight(){
        return weight;
    }
    
    public void setToVertex(Vertex<T, N> toVertex){
        this.toVertex = toVertex;
    }
    
    public void setNextEdge(Edge<T, N> nextEdge){
        this.nextEdge = nextEdge;
    }
    
    public void setWeight(N weight){
        this.weight = weight;
    }
}
