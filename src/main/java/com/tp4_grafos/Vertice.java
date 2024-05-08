package com.tp4_grafos;


import java.util.LinkedList;

public class Vertice<T> {
    private int id;
    private String color;
    private int descubrimiento;
    private int finalizacion;
    private LinkedList<Arco<T>> arcos;
    public Vertice(int value) {
        this.id = value;
        this.arcos = new LinkedList<>();
    }
    public void addArco(int verticeId1,int verticeId2,T etiqueta){
        arcos.add(new Arco(verticeId1,verticeId2,etiqueta));
    }
    public LinkedList<Arco<T>> getArcos() {
        return this.arcos;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
