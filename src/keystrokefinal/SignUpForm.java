/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keystrokefinal;

/**
 *
 * @author Sachin
 */

import java.util.*;

import java.util.ArrayList;
import java.awt.event.KeyListener;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;

import javax.swing.JOptionPane;


public class SignUpForm extends javax.swing.JFrame {
    
    static ArrayList<Long> timeListAttemptOne;
    static ArrayList<Long> timeListAttempt1One;
    static HashMap<String,ArrayList<ArrayList<Long>>> users;
    boolean count=false;
    long flyTime1;
    long pressTime1;
    long startTime1;
    long startTime11;
    static String password;
    //ArrayList<Long>[] twoArrays;
    static ArrayList<ArrayList<Long>> twoArrays;
    /**
     * Creates new form SignUpForm
     */
    public SignUpForm() {
        
        initComponents();
        users= new HashMap<String,ArrayList<ArrayList<Long>>>();
        timeListAttemptOne=new ArrayList<Long>();
        timeListAttempt1One=new ArrayList<Long>();
        twoArrays= new ArrayList<ArrayList<Long>>();
        attemptOne.addKeyListener(new KeyListener() {
    @Override
    public void keyTyped(KeyEvent event) {
        
    }
    @Override
    public void keyPressed(KeyEvent event) {
        
        startTime1 = System.currentTimeMillis();
        flyTime1 = System.currentTimeMillis()-startTime11; 
        timeListAttempt1One.add(flyTime1);
    }
    @Override
    public void keyReleased(KeyEvent event) {
        startTime11 = System.currentTimeMillis(); 
        pressTime1 = System.currentTimeMillis()-startTime1;
        timeListAttemptOne.add(pressTime1);
       
       
    }
    
});     
        
        
    }
    public static HashMap<String,ArrayList<ArrayList<Long>>> returnUserList(){
        return users;
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
        userNameSignUp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        attemptOne = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        logInHere = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("UserName");

        userNameSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameSignUpActionPerformed(evt);
            }
        });

        jLabel2.setText("KeyCode");

        attemptOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attemptOneActionPerformed(evt);
            }
        });

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        logInHere.setText("Log In Here");
        logInHere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInHereActionPerformed(evt);
            }
        });

        jLabel5.setText("Already registerd?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(registerButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(logInHere)
                    .addComponent(attemptOne, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(attemptOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButton)
                    .addComponent(logInHere))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userNameSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameSignUpActionPerformed

    public static String sendPasswordSignUp(){
        return password;
    }
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        //System.out.println("text : "+userNameSignUp.getText());
        //Map<String, Collection<String>> map = new HashMap<String, Collection<String>>();
        //System.out.println(attemptOneKeyStrokes);
        
        JFrame frame = new JFrame("OutPut message");
        JOptionPane.showMessageDialog(frame, "successfully Registerd");  
        
        
        System.out.println(Arrays.toString(timeListAttemptOne.toArray()));
        System.out.println(Arrays.toString(timeListAttempt1One.toArray()));
        twoArrays.add(timeListAttemptOne);
        twoArrays.add(timeListAttempt1One);
        users.put(userNameSignUp.getText(),twoArrays);
        timeListAttemptOne= new ArrayList<Long>();
        timeListAttempt1One= new ArrayList<Long>();
        twoArrays= new ArrayList<ArrayList<Long>>();
        //Iterator<String> keySetIterator = users.keySet().iterator(); 
        //while(keySetIterator.hasNext())
        //{ String key = keySetIterator.next();
        //    System.out.println("key: " + key + " value: " + users.get(key)); 
        //}
        //userNameSignUp.setText("");
        //attemptOne.setText("");


        
        
    }//GEN-LAST:event_registerButtonActionPerformed

    private void attemptOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attemptOneActionPerformed
        
    }//GEN-LAST:event_attemptOneActionPerformed

    private void logInHereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInHereActionPerformed
        // TODO add your handling code here:
        KeyStrokeFinal.setLogInForm();
        password=attemptOne.getText();
        this.dispose();
        userNameSignUp.setText("");
        attemptOne.setText("");
    }//GEN-LAST:event_logInHereActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField attemptOne;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton logInHere;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField userNameSignUp;
    // End of variables declaration//GEN-END:variables

}
