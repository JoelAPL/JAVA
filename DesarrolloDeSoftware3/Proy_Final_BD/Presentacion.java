import javax.swing.*;
import java.awt.*;

public class Presentacion
{
   Presentacion(JFrame ventana)
   {
      ventana.getContentPane().removeAll();

      JLabel lbl_titulo = new JLabel("Sistema de Gestion Hospital");
      lbl_titulo.setBounds(50,40,450,35);
      lbl_titulo.setFont(new Font("Arial", Font.BOLD, 24));
      ventana.add(lbl_titulo);

      JLabel lbl_universidad = new JLabel("Universidad Tecnologica de Panama");
      lbl_universidad.setBounds(50,105,320,20);
      ventana.add(lbl_universidad);

      JLabel lbl_facultad = new JLabel("Fac. de Ing. en Sistemas Computacionales");
      lbl_facultad.setBounds(50,130,340,20);
      ventana.add(lbl_facultad);

      JLabel lbl_carrera = new JLabel("Lic. en Desarrollo de Software");
      lbl_carrera.setBounds(50,155,280,20);
      ventana.add(lbl_carrera);

      JLabel lbl_materia = new JLabel("Desarrollo de Software III");
      lbl_materia.setBounds(50,180,250,20);
      ventana.add(lbl_materia);

      JLabel lbl_profesor = new JLabel("Prof: Ricardo Chan");
      lbl_profesor.setBounds(50,205,200,20);
      ventana.add(lbl_profesor);

      JLabel lbl_estudiante = new JLabel("Est: Joel Alvarez");
      lbl_estudiante.setBounds(50,230,200,20);
      ventana.add(lbl_estudiante);

      JLabel lbl_cedula = new JLabel("Cedula: 8-10-141396");
      lbl_cedula.setBounds(50,255,200,20);
      ventana.add(lbl_cedula);

      JLabel lbl_grupo = new JLabel("Grupo: 1GS222");
      lbl_grupo.setBounds(50,280,200,20);
      ventana.add(lbl_grupo);

      JLabel lbl_fecha = new JLabel("Fecha: 26/07/2026");
      lbl_fecha.setBounds(50,305,200,20);
      ventana.add(lbl_fecha);

      ventana.revalidate();
      ventana.repaint();
   }
}
