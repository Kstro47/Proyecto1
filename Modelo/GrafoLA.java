/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author sansa
 */
public class GrafoLA implements Grafo {

    boolean dirigido;         // Indica si es dirigido o no.
    int maxNodos;           // Tamaño máximo de la tabla.
    int numVertices;        // Número de vértices del grafo.
    Lista listaAdy[];        // Vector de listas de adyacencias del grafo.

    public GrafoLA(boolean d) {
        maxNodos = numVertices = 0;
        dirigido = d;
    }

    public GrafoLA(int n, boolean d) {
        dirigido = d;
        maxNodos = n;
        numVertices = 0;
        listaAdy = new Lista[n];
    }

    public void insertaArista(int i, int j) {
        System.out.println("Vertice: " + numVertices);
        if (i >= numVertices) {
            System.out.println("Error, no existe el vértice en el grafo");
        } else {
            listaAdy[i].insertar(j);
            if (!dirigido) {
                listaAdy[j].insertar(i);
            }
        }
    }

    public void eliminaArista(int i, int j) {
        if (j >= numVertices) {
            System.out.println("Error, no existe el vértice en el grafo");
        } else {
            listaAdy[i].eliminar(j);
            if (!dirigido) {
                listaAdy[j].eliminar(i);
            }
        }
    }

    public void insertaVertice(int n) {
        if (n > maxNodos - numVertices) {
            System.out.println("Error, se supera el número de nodos máximo del grafo");
        } else {
            for (int i = numVertices; i < numVertices + n; i++) {
                listaAdy[i] = new Lista();
            }
            numVertices += n;
        }
    }

    public void imprimirGrafo() {
        System.out.println("Tamaño máximo del grafo: " + maxNodos + "\n");
        System.out.println("El grafo contiene " + numVertices + " vértices: \n");
        for (int i = 0; i < numVertices; i++) {
            System.out.print("vértice " + i + ": ");
            escribir(listaAdy[i]);
            System.out.println("listaAdy[i]: " + listaAdy[i]);
        }
    }

    static void escribir(Lista lista) {
        NodoLista aux;
        aux = lista.inicio;
        
        while (aux != null) {
            System.out.print(aux.clave + ", ");
            aux = aux.siguiente;
        }

        System.out.println("FIN" + aux);
    }
    
    

}
