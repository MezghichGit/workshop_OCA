package gestion_etudiant.model;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		Scanner s = new Scanner(System.in); // System.in = Lecture du Clavier
		
		System.out.println("Taper un nom : ");
		String nom = s.nextLine(); // lecture d'une chaine de caractère
		
		System.out.println("Taper un age : ");
		int a = s.nextInt();  // lecture d'un entier
		
		System.out.println("Taper La moyenne : ");
		double m = s.nextDouble(); 
		s.nextLine();
		System.out.println("Taper une adresse : ");
		String adr = s.nextLine();
		*/
		
		//System.out.println("Vous avez taper : "+nom +" "+a);
		//System.out.println("Vous avez taper : "+m +" "+adr);
		//Etudiant e = new Etudiant(nom,a,m,adr);
		//e.info();
	
		Etudiant e2 = new Etudiant("Ali",24,18.5,"Tunis"); //constructeur avec paramètres
		e2.info();
		//e2.age = 29;
		
		Scanner s = new Scanner(System.in);
		int a=0;
		/*do {
		     System.out.println("Taper un age : ");
		     a = s.nextInt();
		}while(a<18 || a>28);*/
		e2.setNom("AABBCCDD");
		e2.info();
		//e2.age = -5000;
		//e2.setAge(-200);
		//e2.adresse = "France";
		//e2.info();
		//e2.nom = "Sami";
		//e2.info();
		//System.out.println("Age de e2 = "+e2.getAge());
		/*
		Etudiant e1 = new Etudiant(); //constructeur par défaut
		
		e2.info();*/
		
		//Etudiant e3 = new Etudiant("Mohamed",25); 
		
		
		//System.out.println(e1); // adresse mémoire des objets.
		//System.out.println(e2);
		//System.out.println(e3);
		
		//e3.info();
		
		//e1 = e2;
		/*e3 = e2;
		Etudiant e4;  // j'ai déclaré une référence de type Etudiant
		e4 = e1;
		e4 = e2;*/
	}

}
