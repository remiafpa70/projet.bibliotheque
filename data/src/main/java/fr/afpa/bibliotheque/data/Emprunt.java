package fr.afpa.bibliotheque.data;

import java.util.Date;

import lombok.Data;

@Data
public class Emprunt {
	
	private int idemprunt;
	private Date dateemprunt;
	private int fk_idutilisateur;
	private int fk_idexemplaire;

}
