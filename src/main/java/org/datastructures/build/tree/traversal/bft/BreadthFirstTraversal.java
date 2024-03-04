package org.datastructures.build.tree.traversal.bft;

import org.datastructures.build.tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstTraversal {
    // All nodes at the same level are visited first

    public <T> void performBreadthFirstTraversal(Node<T> root){
        if(root == null){
            return;
        }

        Queue<Node<T>> queue = new LinkedList<>();

        queue.add(root);

        do{
            Node<T> node = queue.remove();
            System.out.print(node.getData() + "-->");

            if(node.getLeftChild() !=null){
                queue.add(node.getLeftChild());
            }
            if(node.getRightChild() != null){
                queue.add(node.getRightChild());
            }

        }while(!queue.isEmpty());
        System.out.println("\n");
    }
}
