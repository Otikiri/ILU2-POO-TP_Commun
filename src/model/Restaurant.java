package model;

public class Restaurant {
	private CentraleReservation<EntiteReservable<FormulaireRestaurant>, FormulaireRestaurant> centreserv = 
			new CentraleReservation(new Table[100]);

	public int ajouterTable(int nbChaises) {
		return centreserv.ajouterEntite(new Table(nbChaises));
	}
	
	public int[] donnerPossibilite(FormulaireRestaurant formulaire) {
		return centreserv.donnerPossibilite(formulaire);
	}
	
	public Reservation reserver(int nbEntite, FormulaireRestaurant formulaire) {
		return centreserv.reserver(nbEntite, formulaire);
	}
	
	
	private static class Table extends EntiteReservable <FormulaireRestaurant> {
		private int nbChaise = 0;
		private CalendrierAnnuel calenDeuxieme = new CalendrierAnnuel();
		
		public Table(int nbChaise) {
			this.nbChaise = nbChaise;
		}

		@Override
		public boolean compatible(FormulaireRestaurant formulaire) {
			boolean isAvaiService1 = false;
			boolean isAvaiService2 = false;
			if (estLibre(formulaire) && formulaire.getNumService()==1){
				isAvaiService1 = true;
			}
			if (calenDeuxieme.estLibre(formulaire.getJour(), formulaire.getMois())) {
				isAvaiService2 = true;
			}
			return nbChaise == formulaire.getNombrePersonnes() || nbChaise+1==formulaire.getNombrePersonnes() 
					&& (isAvaiService1 || isAvaiService2);
		}

		@Override
		public Reservation reserver(FormulaireRestaurant formulaire) {
			// TODO Auto-generated method stub
			return null;
		}
	
	}
}
