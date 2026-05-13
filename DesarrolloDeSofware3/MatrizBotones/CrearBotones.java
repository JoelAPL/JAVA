import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CrearBotones implements ActionListener
{

   private JFrame ventana;
   private JButton btn_boton, btn_tmp, btn_crear;
   private JLabel lbl_numero, lbl_x, lbl_y;
   private JTextField tf_numero, tf_x, tf_y;

   public static void main(String[] args)
   {
      new CrearBotones();
   }

   CrearBotones()
   {

      ventana = new JFrame("Matriz Botones");
      ventana.setBounds(100,100,500,500);
      ventana.setLayout(null);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      btn_crear = new JButton("Crear");
      btn_crear.setBounds(180,60,80,20);
      btn_crear.addActionListener(this);
      ventana.add(btn_crear);

      lbl_numero = new JLabel("Numero");
      lbl_numero.setBounds(180,85,60,20);
      ventana.add(lbl_numero);

      tf_numero = new JTextField();
      tf_numero.setBounds(245,85,40,20);
      ventana.add(tf_numero);

      lbl_x = new JLabel("X");
      lbl_x.setBounds(180,110,60,20);
      ventana.add(lbl_x);

      tf_x = new JTextField();
      tf_x.setBounds(245,110,40,20);
      ventana.add(tf_x);

      lbl_y = new JLabel("Y");
      lbl_y.setBounds(180,135,60,20);
      ventana.add(lbl_y);

      tf_y = new JTextField();
      tf_y.setBounds(245,135,40,20);
      ventana.add(tf_y);

      ventana.setVisible(true);
   }

   public void actionPerformed(ActionEvent e)
   {
      System.out.println("en actionPerformed");
  
      if (e.getSource() == btn_crear)
      {
         crear();
      }
      else
      {
         btn_tmp = (JButton)e.getSource();
         tf_numero.setText(btn_tmp.getText());

         tf_x.setText(String.valueOf(btn_tmp.getLocation().x));
         tf_y.setText(String.valueOf(btn_tmp.getLocation().y));
      }
   }
   public void crear(){
      int i ;
      for (i=0;i<9;i++)
      {
          btn_boton = new JButton(String.valueOf(i));
          btn_boton.setBounds(50+35*(i%3),85+35*(i/3),30,30);
          btn_boton.setMargin(new Insets(0,0,0,0));
          btn_boton.addActionListener(this);
          ventana.add(btn_boton);
      }
       ventana.repaint();
   }
}



