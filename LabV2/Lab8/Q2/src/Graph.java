/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Graph<T extends Comparable<T>, N extends Comparable<N>>{
    Vertex<T,N> head;
    int size;
    
    public Graph(){
        head = null;
        size = 0;
    }
    
    public boolean addVertex(T v) {
        if (hasVertex(v)) {
            return false; // Already exists, do nothing
        }

        // Add to the head (O(1) operation)
        head = new Vertex<>(v, head); 
        size++;
        return true;
    }
    
    public Vertex<T, N> getVertex(T info){
        Vertex<T, N> temp = head;
        while(temp != null){
            if(temp.vertexInfo.compareTo(info) == 0){
                return temp;
            }
            
            temp = temp.nextVertex;
        }
        return null;
    }
    
    
    public boolean hasVertex(T vertex){
        if(head == null){
            return false;
        }
        
        Vertex<T, N> temp = head;
        while(temp != null){
            if(temp.vertexInfo.compareTo(vertex) == 0){
                return true;
            }
            temp = temp.nextVertex;
        }
        
        return false;
    }
    
    public boolean addDirectedEdge(T source, T destination, N w){
        if(head == null){
            return false;
        }
        
        if(!hasVertex(source) || !hasVertex(destination)){
            return false;
        }
        
        Vertex<T, N> sVertex = getVertex(source);
        Vertex<T, N> dVertex = getVertex(destination);
        
        sVertex.firstEdge = new Edge<>(dVertex, w, sVertex.firstEdge);
        sVertex.outdeg++;
        dVertex.indeg++;
          
        return true;
    }
    
    public boolean removeEdge(T source, T destination){
        if(head == null){
            return false;
        }
        
        if(!hasVertex(source) || !hasVertex(destination)){
            return false;
        }
        
        Vertex<T, N> sVertex = getVertex(source);
        Vertex<T, N> dVertex = getVertex(destination);
        
        boolean success = removeEdge(sVertex, dVertex);
        
        return success;
    }
    
    public boolean removeEdge(Vertex<T, N> from, Vertex<T, N> to){
        Edge<T, N> curr = from.firstEdge;
        Edge<T, N> prev = null;
        
        while(curr != null){
            if(curr.toVertex == to){
                if(prev == null){
                    from.firstEdge = curr.nextEdge;
                }else{
                    prev.nextEdge = curr.nextEdge;
                }
                
                from.outdeg --;
                to.indeg --;
                return true;
            }
            
            prev = curr;
            curr = curr.nextEdge;
        }
        
        return false;
    }
    
    public void printEdges(){
        Vertex<T, N> temp = head;
        
        while(temp!= null){
            System.out.print("#" + temp.vertexInfo + " : ");
            Edge<T, N> currEdge = temp.firstEdge;
            
            while(currEdge != null){
                System.out.print("[" + temp.vertexInfo + " ," + currEdge.toVertex.vertexInfo + "]");
                currEdge = currEdge.nextEdge;
            }
            
            System.out.println("");
            temp = temp.nextVertex;
        }
    }
}
