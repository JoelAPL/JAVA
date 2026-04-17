
import java.awt.event.*;
import javax.swing.*;

public class Contador implements ActionListener{
    private JFrame ventana;
    private JLabel lbl_titulo, lbl_contador;
    private JTextField tf_contador;
    private JButton btn_contador;
    private int contador;

    public static void main(String[] args) {
        new Contador();
    }

    Contador() {
        contador = 0;
        ventana = new JFrame("Contador");
        ventana.setBounds(100, 100, 500, 500);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lbl_titulo = new JLabel("Contador");
        lbl_titulo.setBounds(100, 20, 80, 20);
        ventana.add(lbl_titulo);


        lbl_contador = new JLabel("Contador");
        lbl_contador.setBounds(50, 50, 80, 20);
        ventana.add(lbl_contador);

        tf_contador = new JTextField("0");
        tf_contador.setBounds(135, 50, 50, 20);
        ventana.add(tf_contador);  

        btn_contador = new JButton("Contar");
        btn_contador.setBounds(190, 50, 80, 20);
        btn_contador.addActionListener(this);
        ventana.add(btn_contador);


        ventana.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        
        System.out.println("en accionPerformed");

        int valor;

    }

}