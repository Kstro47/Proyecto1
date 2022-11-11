/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author yilme
 */
// Adjacency Matrix representation in Java

public class Graph {
  private Cell adjMatrix[][];

  private int numRows;
  private int numColumns;
  
  // Initialize the matrix
  public Graph(int numRows, int numColumns) {
    this.numRows = numRows;
    this.numColumns = numColumns;
    adjMatrix = new Cell[numRows][numColumns];
  }
//
//  // Add edges
//  public void addEdge(int i, int j) {
//      for (int k = 0; k < i; k++) {
//          
//      }
//  }

//  // Remove edges
//  public void removeEdge(int i, int j) {
//    adjMatrix[i][j] = false;
//    adjMatrix[j][i] = false;
//  }
//
//  // Print the matrix
//  public String toString() {
//    StringBuilder s = new StringBuilder();
//    for (int i = 0; i < numRows; i++) {
//      s.append(i + ": ");
//      for (Cell j : adjMatrix[i]) {
//        s.append((j ? 1 : 0) + " ");
//      }
//      s.append("\n");
//    }
//    return s.toString();
//  }

  public static void main(String args[]) {
    Graph g = new Graph(5,5);

//    g.addEdge(0, 1);
//    g.addEdge(0, 2);
//    g.addEdge(1, 2);
//    g.addEdge(2, 0);
//    g.addEdge(2, 3);

    System.out.print(g.toString());
  }
}
