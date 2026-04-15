import java.awt.event.*;
import javax.swing.*;

public class CrearBotones implements ActionListener {
  
    private JFrame ventana;
    private JButton btn_boton1, btn_boton2, btn_boton3, btn_boton4;
    private JTextField tf_valor;
    public static void main(String[] args) {
      new CrearBotones();
    }
    CrearBotones() {
    ventana = new JFrame("Crear Botones");
    ventana.setBounds(100, 100, 500, 500);
    ventana.setLayout(null);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setVisible(true);

    btn_boton1 = new JButton("1");
    btn_boton1.setBounds(50, 100, 50, 20);
    btn_boton1.addActionListener(this);
    ventana.add(btn_boton1);

    btn_boton2 = new JButton("2");
    btn_boton2.setBounds(105, 100, 50, 20);
    btn_boton2.addActionListener(this);

    ventana.add(btn_boton2);
    btn_boton3 = new JButton("3");
    btn_boton3.setBounds(160, 100, 50 , 20);
    btn_boton3.addActionListener(this);
    ventana.add(btn_boton3);

    btn_boton4 = new JButton("4");
    btn_boton4.setBounds(215, 100, 50, 20); 
    btn_boton4.addActionListener(this);
    ventana.add(btn_boton4);
    
      tf_valor = new JTextField();
      tf_valor.setBounds(315, 100, 50, 20);
      ventana.add(tf_valor);

    }

    public void actionPerformed(ActionEvent e) {

      System.out.println("en accionPerformed");

      if (e.getSource() == btn_boton1)
        tf_valor.setText(btn_boton1.getText());
        else if (e.getSource() == btn_boton2)
          tf_valor.setText(btn_boton2.getText());
          else if (e.getSource() == btn_boton3)
            tf_valor.setText(btn_boton3.getText());
            else if (e.getSource() == btn_boton4)
              tf_valor.setText(btn_boton4.getText());
    }
}
