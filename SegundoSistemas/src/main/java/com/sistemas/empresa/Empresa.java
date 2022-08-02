/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemas.empresa;

import java.util.ArrayList;

/**
 *
 * @author Wladimir Tierra
 */
public class Empresa {

    private final String NOMBRE_EMPRESA = "SEGUNDO SISTEMAS";
    private ArrayList<Empleado> arrayEmpleado;
    private ArrayList<Cliente> arrayCliente;

    public Empresa() {
        this.arrayEmpleado = new ArrayList<>();
        this.arrayCliente = new ArrayList<>();

    }

    public void agregarEmpleado(Empleado empleado) {
        this.arrayEmpleado.add(empleado);
    }

    public void agregarCliente(Cliente cliente) {
        this.arrayCliente.add(cliente);
    }

    public double calcularTotalSueldosEmpleados() {
        double totalSueldo = 0;
        for (int i = 0; i < arrayEmpleado.size(); i++) {
            totalSueldo = totalSueldo + arrayEmpleado.get(i).calcularSalario();
        }
        return totalSueldo;
    }

    public void imprimirSueldoTotal() {
        System.out.println("El sueldo total es: " + calcularTotalSueldosEmpleados());
    }

    public void mostrarListaClientes() {
        if (arrayCliente.isEmpty()) {
            System.out.println("NO SE HA AÑADIDO CLIENTES");
        } else {

            for (Cliente cliente : arrayCliente) {
                System.out.println(cliente);
            }
        }
    }

}
