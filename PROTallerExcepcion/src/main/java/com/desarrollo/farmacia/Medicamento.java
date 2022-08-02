/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.farmacia;

/**
 *
 * @author Wladimir Tierra
 */
public class Medicamento {
    String generico, comercial;
    double precio;

    public Medicamento(String generico, String comercial, double precio) {
        this.generico = generico;
        this.comercial = comercial;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "generico=" + generico + ", comercial=" + comercial + ", precio=" + precio + '}';
    }
    
    
    
    
    
}
