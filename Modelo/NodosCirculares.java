/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author sansa
 */
public class NodosCirculares {
    private int elemento;
    private NodosCirculares siguiente;

    public NodosCirculares(int elemento, NodosCirculares siguiente) {
        this.elemento = elemento;
        this.siguiente = this;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public NodosCirculares getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodosCirculares siguiente) {
        this.siguiente = siguiente;
    }
    
}
