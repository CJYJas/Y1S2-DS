/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 * @param <N>
 */
import java.util.*;
public class Graph<T extends Comparable<T>, N extends Comparable <N>>{
    private Vertex<T, N> head;
    private Vertex<T, N> tail;
    private int size;
    
    public Graph(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public boolean addVertex(T v){
        if(hasVertex(v)){
            return false;
        }
        
        Vertex<T, N> newVertex = new Vertex<>(v, null);
        if (head == null) {
            head = newVertex;
            tail = newVertex;
        } else {
            tail.setNextVertex(newVertex); // Link the current last to the new one
            tail = newVertex;             // Move the tail pointer to the new end
        }
        size ++;
        return true;
    }
    
    public Vertex<T, N> getVertex(T info){
        Vertex<T, N> temp = head;
        
        while(temp != null){
            if(temp.getVertexInfo().compareTo(info) == 0){
                return temp;
            }
            
            temp = temp.getNextVertex();
        }
        
        return null;
    }
    
    public boolean hasVertex(T info){
        if(head == null){
            return false;
        }
        
        Vertex<T, N> temp = head;
        while(temp != null){
            if(temp.getVertexInfo().compareTo(info) == 0){
                return true;
            }
            
            temp = temp.getNextVertex();
        }
        
        return false;
    }
    
    public boolean addDirectedEdge(T source, T destination){
        if(head == null){
            return false;
        }
        
        if(!hasVertex(source) || !hasVertex(destination)){
            return false;
        }
        
        Vertex<T, N> sourceVertex = getVertex(source);
        Vertex<T, N> destinationVertex = getVertex(destination);
        Edge<T, N> newEdge = new Edge<>(destinationVertex, sourceVertex.getfirstEdge());
        sourceVertex.setFirstEdge(newEdge);
        
        sourceVertex.setOutDeg(sourceVertex.getOutDeg() + 1);
        destinationVertex.setIndDeg(destinationVertex.getInDeg() + 1);
        return true;
    }
    
    public void printEdge(){
        Vertex<T, N> temp = head;
        
        while(temp != null){
            System.out.println(temp.getVertexInfo() + " --> ");
            Edge<T, N> currEdge = temp.getfirstEdge();
            
            while(currEdge != null){
                System.out.print(currEdge.getToVertex().getVertexInfo() + ":" + currEdge.getToVertex().getInDeg());
                System.out.print(" ");
                currEdge = currEdge.getNextEdge();
            }
            
            System.out.println("");
            temp = temp.getNextVertex();
        }
    }
    
    public List<T> findPath(T start, T destination){
        List<T>visited = new ArrayList<>();
        List<T> path = new ArrayList<>();
        
        Vertex<T, N> startNode = getVertex(start);
        
        if(dfs(startNode, destination, visited, path)){
            return path;
        }
        
        return null;
    }
    
    private boolean dfs(Vertex<T, N> current, T dest, List<T> visited, List<T> path){
        if(current == null){
            return false;
        }
        
        visited.add(current.getVertexInfo());
        path.add(current.getVertexInfo());
        
        if(current.getVertexInfo().compareTo(dest) == 0){
            return true;
        }
        
        Edge<T, N> edge = current.getfirstEdge();
        while(edge != null){
            Vertex<T, N> neighbour = edge.getToVertex();
            
            if(!visited.contains(neighbour.getVertexInfo())){
                if(dfs(neighbour, dest, visited, path)){
                    return true;
                }
            }
            
            edge = edge.getNextEdge();
        }
        
        path.remove(path.size() - 1);
        return false;
    }
}

