import javax.swing.*;

public class Grafico
{
   private JFrame ventana;
   private JLabel lbl_titulo;
   private JLabel lbl_nombre, lbl_apellido;
   private JTextField tf_nombre, tf_apellido;
   
   public static void main(String[] args)
   {
      new Grafico();
   }

   Grafico()
   {
      ventana = new JFrame("Mi Ventana");
      ventana.setSize(500,300);
      ventana.setLocation(500,200);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ventana.setLayout(null);

      lbl_titulo = new JLabel("Grafico");
      lbl_titulo.setSize(80,20);
      lbl_titulo.setLocation(40,20);
      ventana.add(lbl_titulo);

      lbl_nombre = new JLabel("Nombre:");
      lbl_nombre.setSize(80,20); // ancho, alto
      lbl_nombre.setLocation(40,45);  // x, y
      ventana.add(lbl_nombre);

      tf_nombre = new JTextField();
      tf_nombre.setSize(80,20);
      tf_nombre.setLocation(125,45);
      ventana.add(tf_nombre);

      lbl_apellido = new JLabel("Apellido");
      lbl_apellido.setBounds(40,70,80,20);  // location,size
      ventana.add(lbl_apellido);

      tf_apellido = new JTextField();
      tf_apellido.setBounds(125,70,80,20);
      ventana.add(tf_apellido);


      ventana.setVisible(true);
   }
}
