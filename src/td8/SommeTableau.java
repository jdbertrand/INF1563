package td8;

public class SommeTableau {
	  public static int somme (int[] tab){
	    int total = 0;
	    for (int i=0; i<tab.length; i++){
	      total += tab[i];
	    }
	    return total;
	  }
	  public static void main(String[] args){
	    System.out.println(somme(new int[] {1, 2, 3, 4}));
	    System.out.println(somme(new int[] {}));
	    int[] tableau = new int[1];
	    tableau[0] = 23;
	    System.out.println(somme(tableau));
	  }
	}
