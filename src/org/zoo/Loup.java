package org.zoo;

public class Loup extends Canin {

	public Loup() {
		// Constructeur par default DOIT etre ecrit SI un autre constructeur suit(Sinon la JVM le fait)
	}
	public Loup(String couleur, int poid) {
		this.couleur = couleur;
		this.poid = poid;
	}
	void crier() {
		System.out.println("J'hurle : HAOUUU-HAOUUU ");
	}
}
