/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package base_de_données;

import Application.BDD;
import Application.Parameters;
import Application.ResultSetTableModel;
import base_de_données.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class gestiondespersonnes extends javax.swing.JFrame {
     ResultSet rs;
     BDD db;
    
    
    public gestiondespersonnes() {
        initComponents();
        db = new BDD(new Parameters().HOST_DB, new Parameters().USERNAME_DB, new Parameters().PASSWORD_DB, new Parameters().IPHOST, new Parameters().PORT);
        table();

    }
     
    /**
     * Creates new form utilisateur
     */
    
      public void table() {
        String a[] = {"idpersonne","nom","prenom", "login", "password","tel ","adresse","mail","type"};
          rs = db.querySelect(a, "personne");
          table_user.setModel(new ResultSetTableModel(rs));
       
        
      }
         void actualiser() {
        txt_idpersonne.setText("");
        txt_nom.setText("");
        txt_prenom.setText("");
        txt_login.setText("");
        txt_tel.setText("");
        txt_password.setText("");
        txt_adresse.setText("");
        txt_type.setSelectedItem("type");}
         
         
         
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_user = new javax.swing.JTable();
        txt_type = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_nom = new javax.swing.JTextField();
        txt_prenom = new javax.swing.JTextField();
        txt_login = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        txt_tel = new javax.swing.JTextField();
        txt_adresse = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_idpersonne = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        txt_rech = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        com_rech = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION DES UTILISATEURS");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 0, 340, 70);

        table_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IDPERSONNE", "NOM", "PRENOM", "LOGIN", "PASSWORD", "TEL", "ADRESSE", "MAIL", "TYPEPERSONNE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_userMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_user);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 110, 950, 170);

        txt_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrateur", "Utilisateur", "Fournisseur", "Reparateur" }));
        txt_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_typeActionPerformed(evt);
            }
        });
        getContentPane().add(txt_type);
        txt_type.setBounds(230, 720, 100, 30);

        jButton5.setBackground(new java.awt.Color(0, 102, 153));
        jButton5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton5.setText("Actualiser");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(690, 390, 120, 40);

        jButton6.setBackground(new java.awt.Color(0, 102, 153));
        jButton6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton6.setText("Ajouter");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(440, 310, 120, 40);

        jButton7.setBackground(new java.awt.Color(0, 102, 153));
        jButton7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton7.setText("Modifier");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(690, 310, 120, 40);

        jButton8.setBackground(new java.awt.Color(0, 102, 153));
        jButton8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton8.setText("Supprimer");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(440, 390, 120, 40);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 153));
        jLabel11.setText("PRENOM");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 410, 110, 30);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 153));
        jLabel12.setText("IDPERSONNE");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 310, 110, 30);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 153));
        jLabel13.setText("LOGIN");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(50, 460, 110, 30);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 153));
        jLabel14.setText("PASSWORD");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(50, 510, 110, 30);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 153));
        jLabel15.setText("TEL");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(50, 560, 110, 30);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 153));
        jLabel16.setText("ADRESSE");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(50, 610, 110, 30);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 153));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("TYPEPERSONNE");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(50, 720, 120, 30);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 153));
        jLabel18.setText("NOM");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(50, 360, 110, 30);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 153));
        jLabel19.setText("MAIL");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(50, 660, 110, 30);
        getContentPane().add(txt_nom);
        txt_nom.setBounds(230, 360, 100, 30);
        getContentPane().add(txt_prenom);
        txt_prenom.setBounds(230, 410, 100, 30);
        getContentPane().add(txt_login);
        txt_login.setBounds(230, 460, 100, 30);
        getContentPane().add(txt_password);
        txt_password.setBounds(230, 510, 100, 30);
        getContentPane().add(txt_tel);
        txt_tel.setBounds(230, 560, 100, 30);
        getContentPane().add(txt_adresse);
        txt_adresse.setBounds(230, 610, 100, 30);
        getContentPane().add(txt_mail);
        txt_mail.setBounds(230, 660, 100, 30);
        getContentPane().add(txt_idpersonne);
        txt_idpersonne.setBounds(230, 310, 100, 30);

        jButton9.setBackground(new java.awt.Color(0, 102, 153));
        jButton9.setText("RETOUR");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(0, 0, 80, 22);

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jButton10.setText("RECHERCHER");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("RECHERCHER PAR CATEGORIE");

        com_rech.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "idpersonne", "nom", "prenom", "type", " " }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(com_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(com_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(430, 500, 517, 185);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_typeActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         actualiser();
         table();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       if (txt_idpersonne.getText().equals("") || txt_nom.getText().equals("") || txt_prenom.getText().equals("")|| txt_tel.getText().equals("")
        || txt_mail.getText().equals("") || txt_password.getText().equals("") || txt_login.getText().equals("")||
              txt_adresse.getText().equals("")  || txt_type.getSelectedItem().equals("type")) {
            JOptionPane.showMessageDialog(this, "SVP entrer les informations completes");
        } else {
            String[] colon = {"idpersonne","nom","prenom","login", "password","tel","adresse","mail","type"};
            String[] inf = {txt_idpersonne.getText(),txt_nom.getText(), txt_prenom.getText(),txt_login.getText(),
                txt_password.getText(),txt_tel.getText() ,txt_adresse.getText(),txt_mail.getText(),txt_type.getSelectedItem().toString()};
               
            System.out.println(db.queryInsert("personne", colon, inf));
            table();
            actualiser();
         }      
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        if (txt_idpersonne.getText().equals("") || txt_nom.getText().equals("") || txt_prenom.getText().equals("")|| txt_tel.getText().equals("")
        || txt_mail.getText().equals("") || txt_password.getText().equals("") || txt_login.getText().equals("")
                || txt_type.getSelectedItem().equals("type")) {
            JOptionPane.showMessageDialog(this, "SVP  veuillez entrer les informations complètes");
        } else {
                 String idpersonne = String.valueOf(table_user.getValueAt(table_user.getSelectedRow(), 0));
                 String[] colon = {"idpersonne","nom","prenom", "login", "password", "tel", "adresse", "mail", "type"};
                 String[] inf = {txt_idpersonne.getText(), txt_nom.getText(),txt_prenom.getText(),txt_login.getText(),txt_password.getText(),
                                txt_tel.getText() ,txt_adresse.getText(),txt_mail.getText(),txt_type.getSelectedItem().toString()};
            
            System.out.println(db.queryUpdate("personne", colon, inf, "idpersonne=" + "'".concat(idpersonne) +"'" ));
            table();
            actualiser();}
       
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String idpersonne = String.valueOf(table_user.getValueAt(table_user.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "Etes vous sur de vouloir supprimer cet élément? ", "Attention!!!", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
             
        System.out.println(db.queryDelete("personne", "idpersonne=" + "'".concat(idpersonne) +"'" ));
       
        }else{
        return;}
        table();
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void table_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_userMouseClicked
     
       txt_idpersonne.setText(String.valueOf(table_user.getValueAt(table_user.getSelectedRow(),0)));
       txt_nom.setText(String.valueOf(table_user.getValueAt(table_user.getSelectedRow(),1)));
       txt_prenom.setText(String.valueOf(table_user.getValueAt(table_user.getSelectedRow(),2)));
       txt_login.setText(String.valueOf(table_user.getValueAt(table_user.getSelectedRow(),3)));
       txt_password.setText(String.valueOf(table_user.getValueAt(table_user.getSelectedRow(),4)));
       txt_tel.setText(String.valueOf(table_user.getValueAt(table_user.getSelectedRow(),5)));
       txt_adresse.setText(String.valueOf(table_user.getValueAt(table_user.getSelectedRow(),6)));
       txt_mail.setText(String.valueOf(table_user.getValueAt(table_user.getSelectedRow(),7)));
       txt_type.setSelectedItem(String.valueOf(table_user.getValueAt(table_user.getSelectedRow(),8)));
    }//GEN-LAST:event_table_userMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Pageadministrateur w = new Pageadministrateur();
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (txt_rech.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP veuillez saisir un mot clé!");
        } else {
            if (com_rech.getSelectedItem().equals("idpersonne")) {
                rs = db.querySelectAll("personne", "idpersonne LIKE '%" + txt_rech.getText() + "%' ");
                table_user.setModel(new ResultSetTableModel(rs));
            } else if (com_rech.getSelectedItem().equals("nom")) {
                rs = db.querySelectAll("personne", "nom LIKE '%" + txt_rech.getText() + "%' ");
                table_user.setModel(new ResultSetTableModel(rs));
            } else if (com_rech.getSelectedItem().equals("prenom")) {
                rs = db.querySelectAll("personne", "prenom LIKE '%" + txt_rech.getText() + "%' ");
                table_user.setModel(new ResultSetTableModel(rs));
            } else if (com_rech.getSelectedItem().equals("type")) {
                rs = db.querySelectAll("personne", "type LIKE '%" + txt_rech.getText() + "%' ");
                table_user.setModel(new ResultSetTableModel(rs));
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gestiondespersonnes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestiondespersonnes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestiondespersonnes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestiondespersonnes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestiondespersonnes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> com_rech;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable table_user;
    private javax.swing.JTextField txt_adresse;
    private javax.swing.JTextField txt_idpersonne;
    private javax.swing.JTextField txt_login;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_prenom;
    private javax.swing.JTextField txt_rech;
    private javax.swing.JTextField txt_tel;
    private javax.swing.JComboBox<String> txt_type;
    // End of variables declaration//GEN-END:variables
}
