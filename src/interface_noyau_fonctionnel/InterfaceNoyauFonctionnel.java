package interface_noyau_fonctionnel;

import java.util.Random;

public class InterfaceNoyauFonctionnel {

    public String[] trouverTableDisponible(int jour, int mois, int nombrePersonnes, String time) {
 
        if (nombrePersonnes>=1 && nombrePersonnes<=4) {
            return new String[] {"Table 1","Table 2", "Table 3", "Table 4", "Table 5"};
        }
        return new String[] {"Table 6"};
    }
    public String[] trouverHeureDisponible(int jour, int mois){
        return new String[]{"12:00","13:00","13:30","18:00"};
    }
    public String[] trouverNbPersonneDisponible(int jour, int mois,String time){
        String[] nbTable = new String[]{"1","2","3","4","5","6","7","8"};
        Random rnd = new Random();
        int size = rnd.nextInt(8);
        while (size==0) {
            size = rnd.nextInt();
        }
        
        String[] table = new String[size];
        for (int i = 0; i < table.length; i++) {
            int indTable = rnd.nextInt(8);
            table[i] = nbTable[indTable];
        }
        return table;
    }
    public String reserve(int jour,String mois,String time,int nbPeople, int nbTable){
        return ("Réservation confirmée pour le "+jour+" "+mois+" 2025 à "+time+" pour "+nbPeople+" personnes à la Table "+nbTable);
    }
    
}
