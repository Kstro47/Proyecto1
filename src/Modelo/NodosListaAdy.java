/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author sansa
 */
public class NodosListaAdy {
    
    
    public int celda;
    public int listaAdyAristas[];
    public NodosListaAdy siguiente;

    public NodosListaAdy(int celda, int[] listaAdyAristas,  NodosListaAdy siguiente) {
        this.celda = celda;
        this.listaAdyAristas = listaAdyAristas;
        this.siguiente = siguiente;
    }

    public int getCelda() {
        return celda;
    }

    public void setCelda(int celda) {
        this.celda = celda;
    }

    public int[] getListaAdyAristas() {
        return listaAdyAristas;
    }

    public void setListaAdyAristas(int[] listaAdyAristas) {
        this.listaAdyAristas = listaAdyAristas;
    }

    public NodosListaAdy getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodosListaAdy siguiente) {
        this.siguiente = siguiente;
    }

   

    

}


