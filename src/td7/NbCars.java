package td7;

public class NbCars {

	  public static int nbCars(String s){
	    return s.length();
	  }

	  public static void main(String[] args){

	    System.out.println("Longueur de \"INF1563\" = " + nbCars("INF1563"));
	    System.out.println("Longueur de \"x\" = " + nbCars("x"));
	    System.out.println("Longueur de \"\" = " + nbCars(""));

	  }
	}
