package model;

public class Tripulante {
    /** Atributos */

    private String nombre;
    private int id;
    private double nota1;
    private double nota2;
    private double nota3;
    private float numeroIdentificacion;
    private String email;


    /**Getters */
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
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public void setNota3(double nota3) {
        this.nota3 = nota3;
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
        if (nota1 >= nota2 && nota1 >= nota3) {
            return nota1;            
        }else if(nota2 >= nota3){
            return nota2;
        }else{
            return nota3;
        }
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
        if(getAverage() >= 3) {
            return true;
        }
        return false;
    }
    
}

