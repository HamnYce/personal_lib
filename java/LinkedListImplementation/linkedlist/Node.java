package com.linkedlist;

public class Node<T> implements Comparable<T> {
    T info;
    // obj by default it is null
    Node<T> nextNode;

    public Node(T info) {
        this.info = info;
        nextNode = null;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
