package com.tp1.ej6;
public class LinkedList<T> implements Iterable<T>{
    private Node<T> first;
    private int lenght;

    public LinkedList() {
        this.first = null;
        this.lenght = 0;
    }

    public void insertFront(T info){
        Node<T> actual = new Node<T>(info,null);
        actual.setNext(this.first);
        this.first=actual;
        this.lenght++;
    }
    public Node<T> getFirst() {
        return first;
    }
    public void setFirst(Node<T> first) {
        this.first = first;
    }
    public int getLenght() {
        return lenght;
    }
    public boolean isEmpty() {
        return (this.first == null);   // this.first o this.first.getInfo()  ?
    }
    @Override
    public MyIterator<T> iterator() {
        return new MyIterator<>(this.first);
    }
}
