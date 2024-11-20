
package com.mycompany.tp5p;

import java.util.ArrayList;
import java.util.Scanner;

public class TP5P {

    public static void main(String[] args) {
       
        Profesor p = new Profesor("Martin");
        Scanner s = new Scanner(System.in);
        
       int cantProfes,cantAlumnos;
        
        ArrayList<Materia> materias = new ArrayList<>();
        
        Materia m1 = new Materia("Ingenieria",2);
        Materia m2 = new Materia("Matematica",2);
        Materia m3 = new Materia("Programacion Movil", 2);
     
        materias.add(m1);
        materias.add(m2);
        materias.add(m3);
           
        p.setMaterias(materias);
           
           System.out.println("Profesor " + p);
           System.out.println("Carga horaria " +  p.calcularCarga(materias));
         // System.out.println("Cantidad a corregir " + p.repartirAlumnos(38,4));
        
        
           
           System.out.println("Cuantos Profesores hay disponibles ? ");
           cantProfes = s.nextInt();
           
           System.out.println("Cuantos alumnos siguen activos?");
           cantAlumnos = s.nextInt();
           
           
           System.out.println("A cada profesor le toca corregir  " + p.repartirAlumnos(cantAlumnos,cantProfes) + " Alumnos");
         
    
    
    
    }
    
    
    
    
    
    
    
}
