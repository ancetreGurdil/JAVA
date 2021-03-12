package test;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
		private String nom;
		private String prenom;
		private int age;
		private String classe;
		private List<Chien>chiens;
		private List<Gorille>zoo;

	public Etudiant(String nom,String prenom,int age,String classe) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.classe = classe;
		this.chiens = new ArrayList<>();
		this.zoo = new ArrayList<>(); 
		          
		
	}
	
	public void sePresenter() {
		System.out.println("je suis " + nom +" "+ prenom +" et j'ai " + age +" ans je suis dans la classe de "+ classe );
		for (int i = 0;i<chiens.size();i++) {
			chiens.get(i).sePresenter();
		}
		for (int i=0; i<zoo.size();i++) {
			zoo.get(i).presenter();
		}	
	}
	public void ajouterChien(Chien chien) {
		chiens.add(chien);
	}
	public void retirerChien(int numeroChien) {
		chiens.remove(numeroChien);
	}
	public void ajouterGorille(Gorille gorille) {
		zoo.add(gorille);
	}
	public void retirerGorille(int numeroChien) {
		zoo.remove(numeroChien);
	}
}