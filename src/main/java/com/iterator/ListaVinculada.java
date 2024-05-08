package com.iterator;

import java.util.Iterator;

public class ListaVinculada<T> implements Iterable<T>{
    private Node<T> first;
    private int size;

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>(this.first);
    }
    public ListaVinculada() {
        this.first=null;
    }
    public void insertFront(T info) {
        Node<T> tmp = new Node<T>(info,null);
        tmp.setNext(this.first);
        this.first = tmp;
    }
    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
