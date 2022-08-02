/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.hashmap;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author Wladimir Tierra
 */
public class Prueba2 {

    public static void main(String[] args) {
        HashMap<String, String[]> animales = new HashMap<>();

        animales.put("Domésticos", new String[]{"Perro", "Gato", "Vaca"});
        animales.put("Salvajes", new String[]{"león", "tigre", "elefante"});
        
        for(String clave:animales.keySet()){
            System.out.println(clave + " => " + Arrays.toString(animales.get(clave)));
        }

    }

}
