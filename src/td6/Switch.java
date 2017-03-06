package td6;

import java.util.GregorianCalendar;

public class Switch {

	static int nbJours(int mois, int annee) {
		int nbJours = 0;
		int noMois = mois, annees = annee;
		switch (noMois) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: {
			nbJours = 31;
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11: {
			nbJours = 30;
			break;
		}
		case 2: {
			GregorianCalendar cal = new GregorianCalendar();

			if (cal.isLeapYear(annees)) {
				nbJours = 29;
			} else {
				nbJours = 28;
			}
			break;
		}
		default:
			nbJours = 0;
			break;

		}
		return nbJours;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int ligne = 0; ligne < 8; ligne++) {
			if (ligne % 2 == 0) {
				for (int col = 0; col < 8; col++) {

					System.out.print(' ');
					System.out.print((char) 9632);
				}
			} else {
				for (int col = 0; col < 8; col++) {
					System.out.print((char) 9632);
					System.out.print(' ');

				}
			}

			System.out.println();
		}
		// System.out.println("Nombre de jours :" + nbJours(2, 2432));
	}

}
