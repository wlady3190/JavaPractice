/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.excepcionPropia;

/**
 *
 * @author Wladimir Tierra
 */
public class DividirUno extends Exception{

//    public DividirUno() {
//    }
    public DividirUno(String mensajeError) {
        super(mensajeError);
    }
    
}
