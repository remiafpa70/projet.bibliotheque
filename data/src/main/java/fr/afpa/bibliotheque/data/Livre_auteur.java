package fr.afpa.bibliotheque.data;

import lombok.Data;

@Data
public class Livre_auteur {
	
	private int fk_idlivre;
	private int fk_idauteur;

}
