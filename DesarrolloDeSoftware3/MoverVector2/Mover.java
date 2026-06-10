import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class Mover implements ActionListener
{
   private JFrame ventana;
   private JButton[] btn_boton;
   private JButton btn_tmp, btn_inicio;
   private Random rnd=new Random();

   Timer timer = new Timer(200,new ActionListener()
   {
      public void actionPerformed(ActionEvent e)
      {
         int i,x,y;
         i = rnd.nextInt(5);
         x = btn_boton[i].getLocation().x;
         y = btn_boton[i].getLocation().y;
         btn_boton[i].setLocation(x,y+rnd.nextInt(5));
      }
   });

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

      btn_inicio = new JButton("Inicio");
      btn_inicio.setBounds(100,75,80,20);
      btn_inicio.addActionListener(this);
      ventana.add(btn_inicio);

      btn_boton = new JButton[5];
      
      int i;
      for (i=0;i<5;i++)
      {
         btn_boton[i] = new JButton(String.valueOf(i));
         btn_boton[i].setBounds(100+55*i,100,50,20);
         btn_boton[i].addActionListener(this);

         ventana.add(btn_boton[i]);
      }

     // rnd = new Random();

      ventana.setVisible(true);
   }

   public void actionPerformed(ActionEvent e)
   {
      System.out.println("en actionPerformed");

      if (e.getSource() == btn_inicio)
         timer.start();
      else
      {
         int x, y;
         btn_tmp = (JButton)e.getSource();
         x = btn_tmp.getLocation().x;
         y = btn_tmp.getLocation().y;

         btn_tmp.setLocation(x,y+5);
      }
   }
}














