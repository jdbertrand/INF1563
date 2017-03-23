package Intra;

public class Rectangle {

	private double longueur = 1;
	private double largeur = 1;

	public static double MIN_LONGUEUR = 1;
	public static double MIN_LARGUEUR = 1;
	public static double MAX_LONGUEUR = 22;
	public static double MAX_LARGEUR = 12;
	
	public Rectangle() {
		// Constructeur
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r = new Rectangle();
		r.setLongueur(3);
		r.setLargeur(1);

		System.out.println("Rectangle : " + r.toString() 
		+ ", périmètre = " + r.perimetre() + ", aire = " + r.aire());

		r.zoomer(300);

		System.out.println("Rectangle : " + r.toString() 
		+ ", périmètre = " + r.perimetre() + ", aire = " + r.aire());

		r.setLongueur(25.5);
		r.setLargeur(1.5);

		System.out.println("Rectangle : " + r.toString() 
		+ ", périmètre = " + r.perimetre() + ", aire = " + r.aire());
		r.zoomer(80);
		System.out.println("Rectangle : " + r.toString() 
		+ ", périmètre = " + r.perimetre() + ", aire = " + r.aire());
		r.zoomer(40);
		System.out.println("Rectangle : " + r.toString() 
		+ ", périmètre = " + r.perimetre() + ", aire = " + r.aire());

	}

	public void setLargeur(double larg) {
		// La méthode setLargeur change la valeur seulement si entre 1 et 12
		if (larg > MAX_LONGUEUR) {
			System.out.println("La largeur demandée est trop grande! L'appel n'est pas exécuté.");
		} else if (larg < MIN_LARGUEUR) {
			System.out.println("La largeur demandée est trop petite! L'appel n'est pas exécuté.");
		} else {
			this.largeur = larg;
		}

	}

	public void setLongueur(double longueur) {
		// La méthode setLongueur change la valeur seulement si entre 1 et 22
		if (longueur > MAX_LARGEUR) {
			System.out.println("La longueur spécifiée est trop grande! L'appel n'est pas exécuté.");
		} else if (longueur < MIN_LONGUEUR) {
			System.out.println("La longeur spécifiée est trop petite! L'appel n'est pas exécuté.");
		} else {
			this.longueur = longueur;
		}
	}

	public double getLongueur() {
		// Methode accessor pour la Longueur
		return longueur;
	}

	public double getLargeur() {
		// Methode Accessor pour la Largeur
		return largeur;
	}

	public void zoomer(double z) {
		// Methode qui permet de zoomer
		z = z / 100;

		double longueurZoom = getLongueur() * z;
		double largeurZoom = getLargeur() * z;

		setLongueur(longueurZoom);
		setLargeur(largeurZoom);

	}

	public String aire() {
		// Formule de l'aire
		// Longueur * Largeur
		double aire = getLongueur() * getLargeur();
		return String.format("%.4f", aire);

	}

	public String perimetre() {
		// Formule du perimetre
		// 2L + 2l
		double aire = (2 * getLongueur()) + (2 * getLargeur());
		return String.format("%.2f", aire);
	}

	@Override
	// Override de la fonction toString
	public String toString() {
		return "[Longueur: " + String.format("%.2f", getLongueur()) + ", Largeur: " + String.format("%.2f", getLargeur()) + "]";
	}

}
