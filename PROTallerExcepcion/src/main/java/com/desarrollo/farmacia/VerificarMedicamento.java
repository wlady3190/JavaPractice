/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.farmacia;

/**
 *
 * @author Wladimir Tierra
 */
public class VerificarMedicamento extends Exception{

    public VerificarMedicamento() {
    }
    
    public VerificarMedicamento(String mensajeError) {
        super(mensajeError);
    }
     
    
}
