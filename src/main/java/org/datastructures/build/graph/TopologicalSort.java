package org.datastructures.build.graph;

import java.util.*;

public class TopologicalSort {    //Applicable to only directed acyclic graphs . the first node is the node with in degree 0
                                 // the algorithm specifies that only vertices with in degree = 0 can be processed. once the node with in degree 0 has been processed, it is removed
                                // from the list and this reduces the edges going into its neighboring nodes hence reducing their in degree

    public List<Integer> sort(Graph graph){
        LinkedList<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> inDegreeMap = new HashMap<>();

        for(int vertex = 0; vertex < graph.getNumVertices(); vertex++){
            int inDegree = graph.getInDegree(vertex);
            inDegreeMap.put(vertex,inDegree);

            if(inDegree == 0){
                queue.add(vertex);
            }
        }

        List<Integer> sortedList = new ArrayList<>();

        while(!queue.isEmpty()){
            //If more than one element exists then the graph has mre than one topological sort solution
            int vertex = queue.remove();

            sortedList.add(vertex);

            List<Integer> adjacentVertices = graph.getAdjacentVertices(vertex);

            for(int adjacentVertex: adjacentVertices){
                int updatedInDegree = inDegreeMap.get(adjacentVertex) - 1;
                inDegreeMap.put(adjacentVertex, updatedInDegree);
                if(updatedInDegree == 0){
                    queue.add(adjacentVertex);
                }
            }
        }
        if(sortedList.size() != graph.getNumVertices()){
            throw new RuntimeException("The graph has a cycle");
        }

        return sortedList;
    }
}
