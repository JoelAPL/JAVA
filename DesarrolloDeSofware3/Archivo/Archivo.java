import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Archivo implements ActionListener
{

   private JFrame ventana;
   private JLabel lbl_nombre, lbl_apellido;
   private JTextField tf_nombre, tf_apellido;
   private JButton btn_grabar, btn_leer;

   public static void main(String[] args)
   {
      new Archivo();
   }
   Archivo()
   {
      ventana = new JFrame("Archivo");
      ventana.setBounds(100,100,500,500);
      ventana.setLayout(null);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      lbl_nombre = new JLabel("Nombre");
      lbl_nombre.setBounds(50,50,80,20);
      ventana.add(lbl_nombre);

      tf_nombre = new JTextField();
      tf_nombre.setBounds(135,50,80,20);
      ventana.add(tf_nombre);

      lbl_apellido = new JLabel("Apellido");
      lbl_apellido.setBounds(50,75,80,20);
      ventana.add(lbl_apellido);

      tf_apellido = new JTextField();
      tf_apellido.setBounds(135,75,80,20);
      ventana.add(tf_apellido);

      btn_grabar = new JButton("Grabar");
      btn_grabar.setBounds(50,100,80,20);
      btn_grabar.addActionListener(this);
      ventana.add(btn_grabar);

      btn_leer = new JButton("Leer");
      btn_leer.setBounds(135,100,80,20);
      btn_leer.addActionListener(this);
      ventana.add(btn_leer);

      ventana.setVisible(true);
   }

   public void actionPerformed(ActionEvent e)
   {
      System.out.println("en actionPerformed");

      if (e.getSource() == btn_grabar)
         grabar();

      if (e.getSource() == btn_leer)
         leer();
   }

   private void grabar()
   {
      FileWriter fw_cliente;
      try
      {
         fw_cliente = new FileWriter("cliente.txt", true); //true=append, false=overwrite
         //fw_cliente = new FileWriter("c:/nuevo/cliente.txt", true);
         //fw_cliente = new FileWriter("c:\\nuevo\\cliente.txt", true);
         fw_cliente.write(tf_nombre.getText()+"\n");
         fw_cliente.write(tf_apellido.getText()+"\n");
         fw_cliente.close();
      }
      catch(Exception e)
      {
         System.out.println("Error grabar " + e.toString());
      }
   }

   private void leer()
   {
      File f_cliente;
      Scanner sc;
      String nombre, apellido;

      try
      {
         f_cliente = new File("cliente.txt");
         sc  = new Scanner(f_cliente);
         while (sc.hasNextLine())
         {
            nombre = sc.nextLine();
            apellido= sc.nextLine();
            System.out.println(nombre+" "+apellido);
         }
      }
      catch(Exception e)
      {
         System.out.println("Error lectura " + e.toString());
      }
  
   }
}










