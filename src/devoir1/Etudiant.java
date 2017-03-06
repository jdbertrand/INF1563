package devoir1;

//
//  Nom:        Bertrand, Jacques
//  Matricule:  BERJ20117704
//  Cours:      INF1563
//  Devoir #1
//

public class Etudiant {

	String nom;
	String adresse;
	String code;
	String telephone;

	public Etudiant(String nom, String adresse, String code, String telephone) {
		// Méthode constructeur. Elle est le même nom que la classe.
		this.nom = nom;
		this.adresse = adresse;
		this.code = code;
		this.telephone = telephone;
	}

	public static void setNom(Etudiant e, String v) {
		e.nom = v;
	}

	public static void setAdresse(Etudiant e, String v) {
		e.adresse = v;
	}

	public static void setCode(Etudiant e, String v) {
		e.code = v;
	}

	public static void setTelephone(Etudiant e, String v) {
		e.telephone = v;
	}

	public String getNom(Etudiant e) {
		String nomEtudiant = e.nom;
		return nomEtudiant;
	}

	public String getAdresse(Etudiant e) {
		String adresseEtudiant = e.adresse;
		return adresseEtudiant;
	}

	public String getCode(Etudiant e) {
		String codeEtudiant = e.code;
		return codeEtudiant;
	}

	public String getTelephone(Etudiant e) {
		String telephoneEtudiant = e.telephone;
		return telephoneEtudiant;
	}

	public static void afficher(Etudiant e) {
		// La classe afficher s'occupe d'afficher toutes les donner d'un objet
		// Étudiant précisé
		System.out.println("Dossier Étudiant");
		System.out.println("Nom:      " + e.getNom(e));
		System.out.println("Adresse:  " + e.getAdresse(e));
		System.out.println("Code:     " + e.getCode(e));
		System.out.println("Téléphone:" + e.getTelephone(e));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Un exemple d'obkect Étudiant avec les variables dejà tout programmés
		Etudiant e1 = new Etudiant("Jules Berthelot", "45, rue de Renoir, Gatineau (Québec) J6Y 7F5", "BERJ00000001",
				"819.555.1212");

		// Un exemple d'objet Étudiant avec rien
		Etudiant e2 = new Etudiant(null, null, null, null);

		// c'est la fonction afficher qui s'occupe des fonctions get....
		setAdresse(e2, "234, St-ClinClin, Des Meuh Meuh (Québec) J8Y 7U7");
		setCode(e2, "GIRH20030301");
		setNom(e2, "Horace Girard");
		setTelephone(e2, "613.543.2204");

		afficher(e1);
		System.out.println("");
		afficher(e2);

	}

}
