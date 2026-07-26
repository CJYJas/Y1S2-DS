/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
import java.util.*;
public class Graph<T>{
    private Vertex<T> head;
    
    public Graph(){
        this.head = null;
    }
    
    public boolean addVertex(T label){
        Vertex<T> newVertex = new Vertex(label);
        
        if(hasVertex(label)){
            return false;
        }
        
        newVertex.setNextVertex(head);
        head = newVertex;
        return true;
    }
    
    public boolean hasVertex(T label){
        if(head == null){
            return false;
        }
        
        Vertex<T> temp = head;
        while(temp != null){
            if(temp.getVertexInfo().equals(label)){
                return true;
            }
            
            temp = temp.getNextVertex();
        }
        
        return false;
    }
    
    public Vertex<T> getVertex(T label){
        if(head == null){
            return null;
        }
        
        Vertex<T> temp = head;
        while(temp != null){
            if(temp.getVertexInfo().equals(label)){
                return temp;
            }
            
            temp = temp.getNextVertex();
        }
        
        return null;
    }
    
    public boolean hasEdge(Vertex<T> source, Vertex<T> destination){
        Edge<T> temp = source.getFirstEdge();
        while(temp != null){
            if(temp.getToVertex().getVertexInfo().equals(destination.getVertexInfo())){
                return true;
            }
            
            temp = temp.getNextEdge();
        }
        
        return false;
    }
    
    public boolean addEdge(T source, T destination){
        if(head == null){
            return false;
        }
        
        if(!hasVertex(source) || !hasVertex(destination)){
            return false;
        }
        
        Vertex<T> sourceVertex = getVertex(source);
        Vertex<T> destinationVertex = getVertex(destination);
        
        if(hasEdge(sourceVertex, destinationVertex)){
            return false;
        }
        
        Edge<T> newEdge = new Edge<>(destinationVertex, sourceVertex.getFirstEdge());
        sourceVertex.setFirstEdge(newEdge);
        sourceVertex.setOutDeg(sourceVertex.getOutDeg() + 1);
        destinationVertex.setInDeg(destinationVertex.getInDeg() + 1);
        
        return true;
    }
    
    public List<Vertex<T>> getAllVertices(){
        List<Vertex<T>> list = new ArrayList<>();
        Vertex<T> temp = head;
        
        while(temp != null){
            list.add(temp);
            temp = temp.getNextVertex();
        }
        
        return list;
    }
    
    public boolean hasCycle(){
        Set<Vertex<T>> visited = new HashSet<>();
        Set<Vertex<T>> recursionStack = new HashSet<>();
        
        for(Vertex<T> vertex : getAllVertices()){
            if(hasCycleDFS(vertex, visited, recursionStack)){
                return true;
            }
        }
        
        return false;
    }
    
    public boolean hasCycleDFS(Vertex<T> vertex, Set<Vertex<T>> visited, Set<Vertex<T>> recursionStack){
        if(recursionStack.contains(vertex)){
            return true;
        }
        
        if(visited.contains(vertex)){
            return false;
        }
        
        recursionStack.add(vertex);
        visited.add(vertex);
        
        Edge<T> edge = vertex.getFirstEdge();
        while(edge != null){
            Vertex<T> neighbour = edge.getToVertex();
            
            if(hasCycleDFS(neighbour, visited, recursionStack)){
                return true;
            }
            
            edge = edge.getNextEdge();
        }
        
        recursionStack.remove(vertex);
        return false;
    }
}
