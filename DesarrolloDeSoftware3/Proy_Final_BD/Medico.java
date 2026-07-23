import java.sql.*;
import javax.swing.table.*;

public class Medico extends Persona
{
   private String codigo, especialidad;
   private int    pacientes_mes, pacientes_anual;
   private String sql;
   private BD     bd = new BD();

   public String getCodigo()         { return codigo;           }
   public String getEspecialidad()   { return especialidad;     }
   public int    getPacientesMes()   { return pacientes_mes;    }
   public int    getPacientesAnual() { return pacientes_anual;  }

   public void setCodigo(String c)        { codigo           = c;  }
   public void setEspecialidad(String e)  { especialidad     = e;  }
   public void setPacientesMes(int pm)    { pacientes_mes    = pm; }
   public void setPacientesAnual(int pa)  { pacientes_anual  = pa; }

   public boolean buscar(String tf_codigo)
   {
      codigo = ""; cedula = ""; nombre = ""; apellido = "";
      direccion = ""; telefono = ""; especialidad = "";
      pacientes_mes = 0; pacientes_anual = 0;

      try
      {
         sql = "SELECT * FROM medico WHERE codigo='" + tf_codigo + "'";
         System.out.println(sql);
         ResultSet rs = bd.executeQuery(sql);
         if (rs.next())
         {
            codigo          = rs.getString("codigo");
            cedula          = rs.getString("cedula");
            nombre          = rs.getString("nombre");
            apellido        = rs.getString("apellido");
            direccion       = rs.getString("direccion");
            telefono        = rs.getString("telefono");
            especialidad    = rs.getString("especialidad");
            pacientes_mes   = rs.getInt("pacientes_mes");
            pacientes_anual = rs.getInt("pacientes_anual");
            bd.cerrar();
            return true;
         }
         bd.cerrar();
      }
      catch(Exception e)
      {
         System.out.println("Medico buscar error " + e.toString());
      }
      return false;
   }

   public void insertar()
   {
      sql = "INSERT INTO medico(codigo,cedula,nombre,apellido,direccion,telefono,especialidad,pacientes_mes,pacientes_anual)" +
            " VALUES('" + codigo + "','" + cedula + "','" + nombre + "','" + apellido +
            "','" + direccion + "','" + telefono + "','" + especialidad + "'," +
            pacientes_mes + "," + pacientes_anual + ")";
      System.out.println(sql);
      bd.executeUpdate(sql);
   }

   public void modificar()
   {
      sql = "UPDATE medico SET cedula='" + cedula + "',nombre='" + nombre +
            "',apellido='" + apellido + "',direccion='" + direccion +
            "',telefono='" + telefono + "',especialidad='" + especialidad +
            "',pacientes_mes=" + pacientes_mes +
            ",pacientes_anual=" + pacientes_anual +
            " WHERE codigo='" + codigo + "'";
      System.out.println(sql);
      bd.executeUpdate(sql);
   }

   public void eliminar()
   {
      sql = "DELETE FROM medico WHERE codigo='" + codigo + "'";
      System.out.println(sql);
      bd.executeUpdate(sql);
   }

   public void listar(DefaultTableModel dtm)
   {
      dtm.setColumnCount(0);
      dtm.setRowCount(0);
      dtm.addColumn("Codigo");
      dtm.addColumn("Cedula");
      dtm.addColumn("Nombre");
      dtm.addColumn("Apellido");
      dtm.addColumn("Especialidad");

      try
      {
         sql = "SELECT codigo,cedula,nombre,apellido,especialidad FROM medico";
         System.out.println(sql);
         ResultSet rs = bd.executeQuery(sql);
         while (rs.next())
         {
            Object[] fila = {
               rs.getString("codigo"),
               rs.getString("cedula"),
               rs.getString("nombre"),
               rs.getString("apellido"),
               rs.getString("especialidad")
            };
            dtm.addRow(fila);
         }
         bd.cerrar();
      }
      catch(Exception e)
      {
         System.out.println("Medico listar error " + e.toString());
      }
   }
}
