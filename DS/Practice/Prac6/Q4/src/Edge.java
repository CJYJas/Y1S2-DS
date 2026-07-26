/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
public class Edge<T>{
    private Edge<T> nextEdge;
    private Vertex<T> toVertex;
    
    public Edge(){
        this.nextEdge = null;
        this.toVertex = null;
    }
    
    public Edge(Vertex<T> destination, Edge<T> edge){
        this.toVertex = destination;
        this.nextEdge = edge;
    }
    
    public Edge<T> getNextEdge(){
        return this.nextEdge;
    }
    
    public Vertex<T> getToVertex(){
        return this.toVertex;
    }

    public void setNextEdge(Edge<T> nextEdge){
        this.nextEdge = nextEdge;
    }
    
    public void setToVertex(Vertex<T> toVertex){
        this.toVertex = toVertex;
    }
}
