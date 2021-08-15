
import java.util.Scanner;
import model.Curso;
import model.Tripulante;
import view.Vista;

public class App {
    // Esta era la línea inicial, como se genero la excepcion desde Tripulante, se retira en este archivo
    //public static void main(String[] args) throws Exception {
    public static void main(String[] args) {
        
        /**
        // variables que se asignan a la clase curso
        //Curso programacion1 = new Curso(1234, "Fundamentos de Programación", 'M', 7400, "Dev 1");
        //programacion1.getNombre();

        // Throws Exception del archivo Tripulante
        // Si se genera una excepcion sobre una clase y se debe volver a llamar, siempre se debe manejar con la estructura del Try
        // por eso fue necesario comentar la última línea
        try {
            programacion1.calcularPromedioCurso();
        } catch (Exception e) {
            e.getMessage();
        }

        Tripulante t = new Tripulante(); // Clase Tripulante
        t.setNota1(4); // Agregar notas a tripulante
        t.setNota2(4.2);
        t.setNota3(5.3);
        Tripulante t1 = new Tripulante(); // Clase Tripulante
        t1.setNota1(3);
        t1.setNota2(3.2);
        t1.setNota3(4);
        Tripulante t2 = new Tripulante(); // Clase Tripulante
        t2.setNota1(3.4);
        t2.setNota2(4.6);
        t2.setNota3(3.8);
        Tripulante t3 = new Tripulante(); // Clase Tripulante
        t3.setNota1(3.4);
        t3.setNota2(4.6);
        t3.setNota3(3.8);
        Tripulante t4 = new Tripulante(); // Clase Tripulante
        t4.setNota1(3.4);
        t4.setNota2(4.6);
        t4.setNota3(3.8);
        
         
        // -- Se comenta este bloque por la implementación de JFrame en Vista
        System.out.println(programacion1.agregarTripulante(t));   
        System.out.println(programacion1.agregarTripulante(t1));  
        System.out.println(programacion1.agregarTripulante(t2)); 
        System.out.println(programacion1.agregarTripulante(t3)); 
        System.out.println(programacion1.agregarTripulante(t4)); 
        System.out.println("Fin");
       
        //Mostrar los tripulantes agregados al curso - desarrollador es una variable asignada, se puede modificar
        for (Tripulante desarrollador : programacion1.getTripulantes()) {
            desarrollador.getNombre());
            desarrollador.getHighNote());
            desarrollador.getLowNote());
        } 
        -- hasta esta línea se comento este bloque 

        // Promedio general de notas
        //programacion1.calcularPromedioCurso());

        programacion1.agregarTripulante(t);   
        programacion1.agregarTripulante(t1);  
        programacion1.agregarTripulante(t2); 
        programacion1.agregarTripulante(t3); 
        programacion1.agregarTripulante(t4);
        */

        // Objeto de la clase vista
        Vista v = new Vista();
        v.setVisible(true);
    }
}