/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.farmacia;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String generico, comercial;
        double precio = 0;
        int codigo = 0, opcion;
        char decision;
        boolean correcto = false;

        HashMap<Integer, Medicamento> lista = new HashMap<>();
        Medicamento medicamento = null;
        do {

            System.out.println("");
            System.out.println("SISTEMA DE GESTIÓN DE MEDICAMENTOS");
            System.out.println("1. Ingresar datos de medicamento");
            System.out.println("2. Consultar medicamento");
            System.out.println("3. Ver lista de medicamentos");
            System.out.println("4. Salir");
             System.out.println("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    do {

                        System.out.println("");
                        System.out.println("INGRESO DE MEDICAMENTOS");
                        do {
                            System.out.println("Ingrese el código del producto");
                            try {
                                codigo = sc.nextInt();
                                correcto = false;
                            } catch (InputMismatchException e) {
                                System.out.println("Ingrese un código válido");
                                sc.next();

                                correcto = true;
                            }

                        } while (correcto);

                        System.out.println("Ingresar el nombre genérico");
                        generico = sc.next();
                        System.out.println("Ingrese el nombre comercial");
                        comercial = sc.next();
                        do {
                            System.out.println("Ingrese el precio");
                            try {
                                precio = sc.nextDouble();
                                correcto = false;
                            } catch (InputMismatchException e) {
                                System.out.println("Ingrese un precio numérico válido");
                                sc.next();
                                correcto = true;

                            }
                        } while (correcto == true);

                        medicamento = new Medicamento(generico, comercial, precio);

                        lista.put(codigo, medicamento);
                        System.out.println("¿Desea ingresar otro medicamente? (s/n)");
                        decision = sc.next().charAt(0);
                        decision = Character.toLowerCase(decision);
                    } while (decision != 'n');
                   
                }

                case 2 -> {
                    try {
                        medicamentoSinExistencia(lista);
                    } catch (VerificarMedicamento e) {
                        System.out.println("No se ha ingresado ningún medicamento");
                        //e.printStackTrace();
                    }
                }
                case 3 -> {
                    System.out.println("");
                    System.out.println("LISTA DE MEDICAMENTOS");
                    if (lista.isEmpty()) {
                        System.out.println("No se ha ingresado elementos a la lista");
                    } else {
                        for (Map.Entry<Integer, Medicamento> entry : lista.entrySet()) {
                            System.out.println(entry);
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Gracias por usar el servicio -WT-");
                }
                default -> {
                    System.out.println("Opción inválida");
                }
            }
        } while (opcion != 4);

    }

    public static void medicamentoSinExistencia(HashMap<Integer, Medicamento> lista) throws VerificarMedicamento {
        int codigoBuscar = 0;
        if (lista.isEmpty()) {
            throw new VerificarMedicamento("No se ha ingresado un medicamento a la lista");
        } else {
            System.out.println("Ingrese el código que desea buscar");
            try {
                codigoBuscar = sc.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Ingrese un codigo numérico válido");
                sc.next();
            }

             for (Map.Entry<Integer, Medicamento> elemento : lista.entrySet()) {
                if (elemento.getKey() == codigoBuscar) {
                    System.out.println("Si existe el medicamento");
                    System.out.println(elemento.getValue());                 
                }else{
                    System.out.println("No existe el medicamento");
                    break;
                }       
            } 
            //    
        }
    }

}
