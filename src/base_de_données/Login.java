/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package base_de_données;
import Application.BDD;
import java.sql.*;
import Application.Parameters;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author hp
 */
public class Login extends javax.swing.JFrame {
    ResultSet rs;
    BDD db;
    String username1, password1;
    static String hak;
    static String mn;
    
  
    public Login() {
         db = new BDD(new Parameters().HOST_DB, new Parameters().USERNAME_DB, new Parameters().PASSWORD_DB, new Parameters().IPHOST, new Parameters().PORT);    
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_password = new javax.swing.JPasswordField();
        txt_username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        voirpass = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 201, 94));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setText("Fermer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 130, 40));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 290, 120, 40));

        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 140, 30));

        txt_username.setText("");
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println(txt_username.getText());}});
    txt_username.setForeground(new java.awt.Color(0, 102, 153));
    txt_username.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_usernameActionPerformed(evt);
        }
    });
    getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 137, 35));

    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\username-icon-png-1.jpg")); // NOI18N
    getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 56, 35));

    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\icon-password-3.jpg")); // NOI18N
    getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 56, -1));

    voirpass.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
    voirpass.setText("afficher mot de passe");
    voirpass.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            voirpassActionPerformed(evt);
        }
    });
    getContentPane().add(voirpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

    jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\JavaApplication1\\images - Copie\\parc-informatique.png")); // NOI18N
    getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 410));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 
        rs = db.querySelectAll("personne","login='"+ txt_username.getText() +
                        "' and password='" + txt_password.getText() + "'");
        try {
            while (rs.next()) {
                username1 = rs.getString("login");
                password1 = rs.getString("password");
                hak = rs.getString("type");
                mn = rs.getString("idpersonne");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
 

        if (username1 == null && password1 == null) {
            JOptionPane.showMessageDialog(this, "le nom utilisateur ou le mot de passe est incorrect");
        } else {
          switch(hak){
              case "administrateur":
                Pageadministrateur a = new Pageadministrateur();
                a.setVisible(true);
                this.dispose();
                break;
              case "utilisateur" :
                pageutilisateur u = new pageutilisateur();
                u.setVisible(true);
                this.dispose();
                break;
              case "fournisseur" :
                pagefournisseur f =new pagefournisseur();
                f.setVisible(true);
                this.dispose();
                break;
              case "reparateur" :
                pagereparateur r = new pagereparateur();
                r.setVisible(true);
                this.dispose();
            
          }
          } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void voirpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voirpassActionPerformed
         if (voirpass.isSelected()) {
      txt_password.setEchoChar((char)0); //txt_password = JPasswordField
   } else {
      txt_password.setEchoChar('*');
   }
    }//GEN-LAST:event_voirpassActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    private javax.swing.JCheckBox voirpass;
    // End of variables declaration//GEN-END:variables
}
