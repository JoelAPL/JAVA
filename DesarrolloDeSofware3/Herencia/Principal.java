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
    System.out.println("*Padre 1*");
    System.out.println(hija.getAtributo1());

    System.out.println("*Hija 1*");
    hija.setAtributo2("Como");
    System.out.println(hija.getAtributo2());


    System.out.println("** Sobreescritura **");
    hija.setAtributo1("Nuevo Valor");
    System.out.println(hija.getAtributo1());
  }
}