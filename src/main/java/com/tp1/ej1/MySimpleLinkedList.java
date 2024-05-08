package com.tp1.ej1;

public class MySimpleLinkedList<T> {

    private Node<T> first;
    private int size;
    public MySimpleLinkedList() {
        this.first = null;
        this.size =0;
    }
    public void insertFront(T info) {
        Node<T> tmp = new Node<T>(info,null);
        tmp.setNext(this.first);
        this.first = tmp;
        size++;
    }
    public T extractFront() {
        T salida = this.first.getInfo();
        this.first = this.first.getNext();
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
        return this.size;
    }
    @Override
    public String toString() {
        // TODO
        return "";
    }
}