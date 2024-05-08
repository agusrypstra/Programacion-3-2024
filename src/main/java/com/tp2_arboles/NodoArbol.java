package com.tp2_arboles;

public class NodoArbol {
    private Integer value;
    private NodoArbol izq;
    private NodoArbol der;

    public NodoArbol(Integer value) {
        this.value = value;
        this.der=null;
        this.izq=null;
    }
    public boolean esHoja(){
        return this.izq==null && this.der==null;
    }
    public void setIzq(NodoArbol izq) {
        this.izq = izq;
    }

    public void setDer(NodoArbol der) {
        this.der = der;
    }

    public Integer getValue() {
        return value;
    }

    public NodoArbol getIzq() {
        return izq;
    }

    public NodoArbol getDer() {
        return der;
    }
}
