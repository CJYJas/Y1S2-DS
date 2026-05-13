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
    private Vertex<T, N> nxtVertex;
    private Edge<T, N> firstEdge;
    
    public Vertex(){
        this(null, null);
    }
    
    public Vertex(T vInfo, Vertex<T, N> nextVertex){
        this.vertexInfo = vInfo;
        this.inDeg = 0;
        this.outDeg = 0;
        this.nxtVertex = nextVertex;
        this.firstEdge = null;
    }
    
    public T getVertexInfo(){
        return this.vertexInfo;
    }
    
    public int getInDeg(){
        return this.inDeg;
    }
    
    public int getOutDeg(){
        return this.outDeg;
    }
    
    public Vertex<T, N> getNextVertex(){
        return this.nxtVertex;
    }
    
    public Edge<T, N> getfirstEdge(){
        return this.firstEdge;
    }
    
    public void setVertexInfo(T info){
        this.vertexInfo = info;
    }
    
    public void setIndDeg(int inDeg){
        this.inDeg = inDeg;
    }
    
    public void setOutDeg(int outDeg){
        this.outDeg = outDeg;
    }
    
    public void setNextVertex(Vertex<T, N> nextVertex){
        this.nxtVertex = nextVertex;
    }
    
    public void setFirstEdge(Edge<T, N> firstEdge){
        this.firstEdge = firstEdge;
    }
}
