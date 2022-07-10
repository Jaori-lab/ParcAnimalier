package org.zoo;

public class Lion extends Felin {

	public Lion() {
		// Constructeur par default DOIT etre ecrit SI un autre constructeur suit(Sinon la JVM le fait)
	}
	public Lion(String couleur, int poid) {
		this.couleur = couleur;
		this.poid = poid;
	}
	void crier() {
		System.out.println("Je rugis en faisant ROOOOOWWWWWWWWW ! ");
	}
}
