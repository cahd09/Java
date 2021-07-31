package view;

import javax.swing.JFrame;

import controller.CursoController;

import java.awt.BorderLayout;

import model.Curso;

/*
Se comenta esta línea por la implementación de JFrame en Vista     
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

        //System.out.println(cursoFrances.getCodigo());
        //System.out.println(cursoFrances.getJornada());
        //System.out.println(cursoFrances.getNombre());
        //System.out.println(cursoItaliano.getNombre());
        //System.out.println(cursoFrances.getFormador());
    } 
*/

    public class Vista extends JFrame {

        private PanelOpciones panelOpc;

        private CursoController cursoController;

        public Vista() {
            super();
            setSize(600, 400);
            setTitle("Tripulantes");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Sirve para cerrar el proceso
            setLayout(new BorderLayout());

            cursoController = new CursoController();

            panelOpc = new PanelOpciones(this);

            add(panelOpc, BorderLayout.SOUTH);
        }

        public void addCurso(int pCodigo, String pNombre, char pJornada) {
            cursoController.addCurso(pCodigo, pNombre, pJornada);
        }

        public String listCursos() { 
            return cursoController.listCursos();
        }
    }
