package gestion_etudiant.model;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); // System.in = Lecture du Clavier
		
		System.out.println("Taper un nom : ");
		String nom = s.nextLine(); // lecture d'une chaine de caract�re
		System.out.println("Taper un age : ");
		int a = s.nextInt();  // lecture d'un entier
		
		System.out.println("Vous avez taper : "+nom +" "+a);
		
		
		/*
		Etudiant e1 = new Etudiant(); //constructeur par d�faut
		Etudiant e2 = new Etudiant("Ali",24,18.5,"Tunis"); //constructeur avec param�tres
		e1.info();
		e2.info();*/
		
		//Etudiant e3 = new Etudiant("Mohamed",25); 
		
		
		//System.out.println(e1); // adresse m�moire des objets.
		//System.out.println(e2);
		//System.out.println(e3);
		
		//e3.info();
		
		//e1 = e2;
		/*e3 = e2;
		Etudiant e4;  // j'ai d�clar� une r�f�rence de type Etudiant
		e4 = e1;
		e4 = e2;*/
	}

}
