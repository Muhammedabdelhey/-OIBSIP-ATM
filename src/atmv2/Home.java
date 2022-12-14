/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atmv2;

/**
 *
 * @author myoss
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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
        transactionsbtn = new javax.swing.JButton();
        diposetbtn = new javax.swing.JButton();
        withdrawbtn = new javax.swing.JButton();
        transferbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\myoss\\Downloads\\images.png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1175, 600));
        getContentPane().setLayout(null);

        transactionsbtn.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        transactionsbtn.setText("Transactions");
        transactionsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionsbtnActionPerformed(evt);
            }
        });
        getContentPane().add(transactionsbtn);
        transactionsbtn.setBounds(490, 500, 230, 40);

        diposetbtn.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        diposetbtn.setText("Deposit");
        diposetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diposetbtnActionPerformed(evt);
            }
        });
        getContentPane().add(diposetbtn);
        diposetbtn.setBounds(490, 220, 230, 40);

        withdrawbtn.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        withdrawbtn.setText("Withdraw");
        withdrawbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawbtnActionPerformed(evt);
            }
        });
        getContentPane().add(withdrawbtn);
        withdrawbtn.setBounds(490, 310, 230, 40);

        transferbtn.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        transferbtn.setText("Transfer");
        transferbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferbtnActionPerformed(evt);
            }
        });
        getContentPane().add(transferbtn);
        transferbtn.setBounds(490, 410, 230, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\myoss\\Downloads\\ATM2.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(530, 30, 140, 150);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\myoss\\Downloads\\images.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1175, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void diposetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diposetbtnActionPerformed
        // TODO add your handling code here:

        Depositform obj = new Depositform();
        //run Depositform 
        obj.setLocation(50, 30);
        obj.setVisible(true);
        //close home from
        this.dispose();
    }//GEN-LAST:event_diposetbtnActionPerformed

    private void withdrawbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawbtnActionPerformed
        // TODO add your handling code here:
        Withdtawform obj = new Withdtawform();
        //run Withdtawform 
        obj.setLocation(50, 30);
        obj.setVisible(true);
        //close home from
        this.dispose();
    }//GEN-LAST:event_withdrawbtnActionPerformed

    private void transferbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferbtnActionPerformed
        // TODO add your handling code here:

        Transferform obj = new Transferform();
        //run Transferform 
        obj.setLocation(50, 30);
        obj.setVisible(true);
        //close home from
        this.dispose();
    }//GEN-LAST:event_transferbtnActionPerformed

    private void transactionsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionsbtnActionPerformed
        // TODO add your handling code here:

        TransactionsHistory obj = new TransactionsHistory();
        //run TransactionsHistory
        obj.setLocation(50, 30);
        obj.setVisible(true);
        //close home from
        this.dispose();
    }//GEN-LAST:event_transactionsbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton diposetbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton transactionsbtn;
    private javax.swing.JButton transferbtn;
    private javax.swing.JButton withdrawbtn;
    // End of variables declaration//GEN-END:variables
}
