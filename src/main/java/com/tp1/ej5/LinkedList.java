package com.tp1.ej5;

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

    public Node<T> getFirst(){
        return this.first;
    }
    public void setFirst(Node<T> entrada){
        this.first = entrada;
    }
    public T extractFront() {
        T data = this.first.getInfo();
        this.first = this.first.getNext();
        return data;
    }

    public boolean isEmpty() {
        return (this.first == null);   // this.first o this.first.getInfo()  ?
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

        while(actual.getNext() != null){    // actual.getNext() o actual.getNext().getInfo()   ?
            lista += actual.getInfo();
            actual = actual.getNext();
        }
        return lista;
    }

    @Override
    public MyIterator<T> iterator(){
        return new MyIterator<>(this.first);
    }
}
