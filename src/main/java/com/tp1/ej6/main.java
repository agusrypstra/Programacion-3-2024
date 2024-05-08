package com.tp1.ej6;

public class main {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList();
        LinkedList<Integer> l2 = new LinkedList();

        l1.insertFront(1);
        l1.insertFront(2);
        l1.insertFront(3);
        l1.insertFront(4);
        l1.insertFront(5);
        l1.insertFront(6);
        l1.insertFront(7);

        l2.insertFront(3);
        l2.insertFront(4);
        l2.insertFront(5);

        LinkedList<Integer> resultado = procesarListas(l1, l2);

        MyIterator itRes = resultado.iterator();

        while (itRes.hasNext()){
            System.out.println(itRes.next());
        }
    }

    public static LinkedList procesarListas(LinkedList l1, LinkedList l2) {
        LinkedList<Integer> salida = new LinkedList<>();

        MyIterator<Integer> it1 = l1.iterator();
        MyIterator<Integer> it2 = l2.iterator();

        Node<Integer> l2First = l2.getFirst();

        while (it1.hasNext()) {
            boolean coincide = false;

            while (it2.hasNext()) {
                if (it1.getInfo() == it2.getInfo()){
                    coincide=true;
                    break;
                }else{
                    it2.next();
                }
            }
            if (!coincide){
                salida.insertFront(it1.getInfo());
            }
            it2.setCursor(l2First);
            it1.next();
        }
        return salida;
    }
}
