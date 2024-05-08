package com.tp1.ej4;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{

    private Node<T> first;
    private int size;

    public LinkedList() {
        this.first = null;
        this.size = 0;
    }

    public void insertFront(T info) {
        Node<T> actual = new Node<T>(info,null);
        actual.setNext(this.first);
        this.first = actual;
        this.size++;
    }

    public T extractFront() {
        T data = this.first.getInfo();
        this.first = this.first.getNext();

        return data;
    }

    public boolean isEmpty() {

        return (this.first == null);
    }

    public T get(int index) {
        Node<T> actual = this.first;
        for (int c=0; c < index; c++){
            actual = actual.getNext();
        }

        return actual.getInfo();
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        Node<T> actual = this.first;
        String lista = "";

        while(actual.getNext() != null){
            lista += actual.getInfo();
            actual = actual.getNext();
        }

        return lista;
    }

    // Metodo del Iterator
    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>(this.first);
    }
}
