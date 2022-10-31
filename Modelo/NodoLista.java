/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author sansa
 */
public class NodoLista {
    
    private int listaAdy[];
    public int clave;
    public NodoLista siguiente;

    public NodoLista(int[] listaAdy, int clave, NodoLista siguiente) {
        this.listaAdy = listaAdy;
        this.clave = clave;
        this.siguiente = siguiente;
    }

    
    public int[] getListaAdy() {
        return listaAdy;
    }

    public void setListaAdy(int[] listaAdy) {
        this.listaAdy = listaAdy;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }
    
    

}


