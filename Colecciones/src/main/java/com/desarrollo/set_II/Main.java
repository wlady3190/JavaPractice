/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.set_II;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Wladimir Tierra
 */
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Wlady", "Tierra","172059" );
        Empleado empleado1 = new Empleado("Lili", "Toinga", "210021");
       Empleado empleado2 = new Empleado("Daysi", "Chávez", "12345");
        Empleado empleado3 = new Empleado("Wlady", "Tierra","172059" );
        
        Set<Empleado> empleados= new HashSet<>();
        empleados.add(empleado);
        empleados.add(empleado3);
//        empleados.add(empleado2);
//        empleados.add(empleado3);
        if(empleado.equals(empleado3)){
            System.out.println("Es el mismo empleado");
            System.out.println(empleado.hashCode());
        }else{
            System.out.println("No es el mismo empleado");
        }
                
        for (Empleado listaEmpleado:empleados){
            System.out.println(listaEmpleado.toString());
            
        }
        
        
    }
    
}
