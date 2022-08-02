/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.poovectores;

/**
 *
 * @author Wladimir Tierra
 */
public class Persona {
    private String persona;
    private int edad, idPersona;
    private static int contador;
    
    

    public Persona() {
        this.idPersona = ++contador;
        
    }
    
    

    public Persona(String persona, int edad) {
        this();
        this.persona = persona;
        this.edad = edad;

    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Persona.contador = contador;
    }

    @Override
    public String toString() {
        return "Persona{" + "persona=" + persona + ", edad=" + edad + ", idPersona=" + idPersona + '}';
    }
    
    
    
    
    
    
    
    
}
