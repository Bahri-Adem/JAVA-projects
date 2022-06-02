package TP5;

import java.util.*;

public class Etagere {
	Hashtable<Integer, Livre> map = new Hashtable<Integer, Livre>();
	public void ajouterLivre(Livre unLivre) {
		map.put(unLivre.getIsbn(),unLivre);
	}
	public void retirerLivre(int isbn) {
		map.remove(isbn);
	}
	public Livre getLivreByTitle(String titre) {
		for(Livre L:  this.map.values() ) {
			if (L.getTitre() == titre) {
				return L;
			}
		}
		return null;
	}
	public int NombreLivre() {
		return map.size();
	}
	public String toString() {
		return "Etager [map=" + map + "]";
	}
	public boolean estPresent(Livre unLivre) {
		return map.containsValue(unLivre);
	}
}