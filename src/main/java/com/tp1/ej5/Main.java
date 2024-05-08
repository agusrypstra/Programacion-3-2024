package com.tp1.ej5;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> lista1 = new LinkedList();
        LinkedList<Integer> lista2 = new LinkedList();


        lista1.insertFront(5);
        lista1.insertFront(1);
        lista1.insertFront(3);
        lista1.insertFront(10);
        lista1.insertFront(4);
        lista1.insertFront(6);
        lista1.insertFront(2);

        lista2.insertFront(4);
        lista2.insertFront(5);
        lista2.insertFront(6);
        lista2.insertFront(7);
        lista2.insertFront(9);
        lista2.insertFront(10);
        lista2.insertFront(8);

        LinkedList<Integer> resultado = elementosComunes(lista1,lista2);
        MyIterator itNueva = resultado.iterator();
        while (itNueva.hasNext()){
            System.out.println(itNueva.getInfo());
            itNueva.next();
        }
    }

    public static LinkedList<Integer> elementosComunes(LinkedList<Integer> l1, LinkedList<Integer> l2){

        LinkedList salida = new LinkedList<>();

        MyIterator<Integer> it1 = l1.iterator();
        MyIterator<Integer> it2 = l2.iterator();

        Node<Integer> li2first = l2.getFirst();

        while (it1.hasNext()){
            while (it2.hasNext()){
                if (it1.getInfo()==it2.getInfo()){
                    salida.insertFront(it1.getInfo());
                    it2.next();
                    break;
                }
                it2.next();
            }
            it2.setCursor(li2first);
            it1.next();
        }
        return salida;
    }
    public LinkedList listasOrdAordenadas(LinkedList l1, LinkedList l2){
        LinkedList nueva = new LinkedList<>();
        return nueva;
    }
}
