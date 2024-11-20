
package com.mycompany.tp5p;
import java.util.ArrayList;


public class Materia {
    
   String nombre;
   int cargarHoraria;

    public Materia(String nombre, int cargarHoraria) {
        this.nombre = nombre;
        this.cargarHoraria = cargarHoraria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCargarHoraria() {
        return cargarHoraria;
    }

    public void setCargarHoraria(int cargarHoraria) {
        this.cargarHoraria = cargarHoraria;
    }

    @Override
    public String toString() {
        return "Materia : " + "nombre = " + nombre + ", cargarHoraria = " + cargarHoraria + '}';
    }

   
   
   
    
    
    
}
