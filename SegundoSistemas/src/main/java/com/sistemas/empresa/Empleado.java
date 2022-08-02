/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemas.empresa;

/**
 *
 * @author Wladimir Tierra
 */
public class Empleado extends Persona {

    private int idEmpleado, horasT;
    private static int contador;
    private final double VALOR_HORA=8;
    
    private Empleado(){
        
    }

    public Empleado(int horasT, String nombre, String apellido, String direccion, long celular) {
        super(nombre, apellido, direccion, celular);
        this.idEmpleado = contador++;
        this.horasT = horasT;
    }
    

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getHorasT() {
        return horasT;
    }

    public void setHorasT(int horasT) {
        this.horasT = horasT;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Empleado.contador = contador;
    }

    public double calcularSalario() {
        double salario;
        salario = getHorasT() * this.VALOR_HORA;
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString() + "idEmpleado=" + idEmpleado + ", horasT=" + horasT + "salario = " + calcularSalario() + '}';
    }

}
