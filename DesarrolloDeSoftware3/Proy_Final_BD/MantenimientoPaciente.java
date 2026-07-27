import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class MantenimientoPaciente implements ActionListener
{
   private JFrame   ventana;
   private Paciente paciente;

   private JLabel lbl_titulo;
   private JLabel lbl_cedula, lbl_nombre, lbl_apellido, lbl_direccion;
   private JLabel lbl_telefono, lbl_provincia, lbl_edad, lbl_sexo;

   private JTextField tf_cedula, tf_nombre, tf_apellido, tf_direccion;
   private JTextField tf_telefono, tf_provincia, tf_edad;

   private JRadioButton rb_m, rb_f;
   private ButtonGroup  bg_sexo;

   private JButton btn_limpiar, btn_buscar, btn_adicionar;
   private JButton btn_modificar, btn_eliminar, btn_listar;

   private JLabel lbl_mensaje;

   private DefaultTableModel dtm_paciente;
   private JTable            tb_paciente;
   private JScrollPane       jsp_tabla;

   MantenimientoPaciente(JFrame v)
   {
      ventana  = v;
      paciente = new Paciente();

      ventana.getContentPane().removeAll();

      crearPantalla();
      estadoInicial();

      ventana.revalidate();
      ventana.repaint();
   }

   void crearPantalla()
   {
      lbl_titulo = new JLabel("Mantenimiento de Pacientes");
      lbl_titulo.setBounds(50,20,350,28);
      lbl_titulo.setFont(new Font("Arial", Font.BOLD, 18));
      ventana.add(lbl_titulo);

      lbl_cedula = new JLabel("Cedula:");
      lbl_cedula.setBounds(50,65,100,20);
      ventana.add(lbl_cedula);
      tf_cedula = new JTextField();
      tf_cedula.setBounds(160,65,150,22);
      ventana.add(tf_cedula);

      lbl_nombre = new JLabel("Nombre:");
      lbl_nombre.setBounds(50,92,100,20);
      ventana.add(lbl_nombre);
      tf_nombre = new JTextField();
      tf_nombre.setBounds(160,92,200,22);
      ventana.add(tf_nombre);

      lbl_apellido = new JLabel("Apellido:");
      lbl_apellido.setBounds(50,119,100,20);
      ventana.add(lbl_apellido);
      tf_apellido = new JTextField();
      tf_apellido.setBounds(160,119,200,22);
      ventana.add(tf_apellido);

      lbl_direccion = new JLabel("Direccion:");
      lbl_direccion.setBounds(50,146,100,20);
      ventana.add(lbl_direccion);
      tf_direccion = new JTextField();
      tf_direccion.setBounds(160,146,300,22);
      ventana.add(tf_direccion);

      lbl_telefono = new JLabel("Telefono:");
      lbl_telefono.setBounds(50,173,100,20);
      ventana.add(lbl_telefono);
      tf_telefono = new JTextField();
      tf_telefono.setBounds(160,173,100,22);
      ventana.add(tf_telefono);

      lbl_provincia = new JLabel("Provincia:");
      lbl_provincia.setBounds(50,200,100,20);
      ventana.add(lbl_provincia);
      tf_provincia = new JTextField();
      tf_provincia.setBounds(160,200,150,22);
      ventana.add(tf_provincia);

      lbl_edad = new JLabel("Edad:");
      lbl_edad.setBounds(50,227,100,20);
      ventana.add(lbl_edad);
      tf_edad = new JTextField();
      tf_edad.setBounds(160,227,60,22);
      ventana.add(tf_edad);

      lbl_sexo = new JLabel("Sexo:");
      lbl_sexo.setBounds(50,254,100,20);
      ventana.add(lbl_sexo);
      rb_m = new JRadioButton("M");
      rb_m.setBounds(160,254,50,20);
      rb_f = new JRadioButton("F");
      rb_f.setBounds(215,254,50,20);
      bg_sexo = new ButtonGroup();
      bg_sexo.add(rb_m);
      bg_sexo.add(rb_f);
      ventana.add(rb_m);
      ventana.add(rb_f);

      btn_limpiar   = new JButton("Limpiar");
      btn_buscar    = new JButton("Buscar");
      btn_adicionar = new JButton("Adicionar");
      btn_modificar = new JButton("Modificar");
      btn_eliminar  = new JButton("Eliminar");
      btn_listar    = new JButton("Listar");

      btn_limpiar.setBounds(50,290,100,26);
      btn_buscar.setBounds(160,290,100,26);
      btn_adicionar.setBounds(270,290,100,26);
      btn_modificar.setBounds(380,290,100,26);
      btn_eliminar.setBounds(490,290,100,26);
      btn_listar.setBounds(600,290,100,26);

      btn_limpiar.addActionListener(this);
      btn_buscar.addActionListener(this);
      btn_adicionar.addActionListener(this);
      btn_modificar.addActionListener(this);
      btn_eliminar.addActionListener(this);
      btn_listar.addActionListener(this);

      ventana.add(btn_limpiar);
      ventana.add(btn_buscar);
      ventana.add(btn_adicionar);
      ventana.add(btn_modificar);
      ventana.add(btn_eliminar);
      ventana.add(btn_listar);

      lbl_mensaje = new JLabel(" ");
      lbl_mensaje.setBounds(50,325,650,20);
      ventana.add(lbl_mensaje);

      dtm_paciente = new DefaultTableModel();
      tb_paciente  = new JTable(dtm_paciente);
      jsp_tabla    = new JScrollPane(tb_paciente);
      jsp_tabla.setBounds(50,355,870,250);
      ventana.add(jsp_tabla);
   }

   void limpiarCampos()
   {
      tf_cedula.setText("");
      tf_nombre.setText("");
      tf_apellido.setText("");
      tf_direccion.setText("");
      tf_telefono.setText("");
      tf_provincia.setText("");
      tf_edad.setText("");
      bg_sexo.clearSelection();
      lbl_mensaje.setText(" ");

      tf_cedula.setEnabled(true);
      tf_nombre.setEnabled(false);
      tf_apellido.setEnabled(false);
      tf_direccion.setEnabled(false);
      tf_telefono.setEnabled(false);
      tf_provincia.setEnabled(false);
      tf_edad.setEnabled(false);
      rb_m.setEnabled(false);
      rb_f.setEnabled(false);
   }

   void estadoInicial()
   {
      limpiarCampos();
      btn_buscar.setEnabled(true);
      btn_limpiar.setEnabled(true);
      btn_listar.setEnabled(true);
      btn_adicionar.setEnabled(false);
      btn_modificar.setEnabled(false);
      btn_eliminar.setEnabled(false);
   }

   void estadoPostOperacion()
   {
      limpiarCampos();
      btn_buscar.setEnabled(true);
      btn_limpiar.setEnabled(false);
      btn_listar.setEnabled(true);
      btn_adicionar.setEnabled(false);
      btn_modificar.setEnabled(false);
      btn_eliminar.setEnabled(false);
   }

   void habilitarCampos(boolean hab)
   {
      tf_nombre.setEnabled(hab);
      tf_apellido.setEnabled(hab);
      tf_direccion.setEnabled(hab);
      tf_telefono.setEnabled(hab);
      tf_provincia.setEnabled(hab);
      tf_edad.setEnabled(hab);
      rb_m.setEnabled(hab);
      rb_f.setEnabled(hab);
   }

   void buscar()
   {
      String cedula = tf_cedula.getText().trim();
      if (cedula.equals(""))
      {
         lbl_mensaje.setText("Ingrese una cedula para buscar");
         return;
      }

      boolean encontrado = paciente.buscar(cedula);
      tf_cedula.setEnabled(false);

      if (!encontrado)
      {
         habilitarCampos(true);
         btn_buscar.setEnabled(false);
         btn_adicionar.setEnabled(true);
         btn_modificar.setEnabled(false);
         btn_eliminar.setEnabled(false);
         lbl_mensaje.setText("Cedula no registrada. Complete los campos y presione Adicionar.");
      }
      else
      {
         tf_nombre.setText(paciente.getNombre());
         tf_apellido.setText(paciente.getApellido());
         tf_direccion.setText(paciente.getDireccion());
         tf_telefono.setText(paciente.getTelefono());
         tf_provincia.setText(paciente.getProvincia());
         tf_edad.setText(String.valueOf(paciente.getEdad()));
         if ("M".equals(paciente.getSexo())) rb_m.setSelected(true);
         else                                 rb_f.setSelected(true);

         habilitarCampos(true);
         btn_buscar.setEnabled(false);
         btn_adicionar.setEnabled(false);
         btn_modificar.setEnabled(true);
         btn_eliminar.setEnabled(true);
         lbl_mensaje.setText("Paciente encontrado. Puede modificar o eliminar.");
      }
   }

   void pasarCampos()
   {
      paciente.setCedula(tf_cedula.getText().trim());
      paciente.setNombre(tf_nombre.getText().trim());
      paciente.setApellido(tf_apellido.getText().trim());
      paciente.setDireccion(tf_direccion.getText().trim());
      paciente.setTelefono(tf_telefono.getText().trim());
      paciente.setProvincia(tf_provincia.getText().trim());
      paciente.setSexo(rb_m.isSelected() ? "M" : "F");
      try   { paciente.setEdad(Integer.parseInt(tf_edad.getText().trim())); }
      catch (Exception e) { paciente.setEdad(0); }
   }

   void adicionar()
   {
      pasarCampos();
      paciente.insertar();
      lbl_mensaje.setText("Paciente agregado correctamente.");
      estadoPostOperacion();
   }

   void modificar()
   {
      pasarCampos();
      paciente.modificar();
      lbl_mensaje.setText("Paciente modificado correctamente.");
      estadoPostOperacion();
   }

   void eliminar()
   {
      paciente.setCedula(tf_cedula.getText().trim());
      paciente.eliminar();
      lbl_mensaje.setText("Paciente eliminado correctamente.");
      estadoPostOperacion();
   }

   void listar()
   {
      paciente.listar(dtm_paciente);
   }

   public void actionPerformed(ActionEvent e)
   {
      System.out.println("en actionPerformed");

      if (e.getSource() == btn_limpiar)   { estadoInicial(); return; }
      if (e.getSource() == btn_buscar)    { buscar();        return; }
      if (e.getSource() == btn_adicionar) { adicionar();     return; }
      if (e.getSource() == btn_modificar) { modificar();     return; }
      if (e.getSource() == btn_eliminar)  { eliminar();      return; }
      if (e.getSource() == btn_listar)    { listar();        return; }
   }
}
