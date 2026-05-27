import javax.swing.*;
import java.awt.event.*;

public class Mover implements ActionListener
{
    private JFrame ventana;
    private JButton btn_boton, btn_bajar, btn_subir, btn_izq;
    private JButton btn_der;

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
    
       ventana.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
       System.out.println("en actionPerformed");

       int x,y;
       x = btn_boton.getLocation().x;
       y = btn_boton.getLocation().y;

       if (e.getSource()== btn_bajar)
          btn_boton.setLocation(x,y+5);

       if (e.getSource() == btn_subir)
          btn_boton.setLocation(x,y-5);

       if (e.getSource() == btn_izq)
          btn_boton.setLocation(x-5,y);

       if (e.getSource() == btn_der)
          btn_boton.setLocation(x+5,y);

        
    }
}


