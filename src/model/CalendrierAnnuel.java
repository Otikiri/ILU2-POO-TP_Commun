package model;



public class CalendrierAnnuel {
	
	private Mois[] mois = new Mois[12];
	
	public CalendrierAnnuel() {
		mois[0] = new Mois(31,"Janvier");
		mois[1] = new Mois(28,"Fevrier"); 
		mois[2] = new Mois(31,"Mars");
		mois[3] = new Mois(30,"Avril");
		mois[4] = new Mois(31,"Mais");
		mois[5] = new Mois(30,"Juin");
		mois[6] = new Mois(31,"Juillet");
		mois[7] = new Mois(31,"Aout"); 
		mois[8] = new Mois(30,"Septembre");
		mois[9] = new Mois(31,"Octobre");
		mois[10] = new Mois(30,"Novembre");
		mois[11] = new Mois(31,"Juin");
	}
	
	
	public boolean estLibre(int nbJour, int nbmois) {
		return mois[nbmois-1].estLibre(nbJour);
	}
	public boolean reserver(int nbJour, int nbMois) {
		try {
			mois[nbMois-1].reserver(nbJour);
		}
		catch (Exception e) {
			//System.out.println("La date "+nbJour+" du mois "+nbMois+" n'est pas reservable");
			return false;
		}
		return true; 
	}
	
	
	private static class Mois{
		private boolean[] jour; 
		private String nom;
		
		private Mois(int nbjour, String nom) {
			this.jour = new boolean[nbjour];
			this.nom = nom;
			for (int i = 0; i < this.jour.length; i++) {
				jour[i]=true;
			}
		}
		
		private boolean estLibre(int nbjour) {
			return jour[nbjour-1];
		}
		
		private void reserver(int nbjour) {
			if (!estLibre(nbjour)) {
				throw new IllegalStateException();
			}
			else {
				jour[nbjour-1] = false;
			}
		}	
	}
}
