/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.hashsetestudiante;

import java.util.Objects;

/**
 *
 * @author Wladimir Tierra
 */
public class Estudiante {
    String nombre, carrera, cicloAcademico;

    public Estudiante(String nombre, String carrera, String cicloAcademico) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.cicloAcademico = cicloAcademico;
    }

    public Estudiante() {
    }
    

    @Override
    public String toString() {
        return "Estudiante{" + "nombre= " + nombre + ", carrera= " + carrera + ", ciclo Academico= " + cicloAcademico + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Estudiante other = (Estudiante) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }


    
    
    
}
