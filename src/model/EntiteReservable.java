package model;

public abstract class EntiteReservable <T extends Formulaire>{
	private int numID ; 
	protected CalendrierAnnuel calenEntite;
	
	protected EntiteReservable() {
		this.calenEntite = new CalendrierAnnuel();
	}
	public int getNumID() {
		return numID;
	}
	public void setNumID(int numID) {
		this.numID = numID;
	}
	
	public boolean estLibre(T formulaire) {
		return calenEntite.estLibre(formulaire.getJour(), formulaire.getMois());
	}
	
	public abstract boolean compatible(T formulaire);
	public abstract Reservation reserver(T formulaire);

}
