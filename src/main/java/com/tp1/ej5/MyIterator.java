package com.tp1.ej5;

public class MyIterator<T> implements java.util.Iterator<T> {

    private Node<T> cursor;

    public MyIterator(Node<T> cursor){
        this.cursor = cursor;
    }
    @Override
    public boolean hasNext() {
        return cursor!=null;
    }

    @Override
    public T next() {
        T info = this.cursor.getInfo();
        this.cursor = cursor.getNext();

        return info;
    }
    public void setCursor(Node<T> entrada){
        this.cursor = entrada;
    }
    public T getInfo(){
        //return this.cursor.getInfo();
        if (cursor == null) {
            System.out.println("No hay más elementos en el iterador");
        }
        return this.cursor.getInfo();
    }
}
