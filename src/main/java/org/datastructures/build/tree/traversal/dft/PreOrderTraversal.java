package org.datastructures.build.tree.traversal.dft;

import org.datastructures.build.tree.Node;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class PreOrderTraversal {

    public <T> void performPreOrderTraversal(Node<T> root){
        if(root ==null){
            return;
        }

        Stack<Node<T>> stack = new Stack<>();
        Set<Node<T>> visitedNodes = new HashSet<>();

        stack.push(root);

        while(!stack.isEmpty()){
            Node<T> top = stack.pop();

            if(top.getLeftChild()==null && top.getRightChild()==null){
                System.out.print(top.getData()+"-->");

            }else if(visitedNodes.contains(top)){

                System.out.print(top.getData()+"-->");

            }else {
                visitedNodes.add(top);

                if(top.getRightChild() !=null){
                    stack.push(top.getRightChild());
                }

                if(top.getLeftChild() != null){
                    stack.push(top.getLeftChild());
                }

                stack.push(top);
            }
        }
    }

    public <T> void performPreOrderTraversalRecursion(Node<T> root){

        if(root ==null){return;}

        System.out.print(root.getData()+"-->");

        performPreOrderTraversalRecursion(root.getLeftChild());

        performPreOrderTraversalRecursion(root.getRightChild());
    }
}
