import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Alvarez396ProyFinal implements ActionListener
{
   private JFrame   ventana;
   private JMenuBar barra_menu;

   private JMenu     m_inicio, m_mantenimiento, m_reporte;
   private JMenuItem mi_presentacion, mi_salir;
   private JMenuItem mi_paciente, mi_medico;
   private JMenuItem mi_rpt_paciente, mi_rpt_medico;

   public static void main(String[] args)
   {
      new Alvarez396ProyFinal();
   }

   Alvarez396ProyFinal()
   {
      ventana = new JFrame("Sistema de Gestion Hospital - Alvarez 810141396");
      ventana.setBounds(100,100,1000,700);
      ventana.setLayout(null);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);

      crearMenu();
      new Presentacion(ventana);

      ventana.setVisible(true);
   }

   void crearMenu()
   {
      barra_menu = new JMenuBar();

      m_inicio = new JMenu("Inicio");
      mi_presentacion = new JMenuItem("Presentacion");
      mi_presentacion.addActionListener(this);
      m_inicio.add(mi_presentacion);
      mi_salir = new JMenuItem("Salir");
      mi_salir.addActionListener(this);
      m_inicio.add(mi_salir);
      barra_menu.add(m_inicio);

      m_mantenimiento = new JMenu("Mantenimiento");
      mi_paciente = new JMenuItem("Paciente");
      mi_paciente.addActionListener(this);
      m_mantenimiento.add(mi_paciente);
      mi_medico = new JMenuItem("Medico");
      mi_medico.addActionListener(this);
      m_mantenimiento.add(mi_medico);
      barra_menu.add(m_mantenimiento);

      m_reporte = new JMenu("Reporte");
      mi_rpt_paciente = new JMenuItem("Reporte de Pacientes");
      mi_rpt_paciente.addActionListener(this);
      m_reporte.add(mi_rpt_paciente);
      mi_rpt_medico = new JMenuItem("Reporte de Medicos");
      mi_rpt_medico.addActionListener(this);
      m_reporte.add(mi_rpt_medico);
      barra_menu.add(m_reporte);

      ventana.setJMenuBar(barra_menu);
   }

   public void actionPerformed(ActionEvent e)
   {
      System.out.println("en actionPerformed");

      if (e.getSource() == mi_salir)
      {
         System.exit(0);
         return;
      }

      if (e.getSource() == mi_presentacion)
      {
         new Presentacion(ventana);
         return;
      }

      if (e.getSource() == mi_paciente)
      {
         new MantenimientoPaciente(ventana);
         return;
      }

      if (e.getSource() == mi_medico)
      {
         new MantenimientoMedico(ventana);
         return;
      }

      if (e.getSource() == mi_rpt_paciente)
      {
         new ReportePaciente(ventana);
         return;
      }

      if (e.getSource() == mi_rpt_medico)
      {
         new ReporteMedico(ventana);
         return;
      }
   }
}
