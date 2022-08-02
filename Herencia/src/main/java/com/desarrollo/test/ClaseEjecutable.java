/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.test;

import com.desarrollo.herencia.Cliente;
import com.desarrollo.herencia.Empleado;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class ClaseEjecutable {

    public static void main(String[] args) {
        int op;
        String name, address,vip;
        char genre;
        int age, hoursT;
        double valueH;


        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("");
            System.out.println("MENÚ EMPRESA WT");
            System.out.println("1. Empleado");
            System.out.println("2. Ciente");
            System.out.println("3. Salir");
            System.out.println("Escoja una opción");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    //Ver en el costructor para ver que se necesita
                    System.out.println("");
                    System.out.println("INFORMACIÓN EMPLEADO");
                    System.out.println("Nombre: ");
                    name = sc.next();
                    System.out.println("Género: (M/F)");
                    genre = sc.next().charAt(0);
                    System.out.println("Edad: ");
                    age = sc.nextInt();
                    System.out.println("Dirección: ");
                    address = sc.next();
                    System.out.println("Horas trabajadas: ");
                    hoursT = sc.nextInt();
                    System.out.println("Valor hora trabajada: ");
                    valueH = sc.nextDouble();

                    //Crear objeto empleado a partir de la clase HIJA, estahace todo el trabajo con la clase PADRE
                    // No se necesita crear objeto para la clase padre.
                    
                    Empleado empleado = new Empleado(name, genre, age, address, hoursT, valueH);
                    
                    
                    System.out.println(empleado.toString());
                    System.out.println("El salario es: "+ empleado.salario());
                    empleado.descuentoSalario();
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("**INFORMACIÓN CLIENTE**");
                    System.out.println("Nombre: ");
                    name = sc.next();
                    System.out.println("Género: (M/F)");
                    genre = sc.next().charAt(0);
                    System.out.println("Edad: ");
                    age = sc.nextInt();
                    System.out.println("Dirección: ");
                    address = sc.next();
                    System.out.println("VIP (Si/No)");
                    vip = sc.next();
                    Cliente cliente = new Cliente(name, genre, age, address, vip);
                    System.out.println(cliente.toString());
  
                    break;
                    
                case 3:
                    break;
                default:
                    System.out.println("Gracias por usar nuestro servicio");

            }
        } while (op != 3);
    }

}
