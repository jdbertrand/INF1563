package td2;
import java.util.*;

public class ConversionPiedsPouces {

   public static void main (String[] args) {
     final double FACTEUR = 0.305 ; // 1 pied = 0.305 mètre
     int nbPieds, nbPouces ;

     //Pour le input au clavier
     @SuppressWarnings("resource")
    Scanner clavier = new Scanner(System.in);

     System.out.print("Entrez la taille en pieds et pouces ");

     nbPieds = clavier.nextInt();
     nbPouces = clavier.nextInt();

  // conversion
  double taille = (nbPieds + nbPouces / 12.0) * FACTEUR ;

  // print out :
    System.out.println("java ConversionPiedsPouces");
    System.out.println("un pied = 0.305m");
    System.out.println("un pouce = 0.025m");
    System.out.println(nbPieds + " pieds et " + nbPouces + " pouces = "+ taille + "m" );

    }
}