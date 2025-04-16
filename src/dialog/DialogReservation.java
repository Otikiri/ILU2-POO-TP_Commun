/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import interface_noyau_fonctionnel.InterfaceNoyauFonctionnel;
import java.awt.EventQueue;
import java.time.LocalDate;
import javax.swing.DefaultComboBoxModel;
import presentation.FrameReservation;

public class DialogReservation {

    private FrameReservation frameReservation;
    private InterfaceNoyauFonctionnel inf;

    public DialogReservation(InterfaceNoyauFonctionnel inf) {
        this.inf = inf;
    }

    public void initDialog() {
        frameReservation = new FrameReservation();
        frameReservation.initFrame();
        frameReservation.setDialog(this);
        frameReservation.setVisible(true);
    }

    public void handleDateSelectedEvent(LocalDate date) {
        int day = date.getDayOfMonth(); 
        int month = date.getMonthValue();
        String[] hourTable = inf.trouverHeureDisponible(day, month);
        frameReservation.modifyHour(hourTable);
        
    }

    public void handleTimeSelectedEvent(LocalDate date,String time) {
        int day = date.getDayOfMonth(); 
        int month = date.getMonthValue(); 
        String[] nbPersonne = inf.trouverNbPersonneDisponible(day, month, time);
        frameReservation.modifyNbPeople(nbPersonne);
    }
    

    public void handleNumOfPersonsSelectedEvent(LocalDate date , String time , int nbPersons) {
        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        String[] nbTable = inf.trouverTableDisponible(day, month, nbPersons, time);
        frameReservation.modifyNbtable(nbTable);
    }

    public void handleTableSelectedEvent(int numTable) {
        if (numTable>=1&&numTable<=6) {
            frameReservation.modifyConfButton();
        }
    }

    public void handleCancelEvent() {
        frameReservation.modifyAllCancel();
    }

    public void handleValidationEvent(LocalDate date,String time, int nbPersons,int nbTable) {
        int jour = date.getDayOfMonth();
        int mois = date.getMonthValue();
        String moisS = frameReservation.returnMonth(mois-1);
        String returnS = inf.reserve(jour, moisS, time, nbPersons, nbTable);
        frameReservation.showConfText(returnS);
       
    }

    public static void main(String[] args) {
        DialogReservation dialog = new DialogReservation(new InterfaceNoyauFonctionnel());
        EventQueue.invokeLater(() -> {
            dialog.initDialog();
        });
    }

}
