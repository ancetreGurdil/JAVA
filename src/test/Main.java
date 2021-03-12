package test;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Chien un = new Chien (40,12,"Plouf","Fox Terrier");
		Chien deux = new Chien (70,2,"Rex","Berger Allemand");
		Chien trois = new Chien (50,4,"pixou","labrador");
		Chien quatre = new Chien (75,2,"dimitree","Berger Allemand");
		Etudiant guillaume = new Etudiant("KERHERVE","guillaume",19,"BTS SIO, je vais laisser mon/mes chien(s) se présenter");
		Etudiant nathan = new Etudiant("JOUDET","Nathan",20,"BTS SIO , je vais laisser mon/mes chien(s) se présenter ");
		Gorille kong = new Gorille("KONG ","KING ","Gorille ",20);
		MaClasse bts = new MaClasse("BTS");
		//guillaume.sePresenter();
		List<Chien> chenil = new ArrayList<Chien>();
		chenil.add(un);
		chenil.add(deux);
		nathan.ajouterChien(trois);
		nathan.ajouterChien(quatre);
		guillaume.ajouterChien(un);
		guillaume.ajouterChien(deux);
		bts.ajouterEtudiant(guillaume);
		bts.ajouterEtudiant(nathan);
		guillaume.ajouterGorille(kong);
		bts.presenterClasse();
	}	
}