package devoir3;

import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.*;

public class Calendrier extends JApplet {
	
	public Calendrier(){
		//Constructeur
	}
	
	// Variable d'instances
	GregorianCalendar calendar = new GregorianCalendar();
	int rangee = 7;
	int colonne = 7;
	//Tableau pour 
	String[] jourSemaine = {"Lu", "Ma", "Me", "Je", "Ve", "Sa", "Di" };
	
	//Interface utilisateur en Applet
	JLabel[][] grid = new JLabel[rangee][colonne];
	JLabel jlblHeure = new JLabel("Heure: " + "" + calendar.get(GregorianCalendar.HOUR_OF_DAY) + ":"
			+ calendar.get(GregorianCalendar.MINUTE));
	JPanel jpnlCalendar = new JPanel(new GridLayout(7, 7));
	JPanel jpnlHeure = new JPanel(new GridLayout(1, 1));
	
	//Paramètres pour la date d'aujourd'hui en utilisant GregorianCalendar
	int today = calendar.get(GregorianCalendar.DAY_OF_MONTH);
	int daysInMonth = calendar.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
	int daysInWeek = calendar.get(GregorianCalendar.DAY_OF_WEEK);

	//Methode d'initialisation
	public void init() {
		// setting grid
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				grid[i][j] = new JLabel();
			}

		}
		// Tableau 2 dimensions pour la grille 
		Container contenu = getContentPane();
		for (int i = 0; i < rangee; i++) {
			for (int j = 0; j < colonne; j++) {
				jpnlCalendar.add(grid[i][j]);
			}
		}
		// Ajout des JPanel
		contenu.add(jpnlCalendar);
		contenu.add(jpnlHeure, "South");
		jpnlHeure.add(jlblHeure);

		// Dessin de l'heure
		if (calendar.get(GregorianCalendar.MINUTE) < 10) {
			jlblHeure = new JLabel("Heure: " + "" + calendar.get(GregorianCalendar.HOUR_OF_DAY) + ":" + "0"
					+ calendar.get(GregorianCalendar.MINUTE));
		}
		// Dessin de l'entête des demaines
		for (int i = 0; i < jourSemaine.length; i++) {
			grid[0][i].setText(jourSemaine[i]);
		}
		// conditions for the calendar
		calendar.set(GregorianCalendar.DAY_OF_MONTH, 1);
		int daysInWeek = calendar.get(GregorianCalendar.DAY_OF_WEEK) - 1;
		System.out.print(daysInWeek);
		if (daysInWeek == 0)
			daysInWeek = 7;
		calendar.set(GregorianCalendar.DAY_OF_MONTH, today);

		int days = 1;

		for (int k = daysInWeek - 1; k < colonne; k++) {
			grid[1][k].setText(days + "");
			if (days == today)
				grid[1][k].setText(days + "*");
			days++;
		}
		// Dessin du calendrier dans deux boucles imbriquées
		for (int i = 2; i <= colonne; i++) {
			for (int j = 0; j < rangee; j++) {
				if (days <= daysInMonth) {
					grid[i][j].setText(Integer.toString(days));
					if (days == today)
						grid[i][j].setText(Integer.toString(days) + "*");
					days++;
				}
			}
		}

	}
}