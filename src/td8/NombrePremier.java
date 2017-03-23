package td8;

import java.util.ArrayList;

public class NombrePremier {
    public static void main(String[] args) {
        int nbMax = 120;

        System.out.println("Generer une liste des nombres premiers.");

        ArrayList<Integer> tableau = new ArrayList<Integer>();

        for (int n = 3; n < nbMax; n++) {
            boolean nbPremier = true;
            // analyser si n is premier

            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                	nbPremier = false;
                    break; // exit the inner for loop
                    }
            }
            if (nbPremier) {
            	tableau.add(n);
            }
        }
        for (int i : tableau) {
            System.out.println(i + " ");
        }
    }
}
