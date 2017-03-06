package td4;

public class Interet {

  static double soldeInitial = 1000;
  static double soldeFinal = 2000;
  
  static double txInteret = 0.05;
  
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    double soldeCourant = soldeInitial;
    double nbAnnee = 1;
    
    do 
    {
      soldeCourant = (soldeInitial * Math.pow((1 + txInteret), nbAnnee));
      double intGagne = soldeCourant - soldeInitial;
      System.out.println("Année: " + (int)nbAnnee + " - Intérêt: " + intGagne + " - Total: " + soldeCourant);
      nbAnnee = nbAnnee +1;
      //soldeCourant = (soldeCourant + intGagne);
    } while (soldeCourant < soldeFinal);
    
  }

}
