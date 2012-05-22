/*
 * This is Java program  implementation regenerate 
 * https://github.com/ignusius/regenerate
 * @author Komarov Alexander
 * Version: 0.1.0
 * License: GPL v.3
 */
package ru.devhead.jregenerate;


import com.google.common.base.CharMatcher;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Properties;

public class Jregenerate extends javax.swing.JFrame {

    /**
     * Creates new form Jregenerate
     */
    public Jregenerate() {
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

        Text_Resul = new javax.swing.JTextField();
        Button_regenerate = new javax.swing.JButton();
        Clean_Text_Resul = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JRegenerate");
        setResizable(false);

        Button_regenerate.setText("Regenerate");
        Button_regenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_regenerateActionPerformed(evt);
            }
        });

        Clean_Text_Resul.setText("Clean");
        Clean_Text_Resul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clean_Text_ResulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button_regenerate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Clean_Text_Resul, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Text_Resul))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Text_Resul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_regenerate)
                    .addComponent(Clean_Text_Resul))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_regenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_regenerateActionPerformed
        
        String Password = getRegenerate(Text_Resul.getText());
        boolean isAscii = CharMatcher.ASCII.matchesAllOf(Password);
        if (isAscii==false){
        Text_Resul.setText(Password);
        }
        else{
           Text_Resul.setText(""); 
        }
    }//GEN-LAST:event_Button_regenerateActionPerformed

    private void Clean_Text_ResulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clean_Text_ResulActionPerformed
       
        Text_Resul.setText("");
    }//GEN-LAST:event_Clean_Text_ResulActionPerformed

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
            java.util.logging.Logger.getLogger(Jregenerate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jregenerate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jregenerate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jregenerate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Jregenerate().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_regenerate;
    private javax.swing.JButton Clean_Text_Resul;
    private javax.swing.JTextField Text_Resul;
    // End of variables declaration//GEN-END:variables
    
    
    public  String getRegenerate(String str) {
        ArrayList obj_array =new ArrayList();
        String return_string="";


        try{
            Properties p = new Properties();
            p.load(new InputStreamReader(new FileInputStream("db.ini"),"UTF8"));
            for (int n=str.length();n>0;n--){
                obj_array.add(p.getProperty("'"+str.charAt(n-1)+"'"));
            }
            
            for (int n=obj_array.size(); n>0;n--){
            String chars="";
            chars=chars+(obj_array.get(n-1));
            return_string=return_string+chars.charAt(1);
            }
        }
        
        catch (Exception e) {
            System.out.println(e);
        }
        
        return return_string;
    }
}

