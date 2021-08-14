package model;

import java.util.ArrayList;

public class Curso {

     /** Constantes */
     //Controlar la cantidad de tripulantes que se pueden crear
    public static final int MAXIMO_TRIPULANTES = 3;

    /** Atributos */
    private int codigo;
    private String nombre;
    private char jornada; // el tipo char solo deja ingresar un caracter

    // Constructor del formador
    private Formador formador;

    // Lista de tripulantes
    private ArrayList<Tripulante> tripulantes; // Se crea un array para guardar todos los tripulantes

    // Constructor del curso - se agrega p para diferenciarlas de la variables, la p es opcional
    public Curso(int pCodigo, String pNombre, char pJornada, int fCodigo, String fNombre) {
        super();
        this.codigo = pCodigo;
        this.nombre = pNombre;
        this.jornada = pJornada;
        formador = new Formador(fNombre, fCodigo);  
        tripulantes = new ArrayList<>();
    }

    public Curso(int pCodigo, String pNombre, char pJornada) {
        super();
        this.codigo = pCodigo;
        this.nombre = pNombre;
        this.jornada = pJornada;
        formador = null;
        tripulantes = new ArrayList<>();
    }
 
    /**Getters */

    public ArrayList<Tripulante> getTripulantes() {
        return tripulantes;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
        
    }

    public char getJornada() {
        return jornada;
    }

    public Formador getFormador() {
        return formador;
    }

    /**Setters */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     // Clase para crear tripulantes
     public String agregarTripulante(Tripulante t) {
         // if para controlar que no se puedan crear más tripulanes de los permitidos
         if(tripulantes.size() == MAXIMO_TRIPULANTES){ // con Size se cuenta la cantidad de tripulantes creados
             return "No se puede agregar más de " + MAXIMO_TRIPULANTES + " Tripulantes";           
         }
         tripulantes.add(t);
            return "Tripulante agregado al cursos " + nombre;
    }

    // Crear excepciones cuando se genera algún error
    // throws Exception
    public double calcularPromedioCurso()  throws Exception{
        if(tripulantes.size()==0){
            throw new Exception("No hay tripulantes registrados en el curso");
        }
        double total = 0.0;
        for (Tripulante tripulante : tripulantes) {
            total += tripulante.getAverage();
        }

        //Otra forma de hacerlo
        //for (int i = 0; i < tripulantes.size; i++) {
        //    total += tripulantes.get(i).getAverage();
        //}
        
        return total/tripulantes.size();
    }

    // mensaje que se imprime en pantalla
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nombre: " + nombre + ", codigo: " + codigo + ", jornada: " + jornada;
    }   
}



