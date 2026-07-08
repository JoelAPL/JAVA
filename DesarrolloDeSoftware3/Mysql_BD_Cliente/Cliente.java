import java.sql.*;

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

      sql = "";

         //sql = "update cliente set nombre = 'Pedro', apellido = 'Torres' where cedula='8-4'";
         sql = "update cliente set nombre = '" + nombre + "', apellido = '"  + apellido + "' where cedula='" + cedula + "'";

         System.out.println(sql);
         bd.executeUpdate(sql);
   }
   
   private void inicializar()
   {
      cedula = "";
      nombre = "";
      apellido = "";
   }
}
