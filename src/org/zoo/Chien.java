package org.zoo;

public class Chien extends Canin {
	
	// Attributs
	
	// Constructeur
	public Chien() {
		// Constructeur par default DOIT etre ecrit SI un autre constructeur suit(Sinon la JVM le fait)
	}
	public Chien(String couleur, int poid) {
		this.couleur = couleur;
		this.poid = poid;
	}
	
	// Méthodes personnelles
	void crier() {
		System.out.println("J'aboie pour communiquer : WAF-WAF !!");
	}
	// Getters et Setters
	
	// hashCode, equals et toString
	
}
