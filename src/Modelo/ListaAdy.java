/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author sansa
 */
public class ListaAdy {
    private NodosVecinos cabeza;
    private int lenght;
    
    public ListaAdy(NodosVecinos cabeza) {
        if(cabeza == null){
            lenght = 0;
        } else {
            lenght = 1;
        }
        this.cabeza = cabeza;
    }
    
    public void insertarFinal(Celda celda) {
        NodosVecinos nodo = new NodosVecinos(celda);
        if (estaVacia()) {
            setCabeza(nodo);
            System.out.println("hizo esto"+estaVacia());
        } else {
            NodosVecinos pointer = getCabeza();
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
    
    public NodosVecinos getCabeza() {
        return cabeza;
    }

    public int getLenght() {
        return lenght;
    }
    public void setCabeza(NodosVecinos cabeza) {
        this.cabeza = cabeza;
        System.out.println("hizo esto"+cabeza);
    }
    
    public void insertarPrincipio(Celda celda) {
        NodosVecinos nodo = new NodosVecinos(celda);
        if (estaVacia()) {
            setCabeza(nodo);
        } else {
            nodo.setSiguiente(getCabeza());
            setCabeza(nodo);
        }
        lenght++;
    }
    
    public void insertarEnIndice(int pos, Celda celda){
        NodosVecinos nodo = new NodosVecinos(celda);
        if (estaVacia()) {
            setCabeza(nodo);
        } else {
            NodosVecinos pointer = getCabeza();
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
    
    public Celda obtenerCelda(int pos){
        if (estaVacia()) {
            return null;
        } else {
            NodosVecinos pointer = getCabeza();
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
