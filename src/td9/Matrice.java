package td9;

public class Matrice {

	  static public void add(int A[][], int B[][], int C[][]){

	  }

	  static public void mult(int A[][], int B[][], int C[][]){

	  }

	  static public void imprimer(int A[][]){

	  }

	  public static void main(String[] args){
	    int A[][] = {{0, 1}, {2, 4}};
	    int B[][] = {{1, 1}, {2, 3}};
	    int C[][] = new int[2][2];
	    System.out.println("A :");
	    imprimer(A);
	    System.out.println("B :");
	    imprimer(B);
	    System.out.println("A + B :");
	    add(A, B, C);
	    imprimer(C);
	    System.out.println("A * B :");
	    mult(A, B, C);
	    imprimer(C);
	  }
	}
	/* Sortie du programme :
	A :
	 0 1
	 2 4
	B :
	 1 1
	 2 3
	A + B :
	 1 2
	 4 7
	A * B :
	 2 3
	 10 14
	*/
