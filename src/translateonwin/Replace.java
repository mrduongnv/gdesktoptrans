/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package translateonwin;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Wise-SW
 */
public class Replace extends javax.swing.JDialog {

    /**
     * Creates new form Replace
     */
    TranslateOnWin parent;
    String _txtFrom;
    String _setTxt;
    StringReplace strReplace;
    public  String getSetTxt() {
        return _setTxt;
    }

    public void setSetTxt(String setTxt) {
        this._setTxt = setTxt;
    }
    
    public String getTxtFrom() {
        return _txtFrom;
    }

    public void setTxtFrom(String txtFrom) {
        this._txtFrom = txtFrom;
    }
    
    public Replace(java.awt.Frame parent, boolean modal, StringReplace strRep) {
        super(parent, modal);        
        try {
            this.strReplace = strRep;
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            this.getContentPane().setBackground(new Color(245, 245, 245));
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SelectLanguage.class.getName()).log(Level.SEVERE, null, ex);
        }
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

        lblFrom = new javax.swing.JLabel();
        txtRepFrom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtRepTo = new javax.swing.JTextField();
        btnRepalce = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblFrom.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFrom.setText("Find text to replace:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Repalce To:");

        btnRepalce.setMnemonic('R');
        btnRepalce.setText("Replace");
        btnRepalce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepalceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRepFrom, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(txtRepTo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btnRepalce, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addGap(146, 146, 146)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFrom)
                    .addComponent(txtRepFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRepTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRepalce)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRepalceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepalceActionPerformed
        // TODO add your handling code here:        
        strReplace.setTxtReplace(txtRepFrom.getText().toString());
        strReplace.setTxtCharReplace(txtRepTo.getText().toString());                        
        setSetTxt(strReplace.doReplace());
        
        
        this.setVisible(false);
    }//GEN-LAST:event_btnRepalceActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Replace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Replace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Replace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Replace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRepalce;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFrom;
    private javax.swing.JTextField txtRepFrom;
    private javax.swing.JTextField txtRepTo;
    // End of variables declaration//GEN-END:variables
    
    void setParent(TranslateOnWin parent) {
        this.parent = parent;
    }
    
}
