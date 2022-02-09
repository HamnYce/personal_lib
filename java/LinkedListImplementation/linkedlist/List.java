package com.linkedlist;


public class List<T extends Comparable<T>> implements ListInterface<T> {
    int length;
    Node<T> header;

    public List() {
        length = 0;
        header = null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void addLast(T info) {
        if (header == null) { header = new Node<>(info);length++;return;}
        Node<T> current = header;

        for (int i = 0; i < length - 1; i++) {
            current = current.getNextNode();
        }
        // Or use a while (current.nextNode != null)
        current.setNextNode(new Node<>(info));

        length++;
    }

    @Override
    public void add(T info, int index) {
        if (index > length) { return; }
        if (index == length) { addLast(info);return;}

        Node<T> current = header;

        for (int i = 0; i < index - 1; i++) {
            current = current.getNextNode();
        }
        Node<T> temp = new Node<>(info);

        temp.setNextNode(current.getNextNode());
        current.setNextNode(temp);

        length++;
    }

    @Override
    public void removeLast() {
        Node<T> current = header;

        for (int i = 0; i < length - 1; i++) {
            current = current.getNextNode();
        }
        current.setNextNode(null);
        length--;
    }

    @Override
    public void remove(int index) {
        if (isEmpty() || index == length) return;
        if (length == 1) { header = null; length--;return; }
        if (index == 0) {header = header.nextNode;length--;return;}

        Node<T> current = header;

        for (int i = 0; i < e; i++) {
            current = current.getNextNode();
        }
        current.setNextNode(current.getNextNode().getNextNode());
        length--;
    }

    @Override
    public T getElement(int index) {
        if (index >= length) return null;

        Node<T> current = header;
        for (int i = 0; i < index; i++) {
            current = current.getNextNode();
        }
        return current.getInfo();
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int search(T key) {
        Node<T> current = header;
        for (int i = 0; i < length; i++) {
            if (current.getInfo() == key)
                return i;
            current = current.getNextNode();
        }
        return -1;
    }
}
