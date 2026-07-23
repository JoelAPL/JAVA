import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class MantenimientoMedico implements ActionListener
{
   private JFrame ventana;
   private Medico medico;

   private JLabel lbl_titulo;
   private JLabel lbl_codigo, lbl_cedula, lbl_nombre, lbl_apellido;
   private JLabel lbl_direccion, lbl_telefono, lbl_especialidad;
   private JLabel lbl_pac_mes, lbl_pac_anual;

   private JTextField tf_codigo, tf_cedula, tf_nombre, tf_apellido;
   private JTextField tf_direccion, tf_telefono, tf_especialidad;
   private JTextField tf_pac_mes, tf_pac_anual;

   private JButton btn_limpiar, btn_buscar, btn_adicionar;
   private JButton btn_modificar, btn_eliminar, btn_listar;

   private JLabel lbl_mensaje;

   private DefaultTableModel dtm_medico;
   private JTable            tb_medico;
   private JScrollPane       jsp_tabla;

   MantenimientoMedico(JFrame v)
   {
      ventana = v;
      medico  = new Medico();

      ventana.getContentPane().removeAll();

      crearPantalla();
      estadoInicial();

      ventana.revalidate();
      ventana.repaint();
   }

   void crearPantalla()
   {
      lbl_titulo = new JLabel("Mantenimiento de Medicos");
      lbl_titulo.setBounds(50,20,350,28);
      lbl_titulo.setFont(new Font("Arial", Font.BOLD, 18));
      ventana.add(lbl_titulo);

      lbl_codigo = new JLabel("Codigo:");
      lbl_codigo.setBounds(50,65,110,20);
      ventana.add(lbl_codigo);
      tf_codigo = new JTextField();
      tf_codigo.setBounds(170,65,80,22);
      ventana.add(tf_codigo);

      lbl_cedula = new JLabel("Cedula:");
      lbl_cedula.setBounds(50,92,110,20);
      ventana.add(lbl_cedula);
      tf_cedula = new JTextField();
      tf_cedula.setBounds(170,92,150,22);
      ventana.add(tf_cedula);

      lbl_nombre = new JLabel("Nombre:");
      lbl_nombre.setBounds(50,119,110,20);
      ventana.add(lbl_nombre);
      tf_nombre = new JTextField();
      tf_nombre.setBounds(170,119,180,22);
      ventana.add(tf_nombre);

      lbl_apellido = new JLabel("Apellido:");
      lbl_apellido.setBounds(50,146,110,20);
      ventana.add(lbl_apellido);
      tf_apellido = new JTextField();
      tf_apellido.setBounds(170,146,180,22);
      ventana.add(tf_apellido);

      lbl_direccion = new JLabel("Direccion:");
      lbl_direccion.setBounds(50,173,110,20);
      ventana.add(lbl_direccion);
      tf_direccion = new JTextField();
      tf_direccion.setBounds(170,173,280,22);
      ventana.add(tf_direccion);

      lbl_telefono = new JLabel("Telefono:");
      lbl_telefono.setBounds(50,200,110,20);
      ventana.add(lbl_telefono);
      tf_telefono = new JTextField();
      tf_telefono.setBounds(170,200,100,22);
      ventana.add(tf_telefono);

      lbl_especialidad = new JLabel("Especialidad:");
      lbl_especialidad.setBounds(50,227,110,20);
      ventana.add(lbl_especialidad);
      tf_especialidad = new JTextField();
      tf_especialidad.setBounds(170,227,180,22);
      ventana.add(tf_especialidad);

      lbl_pac_mes = new JLabel("Pacientes/Mes:");
      lbl_pac_mes.setBounds(50,254,110,20);
      ventana.add(lbl_pac_mes);
      tf_pac_mes = new JTextField();
      tf_pac_mes.setBounds(170,254,70,22);
      ventana.add(tf_pac_mes);

      lbl_pac_anual = new JLabel("Pacientes/Anual:");
      lbl_pac_anual.setBounds(50,281,110,20);
      ventana.add(lbl_pac_anual);
      tf_pac_anual = new JTextField();
      tf_pac_anual.setBounds(170,281,70,22);
      ventana.add(tf_pac_anual);

      btn_limpiar   = new JButton("Limpiar");
      btn_buscar    = new JButton("Buscar");
      btn_adicionar = new JButton("Adicionar");
      btn_modificar = new JButton("Modificar");
      btn_eliminar  = new JButton("Eliminar");
      btn_listar    = new JButton("Listar");

      btn_limpiar.setBounds(50,318,100,26);
      btn_buscar.setBounds(160,318,100,26);
      btn_adicionar.setBounds(270,318,100,26);
      btn_modificar.setBounds(380,318,100,26);
      btn_eliminar.setBounds(490,318,100,26);
      btn_listar.setBounds(600,318,100,26);

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
      lbl_mensaje.setBounds(50,353,650,20);
      ventana.add(lbl_mensaje);

      dtm_medico = new DefaultTableModel();
      tb_medico  = new JTable(dtm_medico);
      jsp_tabla  = new JScrollPane(tb_medico);
      jsp_tabla.setBounds(50,383,870,250);
      ventana.add(jsp_tabla);
   }

   void estadoInicial()
   {
      tf_codigo.setText("");
      tf_cedula.setText("");
      tf_nombre.setText("");
      tf_apellido.setText("");
      tf_direccion.setText("");
      tf_telefono.setText("");
      tf_especialidad.setText("");
      tf_pac_mes.setText("");
      tf_pac_anual.setText("");
      lbl_mensaje.setText(" ");

      tf_codigo.setEnabled(true);
      tf_cedula.setEnabled(false);
      tf_nombre.setEnabled(false);
      tf_apellido.setEnabled(false);
      tf_direccion.setEnabled(false);
      tf_telefono.setEnabled(false);
      tf_especialidad.setEnabled(false);
      tf_pac_mes.setEnabled(false);
      tf_pac_anual.setEnabled(false);

      btn_buscar.setEnabled(true);
      btn_limpiar.setEnabled(true);
      btn_listar.setEnabled(true);
      btn_adicionar.setEnabled(false);
      btn_modificar.setEnabled(false);
      btn_eliminar.setEnabled(false);
   }

   void habilitarCampos(boolean hab)
   {
      tf_cedula.setEnabled(hab);
      tf_nombre.setEnabled(hab);
      tf_apellido.setEnabled(hab);
      tf_direccion.setEnabled(hab);
      tf_telefono.setEnabled(hab);
      tf_especialidad.setEnabled(hab);
      tf_pac_mes.setEnabled(hab);
      tf_pac_anual.setEnabled(hab);
   }

   void buscar()
   {
      String codigo = tf_codigo.getText().trim();
      if (codigo.equals(""))
      {
         lbl_mensaje.setText("Ingrese un codigo para buscar");
         return;
      }

      boolean encontrado = medico.buscar(codigo);
      tf_codigo.setEnabled(false);

      if (!encontrado)
      {
         habilitarCampos(true);
         btn_buscar.setEnabled(false);
         btn_adicionar.setEnabled(true);
         btn_modificar.setEnabled(false);
         btn_eliminar.setEnabled(false);
         lbl_mensaje.setText("Codigo no registrado. Complete los campos y presione Adicionar.");
      }
      else
      {
         tf_cedula.setText(medico.getCedula());
         tf_nombre.setText(medico.getNombre());
         tf_apellido.setText(medico.getApellido());
         tf_direccion.setText(medico.getDireccion());
         tf_telefono.setText(medico.getTelefono());
         tf_especialidad.setText(medico.getEspecialidad());
         tf_pac_mes.setText(String.valueOf(medico.getPacientesMes()));
         tf_pac_anual.setText(String.valueOf(medico.getPacientesAnual()));

         habilitarCampos(true);
         btn_buscar.setEnabled(false);
         btn_adicionar.setEnabled(false);
         btn_modificar.setEnabled(true);
         btn_eliminar.setEnabled(true);
         lbl_mensaje.setText("Medico encontrado. Puede modificar o eliminar.");
      }
   }

   void pasarCampos()
   {
      medico.setCodigo(tf_codigo.getText().trim());
      medico.setCedula(tf_cedula.getText().trim());
      medico.setNombre(tf_nombre.getText().trim());
      medico.setApellido(tf_apellido.getText().trim());
      medico.setDireccion(tf_direccion.getText().trim());
      medico.setTelefono(tf_telefono.getText().trim());
      medico.setEspecialidad(tf_especialidad.getText().trim());
      try   { medico.setPacientesMes(Integer.parseInt(tf_pac_mes.getText().trim())); }
      catch (Exception e) { medico.setPacientesMes(0); }
      try   { medico.setPacientesAnual(Integer.parseInt(tf_pac_anual.getText().trim())); }
      catch (Exception e) { medico.setPacientesAnual(0); }
   }

   void adicionar()
   {
      pasarCampos();
      medico.insertar();
      lbl_mensaje.setText("Medico agregado correctamente.");
      estadoInicial();
   }

   void modificar()
   {
      pasarCampos();
      medico.modificar();
      lbl_mensaje.setText("Medico modificado correctamente.");
      estadoInicial();
   }

   void eliminar()
   {
      medico.setCodigo(tf_codigo.getText().trim());
      medico.eliminar();
      lbl_mensaje.setText("Medico eliminado correctamente.");
      estadoInicial();
   }

   void listar()
   {
      medico.listar(dtm_medico);
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
