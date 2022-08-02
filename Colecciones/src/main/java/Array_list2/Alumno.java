/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_list2;

/**
 *
 * @author Wladimir Tierra
 */
public class Alumno implements Comparable<Alumno>{
    String nombre;
    int edad;
    double promedio;

    public Alumno(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }
     @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", promedio=" + promedio + '}';
    }

    @Override
    public int compareTo(Alumno o) {
        return nombre.compareTo(o.nombre); 
    }
    
    
    
    
    
    
}
