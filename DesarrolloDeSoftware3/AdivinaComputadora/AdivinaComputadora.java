import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class AdivinaComputadora implements ActionListener{

  private JFrame ventana;
  private JLabel lbl_inferior, lbl_superior, lbl_computadora, lbl_intentos;
  private JTextField tf_inferior, tf_superior, tf_computadora, tf_intentos;
  private JButton btn_inicio,btn_alto,btn_correcto,btn_bajo;
  private  Random rnd;

  public static void main(String[] args) {
    new AdivinaComputadora();
  }
 
  AdivinaComputadora(){
    
    ventana = new JFrame("Adivina Computadora");
    ventana.setBounds(100,100,500,500);
    ventana.setLayout(null);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    lbl_inferior = new JLabel("Inferior");
    lbl_inferior.setBounds(50,50,80,20);
    ventana.add(lbl_inferior);

    tf_inferior = new JTextField();
    tf_inferior.setBounds(135,50,50,20);
    ventana.add(tf_inferior);

    lbl_superior = new JLabel("Superior");
    lbl_superior.setBounds(50,75,80,20);
    ventana.add(lbl_superior);

    tf_superior = new JTextField();
    tf_superior.setBounds(135,75,50,20);
    ventana.add(tf_superior);

    lbl_computadora = new JLabel("Computadora");
    lbl_computadora.setBounds(50,100,80,20);
    ventana.add(lbl_computadora);

    tf_computadora = new JTextField(); 
    tf_computadora.setBounds(135,100,50,20);
    ventana.add(tf_computadora);

    lbl_intentos = new JLabel("Intentos");
    lbl_intentos.setBounds(50,125,50,20);
    ventana.add(lbl_intentos);

    tf_intentos = new JTextField("0");
    tf_intentos.setBounds(135,125,50,20);
    ventana.add(tf_intentos);

    btn_inicio = new JButton("Inicio");
    btn_inicio.setBounds(200,50,80,20);
    btn_inicio.addActionListener(this);
    ventana.add(btn_inicio);

    btn_alto = new JButton("Alto");
    btn_alto.setBounds(200,75,80,20);
    btn_alto.addActionListener(this);
    ventana.add(btn_alto);

    btn_correcto = new JButton("Correcto");
    btn_correcto.setBounds(200,100,80,20);
    btn_correcto.addActionListener(this);
    ventana.add(btn_correcto);
    
    btn_bajo = new JButton("Bajo");
    btn_bajo.setBounds(200,125,80,20);
    btn_bajo.addActionListener(this);
    ventana.add(btn_bajo);

    rnd = new Random();

    ventana.setVisible(true);

  }

  public void actionPerformed(ActionEvent e){
    System.out.println("en actionPerformed");
  
      if (e.getSource() == btn_inicio) 
      {
        tf_inferior.setText("1");
        tf_superior.setText("100");

        int inferior, superior, numero;
        inferior = Integer.parseInt(tf_inferior.getText());
        superior = Integer.parseInt(tf_superior.getText());
        numero = rnd.nextInt(superior)+ inferior;

        tf_computadora.setText(String.valueOf(numero));
      }
      if (e.getSource() == btn_alto) 
      {
        tf_superior.setText(tf_computadora.getText());

        int inferior, superior, numero;
        inferior = Integer.parseInt(tf_inferior.getText());
        superior = Integer.parseInt(tf_superior.getText());
        numero = rnd.nextInt(superior)+ inferior;
        tf_computadora.setText(String.valueOf(numero));
      }
      if (e.getSource() == btn_bajo) 
      {
        tf_inferior.setText(tf_computadora.getText());

        int inferior, superior, numero;
        inferior = Integer.parseInt(tf_inferior.getText());
        superior = Integer.parseInt(tf_superior.getText());
        numero = rnd.nextInt(superior)+ inferior;
        tf_computadora.setText(String.valueOf(numero));
      }
       if (e.getSource() == btn_correcto) 
      {
        JOptionPane.showMessageDialog(null,"La computadora adivino el numero");
      }
    }
    
}
