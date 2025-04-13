package model;

public abstract class Formulaire {
	protected int jour; 
	protected int mois; 
	protected int nbEntite;
	
	protected Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getIdentificationEntite() {
		return nbEntite;
	}

	public void setIdentificationEntite(int nbEntite) {
		this.nbEntite = nbEntite;
	} 
}
