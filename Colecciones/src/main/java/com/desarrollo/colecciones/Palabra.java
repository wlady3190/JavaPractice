/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.colecciones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Wladimir Tierra
 */
public class Palabra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra, eliminar;
        String condicion = null;

        Set<String> palabras = new HashSet<>();
        do {
            System.out.println("Ingrese una palabra");
            palabra = sc.next();
            palabras.add(palabra);

            System.out.println("¿Desea ingresar otra palabra?");
            condicion = sc.next();

        } while (!condicion.equalsIgnoreCase("No"));

        for (String pa : palabras) {
            System.out.println(pa);

        }
        System.out.println("Ingrese la palabra que quier eliminar");
        eliminar = sc.next();
        palabras.remove(eliminar);

        System.out.println("");
        System.out.println("Lista actualizada");
        for (String pa : palabras) {
            System.out.println(pa);

        }

    }
}
