/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_LIst;

import java.util.ArrayList;

/**
 *
 * @author Wladimir Tierra
 */
public class Main {
    //uso de array Lists
    public static void main(String[] args) {
        ArrayList<String> meses = new ArrayList<>();
        
        meses.add("Enero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Junio");
        
        for(String listaMeses:meses){
            System.out.println(listaMeses);
        }
        
        //GET: Devolver el elemento que se encuentra en una determinada posición

        System.out.println("GET");
        
        System.out.println(meses.get(1));
        System.out.println(meses.get(3));
        //SET: Modificar un valor d euna determinada  posición        
        System.out.println("SET");
        meses.set(1, "Febrero");
        System.out.println(meses.get(1));
        
        System.out.println("");
        System.out.println("Imprimir meses");
        for (String mes:meses){
            System.out.println(mes);
        }
        //eliminado productos
        System.out.println("");
        System.out.println("Lista con eliminación de ejercicios");
        meses.remove(3);
        for (String mes:meses){
            System.out.println(mes);
        }
        
        
        
        
    }
    
    
}
