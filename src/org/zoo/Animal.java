package org.zoo;

public abstract class Animal {
	
	// Attributs communs aux animaux 
abstract String couleur;
abstract int poid;

	// Methodes protected requiert un corps
protected void manger() {
}
protected void boire() {
}

	// Methodes abstract
abstract void sedeplacer();
abstract void crier();

	// Méthode toString (hérité de la classe Object) polymorphées
public String toString() {
	String text = " Je suis un objet de la "+this.getClass()+" ,je suis "+this.couleur+" , je pèse: "+this.poid;
	return text;
}

}
