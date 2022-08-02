/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.test;

import com.desarrollo.enumeraciones.*;
import com.desarrollo.enumeraciones.DiasSemana;

/**
 *
 * @author Wladimir Tierra
 */
public class Test {

    public static void main(String[] args) {
        String continente = "AFRICA";

        System.out.println("Dia 3: " + DiasSemana.MIERCOLES);
        //continentes
        System.out.println("Continente No. 4" + Continentes.AMERICA);
        System.out.println("Numero de paises: " + Continentes.AMERICA.getNumPaises());
        imprimir(Continentes.valueOf(continente));
        imprimirConstantes();
    }

    public static void imprimir(Continentes continente) {
        switch (continente) {
            case AFRICA -> {
                System.out.println("Continente: " + continente + " número de países " + continente.getNumPaises());
            }
            case EUROPA -> {
                System.out.println("Continente: " + continente + " número de países " + continente.getNumPaises());
            }
        }
    }

    public static void imprimirConstantes() {
        for (Continentes value : Continentes.values()) {
            System.out.println("Continente: " + value + " numero de paises  " + value.getNumPaises());
        }
    }

}
