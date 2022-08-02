/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.conversion;

/**
 *
 * @author Wladimir Tierra
 */
public class AutoBoxingUnboxing {

    public static void main(String[] args) {
        //convertir primitivo a Object
        Integer numObject = 10;
        System.out.println("Numero: " + numObject);

        //tranformar
        System.out.println("Numero decimal: " + numObject.doubleValue());

        //unboxing: convertir un pbjeto a primitivo
        int numPrimitivo = numObject;
        System.out.println("Número:" + numPrimitivo);

    }

}
