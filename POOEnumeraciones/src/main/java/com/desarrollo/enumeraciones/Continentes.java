/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.enumeraciones;

/**
 *
 * @author Wladimir Tierra
 */
public enum Continentes {
    ASIA(44),
    EUROPA(46),
    AFRICA(53),
    AMERICA(34),
    OCEANIA(14);
    private final int numPaises;
    
    //SI SE AÑADE VALORES SE AGREGA UN CNSTRUCTOR PRIVATE
    private Continentes(int numPaises){
        this.numPaises = numPaises;
    }
    
    //método get
    public int getNumPaises() {
        return numPaises;
    }
    
    
}
