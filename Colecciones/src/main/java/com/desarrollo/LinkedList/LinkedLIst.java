/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class LinkedLIst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, decision;
        int n;
        LinkedList<String> nombres= new LinkedList<>();
        nombres.add("Gabriel");
        nombres.add("Pedro");
        nombres.add("María");
        nombres.add("Samuel");
        nombres.add("Pilar");
        
        for(String lista:nombres){
            System.out.println(lista);
        }
        
        nombres.addFirst("Santiago");
        nombres.addLast("Wlady");
        nombres.add(3,"Ana");
        
        System.out.println("Lista actualizada con adiciones");
        for(String lista:nombres){
            System.out.println(lista);
        }
        
        
        //ordenar elementos
        
        Collections.sort(nombres);
        System.out.println("LISTA ORDENADA");
        
        for(String lista:nombres){
            System.out.println(lista);
        }
        do{
            System.out.println("Ingrese un nombre");
            nombre = sc.next();
            System.out.println("Desea agregar más nombre ");
            decision = sc.next();
            
        }while(!decision.equalsIgnoreCase("N"));
        
        for(String lista:nombres){
            System.out.println(lista);
        }
        System.out.println("");
        System.out.println("PRIMER ELEMENTO");
        System.out.println("El primer elementos es: " + nombres.peek());
        System.out.println("ULTIMO ELEMENTOI");
        System.out.println("EL último elementos es: " + nombres.getLast());
            //Buscar en q posición está un nombre
            System.out.println("¿QUé nombre desea buscar??");
            n = sc.nextInt();
            
            
                    
            
    }
    

  
    
}
