/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
import dialog.DialogReservation;
import java.time.LocalDate;
import java.time.Month;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class FrameReservation extends javax.swing.JFrame {
    private String[] monthString = {"Janvier","Fevrier","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre","Novembre","Decembre"};
    private DialogReservation dialog;

    public FrameReservation() {
    }

    public void initFrame() {
        initComponents();
    }

    public void setDialog(DialogReservation dialog) {
        this.dialog = dialog;
    }

    // /!\ /!\ /!\ ATTENTION /!\ /!\ /!\
    // ce code est auto généré et ne doit PAS être modifié
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        dateTimePanel = new javax.swing.JPanel();
        datePicker = new com.github.lgooddatepicker.components.DatePicker();
        datePicker.addDateChangeListener(new DateChangeListener(){
            public void dateChanged(DateChangeEvent dateEvent) {
                datePickerDateChanged(dateEvent);
            }
        });
        dateLabel = new javax.swing.JLabel();
        hourSelection = new javax.swing.JComboBox<>();
        hourLabel = new javax.swing.JLabel();
        nbPersonsPanel = new javax.swing.JPanel();
        nbSelector = new javax.swing.JLabel();
        nbPeopleSelector = new javax.swing.JComboBox<>();
        pickTablePanel = new javax.swing.JPanel();
        nbTable = new javax.swing.JLabel();
        restPlan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTable = new javax.swing.JList<>();
        confButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dateTimePanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        dateLabel.setText("1.Choisissez la date");

        hourSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "... ", "Heure1", "Heure2", "Heure3", "Heure4" }));
        hourSelection.setEnabled(false);
        hourSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourSelectionActionPerformed(evt);
            }
        });

        hourLabel.setText("2. Choisissez l'heure");
        hourLabel.setEnabled(false);

        javax.swing.GroupLayout dateTimePanelLayout = new javax.swing.GroupLayout(dateTimePanel);
        dateTimePanel.setLayout(dateTimePanelLayout);
        dateTimePanelLayout.setHorizontalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateLabel)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hourLabel)
                    .addComponent(hourSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );
        dateTimePanelLayout.setVerticalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        datePicker.getAccessibleContext().setAccessibleName("");
        datePicker.getAccessibleContext().setAccessibleDescription("");

        nbPersonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        nbSelector.setText("3.Choisissez le nombre de personne");
        nbSelector.setEnabled(false);

        nbPeopleSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        nbPeopleSelector.setEnabled(false);
        nbPeopleSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbPeopleSelectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nbPersonsPanelLayout = new javax.swing.GroupLayout(nbPersonsPanel);
        nbPersonsPanel.setLayout(nbPersonsPanelLayout);
        nbPersonsPanelLayout.setHorizontalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nbSelector)
                    .addComponent(nbPeopleSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nbPersonsPanelLayout.setVerticalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(nbSelector)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nbPeopleSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pickTablePanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        nbTable.setText("4.Choississez votre table ");
        nbTable.setEnabled(false);

        restPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plan_tables.jpg"))); // NOI18N
        restPlan.setEnabled(false);

        listTable.setEnabled(false);
        listTable.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listTableValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listTable);

        javax.swing.GroupLayout pickTablePanelLayout = new javax.swing.GroupLayout(pickTablePanel);
        pickTablePanel.setLayout(pickTablePanelLayout);
        pickTablePanelLayout.setHorizontalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nbTable)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addComponent(restPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pickTablePanelLayout.setVerticalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nbTable)
                .addGap(18, 18, 18)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(restPlan, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
                .addContainerGap())
        );

        confButton.setText("Valider");
        confButton.setBorder(null);
        confButton.setEnabled(false);
        confButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Annuler");
        cancelButton.setBorder(null);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(confButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dateTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nbPersonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pickTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(dateTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nbPersonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pickTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(confButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hourSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourSelectionActionPerformed
        int indHour = hourSelection.getSelectedIndex();
        String hour = hourSelection.getItemAt(indHour);
        LocalDate selected = datePicker.getDate();
        dialog.handleTimeSelectedEvent(selected,hour);
    }//GEN-LAST:event_hourSelectionActionPerformed

    private void nbPeopleSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbPeopleSelectorActionPerformed
        int indHour = hourSelection.getSelectedIndex();
        String hour = hourSelection.getItemAt(indHour);
        LocalDate selected = datePicker.getDate();
        int indP = nbPeopleSelector.getSelectedIndex();
        int nbP = Integer.parseInt(nbPeopleSelector.getItemAt(indP));
        dialog.handleNumOfPersonsSelectedEvent(selected, hour, nbP);
    }//GEN-LAST:event_nbPeopleSelectorActionPerformed

    private void confButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confButtonActionPerformed
        LocalDate date = datePicker.getDate();
        int indHour = hourSelection.getSelectedIndex();
        String hour = hourSelection.getItemAt(indHour);
        int indP = nbPeopleSelector.getSelectedIndex();
        String[] table = listTable.getSelectedValue().split(" ");
        int nTable = Integer.parseInt(table[1]);
        int nbP = Integer.parseInt(nbPeopleSelector.getItemAt(indP));
        dialog.handleValidationEvent(date,hour,nbP,nTable);
    }//GEN-LAST:event_confButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dialog.handleCancelEvent();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void listTableValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listTableValueChanged
        if (listTable.getSelectedValue()!= null){
            String[] table = listTable.getSelectedValue().split(" ");
            int nTable = Integer.parseInt(table[1]);
            if (table!=null) {
                dialog.handleTableSelectedEvent(nTable);
            }
        }
    }//GEN-LAST:event_listTableValueChanged

    public void datePickerDateChanged(DateChangeEvent dateEvent) {
        if (dateEvent.getNewDate()!=null) {
            dialog.handleDateSelectedEvent(dateEvent.getNewDate());
        }
        
    }
    public String returnMonth(int indMonth){
        return monthString[indMonth];
    }
    public void modifyHour(String[] hourTable){
        hourSelection.setEnabled(true);
        hourLabel.setEnabled(true);
        hourSelection.setModel(new DefaultComboBoxModel<>(hourTable));
    }
    
    public void modifyNbPeople(String[] nbPeople){
        nbPeopleSelector.setEnabled(true);
        nbSelector.setEnabled(true);
        nbPeopleSelector.setModel(new DefaultComboBoxModel<>(nbPeople));
    }
    public void modifyNbtable(String[] table){
        nbTable.setEnabled(true);
        pickTablePanel.setEnabled(true);
        restPlan.setEnabled(true);
        listTable.setEnabled(true);
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (String i : table) {
            listModel.addElement(i);
        }
        listTable.setModel(listModel);
    }
    public void modifyConfButton(){
        confButton.setEnabled(true);
    }
    public void showConfText(String text){
        JOptionPane.showConfirmDialog(this, text);
    }
    public void modifyAllCancel(){
        listTable.setModel(new DefaultListModel<>());
        hourSelection.setModel(new DefaultComboBoxModel<>());
        nbPeopleSelector.setModel(new DefaultComboBoxModel<>());
        datePicker.clear();
        
        nbTable.setEnabled(false);
        pickTablePanel.setEnabled(false);
        restPlan.setEnabled(false);
        listTable.setEnabled(false);
        hourSelection.setEnabled(false);
        hourLabel.setEnabled(false);
        nbPeopleSelector.setEnabled(false);
        nbSelector.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confButton;
    private javax.swing.JLabel dateLabel;
    private com.github.lgooddatepicker.components.DatePicker datePicker;
    private javax.swing.JPanel dateTimePanel;
    private javax.swing.JLabel hourLabel;
    private javax.swing.JComboBox<String> hourSelection;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listTable;
    private javax.swing.JComboBox<String> nbPeopleSelector;
    private javax.swing.JPanel nbPersonsPanel;
    private javax.swing.JLabel nbSelector;
    private javax.swing.JLabel nbTable;
    private javax.swing.JPanel pickTablePanel;
    private javax.swing.JLabel restPlan;
    // End of variables declaration//GEN-END:variables

}
