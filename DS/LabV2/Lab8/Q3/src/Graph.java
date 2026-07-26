/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
public class Graph<T extends Comparable <T>>{
    Vertex<T> head;
    int size;
    
    public Graph(){
        head = null;
        size = 0;
    }
    
    public boolean addVertex(T info){
        if(hasVertex(info)){
            return false;
        }
        
        head = new Vertex<>(info, head);
        size ++;
        
        return true;
    }
    
    public boolean hasVertex(T info){
        if(head == null){
            return false;
        }
        
        Vertex<T> temp = head;
        
        while(temp != null){
            if(temp.vertexInfo == info){
                return true;
            }
            temp = temp.nextVertex;
        }
        
        return false;
    }
    
    public Vertex<T> getVertex(T info){
        Vertex<T> temp = head;
        while(temp != null){
            if(temp.vertexInfo.compareTo(info) == 0){
                return temp;
            }
            
            temp = temp.nextVertex;
        }
        return null;
    }
    
    public boolean addUndirectedEdge(T source, T destination){
        if(head == null){
            return false;
        }
        
        if(!hasVertex(source) || !hasVertex(destination)){
            return false;
        }
        
        Vertex<T> sVertex = getVertex(source);
        Vertex<T> dVertex = getVertex(destination);
        
        sVertex.firstEdge = new Edge<>(dVertex, sVertex.firstEdge);
        sVertex.outdeg ++;
        dVertex.indeg ++;
        
        if(sVertex != dVertex){
            dVertex.firstEdge = new Edge<>(sVertex, dVertex.firstEdge);
            dVertex.outdeg ++;
            sVertex.indeg ++;
        }
        
        return true;
    }
    
    public boolean addEdge(T source, T destination){
        if(head == null){
            return false;
        }
        
        if(!hasVertex(source) || !hasVertex(destination)){
            return false;
        }
        
        Vertex<T> sVertex = getVertex(source);
        Vertex<T> dVertex = getVertex(destination);
        
        sVertex.firstEdge = new Edge<>(dVertex, sVertex.firstEdge);
        sVertex.outdeg ++;
        dVertex.indeg ++;
        
        return true;
    }
    
    public boolean removeEdge(T source, T destination){
        if(head == null){
            return false;
        }
        
        if(!hasVertex(source) || !hasVertex(destination)){
            return false;
        }
        
        Vertex sVertex = getVertex(source);
        Vertex dVertex = getVertex(destination);
        
        removeFromList(sVertex, dVertex);
        removeFromList(dVertex, sVertex);
        
        return true;
    }
    
    public boolean removeFromList(Vertex<T> from, Vertex<T> to){
        Edge<T> curr = from.firstEdge;
        Edge<T> prev = null;
        
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
    
    public void printUndirectedEdge(){
        Vertex<T> temp = head;
        
        while(temp != null){
            System.out.print("# " + temp.vertexInfo + " --> ");
            Edge<T> currEdge = temp.firstEdge;
            while(currEdge != null){
                System.out.print("[" + temp.vertexInfo + " <--> " + currEdge.toVertex.vertexInfo + "]");
                currEdge = currEdge.nextEdge;
            }
            System.out.println("");
            temp = temp.nextVertex;
        }
    }
    
    public void printDirectedEdge(){
        Vertex<T> temp = head;
        
        while(temp != null){
            System.out.print("# " + temp.vertexInfo + " --> ");
            Edge<T> currEdge = temp.firstEdge;
            while(currEdge != null){
                System.out.print("[" + temp.vertexInfo + " --> " + currEdge.toVertex.vertexInfo + "]");
                currEdge = currEdge.nextEdge;
            }
            System.out.println("");
            temp = temp.nextVertex;
        }
    }
}
