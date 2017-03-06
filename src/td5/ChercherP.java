package td5;

public class ChercherP {

  public static void main(String[] args) {
  
  String aChercher = "Un petit pâté péripatéticien paré pour partir pâtir petit péripâté";
  int max = aChercher.length();
  int nbDeP = 0;
  
  for (int i = 0; i < max; i++) {
    // intéressé seulement par la lettre p
    if (aChercher.charAt(i) != 'p')
      continue;
    // traiter le p
    nbDeP++;
  }
  System.out.println("Il y a " + nbDeP + " lettres p dans cette chaîne.");
}
}