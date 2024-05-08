package com.tp1.ej2;

public class MySimpleLinkedList<T> {

    private Node<T> first;
    public MySimpleLinkedList() {
        this.first = null;
    }
    public void insertFront(T info) {
        Node<T> tmp = new Node<T>(info,null);
        tmp.setNext(this.first);
        this.first = tmp;
    }
    public T extractFront() {
        T salida = this.first.getInfo();
        return salida;
    }
    public boolean isEmpty() {
        return this.first==null;
    }
    public T get(int index) {
        Node<T> salida = this.first;
        for (int i = 0; i < index; i++) {
            salida=salida.getNext();
        }
        return salida.getInfo();
    }
    public int size() {
        int n = 0;
        Node<T> actual = this.first;
        while (actual.getNext()!=null){
            n++;
            actual = actual.getNext();
        }
        return n;
    }
    @Override
    public String toString() {
        // TODO
        return "";
    }
}