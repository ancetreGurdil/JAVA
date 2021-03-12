package test;

import java.util.ArrayList;
import java.util.List;

public class MaClasse {
		public String libelle;
		public List<Etudiant> etudiants;
		
		public MaClasse(String libelle) {
			this.libelle = libelle;
			this.etudiants = new ArrayList<>();
			
		}
		
		public Etudiant getEtudiant(int index) {
			return etudiants.get(index);
		}
		public void ajouterEtudiant(Etudiant etudiant) {
			etudiants.add(etudiant);
		}
		public void retirerEtudiant (int numeroEtudiant) {
			etudiants.remove(numeroEtudiant);
		}
		public void presenterClasse() {
			System.out.println("voici la classe de " + libelle);
			for (int i=0;i<etudiants.size();i++) {
				etudiants.get(i).sePresenter();
			}	
		}
}