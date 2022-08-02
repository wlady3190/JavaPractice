/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ventas;

import java.util.ArrayList;
public class Orden {

    private int idOrden;
    private Producto[] productosVector;
    private ArrayList<Producto> productosColeccion;
    //atributo estático
    private static int contOrden;
    private static int index = 0;
    //constante estática
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++contOrden;
        this.productosVector = new Producto[MAX_PRODUCTOS];
        this.productosColeccion = new ArrayList<>();

    }

    public void agregarProductoVector(Producto producto) {

        if (index < MAX_PRODUCTOS) {
            this.productosVector[index] = producto;
            index++;
            System.out.println("Producto agregado vector");
        } else {
            System.out.println("Se ha superado el máximo de productos en la orden");
        }

    }

    public void agregarProductoColeccion(Producto producto) {
        this.productosColeccion.add(producto);
        System.out.println("Producto agregado coleccion");
    }


    
    public double calcularTotalVector(){
        double acumTotal=0;
        for (int i = 0; i < index; i++) {
            acumTotal = acumTotal+productosVector[i].getPrecio();    
        }
        return acumTotal;    
    }
    
    public double calcularTotalColeccion(){
        double acumTotal = 0;
        for (int i = 0; i < productosColeccion.size(); i++) {
            acumTotal = acumTotal + productosColeccion.get(i).getPrecio();
        }
        
        return acumTotal;
    }
        //métodos de prueba
    public void mostrarOrdenVector() {
        System.out.println("");
        System.out.println("Orden número: " + this.idOrden );
        System.out.println("**LISTA PRODUCTOS VECTOR**");
        for (int i = 0; i < index; i++) {
            System.out.println(productosVector[i].toString());

        }
        System.out.println("Total a pagar: " + calcularTotalVector());
        
    }

    public void mostrarOrdenColeccion() {
        System.out.println("");
        System.out.println("Orden No. " + this.idOrden +"\n");
        System.out.println("**LISTA DE PRODUCTOS COLECCIÓN**");
        for (int i = 0; i < productosColeccion.size(); i++) {
            System.out.println(productosColeccion.get(i).toString());
        }
        
        System.out.println("Total a pagar: " + calcularTotalColeccion());
        
        
    }

}
