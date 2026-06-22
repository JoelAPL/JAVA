import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class Revolver implements ActionListener
{
   Random rnd = new Random(); 
   private JFrame ventana;
   private JButton[] btn_boton;
   private JButton btn_rev;
 
   public static void main(String[] args)
   {
      new Revolver();
   }

   Revolver()
   {
      ventana = new JFrame("Revolver");
      ventana.setBounds(100,100,500,500);
      ventana.setLayout(null);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      btn_boton = new JButton[5];
      int i;
      for (i=0;i<5;i++)
      {
         btn_boton[i] = new JButton(String.valueOf(i));
         btn_boton[i].setBounds(50+55*i,100,50,50);
         ventana.add(btn_boton[i]);
      }

      btn_rev = new JButton("Rev");
      btn_rev.setBounds(50,50,80,20);
      btn_rev.addActionListener(this);
      ventana.add(btn_rev);

      ventana.setVisible(true);
   }

   public void actionPerformed(ActionEvent e)
   {
      System.out.println("en actionPerformed");

      if (e.getSource() == btn_rev)
      {
         int i,j, xi, yi, xj, yj;
         for (i=0;i<5;i++)
         {
            j = rnd.nextInt(5);

            xi = btn_boton[i].getLocation().x;
            yi = btn_boton[i].getLocation().y;

            xj = btn_boton[j].getLocation().x;
            yj = btn_boton[j].getLocation().y;
          
            btn_boton[i].setLocation(xj,yj);
            btn_boton[j].setLocation(xi,yi);
         }
      }
   }

}

















