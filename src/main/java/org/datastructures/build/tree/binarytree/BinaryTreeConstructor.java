package org.datastructures.build.tree.binarytree;

import org.datastructures.build.tree.Node;
import org.datastructures.build.tree.traversal.bft.BreadthFirstTraversal;
import org.datastructures.build.tree.traversal.dft.BinaryTreeNodeCounter;
import org.datastructures.build.tree.traversal.dft.InOrderTraversal;
import org.datastructures.build.tree.traversal.dft.PostOrderTraversal;
import org.datastructures.build.tree.traversal.dft.PreOrderTraversal;

public class BinaryTreeConstructor {
    Node<Character> nodeA = new Node<>('A');
    Node<Character> nodeB = new Node<>('B');
    Node<Character> nodeC = new Node<>('C');
    Node<Character> nodeD = new Node<>('D');
    Node<Character> nodeE = new Node<>('E');
    Node<Character> nodeF = new Node<>('F');
    Node<Character> nodeG = new Node<>('G');

    public void createTree(){
        nodeA.setLeftChild(nodeB);
        nodeA.setRightChild(nodeC);
        nodeB.setLeftChild(nodeD);
        nodeB.setRightChild(nodeE);
        nodeC.setLeftChild(nodeF);
        nodeC.setRightChild(nodeG);

        System.out.println(nodeA);


    }

    public void performBFT(){
        BreadthFirstTraversal bft = new BreadthFirstTraversal();

        bft.performBreadthFirstTraversal(nodeA);

    }

    //--------IN ORDER -----------
    public void performInOrderTraversal(){
        InOrderTraversal iot = new InOrderTraversal();
        iot.performInOrderTraversal(nodeA);
    }

    public void performIotRecursion(){
        InOrderTraversal iot = new InOrderTraversal();
        iot.performInOrderTraversalRecursion(nodeA);
    }

    //--------PRE ORDER -----------
    public void performPreOrderTraversal(){
        PreOrderTraversal pot = new PreOrderTraversal();
        pot.performPreOrderTraversal(nodeA);
    }

    public void performPreOTRecursion(){
        PreOrderTraversal pot = new PreOrderTraversal();
        pot.performPreOrderTraversalRecursion(nodeA);

    }

    //--------POST ORDER -----------
    public void performPostOrderTraversal(){
        PostOrderTraversal pot = new PostOrderTraversal();
        pot.performPostOrderTraversal(nodeA);
    }

    public void performPostOTRecursion(){
        PostOrderTraversal pot = new PostOrderTraversal();
        pot.performPostOrderTraversalRecusion(nodeA);

    }

    public Integer countBinaryTreeNodes(){
        BinaryTreeNodeCounter binaryTreeNodeCounter = new BinaryTreeNodeCounter();
        return binaryTreeNodeCounter.countBinaryTreeNodesStartingFrom(nodeA);
    }

    public Integer calculateMaxDepth(){
        BinaryTreeNodeCounter binaryTreeNodeCounter = new BinaryTreeNodeCounter();
        return binaryTreeNodeCounter.calculateMaxDepthOfTree(nodeA);
    }


}
