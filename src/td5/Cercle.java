package td5;

public class Cercle {

	private double rayon;
	private int ptX, ptY;
	
	public Cercle() {
		// Constructor
	}

	public static void main(String[] args) {
		Cercle c = new Cercle();
		c.setRayon(3);
		c.setCentre(1, 3);
		System.out.println("Cercle : " + c.toString() + ", périmètre = " + c.perimetre() + ", aire = " + c.aire());
		c.zoomer(200); // 200%
		c.setCentre(2, 4);
		System.out.println("Cercle : " + c.toString() + ", périmètre = " + c.perimetre() + ", aire = " + c.aire());
	}

	@Override
	public String toString() {
		return "[(" + ptX + "," + ptY + ")," + rayon + "]";
	}

	public String aire() {
		// Formule de l'aire
		// Rayon * Rayon * Pi
		double aire = Math.pow(rayon, 2) * Math.PI;
		return String.format("%.4f", aire);
	}

	public String perimetre() {
		double perimetre = Math.PI * 2 * rayon;
		return String.format("%.4f", perimetre);
	}

	public void zoomer(double r) {
		r = r / 100;
		this.rayon = rayon * r;
	}

	public void setCentre(int i, int j) {
		this.ptX = i;
		this.ptY = j;
	}

	public void setRayon(double r) {
		this.rayon = r;
	}

}