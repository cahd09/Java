package model;

public class Curso {
    private int codigo;
    private String nombre;
    private char jornada; // el tipo char solo deja ingresar un caracter

    // Constructor del formador
    private Formador formador;

    
    // Constructor del curso - se agrega p a las variables para identificarlas como variables, la p es opcional
    public Curso(int pcodigo, String pnombre, char pjornada, int fCodigo, String fNombre) {
        super();
        this.codigo = pcodigo;
        this.nombre = pnombre;
        this.jornada = pjornada;
        formador = new Formador(fNombre, fCodigo);
    }
    
    /**Getters */
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

}



