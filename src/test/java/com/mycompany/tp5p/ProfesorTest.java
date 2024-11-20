
package com.mycompany.tp5p;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class ProfesorTest {
    
    public ProfesorTest() {
    }
    
    @Test
    public void CalcularCarga() {
        
        ArrayList<Materia> materia = new ArrayList<>();
        materia.add(new Materia("Ingenieria", 2));
        materia.add(new Materia("Matematica", 2));
        materia.add(new Materia("Programacion Movil", 2));
        
        
        Profesor p = new Profesor("");
        
        int carga = 2 + 2 + 2; 
        
        assertEquals(carga,p.calcularCarga(materia));
    }

    @Test
    public void RepartirAlumnos() {
        // Datos de prueba
        int alumnos = 38;
        int profesores = 4;

       
        Profesor p = new Profesor("");

        int resultado = 38 / 4; 

       
        assertEquals(resultado, p.repartirAlumnos(alumnos, profesores));
    }

    @Test
    public void DivisionPorCero() {
        
        int alumnos = 38;
        int profesores = 0;

        Profesor p = new Profesor("");

        assertThrows(ArithmeticException.class, () -> {
            p.repartirAlumnos(alumnos, profesores);
        });
    }
}
    

