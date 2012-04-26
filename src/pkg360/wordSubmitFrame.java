/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360;

import javax.swing.JFrame;

/**
 *
 * @author cdbitesky
 */
public class wordSubmitFrame extends javax.swing.JFrame {

    /**
     * Creates new form wordSubmitFrame
     */
    public wordSubmitFrame() {
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
        textAnswer = new javax.swing.JTextField();
        buttonCancel = new javax.swing.JButton();
        buttonSubmit = new javax.swing.JButton();
        labelHint = new javax.swing.JLabel();

        setTitle("Submit Word");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Answer:");

        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        buttonSubmit.setText("Submit");
        buttonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmitActionPerformed(evt);
            }
        });

        labelHint.setText("HINT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelHint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonCancel)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonSubmit)
                            .addComponent(textAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(labelHint, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancel)
                    .addComponent(buttonSubmit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitActionPerformed
        Transfer t = Transfer.getInstance();
        UserData d = UserData.getInstance();
        Hint tmp = t.current;
        String word;
        int realLength = (tmp.length < textAnswer.getText().length())?tmp.length:textAnswer.getText().length();
        if( tmp.length < textAnswer.getText().length() ) {
            word = textAnswer.getText().substring(0, tmp.length+1);
        }
        else {
            word = textAnswer.getText();
        }
        if( d.uHints != null ) {
            int i;
            for ( i = 0; i < d.uHints.length; i++) {
                if( d.uHints[i].compareTo(tmp) == 0 ) {
                    d.uHints[i].guess = word;
                    break;
                }
            }
            if( d.uHints[i].ori == Hint.Orientation.ACROSS ) {
                for (int j = d.uHints[i].startX; j < realLength+d.uHints[i].startX; j++) {
                    t.let[d.uHints[i].startY][j].setText(Character.toString(word.charAt(j-d.uHints[i].startX)));
                    d.uBoard_.b[d.uHints[i].startY][j].letVal = word.charAt(j-d.uHints[i].startX);
                }
            }
            else {
                //Down
                System.out.println("starx: " + d.uHints[i].startX + " starty: " + d.uHints[i].startY);
                for (int j = 0; j < realLength; j++) {
                    System.out.println("j: " + j);
                    t.let[j+d.uHints[i].startY][d.uHints[i].startX].setText(Character.toString(word.charAt(j)));
                    d.uBoard_.b[j+d.uHints[i].startY][d.uHints[i].startX].letVal = word.charAt(j);
                }
            }
        }
        else {
            System.out.println("uHints is null. find the fuck-up");
        }
        this.setVisible(false);
    }//GEN-LAST:event_buttonSubmitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Write the hint to the given label
        // TODO fix word length dynamic expansion
        Transfer t = Transfer.getInstance();
        if( t.current.hint.length() > 24 ){
            labelHint.setText(t.current.hint.substring(0, 24));
        }
        else {
            labelHint.setText(t.current.hint);
        }
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(wordSubmitFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wordSubmitFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wordSubmitFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wordSubmitFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new wordSubmitFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelHint;
    private javax.swing.JTextField textAnswer;
    // End of variables declaration//GEN-END:variables
}
