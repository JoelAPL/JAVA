import javax.swing.*;

public class Adivina {

  private JFrame ventana;
  private JLabel lbl_computadora;
  private JTextField tf_computadora;

  public static void main(String[] args) {
    new Adivina();
  }

  Adivina(){
    ventana = new JFrame("Adivina");
    ventana.setBounds(100,100,500,500);
    ventana.setLayout(null);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    lbl_computadora = new JLabel("Computadora");
    lbl_computadora.setBounds(50,50,100,20);
    ventana.add(lbl_computadora);

    tf_computadora = new JTextField();
    tf_computadora.setBounds(155,50,50,20);
    ventana.add(tf_computadora);

    ventana.setVisible(true);



  }

}