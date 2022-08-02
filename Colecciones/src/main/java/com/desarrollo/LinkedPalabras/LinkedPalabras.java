/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.LinkedPalabras;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class LinkedPalabras {

    public static void main(String[] args) {
        String palabra, opcion;
        Scanner sc = new Scanner(System.in);
        LinkedList<String> palabras = new LinkedList<>();
        do {
            System.out.println("Ingrese una palabra");
            palabra = sc.next();
            palabras.add(palabra);
            System.out.println("¿Desea ingresar otra palabra (s/n)?");
            opcion = sc.next();
        } while (!opcion.equalsIgnoreCase("n"));
            System.out.println("Lista original");
        for (String listaPlabras : palabras) {
            System.out.println(listaPlabras);
        }

        Iterator<String> it = palabras.iterator();

        Collections.reverse(palabras);
        
        System.out.println("");
        System.out.println("Lista invertida");
        for (String listaPlabras : palabras) {
            System.out.println(listaPlabras);
        }
        
        

    }

}
