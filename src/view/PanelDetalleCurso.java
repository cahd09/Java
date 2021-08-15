package view;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelDetalleCurso extends JPanel {
    
    private JLabel lblNombre;
    private JLabel lblCodigo;
    private JLabel lblJornada;
    private JLabel lblTripulantes;

    private Vista vistaPrincipal;

    public PanelDetalleCurso(Vista v) {
        super();
        setLayout(new GridLayout(5,1));
        setBorder(new TitledBorder("Detalle Curso"));
        vistaPrincipal = v;

        lblNombre = new JLabel("Nombre: ");
        lblCodigo = new JLabel("Código: ");
        lblJornada = new JLabel("Jornada: ");
        lblTripulantes = new JLabel("Tripulantes: ");

        add(lblNombre);
        add(lblCodigo);
        add(lblJornada);
        add(lblTripulantes);
    }

    public void updateInformationCursos(String nombre, int codigo, char jornada, int tripulantes) {
        lblNombre.setText("Nombre: "+nombre);
        lblCodigo.setText("Código: "+codigo);
        lblJornada.setText("Jornada: "+jornada);
        lblTripulantes.setText("Tripluantes: "+tripulantes);

    }

}
