package TP5;

import java.util.ArrayList;

public class Livre {
	private String titre;
	private int isbn;
	public ArrayList<Auteur>aut;
	public Livre(String titre,int isbn) {
		this.titre=titre;
		this.isbn=isbn;
		aut=new ArrayList<Auteur>();
		}
	public String getTitre() {
		return this.titre;
	}
	public ArrayList<Auteur> getAuteurs() {
		return this.aut;
	}
	public int getIsbn() {
		return this.isbn;
	}
	public void addAuteur(Auteur a) {
		aut.add(a);
	}
	public void removeAuteur(Auteur a) {
		int pos=aut.indexOf(a);
		aut.remove(pos);
	}
	public void removeAuteurByName(String nom) {
		for (int i=0;i<aut.size();i++) {
			if((aut.get(i)).getName() == nom) {
				aut.remove(i);
				break;
			}
		}
	}
	public String toString() {
		return "Le titre du livre d'isbn  "+this.isbn+" est "+this.titre+" et son auteur s'appelle: "+this.getAuteurs();
	}
	public boolean egal(Livre unAutreLivre) {
		if (this.isbn==unAutreLivre.isbn)
			return true;
		else 
			return false;	
	}
}