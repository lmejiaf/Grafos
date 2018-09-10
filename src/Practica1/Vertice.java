/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1;

import java.util.LinkedList;

/**
 *
 * @author lmejiaf
 */
public class Vertice {
    int dato;
    LinkedList<Vertice> apuntadores;

    public Vertice(int dato) {
        this.dato = dato;
        apuntadores= new LinkedList();
    }
    
}
