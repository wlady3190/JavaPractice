/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.treeset;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Wladimir Tierra
 */
public class Main {
        public static void main(String[] args) {
        Set<Producto> listaProductos  = new TreeSet<>();
        Producto p1 = new Producto(2, "Fideo");
        Producto p2 = new Producto(1, "Cepillo");
        Producto p3 = new Producto(4, "Arroz");
        
        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);
        
            System.out.println("Orden por número");
        for (Producto productos : listaProductos){
            System.out.println(productos);
        }
        
            Producto ordenProducto = new Producto();
            
            Set<Producto> listaProductos1 = new TreeSet<>(ordenProducto);
            listaProductos1.add(p1);
            listaProductos1.add(p2);
            listaProductos1.add(p3);
            System.out.println("Orden por producto");
            for (Producto productos:listaProductos1){
                System.out.println(productos);
            }
            

    }
    
}
