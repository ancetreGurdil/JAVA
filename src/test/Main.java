package test;


public class Main {
	public static void main(String[] args) {
		Chien un = new Chien (40,12,"Plouf","Fox Terrier");
		Chien deux = new Chien (70,2,"Rex","Berger Allemand");
		Chien trois = new Chien (50,4,"pixou","labrador");
		Chien quatre = new Chien (75,2,"dimitree","Berger Allemand");
		Etudiant guillaume = new Etudiant("KERHERVE","guillaume",19,"BTS SIO, je vais laisser mon/mes chien(s) ou autres se présenter");
		Etudiant nathan = new Etudiant("JOUDET","Nathan",20,"BTS SIO , je vais laisser mon/mes chien(s) ou autres se présenter ");
		Gorille kong = new Gorille("KONG ","KING ","Gorille ",20);
		Gorille Harambe = new Gorille("HARAMBE","LE GORILLE","mort",10);
		MaClasse bts = new MaClasse("BTS");
		nathan.ajouterChien(trois);
		nathan.ajouterChien(quatre);
		guillaume.ajouterChien(un);
		guillaume.ajouterChien(deux);
		bts.ajouterEtudiant(guillaume);
		bts.ajouterEtudiant(nathan);
		guillaume.ajouterGorille(kong);
		nathan.ajouterGorille(Harambe);
		bts.presenterClasse();
	}	
}