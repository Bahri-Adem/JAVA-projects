package TP5;

public class TestBiblio {
	public static void main(String[] args) {
	Auteur A1 = new Auteur("Adem","@gmail",'H');
	Auteur A2 = new Auteur("Rym","@yahoo",'F');
	Auteur A3 = new Auteur("Wadhah","@enis",'H');
	Auteur A4 = new Auteur("Jihene","@jiji",'F');
	Auteur A5 = new Auteur("Hechem","@tired",'H');
		Etagere E = new Etagere();
		Livre L1 = new Livre("The house",123);
		L1.addAuteur(A1);
		L1.addAuteur(A2);
		L1.addAuteur(A3);
		Livre L2 = new Livre("The University",456);
		L2.addAuteur(A4);
		L2.addAuteur(A5);
		E.ajouterLivre(L1);
		E.ajouterLivre(L2);
		System.out.println(E.estPresent(L1));
		System.out.println(L1.toString());
		System.out.println(E.estPresent(L2));
		System.out.println(L2.toString());
		L1.removeAuteur(A3);
		System.out.println(L1.toString());
		L2.removeAuteurByName("Jihene");
		System.out.println(L2.toString());
		System.out.println(L1.egal(L2));
		System.out.println(E.toString());
		System.out.println(E.NombreLivre());
		System.out.println(E.getLivreByTitle("The house"));
		}
}