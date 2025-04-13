package model;

public class CentraleReservation <S extends Formulaire> {
	private EntiteReservable<S>[] tableEntite;
	private int nbEntite = 0;
	public CentraleReservation(int nbTotalEntite) {
		this.tableEntite = new EntiteReservable[nbTotalEntite];
	}
	
	public void ajouterEntite(EntiteReservable<S> entite) {
		tableEntite[nbEntite] = entite;
	}
	
	
}
