import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Alvarez396Proy1 implements ActionListener
{
   private JFrame ventana;
   private JButton btn_boton, btn_tmp;
   private JButton btn_mostrar, btn_nuevo;
   private JButton btn_colonia_ref;
   private JLabel lbl_universidad, lbl_facultad, lbl_carrera, lbl_materia;
   private JLabel lbl_profesor, lbl_estudiante, lbl_cedula, lbl_grupo, lbl_fecha;
   private JLabel lbl_norte, lbl_sur, lbl_este, lbl_oeste;
   private JLabel lbl_info_titulo, lbl_intentos_txt, lbl_intentos_val;
   private JLabel lbl_mensaje, lbl_colonia_txt;
   private JTextField tf_colonia;
   private JLabel lbl_aux;

   private int colonia_col, colonia_row;
   private int intentos;
   private boolean juegoTerminado;

   private int ANCHO = 10;
   private int ALTO  = 13;
   private int TAM   = 40;
   private int MAP_X = 270;
   private int MAP_Y = 80;

   public static void main(String[] args)
   {
      new Alvarez396Proy1();
   }

   Alvarez396Proy1()
   {
      ventana = new JFrame("Proyecto 1 - Ratones - Alvarez 810141396");
      ventana.setBounds(100,100,950,750);
      ventana.setLayout(null);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);

      crearPanelInfo();
      crearEtiquetasMapa();
      crearBotones();
      iniciarJuego();

      ventana.setVisible(true);
   }

   void crearPanelInfo()
   {
      lbl_universidad = new JLabel("Universidad Tecnologica de Panama");
      lbl_universidad.setBounds(10,30,240,20);
      ventana.add(lbl_universidad);

      lbl_facultad = new JLabel("Fac. Ing. en Sistemas Computacionales");
      lbl_facultad.setBounds(10,55,240,20);
      ventana.add(lbl_facultad);

      lbl_carrera = new JLabel("Lic. en Desarrollo de Software");
      lbl_carrera.setBounds(10,80,240,20);
      ventana.add(lbl_carrera);

      lbl_materia = new JLabel("Desarrollo de Software III");
      lbl_materia.setBounds(10,105,240,20);
      ventana.add(lbl_materia);

      lbl_profesor = new JLabel("Prof: Ricardo Chan");
      lbl_profesor.setBounds(10,130,240,20);
      ventana.add(lbl_profesor);

      lbl_estudiante = new JLabel("Est: Joel Alvarez");
      lbl_estudiante.setBounds(10,155,240,20);
      ventana.add(lbl_estudiante);

      lbl_cedula = new JLabel("Cedula: 8-10-141396");
      lbl_cedula.setBounds(10,180,240,20);
      ventana.add(lbl_cedula);

      lbl_grupo = new JLabel("Grupo: 1GS222");
      lbl_grupo.setBounds(10,205,240,20);
      ventana.add(lbl_grupo);

      lbl_fecha = new JLabel("Fecha: 30/05/2026");
      lbl_fecha.setBounds(10,230,240,20);
      ventana.add(lbl_fecha);

      lbl_info_titulo = new JLabel("--- Informacion del Juego ---");
      lbl_info_titulo.setBounds(10,270,240,20);
      ventana.add(lbl_info_titulo);

      lbl_intentos_txt = new JLabel("Intentos:");
      lbl_intentos_txt.setBounds(10,300,80,20);
      ventana.add(lbl_intentos_txt);

      lbl_intentos_val = new JLabel("0");
      lbl_intentos_val.setBounds(100,300,60,20);
      ventana.add(lbl_intentos_val);

      lbl_mensaje = new JLabel("<html>Seleccione<br>una zona</html>");
      lbl_mensaje.setBounds(10,330,240,80);
      ventana.add(lbl_mensaje);

      lbl_colonia_txt = new JLabel("Zona colonia (boton #):");
      lbl_colonia_txt.setBounds(10,430,160,20);
      ventana.add(lbl_colonia_txt);

      tf_colonia = new JTextField();
      tf_colonia.setBounds(10,455,80,20);
      tf_colonia.setEditable(false);
      ventana.add(tf_colonia);

      btn_mostrar = new JButton("Ocultar");
      btn_mostrar.setBounds(10,485,100,25);
      btn_mostrar.addActionListener(this);
      ventana.add(btn_mostrar);

      btn_nuevo = new JButton("Nuevo Juego");
      btn_nuevo.setBounds(10,520,120,25);
      btn_nuevo.addActionListener(this);
      ventana.add(btn_nuevo);
   }

   void crearEtiquetasMapa()
   {
      lbl_norte = new JLabel("Norte");
      lbl_norte.setBounds(MAP_X + ANCHO*TAM/2 - 20, MAP_Y - 35, 50,20);
      ventana.add(lbl_norte);

      lbl_sur = new JLabel("Sur");
      lbl_sur.setBounds(MAP_X + ANCHO*TAM/2 - 10, MAP_Y + ALTO*TAM + 30, 40,20);
      ventana.add(lbl_sur);

      lbl_oeste = new JLabel("Oeste");
      lbl_oeste.setBounds(MAP_X - 65, MAP_Y + ALTO*TAM/2 - 10, 50,20);
      ventana.add(lbl_oeste);

      lbl_este = new JLabel("Este");
      lbl_este.setBounds(MAP_X + ANCHO*TAM + 10, MAP_Y + ALTO*TAM/2 - 10, 40,20);
      ventana.add(lbl_este);

      int i;
      for (i = 1; i <= ALTO; i++)
      {
         lbl_aux = new JLabel(String.valueOf(i));
         lbl_aux.setBounds(MAP_X - 25, MAP_Y + (ALTO - i)*TAM + TAM/2 - 7, 20,20);
         ventana.add(lbl_aux);
      }

      for (i = 1; i <= ANCHO; i++)
      {
         lbl_aux = new JLabel(String.valueOf(i));
         lbl_aux.setBounds(MAP_X + (i-1)*TAM + TAM/2 - 5, MAP_Y + ALTO*TAM + 5, 20,20);
         ventana.add(lbl_aux);
      }
   }

   void crearBotones()
   {
      int i;
      for (i = 0; i < ANCHO*ALTO; i++)
      {
         btn_boton = new JButton(String.valueOf(i));
         btn_boton.setBounds(MAP_X + (ANCHO - 1 - i%ANCHO)*TAM, MAP_Y + (ALTO - 1 - i/ANCHO)*TAM, TAM, TAM);
         btn_boton.setMargin(new Insets(0,0,0,0));
         btn_boton.setActionCommand(String.valueOf(i));
         btn_boton.addActionListener(this);
         ventana.add(btn_boton);
      }
   }

   void iniciarJuego()
   {
      intentos = 0;
      juegoTerminado = false;
      ubicarColonia();
      lbl_intentos_val.setText("0");
      lbl_mensaje.setText("<html>Seleccione<br>una zona</html>");
   }

   void ubicarColonia()
   {
      int n = (int)(Math.random() * ANCHO * ALTO);
      colonia_col = ANCHO - n%ANCHO;
      colonia_row = n/ANCHO + 1;
      tf_colonia.setText(String.valueOf(n));
      actualizarMarcadorColonia();
   }

   void moverColonia()
   {
      int actual = getColoniaNumero();
      int nuevo;
      do
      {
         nuevo = (int)(Math.random() * ANCHO * ALTO);
      } while (nuevo == actual);
      colonia_col = ANCHO - nuevo%ANCHO;
      colonia_row = nuevo/ANCHO + 1;
      tf_colonia.setText(String.valueOf(nuevo));
      actualizarMarcadorColonia();
   }

   int getColoniaNumero()
   {
      return (colonia_row - 1)*ANCHO + (ANCHO - colonia_col);
   }

   void actualizarMarcadorColonia()
   {
      int numColonia = getColoniaNumero();
      int j;
      Component comp;
      JButton b;

      if (btn_colonia_ref != null)
         btn_colonia_ref.setBackground(null);

      for (j = 0; j < ventana.getContentPane().getComponentCount(); j++)
      {
         comp = ventana.getContentPane().getComponent(j);
         if (comp instanceof JButton)
         {
            b = (JButton)comp;
            if (b.getActionCommand() != null && b.getActionCommand().equals(String.valueOf(numColonia)))
            {
               btn_colonia_ref = b;
               btn_colonia_ref.setBackground(tf_colonia.isVisible() ? Color.RED : null);
            }
         }
      }
   }

   String getDireccion(int dc, int dr)
   {
      int dx = colonia_col - dc;
      int dy = colonia_row - dr;

      if (dy > 0 && dx == 0) return "Norte";
      if (dy < 0 && dx == 0) return "Sur";
      if (dy == 0 && dx > 0) return "Este";
      if (dy == 0 && dx < 0) return "Oeste";
      if (dy > 0 && dx > 0) return "Noreste";
      if (dy > 0 && dx < 0) return "Noroeste";
      if (dy < 0 && dx > 0) return "Sureste";
      return "Suroeste";
   }

   public void actionPerformed(ActionEvent e)
   {
      System.out.println("en actionPerformed");

      if (e.getSource() == btn_nuevo)
      {
         iniciarJuego();
         return;
      }

      if (e.getSource() == btn_mostrar)
      {
         if (tf_colonia.isVisible())
         {
            tf_colonia.setVisible(false);
            lbl_colonia_txt.setVisible(false);
            btn_mostrar.setText("Mostrar");
            if (btn_colonia_ref != null)
               btn_colonia_ref.setBackground(null);
         }
         else
         {
            tf_colonia.setVisible(true);
            lbl_colonia_txt.setVisible(true);
            btn_mostrar.setText("Ocultar");
            if (btn_colonia_ref != null)
               btn_colonia_ref.setBackground(Color.RED);
         }
         return;
      }

      if (juegoTerminado)
         return;

      btn_tmp = (JButton)e.getSource();
      int n = Integer.parseInt(btn_tmp.getActionCommand());
      int dc = ANCHO - n%ANCHO;
      int dr = n/ANCHO + 1;

      intentos++;
      lbl_intentos_val.setText(String.valueOf(intentos));

      if (dc == colonia_col && dr == colonia_row)
      {
         lbl_mensaje.setText("<html><b>Colonia capturada!</b><br>Intentos: " + intentos + "</html>");
         juegoTerminado = true;
         return;
      }

      if (Math.abs(dc - colonia_col) <= 1 && Math.abs(dr - colonia_row) <= 1)
      {
         moverColonia();
         lbl_mensaje.setText("<html>La colonia<br>se movio!</html>");
         return;
      }

      lbl_mensaje.setText("<html>Colonia al<br>" + getDireccion(dc, dr) + "</html>");
   }
}
