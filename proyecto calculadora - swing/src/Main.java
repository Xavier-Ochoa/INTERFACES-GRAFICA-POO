import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Crear un JFrame con un título
        JFrame frame = new JFrame("Aplicación para sumar dos números");
        // Establecer el contenido de la ventana con el panel principal de la clase Form1
        frame.setContentPane(new form1().mainPanel);
        // Configurar el comportamiento de cierre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Establecer el tamaño de la ventana (por ejemplo 400x300 píxeles)
        frame.setSize(1024, 768);
        // Establecer el tamaño preferido para el JFrame (opcional, puedes usarlo junto con pack)
        frame.setPreferredSize(new java.awt.Dimension(500, 400));
        // Empaquetar la ventana, ajustando el tamaño a los componentes dentro de la ventana
        frame.pack();
        // Hacer visible la ventana
        frame.setVisible(true);
    }
}
