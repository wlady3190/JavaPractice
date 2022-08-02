/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.set_II;

import java.util.Objects;

/**
 *
 * @author Wladimir Tierra
 */
public class Empleado {
    String nombre, apellido;
    String ci;

    public Empleado(String nombre, String apellido, String ci) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
    }
    public Empleado(){
        
    }
    
    //SObrecarga de método equals
    
//    @Override
//    public boolean equals(Object obj){
//        if(obj instanceof Empleado){
//            Empleado otro = (Empleado)obj; 
//            
//            if(this.ci==otro.ci){
//                return true;
//            }else{
//                return false;
//            }
//        } else{
//            return false;
//        }
//      
//    }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.ci);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.ci, other.ci)) {
            return false;
        }
        return true;
    }


    
    

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", ci=" + ci + '}';
    }
    
            
    
}
