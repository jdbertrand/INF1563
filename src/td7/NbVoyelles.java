package td7;

public class NbVoyelles {

	  public static int nbVoyelles(String s){
	    String minuscules = s.toLowerCase();
	    int nb = 0;
	    for (int i=0; i<minuscules.length(); i++){
	      if (estVoyelle(minuscules.charAt(i)))
	        nb++;
	    }
	    return nb;
	  }

	  public static boolean estVoyelle(char c){
	    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
	        || c == 'y' || c == 'à' || c == 'â' || c == 'é' || c == 'è'
	        || c == 'ê' || c == 'ë' || c == 'î' || c == 'ï' || c == 'ô'
	        || c == 'û' || c == 'ù' || c == 'ü' || c == 'ÿ'
	        || c == 'æ' || c == 'œ';
	  }

	  public static void main(String[] args){

	    System.out.println("Nombre de voyelles dans \"INF1563\" = " + nbVoyelles("INF1563"));
	    System.out.println("Nombre de voyelles dans \"a\" = " + nbVoyelles("a"));
	    System.out.println("Nombre de voyelles dans \"b\" = " + nbVoyelles("b"));
	    System.out.println("Nombre de voyelles dans \"\" = " + nbVoyelles(""));
	    System.out.println("Nombre de voyelles dans \"aeiouyéèàëê\" = " + nbVoyelles("aeiouyéèàëês"));

	  }

	}
