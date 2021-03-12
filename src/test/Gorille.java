package test;

public class Gorille {
	private String nom; 
	private String prenom;
	private String espece;
	private int age;
	
	
	public Gorille (String nom ,String prenom , String espece , int age ) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.espece = espece;
	}
	
	public void presenter() {
		System.out.println("je suis " + nom +" "+ prenom +" et j'ai " + age +" ans , JE SUIS UN  "+ espece );		
	}
	
}
