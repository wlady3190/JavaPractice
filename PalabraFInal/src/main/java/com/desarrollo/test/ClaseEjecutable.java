/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.test;

import com.desarrollo.palabrafinal.ClaseFinal;

/**
 *
 * @author Wladimir Tierra
 */
public class ClaseEjecutable {
    public static void main(String[] args) {
        ClaseFinal palabraFinal = new ClaseFinal();

        System.out.println("Valor constante: "+ palabraFinal.getVarNumero() );

        System.out.println("Valor constante static public: " + palabraFinal.VAR_PRIMITIVA);
        
    }
    
}
