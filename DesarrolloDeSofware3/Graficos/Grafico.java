import  javax.swing. *;
public class Grafico {
  private JFrame ventana;
  public static void main(String[] args) {
    new Grafico();
  }
  Grafico() {
    ventana = new JFrame("Mi Ventana");
    ventana.setSize(300, 300);
    ventana.setLocation(200,200);
    ventana.setVisible(true);
  }
}