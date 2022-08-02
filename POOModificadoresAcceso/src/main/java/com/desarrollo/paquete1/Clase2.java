/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.paquete1;

/**
 *
 * @author Wladimir Tierra
 */
public class Clase2 {
    Clase1 clase1;
    
    public Clase2(){
        clase1 = new Clase1('F'); //Constructor Público
        clase1 = new Clase1(30); //Constructor Protegido
        clase1 = new Clase1(1.5); //Constructor Default
       
        
    }
    
    //Prueba atributos
    public void pruebaAtributos(){
        System.out.println("Atributo público: " + clase1.atributoPublico);
        System.out.println("Atributo protegido: " + clase1.atributoProtegido);
        System.out.println("Atributo público: " + clase1.atributoDefault);
    }
    
    //Prueba metodo
    public void pruebaMetodo(){
        clase1.metodoPublico();
        clase1.metodoProtegido();
        clase1.metodoDefault();
        
    }
    public static void main(String[] args) {
        Clase2 clase2 = new Clase2();
        clase2.pruebaAtributos();
        clase2.pruebaMetodo();
        
    }
    
}
