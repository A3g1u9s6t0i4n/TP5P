
package com.mycompany.tp5p;

import java.util.ArrayList;


public class Profesor {
    
    String nombre;
    ArrayList<Materia> materias;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    
    
   public int calcularCarga(ArrayList<Materia> materias){
        int carga = 0;
        for(Materia materia : materias){
           carga += materia.getCargarHoraria();
        }
        
        return carga;
    }
   
   public int repartirAlumnos(int alumnos,int profesores){
       
       return alumnos / profesores;
   }

    @Override
    public String toString() {
        return "Profesor " + " nombre = " + nombre + ", materias = " + materias.toString();
    }
    
    
 
    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
   
   
   
    
}
