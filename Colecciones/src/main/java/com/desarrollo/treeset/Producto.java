/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.treeset;

import java.util.Comparator;

/**
 *
 * @author Wladimir Tierra
 */
public class Producto implements Comparable<Producto>, Comparator<Producto>{
    int num;
    String nombre;

    public Producto(int num, String nombre) {
        this.num = num;
        this.nombre = nombre;
    }

    public Producto() {
    }
    

    @Override
    public int compareTo(Producto o) {
        return num-o.num;       
    }

    @Override
    public String toString() {
        return "Producto{" + "num=" + num + ", nombre=" + nombre + '}';
    }

    @Override
    public int compare(Producto o1, Producto o2) {
        String nombre1 = o1.nombre;
        String nombre2 = o2.nombre;
        return nombre1.compareTo(nombre2);
    }
    
    
    
}
