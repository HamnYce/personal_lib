package com.linkedlist;

public interface ListInterface<T> {
    boolean isFull(); // check if list is full
    boolean isEmpty(); // check if list is empty
    void addLast (T info);  // add an item to the end of the list
    void add (T info, int index); // add an item at a specific position
    void removeLast();  // removes the last item in the list
    void remove(int index);  // you write its code - remove an item at a specific position
    T getElement (int index); // returns an item at a give position.
    int getLength(); // returns the number of items in a list
    int search(T key);
}
