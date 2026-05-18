/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
public class Vertex<T>{
    private T vertexInfo;
    private Edge<T> firstEdge;
    private Vertex<T> nextVertex;
    private int inDeg;
    private int outDeg;
    
    public Vertex(T vertexInfo){
        this.vertexInfo = vertexInfo;
        this.firstEdge = null;
        this.nextVertex = null;
        this.inDeg = 0;
        this.outDeg = 0;
    }
    
    public int getInDeg(){
        return this.inDeg;
    }
    
    public int getOutDeg(){
        return this.outDeg;
    }
    
    public T getVertexInfo(){
        return this.vertexInfo;
    }
    
    public Edge<T> getFirstEdge(){
        return this.firstEdge;
    }
    
    public Vertex<T> getNextVertex(){
        return this.nextVertex;
    }
    
    public void setNextVertex(Vertex<T> nextVertex){
        this.nextVertex = nextVertex;
    }
    
    public void setVertexInfo(T vertexInfo){
        this.vertexInfo = vertexInfo;
    }
    
    public void setFirstEdge(Edge<T> firstEdge){
        this.firstEdge = firstEdge;
    }
    
    public void setInDeg(int inDeg){
        this.inDeg = inDeg;
    }
    
    public void setOutDeg(int outDeg){
        this.outDeg = outDeg;
    }
}
