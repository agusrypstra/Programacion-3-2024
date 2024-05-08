package com.tp1.ej2;

public class main {
    public static void main(String[] args) {
        System.out.println("Hola");

        MySimpleLinkedList<Integer> miLista = new MySimpleLinkedList<Integer>();

        miLista.insertFront(8);
        miLista.insertFront(23);
        miLista.insertFront(14);
        miLista.insertFront(22);
        miLista.insertFront(4);
        miLista.insertFront(3);
        miLista.insertFront(2);
    }
}