/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Graph<T extends Comparable<T>, N extends Comparable<N>>{
    private Vertex<T, N> head;
    private Vertex<T, N> tail;
    private int size;
    
    public Graph(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public boolean addVertex(T vertexInfo){
        if(hasVertex(vertexInfo)){
            return false;
        }
        
        Vertex<T, N> newVertex = new Vertex<>(vertexInfo, null);
        if(head == null){
            head = newVertex;
            tail = newVertex;
        }else{
            tail.setNextVertex(newVertex);
            tail = newVertex;
        }
        size ++;
        return true;
    }
    
    public boolean hasVertex(T vertexInfo){
        if(head == null){
            return false;
        }
        
        Vertex<T, N> temp = head;
        
        while(temp != null){
            if(temp.getVertexInfo().compareTo(vertexInfo) == 0){
                return true;
            }
            
            temp = temp.getNextVertex();
        }
        
        return false;
    }
    
    public Vertex<T, N> getVertex(T vertexInfo){
        if(head == null){
            return null;
        }
        
        Vertex<T, N> temp = head;
        while(temp != null){
            if(temp.getVertexInfo().compareTo(vertexInfo) == 0){
                return temp;
            }
            
            temp = temp.getNextVertex();
        }
        
        return null;
    }
    
    public boolean addDirectedEdge(T source, T destination, N weight){
        if(head == null){
            return false;
        }
        
        if(!hasVertex(source) || !hasVertex(destination)){
            return false;
        }
        
        Vertex<T, N> sourceVertex = getVertex(source);
        Vertex<T, N> destinationVertex = getVertex(destination);
        Edge<T, N> newEdge = new Edge<>(destinationVertex, sourceVertex.getFirstEdge(), weight);
        
        sourceVertex.setFirstEdge(newEdge);
        sourceVertex.setOutDeg(sourceVertex.getOutdeg() + 1);
        destinationVertex.setInDeg(destinationVertex.getIndeg() + 1);
        return true;
    }
    
    public void printEdge(){
        Vertex<T, N> temp = head;
        
        while(temp != null){
            System.out.println(temp.getVertexInfo() + " --> ");
            Edge<T, N> currEdge = temp.getFirstEdge();
            
            while(currEdge != null){
                System.out.print(currEdge.getToVertex().getVertexInfo() + ":" + currEdge.getWeight());
                System.out.print(" ");
                currEdge = currEdge.getnextEdge();
            }
            
            System.out.println("");
            temp = temp.getNextVertex();
        }
    }
    

    public List<T> findShortestPathByNodeBFS(T start, T destination) {
        if (start.equals(destination)) return Arrays.asList(start);

        Queue<Vertex<T, N>> queue = new LinkedList<>();
        // Map to store: Child -> Parent (to trace back the path)
        Map<T, T> parents = new HashMap<>();
        Set<T> visited = new HashSet<>();

        Vertex<T, N> startNode = getVertex(start);
        queue.add(startNode);
        visited.add(start);

        while (!queue.isEmpty()) {
            Vertex<T, N> current = queue.poll();

            // Check neighbors
            Edge<T, N> edge = current.getFirstEdge();
            while (edge != null) {
                Vertex<T, N> neighbor = edge.getToVertex();
                T neighborInfo = neighbor.getVertexInfo();

                if (!visited.contains(neighborInfo)) {
                    visited.add(neighborInfo);
                    parents.put(neighborInfo, current.getVertexInfo()); // Record the breadcrumb
                    queue.add(neighbor);

                    // If we found the target, we can stop immediately!
                    if (neighborInfo.equals(destination)) {
                        return reconstructPath(parents, start, destination);
                    }
                }
                edge = edge.getnextEdge();
            }
        }
        return null; // No path found
    }

    private List<T> reconstructPath(Map<T, T> parents, T start, T destination) {
        List<T> path = new LinkedList<>();
        T curr = destination;
        while (curr != null) {
            path.add(0, curr); // Add to front
            if (curr.equals(start)) break;
            curr = parents.get(curr);
        }
        return path;
    }
    
    private class NodeDistance implements Comparable<NodeDistance> {
        Vertex<T, N> vertex;
        double totalDist;

        NodeDistance(Vertex<T, N> vertex, double totalDist) {
            this.vertex = vertex;
            this.totalDist = totalDist;
        }

        @Override
        public int compareTo(NodeDistance other) {
            return Double.compare(this.totalDist, other.totalDist);
        }
    }
    
    public List<T> getShortestPathByWeight(T from, T to) {
        Vertex<T, N> fromNode = getVertex(from);
        Vertex<T, N> toNode = getVertex(to);

        if (fromNode == null || toNode == null) return null;

        // 1. Setup: Distances map and Parent tracker
        Map<Vertex<T, N>, Double> distances = new HashMap<>();
        Map<T, T> parents = new HashMap<>();

        // 2. Priority Queue: Stores pairs of (Vertex, CurrentTotalDistance)
        // We sort it so the SMALLEST distance is always polled first
        PriorityQueue<NodeDistance> pq = new PriorityQueue<>(Comparator.comparingDouble(n -> n.totalDist));

        // Initialize start node
        distances.put(fromNode, 0.0);
        pq.add(new NodeDistance(fromNode, 0.0));

        while (!pq.isEmpty()) {
            NodeDistance current = pq.poll();
            Vertex<T, N> currentNode = current.vertex;

            // Optimization: if we reached the target, we are done!
            if (currentNode.equals(toNode)) {
                return reconstructPath(parents, from, to);
            }

            // Check all outgoing edges
            Edge<T, N> edge = currentNode.getFirstEdge();
            while (edge != null) {
                Vertex<T, N> neighbor = edge.getToVertex();

                // Calculate new potential distance (Current total + this edge weight)
                // Note: We cast weight to double to compare
                double weight = ((Number) edge.getWeight()).doubleValue();
                double newDist = distances.get(currentNode) + weight;

                // If this new path is cheaper than any path we've found before
                if (newDist < distances.getOrDefault(neighbor, Double.MAX_VALUE)) {
                    distances.put(neighbor, newDist);
                    parents.put(neighbor.getVertexInfo(), currentNode.getVertexInfo());
                    pq.add(new NodeDistance(neighbor, newDist));
                }
                edge = edge.getnextEdge();
            }
        }
        return null; // No path found
    }
}
