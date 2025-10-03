package Tp4.Ex2;

public class Animal {
	private final int id;
	protected String nom;
	protected int age;
	private static int compteur = 0;
	
	public Animal(String nom, int age) {
		this.nom = nom;
		this.age = age;
		this.id = ++compteur;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void seDeplacer() {
		System.out.println(this.nom + " se deplace");
	}
	
	@Override 
	public String toString() {
		return "Animal[id=" + this.id + ", nom=" + this.nom
				+ ", age=" + this.age +"]";
	}
}
