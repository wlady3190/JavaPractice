/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.paquete2;

import com.desarrollo.paquete1.Clase1;

/**
 *
 * @author Wladimir Tierra
 */
public class Clase4 {

    Clase1 clase1;

    public Clase4() {
        clase1 = new Clase1('F');
//        clase1 = new Clase1(30);
//        clase1 = new Clase1(1.5);
//        clase1 = new Clase1("Wlady");                                                                        
    }
    
    public void pruebaAtributos(){
        System.out.println("Atributo publico: " + clase1.atributoPublico);
    }
    public void pruebaMetodos(){
        clase1.metodoPublico();
       
    }
    
    public static void main(String[] args) {
        Clase4 clase4 = new Clase4();
        clase4.pruebaAtributos();
        clase4.pruebaMetodos();
    }
    

}
