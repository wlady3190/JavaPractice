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
public class Clase3 extends Clase1 {

    public Clase3() {
        //super('F');
        super(30);
        //super(1.5);
        //super("Wlady");

    }

    public void pruebaAtributos() {
        Clase1 clase1 = new Clase1('F');
        System.out.println("Atributo público: " + clase1.atributoPublico);
        System.out.println("Atributo protegido: " + atributoProtegido);

    }

    public void pruebaMetodos() {
        Clase1 clase1 = new Clase1('F');
        clase1.metodoPublico();
        super.metodoProtegido();
    }
    public static void main(String[] args) {
        Clase3 clase3 = new Clase3();
        clase3.pruebaAtributos();
        clase3.pruebaMetodos();
    }

}
