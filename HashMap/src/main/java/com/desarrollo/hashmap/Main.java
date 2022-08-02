/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Main {

    public static void main(String[] args) {
        String nombre;
        
        Scanner sc = new Scanner(System.in);
        //Creando HashMap
        HashMap<Integer, String> mapaPersonas = new HashMap<>();
        //Añadir elementos

        mapaPersonas.put(100, "Wlady");
        mapaPersonas.put(101, "Lili");
        mapaPersonas.put(102, "Sebas");
        
        //imprimir elementos
        System.out.println(mapaPersonas);        
        System.out.println(mapaPersonas.entrySet());
        
        for(Integer clave:mapaPersonas.keySet()){
            System.out.println(clave + " => " + mapaPersonas.get(clave));      
        }       
        System.out.println("¿Qué persona desea buscar?");
        nombre = sc.next();
        
        if(mapaPersonas.containsValue(nombre)){
            System.out.println("La persona si existe en la lista");
        } else{
            System.out.println("La persona no existe en la lista");
        }
        
        for (Entry<Integer, String> entrada:mapaPersonas.entrySet()){
            if(entrada.getValue().equals(nombre)){
                System.out.println("La persona si existe y su clave es: " + entrada.getKey());
                
            }
            
        }

        

    }

}
