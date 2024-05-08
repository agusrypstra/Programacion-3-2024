package com.tp4_grafos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class GrafoDirigido<T> implements Grafo<T> {
    private HashMap<Integer,LinkedList<Arco<T>>> vertices;
    public GrafoDirigido() {
        this.vertices = new HashMap<>();
    }
    @Override
    public void agregarVertice(int verticeId) {
        vertices.put(verticeId,new LinkedList<>());
    }
    @Override
    public Arco<T> obtenerArco(int verticeId1, int verticeId2) {
        for (Arco<T> a:vertices.get(verticeId1)) {
            if (a.getVerticeDestino() == verticeId2){
                return a;
            }
        }
        return null;
    }
    @Override
    public void borrarVertice(int verticeId) {
        if (vertices.remove(verticeId,vertices.get(verticeId))){
            System.out.println("Eliminado");
        return;
        }
        System.out.println("No se encuentra el vertice");

    }
    @Override
    public void agregarArco(int verticeId1, int verticeId2, T etiqueta) {
        if (vertices.get(verticeId1)!=null && vertices.get(verticeId2)!=null){
            vertices.get(verticeId1).add(new Arco<>(verticeId1,verticeId2,etiqueta));
            System.out.println("Arco agregado");
            return;
        }
        System.out.println("No se agrego el arco");

    }
    @Override
    public void borrarArco(int verticeId1, int verticeId2) {
        for (Arco<T> a:vertices.get(verticeId1)) {
            if (a.getVerticeDestino()==verticeId2){
                vertices.get(verticeId1).remove(a);
                System.out.println("Arco eliminado");
            return;
            }
        }
        System.out.println("No se elimino el arco");
    }
    @Override
    public boolean contieneVertice(int verticeId) {
        return vertices.containsKey(verticeId);
    }

    @Override
    public boolean existeArco(int verticeId1, int verticeId2) {
        for (Arco<T> a:vertices.get(verticeId1)) {
            if (a.getVerticeDestino()==verticeId2){
                return true;
            }
        }
        return false;
    }
    @Override
    public int cantidadVertices() {
        return vertices.size();
    }

    @Override
    public int cantidadArcos() {
        int contador = 0;
        for (LinkedList<Arco<T>> listaAdyacentes:vertices.values()){
            contador+=listaAdyacentes.size();
        }
        return contador;
    }
    @Override
    public Iterator<Integer> obtenerVertices() {
        return null;
    }
    @Override
    public Iterator<Integer> obtenerAdyacentes(int verticeId) {
        Iterator<Arco<T>> arcos = vertices.get(verticeId).iterator();
        if (vertices.containsKey(verticeId)){
            LinkedList<Integer> adyacentes = new LinkedList<>();
            while (arcos.hasNext()){
                adyacentes.add(arcos.next().getVerticeDestino());
            }
            return adyacentes.iterator();
        }
        return null;
    }
    @Override
    public Iterator<Arco<T>> obtenerArcos() {
        return null;
    }

    @Override
    public Iterator<Arco<T>> obtenerArcos(int verticeId) {
        // TODO Auto-generated method stub
        return null;
    }

}