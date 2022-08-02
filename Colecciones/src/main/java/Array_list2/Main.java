/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_list2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Main {

    public static void main(String[] args) {
        String nombre, respuesta, eliminar, nomAlumno;
        int edad, elemento;
        double promedio;
        Alumno alumno = null;
        Scanner sc = new Scanner(System.in);
        ArrayList<Alumno> listaAlumno = new ArrayList<>();
        listaAlumno.ensureCapacity(20);
        do {
            System.out.println("");
            System.out.println("Ingreso de datos");
            System.out.println("Ingrese el nombre del alumno:");
            nombre = sc.next();
            System.out.println("Ingrese la edad: ");
            edad = sc.nextInt();
            System.out.println("Ingrese el promedio: ");
            promedio = sc.nextDouble();
            alumno = new Alumno(nombre, edad, promedio);
            listaAlumno.add(alumno);
            System.out.println("Desea ingresar otro objeto: ");
            respuesta = sc.next();
        } while (respuesta.equalsIgnoreCase("s"));
        for (Alumno alumnos : listaAlumno) {
            System.out.println(alumnos);
        }
        System.out.println("Mi lista de alumnos tiene: " + listaAlumno.size());

//        System.out.println("¿Desea eliminar un registro?");
//        eliminar = sc.next();
//        
//        if(eliminar.equalsIgnoreCase("si")){
//            System.out.println("¿Que alumno desea aliminar?");
//            elemento = sc.nextInt();
//            listaAlumno.remove(elemento-1);
//                    System.out.println("Lista actualizada");
//        for (Alumno alumnos:listaAlumno){
//            System.out.println(alumnos);
//        }
//            
//        } else{
//            System.out.println("Gracias por usar el sistema");
//        }
// ORDENAR UN ARRAYLIST
        Collections.sort(listaAlumno, Collections.reverseOrder());

        for (Alumno alumnos : listaAlumno) {
            System.out.println(alumnos);
        }
            Iterator<Alumno> it = listaAlumno.iterator();
            System.out.println("¿Que alumno desea quitar de lista ?");
            nomAlumno = sc.next();

            while (it.hasNext()) {
                String nom = it.next().nombre;
                if (nom.equals(nomAlumno)) {
                    it.remove();

                }
            }

            System.out.println("**LISTA ACTUALIZADA**");
            for (Alumno alumnos : listaAlumno) {
                System.out.println(alumnos);
            }

        }

    }

