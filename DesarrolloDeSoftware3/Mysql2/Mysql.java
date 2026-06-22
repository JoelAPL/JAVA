import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

public class Mysql implements ActionListener
{

   private JFrame ventana;

   private DefaultListModel<String> listModel;
   private JList<String> lst_cliente;
   private JScrollPane jsp_cliente;

   private JButton btn_listar;

   private JLabel lbl_cedula, lbl_nombre, lbl_apellido;
   private JTextField tf_cedula, tf_nombre, tf_apellido;

   private String URL, user, pass;
   private String cedula, nombre, apellido, sql;

   public static void main(String[] args)
   {
      new Mysql();
   }

   Mysql()
   {

      ventana = new JFrame("Mysql");
      ventana.setBounds(100,100,500,500);
      ventana.setLayout(null);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      listModel = new DefaultListModel<String>();
      lst_cliente = new JList<String>(listModel);
      jsp_cliente = new JScrollPane(lst_cliente);
      jsp_cliente.setBounds(50,50,200,200);
      ventana.add(jsp_cliente);

      btn_listar = new JButton("Listar");
      btn_listar.setBounds(50,25,80,20);
      btn_listar.addActionListener(this);
      ventana.add(btn_listar);

      lbl_cedula = new JLabel("Cedula:");
      lbl_cedula.setBounds(270,50,80,20);
      ventana.add(lbl_cedula);

      tf_cedula = new JTextField();
      tf_cedula.setBounds(355,50,80,20);
      ventana.add(tf_cedula);

      lbl_nombre = new JLabel("Nombre:");
      lbl_nombre.setBounds(270,75,80,20);
      ventana.add(lbl_nombre);

      tf_nombre = new JTextField();
      tf_nombre.setBounds(355,75,80,20);
      ventana.add(tf_nombre);

      lbl_apellido = new JLabel("Apellido:");
      lbl_apellido.setBounds(270,100,80,20);
      ventana.add(lbl_apellido);

      tf_apellido = new JTextField();
      tf_apellido.setBounds(355,100,80,20);
      ventana.add(tf_apellido);


      ventana.setVisible(true);
   }

   public void actionPerformed(ActionEvent e)
   {
      System.out.println("en actionPerformed");

      if (e.getSource() == btn_listar)
         listar();
   }

   public void listar()
   {

      URL = "jdbc:mysql://127.0.0.1/20261_1gs222";
      user = "root";
      pass = "root";

      cedula = "";
      nombre = "";
      apellido = "";

      sql = "";

      try
      {

         Connection con =  DriverManager.getConnection(URL,user,pass);
         Statement stmt = con.createStatement();
         sql = "select * from cliente";
         ResultSet rs = stmt.executeQuery(sql);

         while (rs.next())
         {
            cedula = rs.getString("cedula"); 
            nombre = rs.getString("nombre");
            apellido = rs.getString("apellido");

            //System.out.println(cedula + " " + nombre + " " + apellido);
            listModel.addElement(cedula + " " + nombre + " " + apellido);
         }
         rs.close();
         stmt.close();
         con.close();


      }
      catch(Exception e)
      {
         System.out.println("error " + e.toString());
      }


   }
}






