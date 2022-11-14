package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author sansa
 */
public class ListasSimples {
    private NodosSimples cabeza;
    private int lenght;
    
    public ListasSimples(NodosSimples cabeza) {
        if(cabeza == null){
            lenght = 0;
        } else {
            lenght = 1;
        }
        this.cabeza = cabeza;
    }
    
    public void insertarFinal(Vertice vertice) {
        NodosSimples nodo = new NodosSimples(vertice);
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
    
    public void insertarPrincipio(Vertice vertice) {
        NodosSimples nodo = new NodosSimples(vertice);
        if (estaVacia()) {
            setCabeza(nodo);
        } else {
            nodo.setSiguiente(getCabeza());
            setCabeza(nodo);
        }
        lenght++;
    }
    
    public void insertarEnIndice(int pos, Vertice vertice){
        NodosSimples nodo = new NodosSimples(vertice);
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
    
    public Vertice obtenerVertice(int pos){
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
    
    public void eliminarPrincipio() {
        if (!estaVacia()){
            NodosSimples pointer = getCabeza();
            setCabeza(pointer.getSiguiente());
            pointer.setSiguiente(null);
            lenght--;
        }
    }
    
    public void eliminarUltimo(){
        if(!estaVacia()){
            NodosSimples pointer = getCabeza();
            while (pointer.getSiguiente().getSiguiente() != null) {
                pointer = pointer.getSiguiente();
            }
            pointer.setSiguiente(null);
            lenght--;
        }
    }
    
    public void eliminarEnIndice(int pos){
        System.out.println(pos);
        if(!estaVacia()){
            System.out.println(pos);
            NodosSimples pointer = getCabeza();
            int cont = 0;
            while (cont < (pos - 1) && pointer.getSiguiente() != null) {
                pointer = pointer.getSiguiente();
                cont++;
            }
            NodosSimples temp = pointer.getSiguiente();
            pointer.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(null);
            lenght--;
        }
    }
}
