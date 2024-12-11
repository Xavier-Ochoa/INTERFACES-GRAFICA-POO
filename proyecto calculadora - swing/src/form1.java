import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JTextField textField1;
    private JTextField textField2;
    private JButton Multiplicar;
    public JPanel mainPanel;
    private JButton Dividir;
    private JButton Restar;
    private JButton Sumar;
    private JLabel jltotal;
    private JLabel total;


    public form1() {
        Sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double num1 = Double.parseDouble(textField1.getText());
                Double num2 = Double.parseDouble(textField2.getText());
                total.setText(String.valueOf(num1 + num2));
            }
        });
        Restar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double num1 = Double.parseDouble(textField1.getText());
                Double num2 = Double.parseDouble(textField2.getText());
                total.setText(String.valueOf(num1 - num2));

            }
        });
        Multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double num1 = Double.parseDouble(textField1.getText());
                Double num2 = Double.parseDouble(textField2.getText());
                total.setText(String.valueOf(num1 * num2));

            }
        });
        Dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double num1 = Double.parseDouble(textField1.getText());
                Double num2 = Double.parseDouble(textField2.getText());
                total.setText(String.valueOf(num1 / num2));

            }
        });
    }
}
