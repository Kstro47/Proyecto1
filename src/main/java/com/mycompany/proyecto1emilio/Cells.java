/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1emilio;

/**
 *
 * @author Emilio Jr
 */
public class Cells {
        private boolean adyacentes[]={true,true,true,true}; //son los lados adyacentes a celda, arriba, abajo,derecha e izquierda, al ser true la celda aparece.
        private Cells celdaAbajo, celdaArriba,celdaDerecha,celdaIzquierda; //variables de las celdas adyacentes a una celda.
        private int posx,posy,anchoCelda; //variables de la coordenada x e y así como el ancho de la celda
        private boolean visitado=false; //boolean que permite saber si una celda ya fue visitada.

        public Cells (int x, int y,int anchoCelda){
                this.anchoCelda=anchoCelda;
                this.posx=x*anchoCelda;
                this.posy=y*anchoCelda;
        }

        public boolean[] getAdyacentes() {
                return adyacentes;
        }

        public void setAdyacentes(boolean[] adyacentes) {
                this.adyacentes = adyacentes;
        }

        public Cells getCeldaAbajo() {
                return celdaAbajo;
        }

        public void setCeldaAbajo(Cells celdaAbajo) {
                this.celdaAbajo = celdaAbajo;
        }

        public Cells getCeldaArriba() {
                return celdaArriba;
        }

        public void setCeldaArriba(Cells celdaArriba) {
                this.celdaArriba = celdaArriba;
        }

        public Cells getCeldaDerecha() {
                return celdaDerecha;
        }

        public void setCeldaDerecha(Cells celdaDerecha) {
                this.celdaDerecha = celdaDerecha;
        }

        public Cells getCeldaIzquierda() {
                return celdaIzquierda;
        }

        public void setCeldaIzquierda(Cells celdaIzquierda) {
                this.celdaIzquierda = celdaIzquierda;
        }

        public int getPosx() {
                return posx;
        }
        
        public int getPosx2(){
                return posx/this.anchoCelda;
        }

        public void setPosx(int posx) {
                this.posx = posx;
        }

        public int getPosy() {
                return posy;
        }
        
        public int getPosy2(){
                return posy/this.anchoCelda;
        }
        
        public void setPosy(int posy) {
                this.posy = posy;
        }

        public int getAnchoCelda() {
                return anchoCelda;
        }

        public void setAnchoCelda(int anchoCelda) {
                this.anchoCelda = anchoCelda;
        }

        public boolean isVisitado() {
                return visitado;
        }

        public void setVisitado(boolean visitado) {
                this.visitado = visitado;
        }
}       
