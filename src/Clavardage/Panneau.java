package Clavardage;

import java.awt.event.KeyEvent;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Panneau extends javax.swing.JFrame {

    public PrintWriter writer;
    public Socket ConnectSocket;

    public Panneau() {
        initComponents();
        RemplirTextBox();
    }

    @SuppressWarnings("unchecked")

    private void RemplirTextBox() {
        TB_IP.setText("127.0.0.1");
        TB_Port.setText("50000");
        CB_ResteConnecte.setSelected(true);
        TB_Pseudonyme.setText("manu");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN_Envoyer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_TonMessage = new javax.swing.JTextArea();
        BTN_Deconnecter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TA_Messages = new javax.swing.JTextArea();
        TB_Port = new javax.swing.JTextField();
        TB_IP = new javax.swing.JTextField();
        BTN_Connection = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TB_Pseudonyme = new javax.swing.JTextField();
        BTN_Quitter = new javax.swing.JButton();
        CB_ResteConnecte = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BTN_Envoyer.setText("Envoyer");
        BTN_Envoyer.setName("BTN_Envoyer"); // NOI18N
        BTN_Envoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EnvoyerActionPerformed(evt);
            }
        });

        TB_TonMessage.setColumns(20);
        TB_TonMessage.setRows(5);
        TB_TonMessage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TB_TonMessageKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(TB_TonMessage);

        BTN_Deconnecter.setText("Déconnecter");
        BTN_Deconnecter.setEnabled(false);
        BTN_Deconnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DeconnecterActionPerformed(evt);
            }
        });

        jLabel3.setText("Port:");

        TA_Messages.setColumns(20);
        TA_Messages.setRows(5);
        TA_Messages.setEnabled(false);
        jScrollPane2.setViewportView(TA_Messages);

        TB_IP.setName("TB_IP"); // NOI18N

        BTN_Connection.setText("Connection");
        BTN_Connection.setName("BTN_Connection"); // NOI18N
        BTN_Connection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ConnectionActionPerformed(evt);
            }
        });

        jLabel1.setText("IP Serveur:");

        jLabel2.setText("Pseudo:");

        TB_Pseudonyme.setName("TB_Pseudonyme"); // NOI18N

        BTN_Quitter.setText("Quitter");
        BTN_Quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_QuitterActionPerformed(evt);
            }
        });

        CB_ResteConnecte.setText("Rester Connecté");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TB_IP, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TB_Port, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TB_Pseudonyme))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_Connection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CB_ResteConnecte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BTN_Quitter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTN_Deconnecter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Envoyer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TB_IP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TB_Port, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_Quitter)
                    .addComponent(CB_ResteConnecte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TB_Pseudonyme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Connection, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Deconnecter)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(BTN_Envoyer, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void BTN_DeconnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DeconnecterActionPerformed
        try {
            ConnectSocket.close();
        } catch (IOException ex) {
            Logger.getLogger(Panneau.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Déconnecté");
        BTN_Connection.setEnabled(true);
        BTN_Deconnecter.setEnabled(false);
        TB_IP.setEnabled(true);
        TB_Pseudonyme.setEnabled(true);
        TB_Port.setEnabled(true);
    }//GEN-LAST:event_BTN_DeconnecterActionPerformed

    private void BTN_ConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ConnectionActionPerformed
        if (CB_ResteConnecte.isSelected()) {
            ResterConnecte resterCon = new ResterConnecte(writer);
            Thread resterConnecter;
            resterConnecter = new Thread(resterCon);
            resterConnecter.setDaemon(true);
            resterConnecter.start();
        }
        try {
            ConnectSocket = new Socket(TB_IP.getText(), Integer.parseInt(TB_Port.getText()));
            new Thread(new GestionMessages(ConnectSocket, TA_Messages)).start();

            writer = new PrintWriter(new OutputStreamWriter(ConnectSocket.getOutputStream()));
            writer.println(TB_Pseudonyme.getText());
            writer.flush();
            //new Thread(new OutputHandler(master,textField)).start();
        } catch (NumberFormatException | IOException ex) {
            System.out.println(ex.getMessage());
        }
        TB_IP.setEnabled(false);
        TB_Pseudonyme.setEnabled(false);
        TB_Port.setEnabled(false);
        BTN_Connection.setEnabled(false);
        BTN_Deconnecter.setEnabled(true);
    }//GEN-LAST:event_BTN_ConnectionActionPerformed

    private void BTN_QuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_QuitterActionPerformed
        try {
            ConnectSocket.close();
        } catch (IOException e) {
        }
        System.exit(0);
    }//GEN-LAST:event_BTN_QuitterActionPerformed

    private void BTN_EnvoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_EnvoyerActionPerformed
        if (TB_TonMessage.getText().length() < 1) {
            // On envoit rien car le jtextfield est vide
        } else if (TB_TonMessage.getText().equals(".clear")) {
            TA_Messages.setText("Cleared all messages\n");
            TA_Messages.setText("");
        } else {
            writer.println(TB_TonMessage.getText());
            writer.flush();

            TB_TonMessage.setText("");
        }
    }//GEN-LAST:event_BTN_EnvoyerActionPerformed

    private void TB_TonMessageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TB_TonMessageKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
        writer.println(TB_TonMessage.getText());
        writer.flush();

        TB_TonMessage.setText("");
        }
    }//GEN-LAST:event_TB_TonMessageKeyPressed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panneau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new Panneau().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Connection;
    public javax.swing.JButton BTN_Deconnecter;
    private javax.swing.JButton BTN_Envoyer;
    private javax.swing.JButton BTN_Quitter;
    private javax.swing.JCheckBox CB_ResteConnecte;
    public javax.swing.JTextArea TA_Messages;
    public javax.swing.JTextField TB_IP;
    public javax.swing.JTextField TB_Port;
    public javax.swing.JTextField TB_Pseudonyme;
    public javax.swing.JTextArea TB_TonMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}