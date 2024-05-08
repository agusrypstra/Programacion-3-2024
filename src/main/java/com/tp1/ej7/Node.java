package com.tp1.ej7;

public class Node <T>{
    private Node<T> next;
    private Node<T> previous;
    private T info;
    public Node(Node<T> previous, Node<T> next, T info) {
        this.previous = previous;
        this.info = info;
        this.next = next;
    }
    public Node() {
        this.info = null;
        this.next = null;
        this.previous = null;
    }
    public Node<T> getPrevious() {
        return previous;
    }
    public Node<T> getNext() {
        return next;
    }
    public T getInfo() {
        return info;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public void setInfo(T info) {
        this.info = info;
    }

}
