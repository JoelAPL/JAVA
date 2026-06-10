import  javax.swing. *;
public class Grafico {
  private JFrame ventana;
  public static void main(String[] args) {
    new Grafico();
  }
  Grafico() {
    ventana = new JFrame("Mi Ventana");
    ventana.setSize(500, 300);
    ventana.setLocation(500,200);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setVisible(true);
  }
}