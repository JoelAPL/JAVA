import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class Adivina implements ActionListener{

  private JFrame ventana;
  private JLabel lbl_computadora, lbl_usuario, lbl_mensaje, lbl_intentos;
  private JTextField tf_computadora, tf_usuario, tf_mensaje, tf_intentos;
  private JButton btn_iniciar, btn_validar;
  private  Random rnd;

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

    lbl_usuario = new JLabel("Usuario");
    lbl_usuario.setBounds(50,75,100,20);
    ventana.add(lbl_usuario);

    tf_usuario = new JTextField();
    tf_usuario.setBounds(155,75,50,20);
    ventana.add(tf_usuario);

    lbl_mensaje = new JLabel("Mensaje");
    lbl_mensaje.setBounds(50,100,50,20);
    ventana.add(lbl_mensaje);

    tf_mensaje = new JTextField();
    tf_mensaje.setBounds(155,100,70,20);
    ventana.add(tf_mensaje);

    lbl_intentos = new JLabel("Intentos");
    lbl_intentos.setBounds(50,125,50,20);
    ventana.add(lbl_intentos);

    tf_intentos = new JTextField("0");
    tf_intentos.setBounds(155,125,50,20);
    ventana.add(tf_intentos);

    btn_iniciar = new JButton("Iniciar");
    btn_iniciar.setBounds(210,50,100,20);
    btn_iniciar.addActionListener(this);
    ventana.add(btn_iniciar);

    btn_validar = new JButton("Validar");
    btn_validar.setBounds(210,75,100,20);
    btn_validar.setEnabled(false);
    btn_validar.addActionListener(this);
    ventana.add(btn_validar);

    ventana.setVisible(true);

  }

  public void actionPerformed(ActionEvent e){
    System.out.println("en actionPerformed");

    if (e.getSource() == btn_iniciar) {
      rnd = new Random();

      tf_computadora.setText(String.valueOf(rnd.nextInt(100)+1));
      btn_iniciar.setEnabled(false);
      btn_validar.setEnabled(true);
      tf_usuario.setText("");
      tf_mensaje.setText("");
      tf_intentos.setText("0");

    }

    if (e.getSource() == btn_validar)
  
    {
      
      if (tf_usuario.getText().compareTo(tf_computadora.getText()) > 0)
        tf_mensaje.setText("muy alto");
       else 
          if (tf_usuario.getText().compareTo(tf_computadora.getText()) < 0)
          tf_mensaje.setText("muy bajo");
            else
            {
              tf_mensaje.setText("correcto");
              btn_iniciar.setEnabled(true);
              btn_validar.setEnabled(false);
            }
      int valor;
      valor = Integer.parseInt(tf_intentos.getText());
      tf_intentos.setText(String.valueOf(valor+1));


    }
    
  }
}