package org.zoo;

public class Chat extends Felin {

	public Chat() {
		
	}
	public Chat(String couleur, int poid) {
		this.couleur = couleur;
		this.poid = poid;
	}
	void crier() {
		System.out.println("Je miaule ! ");
	}
}
