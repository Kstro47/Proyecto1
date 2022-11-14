package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author sansa
 */
public class NodosSimples {
    private Vertice elemento;
    private NodosSimples siguiente;

    public NodosSimples(Vertice elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public Vertice getElemento() {
        return elemento;
    }

    public void setElemento(Vertice elemento) {
        this.elemento = elemento;
    }

    public NodosSimples getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodosSimples siguiente) {
        this.siguiente = siguiente;
    }
}
