/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Wladimir Tierra
 */
public class Persona {
    public static void main(String[] args) {
        //Hash set
        
        TreeSet<String> nombres = new TreeSet<>();
        
        nombres.add("María");
        nombres.add("Wlady");
        nombres.add("José");
        nombres.add("Teresa");
        nombres.add("Wlady");
                //Uso de metodo for each
        for(String nombre:nombres){
            System.out.println(nombre);
        }
//        nombres.remove("Teresa");
//        System.out.println("");
//        System.out.println("INFORMACIÓN ACTUALIZADA ");
//        for(String nombre:nombres){
//            System.out.println(nombre);
//        }
        
        
    }
    
}
