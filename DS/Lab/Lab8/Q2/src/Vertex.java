/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class Vertex<T extends Comparable<T>, N extends Comparable<N>>{
    private T vertexInfo;
    private int inDeg;
    private int outDeg;
    private Vertex<T, N> nextVertex;
    private Edge<T, N> firstEdge;
    
    public Vertex(){
        this(null, null);
    }
    
    public Vertex(T vertexInfo, Vertex<T, N> nextVertex){
        this.vertexInfo = vertexInfo;
        this.nextVertex = nextVertex;
        this.inDeg = 0;
        this.outDeg =0;
        this.firstEdge = null;
    }
    
    public T getVertexInfo(){
        return vertexInfo;
    }
    
    public int getIndeg(){
        return inDeg;
    }
    
    public int getOutdeg(){
        return outDeg;
    }
    
    public Vertex<T, N> getNextVertex(){
        return nextVertex;
    }
    
    public Edge<T, N> getFirstEdge(){
        return firstEdge;
    }
    
    public void setVertexInfo(T vertexInfo){
        this.vertexInfo = vertexInfo;
    }
    
    public void setInDeg(int inDeg){
        this.inDeg = inDeg;
    }
    
    public void setOutDeg(int outDeg){
        this.outDeg = outDeg;
    }
    
    public void setNextVertex(Vertex<T, N> nextVertex){
        this.nextVertex = nextVertex;
    }
    
    public void setFirstEdge(Edge<T, N> firstEdge){
        this.firstEdge = firstEdge;
    }
}
