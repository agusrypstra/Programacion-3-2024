package com.tp1.ej7;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{
    private Node<T> first;
    private int lenght;

    public LinkedList() {
        this.first=null;
        this.lenght=0;
    }
    public void insertFront(T info){
        Node<T> actual = new Node<T>(null,null,info);
        actual.setNext(this.first);
        this.first=actual;
        this.lenght++;
    }
    @Override
    public Iterator iterator() {
        return null;
    }
}
