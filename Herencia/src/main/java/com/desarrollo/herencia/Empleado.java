/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.herencia;

/**
 *
 * @author Wladimir Tierra
 */
//Clase hija, hereda de la superclase
public class Empleado extends Persona{
    //atributos propios de la clase hija
    private int idEmployee;
    private int hoursT;
    private double valueH;
    
    public static int countEmployee;
    
    //Constructor de clase hija llama a constructor de clase padre
    public Empleado(String name, char genre, int age, String address, int hoursT, double valueH){
        //llamar constructor clase padre siempre en la primer linea de la clase hija
        super(name, genre, age, address);
        this.idEmployee = ++countEmployee;
        this.hoursT = hoursT;
        this.valueH = valueH; 
        //metodos get y set    
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public int getHoursT() {
        return hoursT;
    }

    public void setHoursT(int hoursT) {
        this.hoursT = hoursT;
    }

    public double getValueH() {
        return valueH;
    }

    public void setValueH(double valueH) {
        this.valueH = valueH;
    }

    public static int getCountEmployee() {
        return countEmployee;
    }
// Para no cambiar método del contador se lo elimina del metodo set
//    public static void setCountEmployee(int countEmployee) {
//        Empleado.countEmployee = countEmployee;
//    }
    //Cálculo del salario
    public double salario(){
        double salario;
        salario = this.hoursT*this.valueH;
        return salario;    
    }
    //mérodo descuento salario
    //aplicar un descuento del 12% al salario final si las H trabajadas son menores a 100
    public void descuentoSalario(){
        double descuentoSalario;
        double salario = salario();
        if (this.hoursT<100){
            //descuentoSalario = salario()-salario()*0.12;
            
            descuentoSalario = salario/1.12;
            System.out.println("El salario con descuento es: " + descuentoSalario );
        } else{
            System.out.println("No existe ningún descuento");
        }     
           
    }
    

    @Override
    public String toString() {
        return " Empleado{" + "idEmpleado=" + idEmployee + super.toString()+ ", hours Trabajadas=" + hoursT + ", valor hora=" + valueH + '}';
    }
    
    
    
}
