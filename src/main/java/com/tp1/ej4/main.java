package com.tp1.ej4;

import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        LinkedList<Integer> lista= new LinkedList<Integer>();

        lista.insertFront(22);
        lista.insertFront(40);
        lista.insertFront(50);
        lista.insertFront(88);

        Iterator<Integer> it = lista.iterator();

        while(it.hasNext()){
            Integer i = it.next();
            System.out.println(i);
        }
    }
}
