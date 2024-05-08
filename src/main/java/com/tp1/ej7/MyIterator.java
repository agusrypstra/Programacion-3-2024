package com.tp1.ej7;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
    private Node<T> cursor;

    public MyIterator(Node<T> cursor) {
        this.cursor = cursor;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
    @Override
    public T next() {
        return null;
    }
    public boolean hasPrevious() {
        return false;
    }
    public T previous() {
        return null;
    }
}
