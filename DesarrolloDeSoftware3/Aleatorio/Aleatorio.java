import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Aleatorio implements ActionListener {

  private JFrame ventana;
  private JLabel lbl_titulo, lbl_numero;
  private JTextField tf_numero;
  private JButton btn_generar;
  private Random rnd;

  public static void main(String[] args) {
    new Aleatorio();
  }

  public Aleatorio() {
    ventana = new JFrame("Aleatorio");
    ventana.setBounds(100,100,500,500);
    ventana.setLayout(null);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    lbl_titulo = new JLabel("Aleatorio");
    lbl_titulo.setBounds(100,20,100,20);
    ventana.add(lbl_titulo);

    lbl_numero = new JLabel("Numero");
    lbl_numero.setBounds(50,50,60,20);
    ventana.add(lbl_numero);

    tf_numero = new JTextField();
    tf_numero.setBounds(150,50,60,20);
    ventana.add(tf_numero);

    btn_generar = new JButton("Generar");
    btn_generar.setBounds(180,50,80,20);
    ventana.add(btn_generar);
    btn_generar.addActionListener(this);

    rnd = new Random();
    ventana.setVisible(true);
  }


  public void actionPerformed(ActionEvent e) {

    System.out.println("en ActionPerformed");
    tf_numero.setText(String.valueOf(rnd.nextInt(100)));

  }




}
