import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Contabilidad implements ActionListener
{

   private JFrame ventana;
   private JLabel lbl_titulo;

   private JMenuBar menuBar;
   private JMenu m_conta;
   private JMenuItem mc_conta1, mc_conta2;

   Contabilidad(JFrame v)
   {
      ventana = v;
      ventana.getContentPane().removeAll();
      ventana.getContentPane().setBackground(Color.YELLOW);

      //ventana = new JFrame("Contabilidad");
      //ventana.setBounds(200,100,500,500);
      //ventana.setLayout(null);
      //ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      menuBar = ventana.getJMenuBar();
      if (menuBar.getMenuCount()>3)
         menuBar.remove(3);

      m_conta = new JMenu("Conta");
      mc_conta1 = new JMenuItem("Conta1");
      mc_conta1.addActionListener(this);
      m_conta.add(mc_conta1);

      mc_conta2 = new JMenuItem("Conta2");
      mc_conta2.addActionListener(this);
      m_conta.add(mc_conta2);

      menuBar.add(m_conta);

      lbl_titulo = new JLabel("Contabilidad");
      lbl_titulo.setBounds(50,20,140,20);
      ventana.add(lbl_titulo);

      ventana.revalidate();
      ventana.repaint();
   }

   public void actionPerformed(ActionEvent e)
   {
      System.out.println("en Conta");
   }
}