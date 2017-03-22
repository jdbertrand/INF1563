package td8;

public class Inversion {
	  static int[] tab1 = new int[]{1, 2, 3, 4, 5};
	  static int[] tab2 = new int[]{1, 2, 3, 4, 5, 6};
	  static int[] tab3 = new int[]{1, 2, 3, 4, 5};
	  static int[] tab4 = new int[]{1, 2, 3, 4, 5, 6};

	  // Inversion d'un tableau en utilisant un second tableau
	  public static void inversion1(int[] tab){
	    int[] tab2 = new int[tab.length];
	    for (int i=0; i<tab.length; i++)
	      tab2[i] = tab[i];
	    for (int i=0; i<tab.length; i++){
	      tab[i] = tab2[tab.length -1 -i];
	    }
	  }

	  // Inversion d'un tableau sans utilisation d'un nouveau tableau
	  public static void inversion2(int[] tab){
	    for (int i=0; i<tab.length/2; i++){
	      int temp = tab[i];
	      tab[i] = tab[tab.length -1 -i];
	      tab[tab.length -1 -i] = temp;
	    }
	  }

	  public static void impression(int[] tab){
	    for (int i=0; i<tab.length; i++){
	      System.out.print(tab[i] + " ");
	    }
	    System.out.println();
	  }

	  public static void main(String[] args){
	    System.out.println("L'inversion en utilisant un second tableau");
	    System.out.print("tab1 avant l'inversion = ");
	    impression(tab1);
	    inversion1(tab1);
	    System.out.print("tab1 après l'inversion = ");
	    impression(tab1);

	    System.out.print("tab2 avant l'inversion = ");
	    impression(tab2);
	    inversion1(tab2);
	    System.out.print("tab2 après l'inversion = ");
	    impression(tab2);

	    System.out.println("L'inversion sans utilisation d'un nouveau tableau");
	    System.out.print("tab3 avant l'inversion = ");
	    impression(tab3);
	    inversion2(tab3);
	    System.out.print("tab3 après l'inversion = ");
	    impression(tab3);

	    System.out.print("tab4 avant l'inversion = ");
	    impression(tab4);
	    inversion2(tab4);
	    System.out.print("tab4 après l'inversion = ");
	    impression(tab4);
	  }
	}
