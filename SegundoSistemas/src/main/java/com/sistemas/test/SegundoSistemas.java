/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemas.test;

import com.sistemas.empresa.Cliente;
import com.sistemas.empresa.Empleado;
import com.sistemas.empresa.Empresa;
import java.util.Scanner;

public class SegundoSistemas {

    public static void main(String[] args) {
        String nombre, apellido, direccion, vip;
        int horasTrabajadas, opcion;
        long celular;
        char decision;
        Scanner sc = new Scanner(System.in);
        Empleado empleado = null;
        Cliente cliente = null;
        Empresa empresa = new Empresa();
        do {
            System.out.println("");
            System.out.println("**SEGUNDO SISTEMAS**");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Agregar cliente");
            System.out.println("3. Calcular salario total de empleados");
            System.out.println("4. Mostar lista de clientes");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opción");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    do {
                        System.out.println("Horas trabajadas: ");
                        horasTrabajadas = sc.nextInt();
                        System.out.println("Ingrese su nombre: ");
                        nombre = sc.next();
                        System.out.println("Ingrese su apellido: ");
                        apellido = sc.next();
                        System.out.println("Ingrese la dirección: ");
                        direccion = sc.next();
                        System.out.println("Ingrese el celular: ");
                        celular = sc.nextLong();

                        empleado = new Empleado(horasTrabajadas, nombre, apellido, direccion, celular);

                        empresa.agregarEmpleado(empleado);
                        System.out.println("¿Desea ingresar otro empleado?(s/n)");
                        decision = sc.next().charAt(0);
                        decision = Character.toLowerCase(decision);
                    } while (decision == 's');
                }
                case 2 -> {
                    do {
                        System.out.println("");
                        System.out.println("Ingrese el nombre: ");
                        nombre = sc.next();
                        System.out.println("Ingrese el apellido: ");
                        apellido = sc.next();
                        System.out.println("Dirección: ");
                        direccion = sc.next();
                        System.out.println("Celular: ");
                        celular = sc.nextLong();
                        System.out.println("VIP?");
                        vip = sc.next();

                        cliente = new Cliente(vip, nombre, apellido, direccion, celular);

                        empresa.agregarCliente(cliente);
                        System.out.println("Desea ingresar otro cliente (s/n)?");
                        decision = sc.next().charAt(0);
                        decision = Character.toLowerCase(decision);
                        empresa.calcularTotalSueldosEmpleados();
                    } while (decision == 's');
                }
                case 3 -> {
                    System.out.println("Salarios de empleados");
                    empresa.imprimirSueldoTotal();
                }
                case 4 -> {
                    System.out.println("Lista de clientes");
                    empresa.mostrarListaClientes();
                }               
                case 5->{
                    System.out.println("GRACIAS POR USAR EL SISTEMA -WT-");
                }
                default->{
                    System.out.println("Opción incorrecta");
            }
            }

        } while (opcion != 5);

    }

}
