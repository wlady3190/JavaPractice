/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.contactos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Main {

    public static void main(String[] args) {

        int opcion;
        String nombre, telefono, eliminar;
        char decision;
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> contactos = new HashMap<>();

        do {
            System.out.println("");
            System.out.println("**AGENDA DE CONTACTOS**");
            System.out.println("1. Agregar contactos");
            System.out.println("2. Ver contactos");
            System.out.println("3. Eliminar contactos");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opción");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    do {
                        System.out.println("");
                        System.out.println("Ingrese el nombre de contacto");
                        nombre = sc.next();
                        System.out.println("Ingrese el teléfono de contacto");
                        telefono = sc.next();
                        contactos.put(nombre, telefono);
                        System.out.println("¿Desea ingresar otro contacto (s/n)?");
                        decision = sc.next().charAt(0);
                        decision = Character.toLowerCase(decision);
                    } while (decision != 'n');
                }
                case 2 -> {
                    System.out.println("");
                    System.out.println("LISTA DE CONTACTOS");
                    for (String nombres : contactos.keySet()) {
                        System.out.println(nombres + " : " + contactos.get(nombres));
                    }
                }
                case 3 -> {
                    if (contactos.size() > 0) {
                        do {
                            System.out.println("");
                            System.out.println("QUITAR CONTACTOS");
                            System.out.println("Ingrese el nombre que desea eliminar");
                            eliminar = sc.next();

                            for (Map.Entry<String, String> agenda : contactos.entrySet()) {
                                if (agenda.getKey().equals(eliminar)) {
                                    contactos.remove(eliminar);
                                }
                            }
                            System.out.println("¿Desea eliminar otro contacto (s/n)?");
                            decision = sc.next().charAt(0);
                            decision = Character.toLowerCase(decision);
                        } while (decision != 'n');
                    } else {
                        System.out.println("No existen contactos en la agenda!");
                    }
                }
                case 4 ->
                    System.out.println("Gracias por usar el sistema -WT-");
                default ->
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 4);
    }
}
