import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Alvarez396Proy2 implements ActionListener
{
   private JFrame ventana;
   private JButton[] btn_pieza;
   private JButton btn_tmp, btn_animando;
   private JButton btn_iniciar, btn_iniciar2, btn_consultar, btn_guardar;

   private JLabel lbl_universidad, lbl_facultad, lbl_carrera, lbl_materia;
   private JLabel lbl_profesor, lbl_estudiante, lbl_cedula, lbl_grupo, lbl_fecha;
   private JLabel lbl_tiempo_txt, lbl_tiempo_val;
   private JLabel lbl_mov_txt, lbl_mov_val;
   private JLabel lbl_mensaje, lbl_nombre_txt, lbl_top5_txt;
   private JTextField tf_nombre;

   private DefaultListModel<String> listModel;
   private JList<String> lst_top5;
   private JScrollPane jsp_top5;

   private int vacio;
   private int tiempo;
   private int movimientos;
   private int target_x, target_y;
   private int pos_anterior;
   private boolean enMovimiento;
   private boolean juegoIniciado;

   private int PUZZLE_X = 280;
   private int PUZZLE_Y = 80;
   private int TAM      = 80;

   private Random rnd = new Random();

   javax.swing.Timer timer_mov = new javax.swing.Timer(10, new ActionListener()
   {
      public void actionPerformed(ActionEvent e)
      {
         int cx   = btn_animando.getLocation().x;
         int cy   = btn_animando.getLocation().y;
         int paso = 4;
         int nx   = cx;
         int ny   = cy;

         if (cx != target_x)
         {
            nx = cx + (target_x > cx ? paso : -paso);
            if (Math.abs(target_x - cx) <= paso) nx = target_x;
            btn_animando.setLocation(nx, cy);
         }
         else if (cy != target_y)
         {
            ny = cy + (target_y > cy ? paso : -paso);
            if (Math.abs(target_y - cy) <= paso) ny = target_y;
            btn_animando.setLocation(cx, ny);
         }
         else
         {
            timer_mov.stop();
            vacio = pos_anterior;
            enMovimiento = false;
            movimientos++;
            lbl_mov_val.setText(String.valueOf(movimientos));
            if (estaOrdenado())
               juegoGanado();
         }
      }
   });

   javax.swing.Timer timer_tiempo = new javax.swing.Timer(1000, new ActionListener()
   {
      public void actionPerformed(ActionEvent e)
      {
         tiempo++;
         lbl_tiempo_val.setText(String.valueOf(tiempo));
      }
   });

   public static void main(String[] args)
   {
      new Alvarez396Proy2();
   }

   Alvarez396Proy2()
   {
      ventana = new JFrame("Proyecto 2 - Rompecabeza - Alvarez 810141396");
      ventana.setBounds(100,100,1000,750);
      ventana.setLayout(null);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);

      crearPanelInfo();
      crearBotones();
      crearControles();
      crearTop5Panel();

      enMovimiento  = false;
      juegoIniciado = false;

      ventana.setVisible(true);
   }

   void crearPanelInfo()
   {
      lbl_universidad = new JLabel("Universidad Tecnologica de Panama");
      lbl_universidad.setBounds(10,30,250,20);
      ventana.add(lbl_universidad);

      lbl_facultad = new JLabel("Fac. Ing. en Sistemas Computacionales");
      lbl_facultad.setBounds(10,55,250,20);
      ventana.add(lbl_facultad);

      lbl_carrera = new JLabel("Lic. en Desarrollo de Software");
      lbl_carrera.setBounds(10,80,250,20);
      ventana.add(lbl_carrera);

      lbl_materia = new JLabel("Desarrollo de Software III");
      lbl_materia.setBounds(10,105,250,20);
      ventana.add(lbl_materia);

      lbl_profesor = new JLabel("Prof: Ricardo Chan");
      lbl_profesor.setBounds(10,130,250,20);
      ventana.add(lbl_profesor);

      lbl_estudiante = new JLabel("Est: Joel Alvarez");
      lbl_estudiante.setBounds(10,155,250,20);
      ventana.add(lbl_estudiante);

      lbl_cedula = new JLabel("Cedula: 8-10-141396");
      lbl_cedula.setBounds(10,180,250,20);
      ventana.add(lbl_cedula);

      lbl_grupo = new JLabel("Grupo: 1GS222");
      lbl_grupo.setBounds(10,205,250,20);
      ventana.add(lbl_grupo);

      lbl_fecha = new JLabel("Fecha: 21/06/2026");
      lbl_fecha.setBounds(10,230,250,20);
      ventana.add(lbl_fecha);

      lbl_tiempo_txt = new JLabel("Tiempo (seg):");
      lbl_tiempo_txt.setBounds(10,275,100,20);
      ventana.add(lbl_tiempo_txt);

      lbl_tiempo_val = new JLabel("0");
      lbl_tiempo_val.setBounds(120,275,80,20);
      ventana.add(lbl_tiempo_val);

      lbl_mov_txt = new JLabel("Movimientos:");
      lbl_mov_txt.setBounds(10,300,100,20);
      ventana.add(lbl_mov_txt);

      lbl_mov_val = new JLabel("0");
      lbl_mov_val.setBounds(120,300,80,20);
      ventana.add(lbl_mov_val);

      lbl_mensaje = new JLabel("<html>Presione<br>Iniciar</html>");
      lbl_mensaje.setBounds(10,335,250,70);
      ventana.add(lbl_mensaje);

      lbl_nombre_txt = new JLabel("Tu nombre:");
      lbl_nombre_txt.setBounds(10,420,90,20);
      lbl_nombre_txt.setVisible(false);
      ventana.add(lbl_nombre_txt);

      tf_nombre = new JTextField();
      tf_nombre.setBounds(10,445,180,22);
      tf_nombre.setVisible(false);
      ventana.add(tf_nombre);

      btn_guardar = new JButton("Guardar Top 5");
      btn_guardar.setBounds(10,477,130,25);
      btn_guardar.addActionListener(this);
      btn_guardar.setVisible(false);
      ventana.add(btn_guardar);
   }

   void crearBotones()
   {
      btn_pieza = new JButton[15];
      int i;
      for (i = 0; i < 15; i++)
      {
         btn_pieza[i] = new JButton(String.valueOf(i+1));
         btn_pieza[i].setBounds(PUZZLE_X + (i%4)*TAM, PUZZLE_Y + (i/4)*TAM, TAM, TAM);
         btn_pieza[i].setFont(new Font("Arial", Font.BOLD, 22));
         btn_pieza[i].setMargin(new Insets(0,0,0,0));
         btn_pieza[i].addActionListener(this);
         ventana.add(btn_pieza[i]);
      }
      vacio = 15;
   }

   void crearControles()
   {
      btn_iniciar = new JButton("Iniciar");
      btn_iniciar.setBounds(PUZZLE_X, PUZZLE_Y + 4*TAM + 15, 110, 28);
      btn_iniciar.addActionListener(this);
      ventana.add(btn_iniciar);

      btn_iniciar2 = new JButton("Iniciar 2");
      btn_iniciar2.setBounds(PUZZLE_X + 125, PUZZLE_Y + 4*TAM + 15, 110, 28);
      btn_iniciar2.addActionListener(this);
      ventana.add(btn_iniciar2);
   }

   void crearTop5Panel()
   {
      lbl_top5_txt = new JLabel("Top 5 Mejores Jugadores:");
      lbl_top5_txt.setBounds(PUZZLE_X, PUZZLE_Y + 4*TAM + 58, 200, 20);
      ventana.add(lbl_top5_txt);

      btn_consultar = new JButton("Consultar");
      btn_consultar.setBounds(PUZZLE_X + 215, PUZZLE_Y + 4*TAM + 55, 110, 25);
      btn_consultar.addActionListener(this);
      ventana.add(btn_consultar);

      listModel = new DefaultListModel<String>();
      lst_top5  = new JList<String>(listModel);
      jsp_top5  = new JScrollPane(lst_top5);
      jsp_top5.setBounds(PUZZLE_X, PUZZLE_Y + 4*TAM + 88, 360, 130);
      ventana.add(jsp_top5);
   }

   void revolver()
   {
      int i, j, xi, yi, xj, yj;
      for (i = 0; i < 15; i++)
      {
         j  = rnd.nextInt(15);
         xi = btn_pieza[i].getLocation().x;
         yi = btn_pieza[i].getLocation().y;
         xj = btn_pieza[j].getLocation().x;
         yj = btn_pieza[j].getLocation().y;
         btn_pieza[i].setLocation(xj, yj);
         btn_pieza[j].setLocation(xi, yi);
      }
      vacio = 15;
   }

   void iniciarJuego()
   {
      timer_mov.stop();
      timer_tiempo.stop();

      int i;
      for (i = 0; i < 15; i++)
         btn_pieza[i].setLocation(PUZZLE_X + (i%4)*TAM, PUZZLE_Y + (i/4)*TAM);

      vacio         = 15;
      tiempo        = 0;
      movimientos   = 0;
      enMovimiento  = false;
      juegoIniciado = false;

      lbl_tiempo_val.setText("0");
      lbl_mov_val.setText("0");
      lbl_mensaje.setText("<html>Presione<br>Iniciar</html>");

      lbl_nombre_txt.setVisible(false);
      tf_nombre.setVisible(false);
      btn_guardar.setVisible(false);
   }

   void iniciar()
   {
      iniciarJuego();
      revolver();
      juegoIniciado = true;
      timer_tiempo.start();
      lbl_mensaje.setText("<html>¡Ordena<br>el puzzle!</html>");
   }

   void iniciar2()
   {
      iniciarJuego();
      target_x      = PUZZLE_X + 3*TAM;
      target_y      = PUZZLE_Y + 3*TAM;
      pos_anterior  = 14;
      btn_animando  = btn_pieza[14];
      enMovimiento  = true;
      juegoIniciado = true;
      timer_mov.start();
      timer_tiempo.start();
      lbl_mensaje.setText("<html>¡Ordena<br>el puzzle!</html>");
   }

   void moverBoton(JButton b)
   {
      int bx    = b.getLocation().x;
      int by    = b.getLocation().y;
      int b_col = (bx - PUZZLE_X) / TAM;
      int b_row = (by - PUZZLE_Y) / TAM;
      int b_pos = b_row * 4 + b_col;

      int v_col = vacio % 4;
      int v_row = vacio / 4;

      boolean adyacente = false;
      if (b_row == v_row && Math.abs(b_col - v_col) == 1) adyacente = true;
      if (b_col == v_col && Math.abs(b_row - v_row) == 1) adyacente = true;

      if (adyacente)
      {
         target_x     = PUZZLE_X + v_col * TAM;
         target_y     = PUZZLE_Y + v_row * TAM;
         pos_anterior = b_pos;
         btn_animando = b;
         enMovimiento = true;
         timer_mov.start();
      }
   }

   boolean estaOrdenado()
   {
      int i;
      for (i = 0; i < 15; i++)
      {
         if (btn_pieza[i].getLocation().x != PUZZLE_X + (i%4)*TAM) return false;
         if (btn_pieza[i].getLocation().y != PUZZLE_Y + (i/4)*TAM) return false;
      }
      return vacio == 15;
   }

   void juegoGanado()
   {
      timer_tiempo.stop();
      juegoIniciado = false;
      lbl_mensaje.setText("<html><b>¡Resuelto!</b><br>" + tiempo + "s | " + movimientos + " mov</html>");
      lbl_nombre_txt.setVisible(true);
      tf_nombre.setText("");
      tf_nombre.setVisible(true);
      btn_guardar.setVisible(true);
   }

   void guardarJugador()
   {
      if (tf_nombre.getText().trim().equals(""))
      {
         lbl_mensaje.setText("<html>Ingresa tu<br>nombre primero</html>");
         return;
      }
      verificarTop5();
   }

   void verificarTop5()
   {
      String[] nombres  = new String[6];
      int[]    tiempos  = new int[6];
      int[]    movs     = new int[6];
      int      count    = 0;

      try
      {
         File    f  = new File("mejores.txt");
         Scanner sc = new Scanner(f);
         while (sc.hasNextLine() && count < 5)
         {
            nombres[count] = sc.nextLine();
            tiempos[count] = Integer.parseInt(sc.nextLine().trim());
            movs[count]    = Integer.parseInt(sc.nextLine().trim());
            count++;
         }
         sc.close();
      }
      catch(Exception e)
      {
         System.out.println("Sin archivo previo: " + e.toString());
      }

      boolean califica = count < 5;
      if (!califica && tiempos[count-1] > tiempo) califica = true;

      if (califica)
      {
         nombres[count] = tf_nombre.getText().trim();
         tiempos[count] = tiempo;
         movs[count]    = movimientos;
         count++;

         int i, j;
         String tmpN;
         int tmpT, tmpM;
         for (i = 0; i < count-1; i++)
            for (j = i+1; j < count; j++)
               if (tiempos[i] > tiempos[j])
               {
                  tmpN = nombres[i]; nombres[i] = nombres[j]; nombres[j] = tmpN;
                  tmpT = tiempos[i]; tiempos[i] = tiempos[j]; tiempos[j] = tmpT;
                  tmpM = movs[i];    movs[i]    = movs[j];    movs[j]    = tmpM;
               }

         if (count > 5) count = 5;

         try
         {
            FileWriter fw = new FileWriter("mejores.txt", false);
            int i2;
            for (i2 = 0; i2 < count; i2++)
            {
               fw.write(nombres[i2] + "\n");
               fw.write(tiempos[i2] + "\n");
               fw.write(movs[i2]    + "\n");
            }
            fw.close();
         }
         catch(Exception e)
         {
            System.out.println("Error guardando: " + e.toString());
         }

         lbl_mensaje.setText("<html><b>¡En el Top 5!</b><br>Registrado</html>");
      }
      else
      {
         lbl_mensaje.setText("<html>No clasifico<br>en Top 5</html>");
      }

      lbl_nombre_txt.setVisible(false);
      tf_nombre.setVisible(false);
      btn_guardar.setVisible(false);
   }

   void consultarTop5()
   {
      listModel.clear();
      try
      {
         File    f   = new File("mejores.txt");
         Scanner sc  = new Scanner(f);
         int     pos = 1;
         while (sc.hasNextLine())
         {
            String nombre = sc.nextLine();
            String tiemp  = sc.nextLine();
            String mov    = sc.nextLine();
            listModel.addElement(pos + ". " + nombre + "  |  " + tiemp + "s  |  " + mov + " mov");
            pos++;
         }
         sc.close();
         if (listModel.isEmpty())
            listModel.addElement("Sin registros aun");
      }
      catch(Exception e)
      {
         System.out.println("Error consultar: " + e.toString());
         listModel.addElement("Sin registros aun");
      }
   }

   public void actionPerformed(ActionEvent e)
   {
      System.out.println("en actionPerformed");

      if (e.getSource() == btn_iniciar)
      {
         iniciar();
         return;
      }

      if (e.getSource() == btn_iniciar2)
      {
         iniciar2();
         return;
      }

      if (e.getSource() == btn_consultar)
      {
         consultarTop5();
         return;
      }

      if (e.getSource() == btn_guardar)
      {
         guardarJugador();
         return;
      }

      if (enMovimiento || !juegoIniciado)
         return;

      btn_tmp = (JButton)e.getSource();
      moverBoton(btn_tmp);
   }
}
