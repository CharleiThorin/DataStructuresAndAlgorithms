package org.datastructures.build.tree.traversal.dft;

import org.datastructures.build.tree.Node;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class InOrderTraversal {
    //All left children are visited first
    //uses a stack

    public <T> void performInOrderTraversal(Node<T> root){
        if(root == null){
            return;
        }

        Stack<Node<T>> stack = new Stack<>();
        Set<Node<T>> visitedNodes = new HashSet<>();

        stack.push(root);

        while (!stack.isEmpty()){
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

                stack.push(top);

                if(top.getLeftChild() != null){
                    stack.push(top.getLeftChild());
                }
            }

        }
    }

    public <T> void performInOrderTraversalRecursion(Node<T> root){
        if(root == null){
            return;
        }
        performInOrderTraversalRecursion(root.getLeftChild());
        System.out.print(root.getData()+"-->");
        performInOrderTraversalRecursion(root.getRightChild());
    }
}
