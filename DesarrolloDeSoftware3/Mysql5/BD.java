import java.sql.*;

public class BD
{
   private String URL, user, pass;
   Connection con;
   Statement stmt;
   ResultSet rs;

   BD()
   {
      URL = "jdbc:mysql://127.0.0.1/20261_1gs222";
      user = "root";
      pass = "root";
   }

   public void abrir()
   {
      try
      {
         con =  DriverManager.getConnection(URL,user,pass);
         stmt = con.createStatement();
      }
      catch(Exception e)
      {
         System.out.println("error " + e.toString());
      }
   }
   public ResultSet executeQuery(String sql)
   {
      System.out.println("BD");
      try
      {
         abrir();
         rs = stmt.executeQuery(sql);
      }
      catch(Exception e)
      {
         System.out.println("error " + e.toString());
      }
      return rs;
   }

   public void cerrar()
   {
     try
     {
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