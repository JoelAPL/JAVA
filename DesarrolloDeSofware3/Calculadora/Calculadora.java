import javax.swing.*;
import java.awt.event.*;
public class Calculadora implements ActionListener {

  private JFrame ventana;
  private JLabel lbl_titulo;
  private JLabel lbl_num1, lbl_num2, lbl_res;
  private JTextField tf_num1, tf_num2 ,tf_res;
  private JButton btn_sumar;

  public static void main(String[] args) {
      new Calculadora();
  }
  Calculadora()
  {
    ventana = new JFrame("Calculadora");
    ventana.setBounds(100,100,300,300);
    ventana.setLayout(null);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    lbl_titulo = new JLabel("Calculadora");
    lbl_titulo.setBounds(50,50,120,20);
    ventana.add(lbl_titulo);

    lbl_num1 = new JLabel("Num1");
    lbl_num1.setBounds(50,75 ,120,20);
    ventana.add(lbl_num1);

    tf_num1 = new JTextField();
    tf_num1.setBounds(105,75,50,20);
    ventana.add(tf_num1);

    lbl_num2 = new JLabel("Num2");
    lbl_num2.setBounds(50,100,50,20);
    ventana.add(lbl_num2);

    tf_num2 = new JTextField();
    tf_num2.setBounds(105,100,50,20);
    ventana.add(tf_num2);

    lbl_res = new JLabel("Res");  
    lbl_res.setBounds(50,125,50,20);
    ventana.add(lbl_res);
    tf_res = new JTextField();
    tf_res.setBounds(105,125,50,20);
    ventana.add(tf_res);

    btn_sumar = new JButton("Sumar");
    btn_sumar.setBounds(50,150,80,20);
    btn_sumar.addActionListener(this);
    ventana.add(btn_sumar);


    ventana.setVisible(true);
  }

  public void actionPerformed(ActionEvent e)
  {
    System.out.println("en ActionPerformed");
    if (e.getSource() == btn_sumar){
      int num1 = Integer.parseInt(tf_num1.getText());
      int num2 = Integer.parseInt(tf_num2.getText());
      int res = num1 + num2;
      tf_res.setText(String.valueOf(res));
    }
  }
}

