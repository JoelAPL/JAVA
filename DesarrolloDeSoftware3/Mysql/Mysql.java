import java.sql.*;

public class Mysql
{

   private String URL, user, pass;
   private String cedula, nombre, apellido, sql;

   public static void main(String[] args)
   {
      new Mysql();
   }

   Mysql()
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

            System.out.println(cedula + " " + nombre + " " + apellido);
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






