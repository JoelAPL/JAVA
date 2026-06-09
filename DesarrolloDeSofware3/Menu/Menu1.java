import javax.swing.*;
import java.awt.event.*;

public class Menu1 implements ActionListener
{

   private JFrame ventana;

   private JMenuBar menuBar;
   private JMenu m_archivo, m_edicion;
   private JMenuItem ma_abrir, ma_salir;
   private JMenuItem me_deshacer, me_copiar, me_pegar;

   public static void main(String[] args)
   {
      new Menu1();
   }
   
   Menu1()
   {
      ventana = new JFrame("Menu");
      ventana.setBounds(100,100,500,500);
      ventana.setLayout(null);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      menuBar = new JMenuBar();

      // *********** Archivo
      m_archivo = new JMenu("Archivo");

      ma_abrir = new JMenuItem("Abrir");
      m_archivo.add(ma_abrir);

      ma_salir = new JMenuItem("Salir");
      ma_salir.addActionListener(this);
      m_archivo.add(ma_salir);

      menuBar.add(m_archivo);

      // ********* Edicion
      m_edicion = new JMenu("Edicion");

      me_deshacer = new JMenuItem("Deshacer");
      m_edicion.add(me_deshacer);
      m_edicion.addSeparator();

      me_copiar = new JMenuItem("Copiar");
      m_edicion.add(me_copiar);

      me_pegar = new JMenuItem("Pegar");
      m_edicion.add(me_pegar);
     
      menuBar.add(m_edicion);
      
    
      ventana.setJMenuBar(menuBar);

      ventana.setVisible(true);
   }

   public void actionPerformed(ActionEvent e)
   {
      System.out.println("en actionPerformed");

      if (e.getSource() == ma_salir)
          System.exit(0);
   }
}





   
