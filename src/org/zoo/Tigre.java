package org.zoo;

public class Tigre extends Felin {

	
	public Tigre() {
		
	}
	public Tigre(String couleur, int poid) {
		this.couleur = couleur;
		this.poid = poid;
	}
	void crier() {
		System.out.println("Je grogne RRRRRRRRRRR ! ");
	}
}
