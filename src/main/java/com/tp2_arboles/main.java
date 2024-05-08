package com.tp2_arboles;

public class main {
    public static void main(String[] args) {
        Arbol arbolito = new Arbol(1);
        arbolito.add(8);
        arbolito.add(6);
        arbolito.add(3);
        arbolito.add(7);
        arbolito.add(11);
        arbolito.add(22);
        arbolito.add(15);
        arbolito.add(25);
        System.out.println("------Pre orden-------");
        arbolito.imprimirPreOrden();
        System.out.println();
        System.out.println("------Pos orden-------");
        arbolito.imprimirPosOrden();
        System.out.println();
        System.out.println("------En orden-------");
        arbolito.imprimirEnOrden();
        System.out.println();
        //hasElement()
        System.out.println("hasElement()");
        System.out.println(arbolito.hasElement(2));
        //isEmpty()
        System.out.println("isEmpty()");
        System.out.println(arbolito.isEmpty());
        //getHeight()
        System.out.println("getHeight()");
        System.out.println("Altura: " + arbolito.getHeight());//getHeight()
        //getMaxElem()
        System.out.println("getMaxElem()");
        System.out.println("Maximo: " + arbolito.getMaxElem());
        //getElemAtLevel()
        System.out.println("getElemAtLevel()");
        System.out.println(arbolito.getElemAtLevel(0));

        //2
        System.out.println("CONSIGNA 2");
        System.out.println("getSum()");
        System.out.println(arbolito.getSum());

        //3
        System.out.println("CONSIGNA 3");
        System.out.println("getHojasMayores()");
        System.out.println(arbolito.getHojasMayoresA(5));
    }
}