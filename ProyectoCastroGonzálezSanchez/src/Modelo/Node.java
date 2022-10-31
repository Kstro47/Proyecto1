/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class Node{
    private String data;
    private int num;
    private Celda celda;

    public Node(Celda celda){
        this.celda = celda;      
    }
    
    public Node(String data){
        this.data = data;
    }
    
    public Node(int num){
        this.num = num;
    }
    

    public Celda getCelda() {
        return celda;
    }

    public void setCelda(Celda celda) {
        this.celda = celda;
    }
    
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int next) {
        this.num = next;
    }
    
}
