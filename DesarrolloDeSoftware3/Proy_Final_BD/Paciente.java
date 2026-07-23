import java.sql.*;
import javax.swing.table.*;

public class Paciente extends Persona
{
   private String provincia, sexo;
   private int    edad;
   private String sql;
   private BD     bd = new BD();

   public String getProvincia() { return provincia; }
   public String getSexo()      { return sexo;      }
   public int    getEdad()      { return edad;      }

   public void setProvincia(String p) { provincia = p; }
   public void setSexo(String s)      { sexo      = s; }
   public void setEdad(int e)         { edad      = e; }

   public boolean buscar(String tf_cedula)
   {
      cedula = ""; nombre = ""; apellido = "";
      direccion = ""; telefono = "";
      provincia = ""; sexo = ""; edad = 0;

      try
      {
         sql = "SELECT * FROM paciente WHERE cedula='" + tf_cedula + "'";
         System.out.println(sql);
         ResultSet rs = bd.executeQuery(sql);
         if (rs.next())
         {
            cedula    = rs.getString("cedula");
            nombre    = rs.getString("nombre");
            apellido  = rs.getString("apellido");
            direccion = rs.getString("direccion");
            telefono  = rs.getString("telefono");
            provincia = rs.getString("provincia");
            edad      = rs.getInt("edad");
            sexo      = rs.getString("sexo");
            bd.cerrar();
            return true;
         }
         bd.cerrar();
      }
      catch(Exception e)
      {
         System.out.println("Paciente buscar error " + e.toString());
      }
      return false;
   }

   public void insertar()
   {
      sql = "INSERT INTO paciente(cedula,nombre,apellido,direccion,telefono,provincia,edad,sexo)" +
            " VALUES('" + cedula + "','" + nombre + "','" + apellido + "','" +
            direccion + "','" + telefono + "','" + provincia + "'," +
            edad + ",'" + sexo + "')";
      System.out.println(sql);
      bd.executeUpdate(sql);
   }

   public void modificar()
   {
      sql = "UPDATE paciente SET nombre='" + nombre + "',apellido='" + apellido +
            "',direccion='" + direccion + "',telefono='" + telefono +
            "',provincia='" + provincia + "',edad=" + edad +
            ",sexo='" + sexo + "' WHERE cedula='" + cedula + "'";
      System.out.println(sql);
      bd.executeUpdate(sql);
   }

   public void eliminar()
   {
      sql = "DELETE FROM paciente WHERE cedula='" + cedula + "'";
      System.out.println(sql);
      bd.executeUpdate(sql);
   }

   public void listar(DefaultTableModel dtm)
   {
      dtm.setColumnCount(0);
      dtm.setRowCount(0);
      dtm.addColumn("Cedula");
      dtm.addColumn("Nombre");
      dtm.addColumn("Apellido");
      dtm.addColumn("Telefono");
      dtm.addColumn("Provincia");

      try
      {
         sql = "SELECT cedula,nombre,apellido,telefono,provincia FROM paciente";
         System.out.println(sql);
         ResultSet rs = bd.executeQuery(sql);
         while (rs.next())
         {
            Object[] fila = {
               rs.getString("cedula"),
               rs.getString("nombre"),
               rs.getString("apellido"),
               rs.getString("telefono"),
               rs.getString("provincia")
            };
            dtm.addRow(fila);
         }
         bd.cerrar();
      }
      catch(Exception e)
      {
         System.out.println("Paciente listar error " + e.toString());
      }
   }
}
