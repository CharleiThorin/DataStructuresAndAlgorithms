package org.datastructures.build.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjacencyMatrixGraph implements Graph{

    private int[][] adjacencyMatrix;
    private int numVertices = 0;

    private GraphType graphType;

    public AdjacencyMatrixGraph(int numVertices, GraphType graphType){
        this.numVertices = numVertices;
        this.adjacencyMatrix = new int[this.numVertices][this.numVertices];
        this.graphType = graphType;

        for(int i= 0; i< this.numVertices; i++){
            for (int j = 0; j<this.numVertices; j++){
                adjacencyMatrix[i][j] = 0;
            }
        }

    }

    @Override
    public void addEdge(int v1, int v2) {
        if(v1 >= this.numVertices || v2 >= this.numVertices || v1 < 0 || v2< 0){
            throw new IllegalArgumentException("Vertex number is not valid");
        }
        if(graphType == GraphType.UNDIRECTED){
            adjacencyMatrix[v2][v1] = 1;
        }
        adjacencyMatrix[v1][v2] = 1;
    }

    @Override
    public void addEdge(int v1, int v2, int weight) {
        if(v1 >= this.numVertices || v2 >= this.numVertices || v1 < 0 || v2< 0){
            throw new IllegalArgumentException("Vertex number is not valid");
        }
        if(graphType == GraphType.UNDIRECTED){
            adjacencyMatrix[v2][v1] = weight;
        }
        adjacencyMatrix[v1][v2] = weight;
    }

    @Override
    public List<Integer> getAdjacentVertices(int v) {
        if(v >= this.numVertices || v < 0){
            throw new IllegalArgumentException("Vertex number is not valid");
        }

        List<Integer> adjacentVerticesList = new ArrayList<>();
        for(int i = 0; i < numVertices; i++){
            if(adjacencyMatrix[v][i] !=0){
                adjacentVerticesList.add(i);
            }
        }
        Collections.sort(adjacentVerticesList);

        return adjacentVerticesList;
    }

    @Override
    public int getInDegree(int v) {
        if(v >= this.numVertices || v < 0){
            throw new IllegalArgumentException("Vertex number is not valid");
        }

        int inDegree = 0;

        for(int i=0; i < numVertices; i++){
            if(adjacencyMatrix[i][v] !=0){
                inDegree++;
            }
        }
        return inDegree;
    }

    @Override
    public int getNumVertices() {
        return numVertices;
    }



    @Override
    public void displayGraph() {
        System.out.println("Adjacency Matrix\n");

        for(int i= 0; i< this.numVertices; i++){
            for (int j = 0; j<this.numVertices; j++){

                System.out.print(adjacencyMatrix[i][j] + " " );
            }
            System.out.println();

        }

        System.out.println();

        for(int i=0; i < numVertices; i++){
            System.out.print("Edges from " + i + " to : ");
            for (int j = 0; j<this.numVertices; j++){
                if(adjacencyMatrix[i][j]>0){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
