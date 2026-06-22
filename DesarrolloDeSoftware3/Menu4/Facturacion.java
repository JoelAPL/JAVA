import javax.swing.*;
import java.awt.*;

public class Facturacion
{

   private JFrame ventana;
   private JLabel lbl_titulo;

   private JMenuBar menuBar;

   Facturacion(JFrame v)
   {
      ventana = v;
      ventana.getContentPane().removeAll();
      ventana.getContentPane().setBackground(Color.CYAN);

      //ventana = new JFrame("Facturacion");
      //ventana.setBounds(200,100,500,500);
      //ventana.setLayout(null);
      //ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      menuBar = ventana.getJMenuBar();
      if (menuBar.getMenuCount()>3)
         menuBar.remove(3);

      lbl_titulo = new JLabel("Facturacion");
      lbl_titulo.setBounds(50,20,140,20);
      ventana.add(lbl_titulo);

      ventana.revalidate();
      ventana.repaint();
   }
}