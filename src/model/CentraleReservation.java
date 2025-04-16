package model;

public class CentraleReservation <G extends EntiteReservable<S>,S extends Formulaire> {
	private G[] tableEntite;
	private int nbEntite =0;
	
	public CentraleReservation(G[] entite) {
		this.tableEntite =  entite;
	}
	
	public int ajouterEntite(G entite) {
		int nbEntiteAdded = nbEntite;
		tableEntite[nbEntiteAdded] = entite;
		++nbEntite;
		return nbEntiteAdded;
	}
	
	public int [] donnerPossibilite(S formulaire) {
		int[] nbtabledispo = new int[nbEntite];
		for (int i = 0; i < tableEntite.length; i++) {
			if (tableEntite[i].compatible(formulaire)) {
				nbtabledispo[i] = i;
			}
			else{
				nbtabledispo[i] = 0;
			}
		}
		return nbtabledispo;
	}
	
	public Reservation  reserver(int nbEntite, S formulaire) {
		G reserved = tableEntite[nbEntite];
		formulaire.setIdentificationEntite(nbEntite);
		return reserved.reserver(formulaire);
	}
}
