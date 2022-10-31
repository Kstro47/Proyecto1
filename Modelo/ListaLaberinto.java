/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.GenerarLaberinto;

/**
 *
 * @author sansa
 */
public class ListaLaberinto {
    private NodosSimples cabeza;
    private int lenght;
    
    public ListaLaberinto(NodosSimples cabeza) {
        if(cabeza == null){
            lenght = 0;
        } else {
            lenght = 1;
        }
        this.cabeza = cabeza;
    }
    
    public void insertarFinal(GenerarLaberinto laberinto) {
        NodosSimples nodo = new NodosSimples(laberinto);
        if (estaVacia()) {
            setCabeza(nodo);
            System.out.println("hizo esto"+estaVacia());
        } else {
            NodosSimples pointer = getCabeza();
            while (pointer.getSiguiente() != null) {
                pointer = pointer.getSiguiente();
            }
            pointer.setSiguiente(nodo);
        }
        lenght++;
    }
    
    public boolean estaVacia(){
            return getCabeza() == null;
        }
    
    public NodosSimples getCabeza() {
        return cabeza;
    }

    public int getLenght() {
        return lenght;
    }
    public void setCabeza(NodosSimples cabeza) {
        this.cabeza = cabeza;
        System.out.println("hizo esto"+cabeza);
    }
    
    public void insertarPrincipio(GenerarLaberinto laberinto) {
        NodosSimples nodo = new NodosSimples(laberinto);
        if (estaVacia()) {
            setCabeza(nodo);
        } else {
            nodo.setSiguiente(getCabeza());
            setCabeza(nodo);
        }
        lenght++;
    }
    
    public void insertarEnIndice(int pos, GenerarLaberinto laberinto){
        NodosSimples nodo = new NodosSimples(laberinto);
        if (estaVacia()) {
            setCabeza(nodo);
        } else {
            NodosSimples pointer = getCabeza();
            int cont = 0;
            while (cont < pos && pointer.getSiguiente() != null) {
                pointer = pointer.getSiguiente();
                cont++;
            }
            nodo.setSiguiente(pointer.getSiguiente());
            pointer.setSiguiente(nodo);
        }
        lenght++;
    }
    
    public GenerarLaberinto obtenerLaberinto(int pos){
        if (estaVacia()) {
            return null;
        } else {
            NodosSimples pointer = getCabeza();
            int cont = 0;
            while (cont < pos && pointer.getSiguiente() != null) {
                pointer = pointer.getSiguiente();
                cont++;
            }
            if (cont == pos) {
                return pointer.getElemento();
            } else {
                return null;
            }
        }
    }
}
