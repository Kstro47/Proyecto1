/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


/**
 *
 * @author sansa
 */
public class NodosVecinos {
    private Celda elemento;
    private NodosVecinos siguiente;

    public NodosVecinos(Celda elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public Celda getElemento() {
        return elemento;
    }

    public void setElemento(Celda elemento) {
        this.elemento = elemento;
    }

    public NodosVecinos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodosVecinos siguiente) {
        this.siguiente = siguiente;
    }

    
    
}
