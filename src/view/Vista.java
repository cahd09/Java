package view;

import model.Curso;

public class Vista {

    public static void main(String[] args) {
        // Crear objeto
        // Se importa el modelo curso
        // la ultima variables es Char y se debe utilizar 'Variable'
        Curso cursoFrances = new Curso(52441, "Frances 101", 'N', 7400, "Guillaume");
        Curso cursoItaliano = new Curso(52442, "Italiano 101", 'T', 7401, "Vladimir");

        System.out.println(cursoFrances.getFormador().getNombre());
        System.out.println(cursoFrances.getFormador().getCodigo());
        System.out.println(cursoItaliano.getFormador().getNombre());
        System.out.println(cursoFrances.getFormador().getCodigo());

        /**System.out.println(cursoFrances.getCodigo());
        System.out.println(cursoFrances.getJornada());
        System.out.println(cursoFrances.getNombre());
        System.out.println(cursoItaliano.getNombre());

        System.out.println(cursoFrances.getFormador()); */
    }
}
