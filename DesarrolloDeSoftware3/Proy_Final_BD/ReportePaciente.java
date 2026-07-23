import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.*;

public class ReportePaciente implements ActionListener
{
   private JFrame ventana;

   private JLabel       lbl_titulo, lbl_ordenar;
   private JRadioButton rb_apellido, rb_cedula, rb_edad;
   private ButtonGroup  bg_orden;
   private JButton      btn_generar;
   private JLabel       lbl_mensaje;

   ReportePaciente(JFrame v)
   {
      ventana = v;
      ventana.getContentPane().removeAll();

      crearPantalla();

      ventana.revalidate();
      ventana.repaint();
   }

   void crearPantalla()
   {
      lbl_titulo = new JLabel("Reporte de Pacientes");
      lbl_titulo.setBounds(50,30,300,28);
      lbl_titulo.setFont(new Font("Arial", Font.BOLD, 18));
      ventana.add(lbl_titulo);

      lbl_ordenar = new JLabel("Ordenar por:");
      lbl_ordenar.setBounds(50,80,110,22);
      ventana.add(lbl_ordenar);

      rb_apellido = new JRadioButton("Apellido");
      rb_apellido.setBounds(170,80,100,22);
      rb_apellido.setSelected(true);

      rb_cedula = new JRadioButton("Cedula");
      rb_cedula.setBounds(275,80,100,22);

      rb_edad = new JRadioButton("Edad");
      rb_edad.setBounds(380,80,100,22);

      bg_orden = new ButtonGroup();
      bg_orden.add(rb_apellido);
      bg_orden.add(rb_cedula);
      bg_orden.add(rb_edad);

      ventana.add(rb_apellido);
      ventana.add(rb_cedula);
      ventana.add(rb_edad);

      btn_generar = new JButton("Generar Reporte");
      btn_generar.setBounds(50,120,150,28);
      btn_generar.addActionListener(this);
      ventana.add(btn_generar);

      lbl_mensaje = new JLabel(" ");
      lbl_mensaje.setBounds(50,165,600,20);
      ventana.add(lbl_mensaje);
   }

   void generar()
   {
      String orden       = "apellido";
      String orden_texto = "Apellido";

      if (rb_cedula.isSelected()) { orden = "cedula"; orden_texto = "Cedula"; }
      if (rb_edad.isSelected())   { orden = "edad";   orden_texto = "Edad";   }

      try
      {
         BD bd = new BD();
         Connection con = bd.getConexion();

         Map<String, Object> parametros = new HashMap<String, Object>();
         parametros.put("ORDEN",  orden);
         parametros.put("TITULO", "Listado de Pacientes ordenado por " + orden_texto);

         JasperReport jr = JasperCompileManager.compileReport("RptPaciente.jrxml");
         JasperPrint  jp = JasperFillManager.fillReport(jr, parametros, con);
         JasperViewer.viewReport(jp, false);
         con.close();
      }
      catch(Exception e)
      {
         System.out.println("error reporte paciente " + e.toString());
         lbl_mensaje.setText("Error: " + e.getMessage());
      }
   }

   public void actionPerformed(ActionEvent e)
   {
      System.out.println("en actionPerformed");

      if (e.getSource() == btn_generar)
         generar();
   }
}
