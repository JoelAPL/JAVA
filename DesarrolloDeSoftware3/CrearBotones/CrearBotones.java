import java.awt.event.*;
import javax.swing.*;

public class CrearBotones implements ActionListener {
  
    private JFrame ventana;
    private JButton btn_boton, btn_tmp;
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

      int i;
      for (i = 0; i < 4; i++) {
        btn_boton = new JButton(String.valueOf(i+1));
        btn_boton.setBounds(50+55*i, 100, 50, 20);
        btn_boton.addActionListener(this);
        ventana.add(btn_boton);
      }



      tf_valor = new JTextField();
      tf_valor.setBounds(315, 100, 50, 20);
      ventana.add(tf_valor);

    }

    public void actionPerformed(ActionEvent e) {

      System.out.println("en accionPerformed");
      btn_tmp = (JButton) e.getSource();
      tf_valor.setText(btn_tmp.getText());
    }
}
