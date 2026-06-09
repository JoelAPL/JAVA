import javax.swing.*;
import java.awt.event.*;

public class Mover implements ActionListener
{
   private JFrame ventana;
   private JButton btn_boton, btn_tmp;

   public static void main(String[] args)
   {
      new Mover();
   }
   Mover()
   {
      ventana = new JFrame("Mover Vector");
      ventana.setBounds(100,100,500,500);
      ventana.setLayout(null);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);

      int i;
      for (i=0;i<5;i++)
      {
         btn_boton = new JButton(String.valueOf(i));
         btn_boton.setBounds(100+55*i,100,50,20);
         btn_boton.addActionListener(this);

         ventana.add(btn_boton);
      }


      ventana.setVisible(true);
   }

   public void actionPerformed(ActionEvent e)
   {
      System.out.println("en actionPerformed");

      int x, y;
      btn_tmp = (JButton)e.getSource();
      x = btn_tmp.getLocation().x;
      y = btn_tmp.getLocation().y;

      btn_tmp.setLocation(x,y+5);
      
   }
}














