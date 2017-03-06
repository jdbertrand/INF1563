package devoir2;

//
//Nom:        Bertrand, Jacques
//Matricule:  BERJ20117704
//Cours:      INF1563
//Devoir #1
//
// Importtion de util.Random pour générer sans avoir à l'affecter avec des opérations mathématiques
// mais le devoir voulait qu'on utilise Math.random alors c'est ce que j'ai fait. 
// import java.util.Random;
import java.util.*;

public class Decouverte {

	private static Scanner sc;

	public Decouverte() {
		// Constructor vide
	}

	// Cette methode faisait utilisation de randomGenerator au lieu de
	// Math.radom
	/*
	 * public static int ChoisirNombre() { Random randomGenerator = new
	 * Random(); int valeurChoisie = randomGenerator.nextInt(100); return
	 * valeurChoisie;
	 * 
	 * }
	 */

	public static int ChoisirNombre() {
		double x;
		x = (Math.random() * 100) + 1;
		return (int) x;

	}

	public static String EvaluerNombre(int valEntree, int valChoisie) {
		String strMessage = null;
		if (valEntree > valChoisie) {
			strMessage = "Trop grand";

		} else {
			strMessage = "Trop petit";
		}
		return strMessage;
	}

	public static void main(String[] args) {
		// Initialisation des variables et
		// appel de la méthode qui permettra de choisir le nombre entre 1 et 100
		int essai = 0;
		int valEntree = 0;
		int valChoisie = ChoisirNombre();

		// Ecriture des instructions à l'écran
		System.out.println("Le but est de chercher un nombre entre 1 et 100");

		// Boucle while qui continue tant que le nombre deviné n'est pas celui
		// choisi aléatoirement!
		do {
			System.out.println("Tapez un nombre: ");
			sc = new Scanner(System.in);
			valEntree = sc.nextInt();
			if (valChoisie != valEntree) {
				// Appel de la méthode EvaluerNombre avec les deux paramètres
				// d'entrées qui sont évalués.
				// On aurait été capable de mettre tout dans le main, mais j'ai
				// poussé afin de pratiquer l'organisation.
				String reponse = EvaluerNombre(valEntree, valChoisie);
				System.out.println(reponse);
			}

			// Incrémentation du compteur pour chaque essai
			essai++;

		} while (valChoisie != valEntree);
		//
		System.out.println("Félicitations ! Vous l'avez trouvé en " + essai + " essai(s).");

	}

}
