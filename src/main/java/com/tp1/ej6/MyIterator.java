package com.tp1.ej6;

public class MyIterator<T> implements java.util.Iterator<T> {
    private Node<T> cursor;
    public MyIterator(Node<T> cursor) {
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
    public T getInfo(){
        return this.cursor.getInfo();
    }

    public void setCursor(Node<T> cursor) {
        this.cursor = cursor;
    }
}
