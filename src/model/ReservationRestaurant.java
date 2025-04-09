package model;

public class ReservationRestaurant extends Reservation {
	private int numbTable;
	private int numService;
	
	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour, mois);
		this.numbTable = numTable;
		this.numService = numService;
	}
	@Override
	public String toString() {
		if (numService == 1) {
			return "Le "+this.getJour()+"/"+this.getMois()+"\nTable "+numbTable+" pour le premier service.";
		}
		if (numService == 2) {
			return "Le " +this.getJour()+"/"+this.getMois()+"\nTable "+numbTable+" pour le deuxième service.";
		}
		return "Num de service invalide";
	}
	
}
