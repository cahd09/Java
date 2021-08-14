package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelCurso extends JPanel implements ActionListener {
    private JTextField txtNombre;
    private JTextField txtCodigo;
    private JTextField txtJornada;
    
    private JButton btnCrear;
    private Vista vistaPrincipal;

    public PanelCurso(Vista v){
        super();
        //Crear 7 filas - 1 columna
        setLayout(new GridLayout(7,1));
        setBorder(new TitledBorder("Crear Curso"));

        vistaPrincipal = v;

        txtCodigo = new JTextField();
        txtNombre = new JTextField();
        txtJornada = new JTextField();

        btnCrear = new JButton("Crear");
        btnCrear.addActionListener(this);

        add (new JLabel("Nombre curso"));
        add(txtNombre);
        add (new JLabel("Codigo curso"));
        add(txtCodigo);
        add (new JLabel("Jornada curso"));
        add(txtJornada);
        add(btnCrear);
    }

    public void addCurso(){
        //validar que ingrese texto y no contar espacios en blanco
        if (txtNombre.getText()!=null && txtNombre.getText().trim() !=""){
            if (txtCodigo.getText()!=null && txtCodigo.getText().trim() !=""){
                if (txtJornada.getText()!=null && txtJornada.getText().trim() !=""){
                    vistaPrincipal.addCurso(Integer.parseInt(txtCodigo.getText()),
                        txtNombre.getText(), txtJornada.getText().trim().charAt(0));
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        addCurso();
        if (e.getActionCommand().equals(btnCrear.getActionCommand())) {
        }
        
    }
}
