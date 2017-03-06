package td2;

public class Conversion {

  public static void main(String[] args) {
    
    kiloVersLivre(1);
    livreVersKilo(1);
  }
  
  private static void kiloVersLivre(double kilo){
    double livre = kilo / 0.454;
    System.out.println("java Conversion");
    System.out.println(kilo + " kilo(s) est " + livre + " livre(s)");
  }
  
  private static void livreVersKilo(double livre){
    double kilo = livre * 0.454;

    System.out.println(livre + " livre(s) est " + kilo + " kilo(s)");
  }

}
