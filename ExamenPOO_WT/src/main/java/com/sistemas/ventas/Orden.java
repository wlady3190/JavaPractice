/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemas.ventas;

import java.util.ArrayList;

/**
 *
 * @author Wladimir Tierra
 */
public class Orden {

    private int idOrden;
    private ArrayList<Computadora> listaComputadoras;
    private static int contadorOrdenes;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        this.listaComputadoras = new ArrayList<>();

    }

    public void agregarComputador(Computadora computadora) {
        this.listaComputadoras.add(computadora);
    }

    public double calculaTotal() {
        double precioTotal = 0;
        for (Computadora listaComputadora : listaComputadoras) {
            precioTotal += listaComputadora.getPrecio();
        }
        return precioTotal;
    }

    public double descuentoOrden() {
        double descuento = 0;
        if(listaComputadoras.size()>2){
            descuento = calculaTotal()-calculaTotal()/1.20;
        }
        
        return descuento;
    }

    public void mostrarOrden() {
        System.out.println("\nEl precio total de su orden es: " + calculaTotal());
        System.out.println("Número de computadoras: " + listaComputadoras.size());

        System.out.println("El valor de su descuento es: " + String.format("%.2f", descuentoOrden()));

        System.out.println("El valor a pagar es: " + String.format("%.2f",(calculaTotal() - descuentoOrden())));

    }

    public void imprimir() {
        for (Computadora listaComputadora : listaComputadoras) {
            System.out.println(listaComputadora);
        }
    }

}
