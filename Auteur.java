package TP5;

public class Auteur {
	private String nom,email;
	private char genre;
	public Auteur(String nom,String email,char genre) {
		this.nom=nom;
		this.email=email;
		this.genre=genre;
	}
	public String getName() {
		return this.nom;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String e) {
		this.email=e;
	}
	public String toString() {
		if(genre == 'F') {
			return "Mme. "+this.nom+" (" +this.email+")";
		}
		else {
			return "M. "+this.nom+" (" +this.email+")";
		}
	}
}
