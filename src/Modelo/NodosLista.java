/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author sansa
 */
public class NodosLista {
    public int clave;
    private int listaAdy[];
    public NodosLista siguiente;

    public NodosLista(int[] listaAdy, int clave, NodosLista siguiente) {
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

    public NodosLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodosLista siguiente) {
        this.siguiente = siguiente;
    }
    
    

}


