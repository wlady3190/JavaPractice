/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.parqueadero.banco;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Main {

    public static void main(String[] args) {
        int opcion;
        double cantidad = 0;

        Cuenta cuenta = new Cuenta();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("");
            System.out.println("BANCO DEL BARRIO");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Mostrar saldo");
            System.out.println("4. Salir");

            System.out.println("Seleccione una opcion");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese la cantidad a depositar: ");
                    cantidad = sc.nextDouble();
                    try{
                        cuenta.depositar(cantidad);
                    } catch (InputMismatchException e){
                        System.out.println("Datos incorrectos");
                    } finally{
                        System.out.println("Ingrese datos numéricos");
                    }
                    

                }
                case 2 -> {
                    System.out.println("Ingrese la cantidad a retirar: ");
                    cantidad = sc.nextDouble();
                    try {
                        cuenta.retirar(cantidad);
                    } catch (RuntimeException e) {
                        System.out.println("");
                        System.out.println("Saldo no disponible");
                        //e.printStackTrace();
                    } finally{
                        System.out.println("El monto excede la cantidad en su saldo");
                    }

                }
                case 3 -> {

                    System.out.println("Mostrar saldo");
                    cuenta.imprimirSaldo();

                }
            }
        } while (opcion != 4);

        //cuenta.depositar(1000);
    }

}
