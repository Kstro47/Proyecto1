package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author sansa
 */
public class Vertice {

    int aristas[] = {-1, -1, -1, -1};
    boolean visitada = false; //Saber si la celda está visitada
    boolean lados[] = {true, true, true, true}; //Los cuatros lados de cada celda (arriba, derecha, abajo, izquierda) --> true para que se dibuje, false para que no.
    int posX, posY, anchoCelda; //La coordenada y el ancho en píxeles de cada celda.

    public Vertice() {
    }

    public Vertice(int posX, int posY, int anchoCelda) {
        this.posX = posX;
        this.posY = posY;
        this.anchoCelda = anchoCelda;
    }

    public int[] getAristas() {
        return aristas;
    }

    public void setAristas(int[] aristas) {
        this.aristas = aristas;
    }

    public boolean isVisitada() {
        return visitada;
    }

    public void setVisitada(boolean visitada) {
        this.visitada = visitada;
    }

    public boolean[] getLados() {
        return lados;
    }

    public void setLados(boolean[] lados) {
        this.lados = lados;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }
     public int getPosX2() {
        return posX/this.anchoCelda;
    }

    public int getPosY() {
        return posY;
    }
      public int getPosY2() {
        return posY/this.anchoCelda;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getAnchoCelda() {
        return anchoCelda;
    }

    public void setAnchoCelda(int anchoCelda) {
        this.anchoCelda = anchoCelda;
    }

}
