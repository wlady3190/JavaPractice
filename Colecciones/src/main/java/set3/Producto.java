/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set3;

/**
 *
 * @author Wladimir Tierra
 */
public class Producto {
    String nombre, categoria;
    int codigo;

    public Producto(String nombre, String categoria, int codigo) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.codigo = codigo;
    }
    public Producto() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Producto other = (Producto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "El Producto es "  + nombre + ", pertenece a la categoria " + categoria + ", codigo=" + codigo;
    }
    
    
    
}
