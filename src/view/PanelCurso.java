package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
        if (!txtNombre.getText().equals(null) && txtNombre.getText().trim().equals(null)){
            if (!txtCodigo.getText().equals(null) && txtCodigo.getText().trim().equals(null)){
                if (!txtJornada.getText().equals(null) && txtJornada.getText().trim().equals(null)){
                    vistaPrincipal.addCurso(Integer.parseInt(txtCodigo.getText()),
                        txtNombre.getText(), txtJornada.getText().trim().charAt(0));
                    txtNombre.setText("");
                    txtJornada.setText("");
                    txtCodigo.setText("");
                } else {
                    JOptionPane.showMessageDialog(vistaPrincipal, "Llena el campo Jornada");
                } 
            } else {
                JOptionPane.showMessageDialog(vistaPrincipal, "Llena el campo Codigo");
            } 
        } else {
            JOptionPane.showMessageDialog(vistaPrincipal, "Llena el campo Nombre");
        } 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        addCurso();
        if (e.getActionCommand().equals(btnCrear.getActionCommand())) {
        }
        
    }
}
