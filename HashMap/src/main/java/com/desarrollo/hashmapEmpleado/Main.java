/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.hashmapEmpleado;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Empleado> empleados = new HashMap<>();
        empleados.put("E001", new Empleado("Pedro", 450.5));
        empleados.put("E002", new Empleado("Wlady", 550.25));
        empleados.put("E003", new Empleado("Lili", 400.54));
        empleados.put("E004", new Empleado("Sebas", 600.5));
        System.out.println("");
        System.out.println("*DATOS DEL PROSONAL DE LA EMPRESA*");
        for (String clave : empleados.keySet()) {

            System.out.println(clave + " => " + empleados.get(clave));
        }
        System.out.println("¿Qué empleado desea buscar?");
        String codigoEmpleado = sc.next();
        for (Map.Entry<String, Empleado> entrada : empleados.entrySet()) {
            //String clave = entrada.getKey();
            //Empleado valor = entrada.getValue();

            if (entrada.getKey().equals(codigoEmpleado)) {
                System.out.println("El empleado es: " + entrada.getValue());
            }

        }

    }

}
