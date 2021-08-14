package model;

import java.util.ArrayList;

public class Tripulante {

    /** Constantes */
    // Controlar la nota maxima que puede ser asignada
    public final static double NOTA_MAXIMA = 5.0;

    /** Atributos */
    private String nombre;
    private int id;
    private double nota1;
    private double nota2;
    private double nota3;
    private float numeroIdentificacion;
    private String email;

    // Lista de cursos
    private ArrayList<Curso> curso;

    // Constructor vacío para evitar error en el APP, uno de los constructores queda vacío y el otro con los parametros
    public Tripulante() {
        super();        
    }

     // Constructor del tripulante - se agrega p para diferenciarlas de la variables, la p es opcional
     public Tripulante (String pnombre, int pid, double pnota1, double pnota2, double pnota3, float pnumeroIndetificacion, String pemail) {
        super();
        this.nombre = pnombre;
        this.id = pid;
        this.nota1 = pnota1;
        this.nota2 = pnota2;
        this.nota3 = pnota3;
        this.numeroIdentificacion = pnumeroIndetificacion;
        this.email = pemail;
        curso = new ArrayList<>();
    }

    /**Getters */
    public ArrayList<Curso> getCurso() {
        return curso;
    }
    public String getNombre() {
        return nombre;
    }
    public int getId() {
        return id;
    }
    public double getNota1() {
        return nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public float getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
    public String getEmail() {
        return email;
    }

    /**Setters */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNota1(double nota1) {
        // Controlar que la nota no sea mayor que 5
        if(nota1 <= NOTA_MAXIMA) {
            this.nota1 = nota1;   
        } else {
            System.out.println("No se puede ingresar la nota, la nota más alta puede ser " + NOTA_MAXIMA);  
        }
    }

    public void setNota2(double nota2) {
        if(nota2 <= NOTA_MAXIMA) { // // Controlar que la nota no sea mayor que 5
            this.nota2 = nota2;
        } else {
            System.out.println("No se puede ingresar la nota, la nota más alta puede ser " + NOTA_MAXIMA);       
        }
    }
    
    public void setNota3(double nota3) {
        if(nota3 <= NOTA_MAXIMA) { // // Controlar que la nota no sea mayor que 5
            this.nota3 = nota3;
        } else {
            System.out.println("No se puede ingresar la nota, la nota más alta puede ser " + NOTA_MAXIMA);           
        }
    }

    public void setNumeroIdentificacion (float numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;        
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public double getAverage() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public double getHighNote() {
        double respuesta;

        if(nota1 >= nota2){
            if (nota1 >= nota3) {
                respuesta = nota1;
            }else{
                respuesta = nota3;
            }
        }else{
            if (nota2 >= nota3) {
                respuesta = nota2;
            }else{
                respuesta = nota3;
            }
        }
        return respuesta;
    }    

    public double getLowNote() {
        if (nota1 <= nota2 && nota1 <= nota3) {
            return nota1;            
        }else if(nota2 <= nota3){
            return nota2;
        }else{
            return nota3;
        }
    }

    public boolean chekIfPass() {
        if(getAverage() <= 3) {
            return true;
        }
        return false;
    }
    
}

