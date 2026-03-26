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
    hija.atributo1 = "nada";
    System.out.print("*Padre 1*");
    System.out.print(hija.getAtributo1());

    System.out.print("*Hija 1*");
    hija.setAtributo2("Como");
    System.out.print(hija.getAtributo2());

  }
}