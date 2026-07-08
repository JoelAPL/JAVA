import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

public class Mysql implements ActionListener
{

   private JFrame ventana;

   private DefaultListModel<String> listModel;
   private JList<String> lst_cliente;
   private JScrollPane jsp_cliente;

   private JButton btn_listar, btn_buscar, btn_insertar;
   private JButton btn_modificar, btn_eliminar;

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
      ventana.setBounds(100,100,600,500);
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

      btn_buscar = new JButton("Buscar");
      btn_buscar.setBounds(440,50,80,20);
      btn_buscar.addActionListener(this);
      ventana.add(btn_buscar);

      btn_insertar = new JButton("Insertar");
      btn_insertar.setBounds(440,75,80,20);
      btn_insertar.addActionListener(this);
      ventana.add(btn_insertar);

      btn_modificar = new JButton("Modificar");
      btn_modificar.setBounds(440,100,80,20);
      btn_modificar.addActionListener(this);
      ventana.add(btn_modificar);

      btn_eliminar = new JButton("Eliminar");
      btn_eliminar.setBounds(440,125,80,20);
      btn_eliminar.addActionListener(this);
      ventana.add(btn_eliminar);


      ventana.setVisible(true);
   }

   public void actionPerformed(ActionEvent e)
   {
      System.out.println("en actionPerformed");

      if (e.getSource() == btn_listar)
         listar();
      if (e.getSource() == btn_buscar)
         buscar();
      if (e.getSource() == btn_insertar)
         insertar();
      if (e.getSource() == btn_modificar)
         modificar();
      if (e.getSource() == btn_eliminar)
         eliminar();
   }

   public void listar()
   {
      
      BD bd = new BD();

      cedula = "";
      nombre = "";
      apellido = "";

      sql = "";

      try
      {

         sql = "select * from cliente";
         ResultSet rs = bd.executeQuery(sql);

         listModel.clear();
         while (rs.next())
         {
            cedula = rs.getString("cedula"); 
            nombre = rs.getString("nombre");
            apellido = rs.getString("apellido");

            //System.out.println(cedula + " " + nombre + " " + apellido);
            listModel.addElement(cedula + " " + nombre + " " + apellido);
         }
         bd.cerrar();
      }
      catch(Exception e)
      {
         System.out.println("error " + e.toString());
      }
   }

   public void buscar()
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
         //sql = "select * from cliente where cedula = '8-2'";
         sql = "select * from cliente where cedula = '" + tf_cedula.getText()+ "'";
         System.out.println(sql);
         ResultSet rs = stmt.executeQuery(sql);

         if (rs.next())
         {
            cedula = rs.getString("cedula"); 
            nombre = rs.getString("nombre");
            apellido = rs.getString("apellido");

            tf_nombre.setText(nombre);
            tf_apellido.setText(apellido);
         }
         else
         {
            tf_nombre.setText("");
            tf_apellido.setText("");
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

   public void insertar()
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
         sql = "insert into cliente(cedula,nombre,apellido) values('8-4','Ricardo','Chan')";
         sql = "insert into cliente(cedula,nombre,apellido) values('" + tf_cedula.getText() + "','" + tf_nombre.getText() + "','" + tf_apellido.getText() + "')";

         System.out.println(sql);
         stmt.executeUpdate(sql);

         stmt.close();
         con.close();
      }
      catch(Exception e)
      {
         System.out.println("error " + e.toString());
      }
   }
 
   public void modificar()
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

         //sql = "update cliente set nombre = 'Pedro', apellido = 'Torres' where cedula='8-4'";
         sql = "update cliente set nombre = '" + tf_nombre.getText() + "', apellido = '"  + tf_apellido.getText() + "' where cedula='" + tf_cedula.getText() + "'";

         System.out.println(sql);
         stmt.executeUpdate(sql);

         stmt.close();
         con.close();
         listar();
      }
      catch(Exception e)
      {
         System.out.println("error " + e.toString());
      }
   }
   
   private void eliminar()
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

         //sql = "delete from cliente where cedula = '8-3'";
         sql = "delete from cliente where cedula = '" + tf_cedula.getText() + "'";

         System.out.println(sql);
         stmt.executeUpdate(sql);

         stmt.close();
         con.close();
         listar();
      }
      catch(Exception e)
      {
         System.out.println("error " + e.toString());
      }
   }


}






