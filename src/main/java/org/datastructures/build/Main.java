package org.datastructures.build;

import org.datastructures.build.graph.TopologicalSort;
import org.datastructures.build.tree.binarytree.BinaryTreeConstructor;
import org.datastructures.build.graph.Graph;
import org.datastructures.build.graph.GraphConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Application ------>\n");

        System.out.println("========== Construct Binary Tree ========>\n");
        BinaryTreeConstructor binaryTreeConstructor = new BinaryTreeConstructor();
        binaryTreeConstructor.createTree();

        System.out.println("\n======= Perform Breadth First Traversal ========>\n");
        binaryTreeConstructor.performBFT();

        System.out.println("\n======= Perform In Order Traversal ========>\n");
        binaryTreeConstructor.performInOrderTraversal();
        System.out.println("\n\nIOT Recursion version ");
        binaryTreeConstructor.performIotRecursion();

        System.out.println("\n\n======= Perform Pre Order Traversal ========>\n");
        binaryTreeConstructor.performPreOrderTraversal();
        System.out.println("\n\nPrOT Recursion version ");
        binaryTreeConstructor.performPreOTRecursion();

        System.out.println("\n\n======= Perform Post Order Traversal ========>\n");
        binaryTreeConstructor.performPostOrderTraversal();
        System.out.println("\n\nPrOT Recursion version ");
        binaryTreeConstructor.performPostOTRecursion();

        System.out.println("\n\n======= Count Binary Tree Nodes ========>\n");
        System.out.println(binaryTreeConstructor.countBinaryTreeNodes());

        System.out.println("\n\n======= Calculate Max Depth ========>\n");
        System.out.println(binaryTreeConstructor.calculateMaxDepth());


        System.out.println("\n\n======= WORKING WITH GRAPHS ========>\n \n");

        System.out.println("\n\n======= Construct Adjacency Matrix ========>\n");
        GraphConstructor graphConstructor = new GraphConstructor();
        Graph adjacencyMatrix = graphConstructor.constructAdjacencyMatrixGraph(8, Graph.GraphType.DIRECTED);

        System.out.println("\nIn Degree of 3 = " + adjacencyMatrix.getInDegree(3));
        System.out.println("In Degree of 1 = " + adjacencyMatrix.getInDegree(1));

        System.out.println("\nAdjacent Vertices of 3 = " + adjacencyMatrix.getAdjacentVertices(3));
        System.out.println("Adjacent Vertices of 1 = " + adjacencyMatrix.getAdjacentVertices(1));


        TopologicalSort topologicalSort = new TopologicalSort();
        System.out.println("\nPerforming topological sort on graph: "+topologicalSort.sort(adjacencyMatrix));

        List<Integer> lst1  = new ArrayList<>(); List<Integer> lst2  = new ArrayList<>();
        List<Integer> lst3  = new ArrayList<>(); List<Integer> lst4  = new ArrayList<>();
        List<List<Integer>> astronaut  = new ArrayList<>();
        lst1.add(5);lst1.add(3); lst2.add(0); lst2.add(1); lst3.add(2); lst3.add(3);
        lst4.add(0); lst4.add(4);

        astronaut.add(lst1); astronaut.add(lst2); astronaut.add(lst3); astronaut.add(lst4);

        journeyToMoon(4, astronaut);

    }

    public static int journeyToMoon(int n, List<List<Integer>> astronaut) {
        // Write your code here
        List<List<Integer>> country1 = new ArrayList<>();

        for(List<Integer> pair: astronaut){
            int first = pair.get(0);
            int second = pair.get(1);
            country1.add(
                    astronaut.stream().filter(group -> group.contains(first) || group.contains(second))
                            .flatMap(List::stream)
                            .collect(Collectors.toList()));
//            astronaut.remove(pair);
        }
        return country1.size();
    }
}