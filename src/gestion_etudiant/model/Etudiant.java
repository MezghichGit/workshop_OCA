package gestion_etudiant.model;

public class Etudiant {
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		if(nom.length()>= 8 && nom.length()<=30)
		   this.nom = nom;
		else
			System.out.println("Nom invalide");
	}

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	// attributs d'instance(caractérisque de chaque objet Etudiant)
	private String nom;
	private int age;
	private double moyenne;
	public String adresse;

	public void setAge(int a) {
		if (a > 18 && a < 28) {
			this.age = a;
		} else
			System.out.println("Valeur invalide");
	}
	
	public int getAge()
	{
		return this.age;
	}

	// Une méthode
	public void info() {
		System.out.println("Nom = " + this.nom + " Age = " + this.age + " Moyenne = " + this.moyenne + " Adresse = "
				+ this.adresse);
	}

	// Constructeur par défaut
	public Etudiant() {
		System.out.println("Constructeur par defaut avec 0 paramètres");
	}

	// Constructeur avec paramètres
	public Etudiant(String nom, int age, double moy, String adr) {
		System.out.println("Constructeur avec 4 paramètres");
		this.nom = nom;
		this.age = age;
		this.moyenne = moy;
		this.adresse = adr;
	}

	public Etudiant(String nom, int age) {
		System.out.println("Constructeur avec 2 paramètres");
		this.nom = nom;
		this.age = age;
	}
}
