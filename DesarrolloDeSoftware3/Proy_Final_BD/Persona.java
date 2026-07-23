public abstract class Persona
{
   protected String cedula, nombre, apellido, direccion, telefono;

   public String getCedula()    { return cedula;    }
   public String getNombre()    { return nombre;    }
   public String getApellido()  { return apellido;  }
   public String getDireccion() { return direccion; }
   public String getTelefono()  { return telefono;  }

   public void setCedula(String c)    { cedula    = c; }
   public void setNombre(String n)    { nombre    = n; }
   public void setApellido(String a)  { apellido  = a; }
   public void setDireccion(String d) { direccion = d; }
   public void setTelefono(String t)  { telefono  = t; }
}
