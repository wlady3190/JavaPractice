/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Wladimir Tierra
 */
public class EjerciciosArrayLIst {

    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        ArrayList<Double> nuevaLista = new ArrayList<>();

        //Iterator it =  numeros.iterator();
        double promedio = 0;

        numeros.add(1.60);
        numeros.add(1.85);
        numeros.add(1.90);
        numeros.add(1.60);
        numeros.add(1.75);
        numeros.add(1.73);
        numeros.add(1.73);
        numeros.add(1.87);
        numeros.add(1.90);
        numeros.add(1.50);
        System.out.println("\n**IMPRESIÓN DE COLECCIÓN INICIAL**");

        for (Double numero : numeros) {
            System.out.println(numero);
        }

        for (Double numero : numeros) {
            promedio += numero / numeros.size();

        }
        System.out.println("\n**IMPRESIÓN DEL PROMEDIO**");
        System.out.println("El promedio es " + promedio);

        for (Double numero : numeros) {
            if (!nuevaLista.contains(numero)) {
                nuevaLista.add(numero);
            }
        }

        System.out.println("\n**LISTA ACTUALIZADA**");
        for (Double numero : nuevaLista) {
            System.out.println(numero);

        }

    }

}
