import java.sql.*;
import javax.swing.table.*;

public class Cliente
{

   private String cedula, nombre, apellido;
   private String sql;
   private BD bd = new BD();


   public void setCedula(String c)
   {
      cedula = c;
   }
   public String getCedula()
   {
      return cedula;
   }

   public void setNombre(String n)
   {
      nombre = n;
   }
   public String getNombre()
   {
      return nombre;
   }

   public void setApellido(String a)
   {
      apellido = a;
   }
   public String getApellido()
   {
      return apellido;
   }


   public void buscar(String tf_cedula)
   {

      cedula = "";
      nombre = "";
      apellido = "";

      sql = "";

      try
      {

         //sql = "select * from cliente where cedula = '8-2'";
         sql = "select * from cliente where cedula = '" + tf_cedula + "'";
         System.out.println(sql);
         ResultSet rs = bd.executeQuery(sql);

         if (rs.next())
         {
            cedula = rs.getString("cedula"); 
            nombre = rs.getString("nombre");
            apellido = rs.getString("apellido");

         }
         else
         {
            nombre = "";
            apellido = "";
         }
         bd.cerrar();
      }
      catch(Exception e)
      {
         System.out.println("Cliente buscar error " + e.toString());
      }
   }

   public void insertar()
   {
 
      sql = "";

      try
      {

         sql = "insert into cliente(cedula,nombre,apellido) values('" + cedula + "','" + nombre + "','" + apellido + "')";

         System.out.println(sql);
         bd.executeUpdate(sql);
      }
      catch(Exception e)
      {
         System.out.println("Cliente insertar error " + e.toString());
      }
   }

   public void modificar()
   {

         //sql = "update cliente set nombre = 'Pedro', apellido = 'Torres' where cedula='8-4'";
         sql = "update cliente set nombre = '" + nombre + "', apellido = '"  + apellido + "' where cedula='" + cedula + "'";

         System.out.println(sql);
         bd.executeUpdate(sql);
   }

   public void eliminar()
   {
         //sql = "delete from cliente where cedula = '8-3'";
         sql = "delete from cliente where cedula = '" + cedula + "'";

         System.out.println(sql);
         bd.executeUpdate(sql);
         //listar();
   }

   
   private void inicializar()
   {
      cedula = "";
      nombre = "";
      apellido = "";
   }

   public void listar(DefaultTableModel dtm_cliente)
   {
      
      dtm_cliente.setColumnCount(0);
      dtm_cliente.setRowCount(0);

      dtm_cliente.addColumn("Cedula");
      dtm_cliente.addColumn("Nombre");
      dtm_cliente.addColumn("Apellido");

      Object[] fila = new Object[3];

      cedula = "";
      nombre = "";
      apellido = "";

      sql = "";

      try
      {

         sql = "select * from cliente";
         ResultSet rs = bd.executeQuery(sql);

         //listModel.clear();
         while (rs.next())
         {
            cedula = rs.getString("cedula"); 
            nombre = rs.getString("nombre");
            apellido = rs.getString("apellido");

            fila[0] = cedula;
            fila[1] = nombre;
            fila[2] = apellido;

            //System.out.println(cedula + " " + nombre + " " + apellido);
            //listModel.addElement(cedula + " " + nombre + " " + apellido);

            dtm_cliente.addRow(fila);
         }
         bd.cerrar();
      }
      catch(Exception e)
      {
         System.out.println("error " + e.toString());
      }
   }

}
