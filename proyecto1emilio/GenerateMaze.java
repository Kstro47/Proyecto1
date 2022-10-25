/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1emilio;

/**
 *
 * @author Emilio Jr
 */
public class GenerateMaze {
        
        private int mazeRows, mazeColumns, cellsWidth; //datos que ingresará el usuario
        private Cells[][] cells; //celdas que serán el "panel" para generar el laberinto

        public GenerateMaze(int mazeRows, int mazeColumns, int cellsWidth, Cells[][] cells) {
                this.mazeRows = mazeRows;
                this.mazeColumns = mazeColumns;
                this.cellsWidth = cellsWidth;
                this.cells = cells;
        }
        
        public void startCells() {
                cells = new Cells[this.mazeColumns][this.mazeRows]; //celdas generadas  con respeto a las columnas y filas ingresdasporel ususario
                for (int i = 0; i < this.mazeRows; i++) {
                        for (int j = 0; j < this.mazeColumns; j++) {
                                cells[i][j] = new Cells(j, i, this.cellsWidth); //las celdas se ubican en su coordenada y anchura indicada
                        }
                }
                this.adjacentCells();
        }
        
        public void adjacentCells() {
                for (int i = 0; i < this.mazeRows; i++) {
                        for (int j = 0; j < this.mazeColumns; j++) {
                                if (j > 0) { //fila mayor a 0, se puede asinar adyacente arriba
                                        this.cells[i][j].setCeldaArriba(this.cells[i - 1][j]);
                                }
                                if (i < this.mazeRows - 1) {//Si la fila es menor que el total de filas se puede asignar un celda adyacente abajo
                                        this.cells[i][j].setCeldaAbajo(this.cells[i + 1][j]);
                                }
                                if (j < this.mazeColumns - 1) { //Si la columna es menor que el total de columnas se puede asignar un vecino derecho
                                        this.cells[i][j].setCeldaDerecha(this.cells[i][j + i]);
                                }
                                if (j > 0) {//Si la columna es mayor que cero se puede asignar un vecino izquierdo.
                                        this.cells[i][j].setCeldaIzquierda(this.cells[i][j - 1]);
                                }
                                
                        }
                }
                
        }
        public void startMazePlane(){
                this.startCells();
        }
        public void generateMaze(){
                //this.primAlgorithm;
        }
}
