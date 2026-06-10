import javax.swing.*;
import java.awt.event.*;

public class Mover implements ActionListener
{
    private JFrame ventana;
    private JButton btn_boton, btn_bajar;

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

       btn_bajar = new JButton("Bajar");
       btn_bajar.setBounds(400,100,80,20);
       btn_bajar.addActionListener(this);
       ventana.add(btn_bajar);
    


       ventana.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
       System.out.println("en actionPerformed");

       if (e.getSource()== btn_bajar)
       {
          int x,y;
          x = btn_boton.getLocation().x;
          y = btn_boton.getLocation().y;
          btn_boton.setLocation(x,y+5);
       }
    }
}


