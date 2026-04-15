import javax.swing.*;

public class CrearBotones {
  
    private JFrame ventana;
    private JButton btn_boton1, btn_boton2, btn_boton3, btn_boton4;
    public static void main(String[] args) {
      new CrearBotones();
    }
    CrearBotones() {
    ventana = new JFrame("Crear Botones");
    ventana.setBounds(100, 100, 300, 300);
    ventana.setLayout(null);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setVisible(true);

    btn_boton1 = new JButton("1");
    btn_boton1.setBounds(50, 100, 50, 20);
    ventana.add(btn_boton1);
    btn_boton2 = new JButton("2");
    btn_boton2.setBounds(105, 100, 50, 20);
    ventana.add(btn_boton2);
    btn_boton3 = new JButton("3");
    btn_boton3.setBounds(160, 100, 50 , 20);
    ventana.add(btn_boton3);

    btn_boton4 = new JButton("4");
    btn_boton4.setBounds(215, 100, 50, 20); 
    ventana.add(btn_boton4);
    
    }
}