package model;

public class Restaurant {
	private CentraleReservation<EntiteReservable<Formulaire>, Formulaire> centreserv;
	private Table[] nbTable;
	
	private static class Table{
		private int nbChaise = 0;
		private EntiteReservable<Formulaire> er;
		
		public void Table(int nbChaise) {
			this.nbChaise = nbChaise;
		}
		//TODO
	}
}
