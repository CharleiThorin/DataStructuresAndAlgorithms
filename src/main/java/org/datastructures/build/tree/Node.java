package org.datastructures.build.tree;

import lombok.Data;

@Data
public class Node<T> {
    private Node<T> leftChild;
    private Node<T> rightChild;
    private T data;

    public Node (T data){
        this.data = data;
    }
}
