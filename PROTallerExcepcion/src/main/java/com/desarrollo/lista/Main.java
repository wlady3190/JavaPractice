/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.lista;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        String nombre;
        char decision;

        LinkedList<String> lista = new LinkedList<>();
        do {

            System.out.println("");
            System.out.println("INGRESAR NOMBRES");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Eliminar datos");
            System.out.println("3. Mostrar datos");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {

                    do {
                        System.out.println("");
                        System.out.println("Ingrese un nombre");
                        nombre = sc.next();
                        lista.add(nombre);
                        System.out.println("Desea ingresar otro elemento?");
                        decision = sc.next().charAt(0);
                    } while (decision != 'n');
                }
                case 2 -> {
                    try {
                        eliminar(lista);
                    } catch (ListaEnlazada e) {
                        System.out.println("Lista vacía");
                        e.printStackTrace();
                    }
                }
                case 3 -> {
                    mostrar(lista);
                }
            }
        } while (opcion != 4);

    }

    public static void eliminar(LinkedList<String> lista) throws ListaEnlazada {
        if (lista.isEmpty()) {
            throw new ListaEnlazada("No se ha ingresado lista a la lista");
        } else {
            System.out.println("¿Que elemento desea eliminar de la lista?");
            String eliminar = sc.next();
            if (lista.contains(eliminar)) {
                lista.remove(eliminar);
                System.out.println("El registro: " + eliminar + " ha sido retirado de la lista");
            } else {
                System.out.println("No se encuentra a la persona");
            }
        }

    }

    public static void mostrar(LinkedList<String> lista) {
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }

}
