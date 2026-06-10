public class Hija extends Padre 
{
  private String atributo2;

  public void setAtributo2(String valor)
  {
    atributo2 = valor;
  }

  public String getAtributo2()
  {
    return atributo2;
  }
  public void setAtributo1(String valor)
  {
    super.setAtributo1("Hija = " + valor);
  }
}