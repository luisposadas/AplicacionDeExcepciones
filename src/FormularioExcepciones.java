import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioExcepciones {
    private JButton button1;
    private JPanel panel1;
    private JTextField numero1;
    private JTextField numero2;


    public FormularioExcepciones() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("HOla");

                JOptionPane.showMessageDialog(null,"quiero dividir"+ numero1.getText() + "y"
                        + numero2.getText() 
                );

            }
        });
    }
    public static void main (String[]args)//psvm
    {
        FormularioExcepciones formulario = new FormularioExcepciones();
        JFrame ventana  = new JFrame();
        //panel que va a contener, lo que esta dentro de la ventana
        ventana.setContentPane(formulario.panel1);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();//hace la ventana con el tamaño sel boton

        ventana.setVisible(true);

    }
}
