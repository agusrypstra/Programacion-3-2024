package com.tp1.ej1;

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

        //1
        System.out.println("1");
        miLista.insertFront(1);
        //2
        System.out.println("2");
        System.out.println("Antes de quitar:");
        System.out.println(miLista.get(0));
        System.out.println("Despues de quitar:");

        miLista.extractFront();
        System.out.println(miLista.get(0));
    }
}