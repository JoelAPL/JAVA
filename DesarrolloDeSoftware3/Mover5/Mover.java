import javax.swing.*;
import java.awt.event.*;

public class Mover implements ActionListener
{
    private JFrame ventana;
    private JButton btn_boton, btn_bajar, btn_subir, btn_izq;
    private JButton btn_der;
    private int diry=0, dirx=0;
    private JLabel lbl_height, lbl_y;
    private JTextField tf_height, tf_y;

    Timer timer = new Timer(200, new ActionListener()
    {
       public void actionPerformed(ActionEvent e)
       {
          int x,y;
          x = btn_boton.getLocation().x;
          y = btn_boton.getLocation().y;

          tf_height.setText(String.valueOf(ventana.getHeight()-btn_boton.getHeight()));
          tf_y.setText(String.valueOf(y));

          if (y <= 0)
             diry = -diry;
          if (y>ventana.getHeight()-btn_boton.getHeight()-40)
             diry = -diry;

          if (x <= 0)
             dirx = -dirx;

          if (x > ventana.getWidth()-btn_boton.getWidth()-20)
             dirx = -dirx;

          btn_boton.setLocation(x+dirx,y+diry);
       }
    });
    
    public static void main(String[] args)
    {
       new Mover();
    }

    Mover()
    {
       ventana = new JFrame("Mover");
       ventana.setBounds(100,100,500,500);
       ventana.setLayout(null);
       ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);

       btn_boton = new JButton();
       btn_boton.setBounds(200,200,50,50);
       ventana.add(btn_boton);

       btn_subir = new JButton("Subir");
       btn_subir.setBounds(400,75,80,20);
       btn_subir.addActionListener(this);
       ventana.add(btn_subir);

       btn_bajar = new JButton("Bajar");
       btn_bajar.setBounds(400,100,80,20);
       btn_bajar.addActionListener(this);
       ventana.add(btn_bajar);

       btn_izq = new JButton("Izq");
       btn_izq.setBounds(315,88,80,20);
       btn_izq.addActionListener(this);
       ventana.add(btn_izq);

       btn_der = new JButton("Der");
       btn_der.setBounds(485,88,80,20);
       btn_der.addActionListener(this);
       ventana.add(btn_der);

       lbl_height = new JLabel("Height");
       lbl_height.setBounds(400,125,60,20);
       ventana.add(lbl_height);

       tf_height = new JTextField();
       tf_height.setBounds(465,125,60,20);
       ventana.add(tf_height);

       lbl_y = new JLabel("Y");
       lbl_y.setBounds(400,150,60,20);
       ventana.add(lbl_y);

       tf_y = new JTextField();
       tf_y.setBounds(465,150,60,20);
       ventana.add(tf_y);

       timer.start();
    
       ventana.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
       System.out.println("en actionPerformed");

       if (e.getSource()== btn_bajar)
          diry++;

       if (e.getSource() == btn_subir)
          diry--;

       if (e.getSource() == btn_izq)
          dirx--;

       if (e.getSource() == btn_der)
          dirx++;
        
    }
}


