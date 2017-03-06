package devoir1;


import java.util.Scanner;

/* 
 * Nom:       Bertrand, Jacques
 * Date:      2017-01-30
 * Matricule: BERJ20117704
 * Cours:     INF1563
 * Devoir #1
 * 
 * Cette Classe permet à l'utilisateur de spécifier des secondes et ensuite 
 * le programme donnera le résultat en heure, jours, minutes et secondes. 
 */

public class ConversionSec {

	public static String conversionSec(int sec) {
		int j = sec / (3600 * 24);
		int h = (sec / 3600) % 24;
		int m = (sec % 3600) / 60;
		int s = (sec % 60);
		return j + " jour(s) " + h + " heure(s) " + m + " minute(s) " + s + " seconde(s)";
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrez les secondes :");
		int sec = clavier.nextInt();
		System.out.println(sec + " seconde(s) équivaut à " + conversionSec(sec));
	}
}