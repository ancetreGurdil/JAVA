package test;

import java.util.ArrayList;
import java.util.List;

public class Gorille {
	private String nom; 
	private String prenom;
	private String espece;
	private int age;
	public List<Gorille> zoo;
	
	
	public Gorille (String nom ,String prenom , String espece , int age ) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.espece = espece;
		this.zoo = new ArrayList<>();
	}
	
	public void presenter() {
		System.out.println("je suis " + nom +" "+ prenom +" et j'ai " + age +" ans , JE SUIS UN  "+ espece );
		for (int i=0; i<zoo.size();i++) {
			zoo.get(i).presenter();
		}
		
	}
	
}
