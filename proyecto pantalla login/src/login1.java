import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login1 {
    private JTextField usuario1;
    private JPasswordField passwordField1;
    private JButton validarDatosButton;
    public JPanel mainPanel;
    private JLabel mensaje_validacion;

    public login1() {
        validarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = usuario1.getText();
                String contraseña = new String(passwordField1.getPassword());

                if (usuario.equals("APELLIDO") && contraseña.equals("APELLIDO123")) {
                    mensaje_validacion.setText("Acceso correcto");
                } else {
                    mensaje_validacion.setText("Usuario o contraseña incorrectos");
                }
            }
        });
    }
}
