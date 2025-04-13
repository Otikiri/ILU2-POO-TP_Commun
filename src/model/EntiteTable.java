package model;

public class EntiteTable extends EntiteReservable<FormulaireRestaurant>{
	private int nbTable;
	private int nbService;
	

	public EntiteTable(int nbTable,int nbService) {
		super();
		this.nbTable = nbTable;
		this.nbService = nbService;
	}
	
	public int  getTable() {
		return nbTable;
	}

	@Override
	public boolean compatible(FormulaireRestaurant formulaire) {
		return formulaire.getNumService() == nbService && calenEntite.estLibre(formulaire.getJour(),formulaire.getMois());
	}

	@Override
	public Reservation reserver(FormulaireRestaurant formulaire) {
		if (calenEntite.reserver(formulaire.getJour(),formulaire.getMois())) {
			return new ReservationRestaurant(formulaire.getJour(),formulaire.getMois(), nbService, nbTable);
		}
		else {
			return null;
		}
	}
	
}
