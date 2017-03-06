package td5;


public class CalculerValeurDecimale {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

 // calcul de la valeur décimale d'une constante octale
    String cst = "17777777777";
    int val = 0;
    int i = 0;
    final int max = Integer.MAX_VALUE;
    do {
      int chiffre = Character.digit(cst.charAt(i), 8);
      if (chiffre > 7 || chiffre < 0)
        break; // seulement les chiffres octaux permis
      if (max / 8 < val)
        break; // valeur trop grande
      val = val * 8;
      if (max - chiffre < val)
        break; // valeur trop grande
      val = val + chiffre;
      i++;
    } while (i < cst.length());
    System.out.println("Les caractères acceptés représentent la valeur " + val + ".");
  }

}
