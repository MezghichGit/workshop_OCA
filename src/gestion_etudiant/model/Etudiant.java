package gestion_etudiant.model;

public class Etudiant {
	String nom;
	int age;
	double moyenne;
	String adresse;
	
	// Une méthode
	public void info(){
		System.out.println("Nom = "+ this.nom+ " Age = "+this.age+" Moyenne = "+this.moyenne+ " Adresse = "+this.adresse);
	}
	
	// Constructeur par défaut
	public Etudiant()
	{
		System.out.println("Constructeur par defaut avec 0 paramètres");
	}
	
	// Constructeur avec paramètres
	public Etudiant(String nom, int age, double moy, String adr)
	{
	  System.out.println("Constructeur avec 4 paramètres");
	    this.nom = nom;
	    this.age = age;
	    this.moyenne = moy;
	    this.adresse = adr;
	}
	
	public Etudiant(String nom, int age)
	{
	  System.out.println("Constructeur avec 2 paramètres");
	    this.nom = nom;
	    this.age = age;
	}
}
