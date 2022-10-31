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
public class NodosSimples {
    private GenerarLaberinto elemento;
    private NodosSimples siguiente;

    public NodosSimples(GenerarLaberinto elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public GenerarLaberinto getElemento() {
        return elemento;
    }

    public void setElemento(GenerarLaberinto elemento) {
        this.elemento = elemento;
    }

    public NodosSimples getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodosSimples siguiente) {
        this.siguiente = siguiente;
    }
}
