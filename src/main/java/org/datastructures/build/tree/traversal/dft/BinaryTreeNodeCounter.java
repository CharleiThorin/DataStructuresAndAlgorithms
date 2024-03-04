package org.datastructures.build.tree.traversal.dft;

import org.datastructures.build.tree.Node;

public class BinaryTreeNodeCounter {

    public <T> int countBinaryTreeNodesStartingFrom(Node<T> root){
        if(root == null) {return 0;}

        int numNodesLeft = countBinaryTreeNodesStartingFrom(root.getLeftChild());
        int numNodesRight = countBinaryTreeNodesStartingFrom(root.getRightChild());

        return 1 + numNodesLeft + numNodesRight;
    }

    public <T> int calculateMaxDepthOfTree(Node<T> root){
        if(root == null) {return 0;}

        if(root.getLeftChild()==null && root.getRightChild()==null){
            return 0;
        }

        int maxDepthOnLeft = calculateMaxDepthOfTree(root.getLeftChild());
        int maxDepthOnRight = calculateMaxDepthOfTree(root.getRightChild());

        int maxDepth = 1 + Math.max(maxDepthOnLeft, maxDepthOnRight);

        System.out.println("Max Depth for Left Tree:"+ maxDepthOnLeft+" , "+
        "Max Depth for Right Tree: "+ maxDepthOnRight+" , "+ "max Depth for tree: "+maxDepth);

        return maxDepth;
    }
}
