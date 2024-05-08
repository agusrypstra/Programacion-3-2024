package com.tp2_arboles;

import java.util.ArrayList;

public class Arbol {
    private NodoArbol raiz;
    public Arbol(int value) {
        this.raiz=null;
    }
    public void imprimirPreOrden(){
        this.imprimirPreOrden(this.raiz);
    }
    private void imprimirPreOrden(NodoArbol nodo){
        if (nodo == null)
            return;
        System.out.print(nodo.getValue() + " ");
        imprimirPreOrden(nodo.getIzq());
        imprimirPreOrden(nodo.getDer());
    }
    public void imprimirPosOrden(){
        this.imprimirPosOrden(this.raiz);
    }
    private void imprimirPosOrden(NodoArbol nodo)
    {
        if (nodo == null)
            return;
        imprimirPosOrden(nodo.getIzq());
        imprimirPosOrden(nodo.getDer());
        System.out.print(nodo.getValue() + " ");
    }
    public void imprimirEnOrden(){
        this.imprimirEnOrden(this.raiz);
    }
    private void imprimirEnOrden(NodoArbol nodo)
    {
        if (nodo == null)
            return;
        imprimirEnOrden(nodo.getIzq());
        imprimirEnOrden(nodo.getDer());
        System.out.print(nodo.getValue() + " ");
    }
    public int getHeight() {
        return getHeight(raiz);
    }
    private int getHeight(NodoArbol actual) {
        if (actual==null){
            return 0;
        }
        // Recursivamente calcular la altura de los subárboles izquierdo y derecho

        int alturaIzq = getHeight(actual.getIzq());
        int alturaDer = getHeight(actual.getDer());
        // La altura del árbol es la máxima entre la altura del subárbol izquierdo y derecho, más 1 para contar la raíz

        return Math.max(alturaIzq,alturaDer)+1;
    }
    public int getSum() {
        return getSuma(this.raiz);
    }
    private int getSuma(NodoArbol actual){
        int suma = 0;
        if(actual == null){
            return 0;
        }else{
            suma = actual.getValue();
            suma += getSuma(actual.getIzq());
            suma += getSuma(actual.getDer());
        }
        return suma;
    }
    public ArrayList getElemAtLevel(int level){
        ArrayList res = new ArrayList();
        return getElemAtLevel(this.raiz,level,res,0);
    }
    private ArrayList getElemAtLevel(NodoArbol nodo,int level,ArrayList resultado,int actual){
        if (nodo == null){
            return new ArrayList<>();
        }
        if (actual==level){
            resultado.add(nodo.getValue());
        }else {
            ArrayList izq = new ArrayList<>(getElemAtLevel(nodo.getIzq(),level,resultado,actual+1));
            ArrayList der = new ArrayList<>(getElemAtLevel(nodo.getDer(),level,resultado,actual+1));
        }
        return resultado;
    }
    public int getMaxElem(){
        int max = 0;
        if (this.raiz!=null){
            max = getMaxElem(this.raiz);
        }
        return max;
    }
    private int getMaxElem(NodoArbol nodo){
        if (nodo.getDer()==null){
            return nodo.getValue();
        }
        return getMaxElem(nodo.getDer());
    }
    public ArrayList getHojasMayoresA(int valor){
        ArrayList resultado = new ArrayList<>();
        if (this.raiz != null){
            getHojasMayoresA(valor,raiz,resultado);
        }
        return resultado;
    }
    private void getHojasMayoresA(int valor,NodoArbol nodo,ArrayList resultado){
        if (!nodo.esHoja()){
            if (nodo.getIzq() != null){
                getHojasMayoresA(valor,nodo.getIzq(),resultado);
            }
            if (nodo.getDer()!= null){
                getHojasMayoresA(valor,nodo.getDer(),resultado);
            }
        }else{
            if (nodo.getValue()>valor){
                resultado.add(0,nodo.getValue());
            }
        }
    }

    public boolean isEmpty(){
        return this.raiz==null;
    }
    public boolean hasElement(Integer value){
        if (this.raiz==null){
            return false;
        }else {
            return this.hasElement(this.raiz,value);
        }
    }
    private boolean hasElement(NodoArbol actual,Integer value){
        if (actual.getValue().equals(value)){
            return true;
        }
        if (actual.getValue()>value){
            if (actual.getIzq()==null){
                return false;
            }else{
                return this.hasElement(actual.getIzq(),value);
            }
        } else if (actual.getValue()<value) {
            if (actual.getDer()==null){
                return false;
            }else{
                return this.hasElement(actual.getDer(),value);
            }
        }
        return false;
    }
    public void add(Integer value){
        //si la raiz es nula, se le da valor
        if (this.raiz==null){
            this.raiz= new NodoArbol(value);
        }else{
            //sino se ingresa al arbol
            this.add(this.raiz,value);
        }
    }
    private void add(NodoArbol actual,Integer value){
        //si el nodo actual es mas grande que el valor a ingresar
        if (actual.getValue() > value) {
            //se comprueba que el de la izquierda sea nulo
            if (actual.getIzq() == null) {
                //se agrega a la izquierda el valor
                NodoArbol temp = new NodoArbol(value);
                actual.setIzq(temp);
            } else {
                //sino es nulo, se sigue ingresando a la funcion
                add(actual.getIzq(),value);
            }
            //si el valor del nodo es menor al valor
        } else if (actual.getValue() < value) {
            //se comprueba que el de la derecha sea nulo
            if (actual.getDer() == null) {
                //se agrega a la derecha el valor
                NodoArbol temp = new NodoArbol(value);
                actual.setDer(temp);
            } else {
                //si no es nulo se sigue por la derecha
                add(actual.getDer(),value);
            }
        }
    }
}
