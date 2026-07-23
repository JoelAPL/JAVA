import java.sql.*;

public class BD
{
   private String URL, user, pass;
   private Connection con;
   private Statement  stmt;
   private ResultSet  rs;

   BD()
   {
      URL  = "jdbc:mysql://127.0.0.1/20261_1gs222";
      user = "root";
      pass = "root";
   }

   public void abrir()
   {
      try
      {
         con  = DriverManager.getConnection(URL, user, pass);
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

   public void executeUpdate(String sql)
   {
      System.out.println("BD");
      try
      {
         abrir();
         stmt.executeUpdate(sql);
         cerrar();
      }
      catch(Exception e)
      {
         System.out.println("error " + e.toString());
      }
   }

   public Connection getConexion()
   {
      abrir();
      return con;
   }

   public void cerrar()
   {
      try
      {
         if (rs != null)
            rs.close();
         stmt.close();
         con.close();
      }
      catch(Exception e)
      {
         System.out.println("BD cerrar error " + e.toString());
      }
   }
}
