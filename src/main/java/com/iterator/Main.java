package com.iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola");

        ListaVinculada<Integer> miLista = new ListaVinculada<Integer>();

        miLista.insertFront(8);
        miLista.insertFront(23);
        miLista.insertFront(14);
        miLista.insertFront(22);
        miLista.insertFront(4);
        miLista.insertFront(3);
        miLista.insertFront(2);

        Iterator<Integer> it = miLista.iterator();

        while (it.hasNext()){
            Integer i = it.next();
            System.out.print(i);
        }

        for (int i : miLista){
            System.out.println(i);
        }

    }
}
