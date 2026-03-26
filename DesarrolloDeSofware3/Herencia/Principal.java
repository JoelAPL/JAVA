public class Principal
{
  public static void main(String[] args)
  {
    new Principal();
  }
  Principal()
  {
    Hija hija = new Hija();
    hija.setAtributo1("Hola");
    System.out.print(hija.getAtributo1());
  }
}