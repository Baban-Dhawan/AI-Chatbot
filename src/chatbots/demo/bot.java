/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbots.demo;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class bot extends javax.swing.JFrame {

    private String user;

    
    /**
     * Creates new form bot
     */
    public bot() {
        initComponents();
        setLocationRelativeTo(null);
        
        setIconImage();

    }

    void username (String user){
        jLabel2.setText(user);
    }
    void name(String signup_user){
        jLabel2.setText(signup_user);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        tfmessage = new javax.swing.JTextField();
        sendbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("     Chatbot");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 3, 48)); // NOI18N
        jLabel1.setText("WELCOME");
        jLabel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabel1ComponentAdded(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 3, 48)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(204, 204, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 27)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        tfmessage.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tfmessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmessageActionPerformed(evt);
            }
        });

        sendbtn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        sendbtn.setText("Send");
        sendbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sendbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendbtnMouseClicked(evt);
            }
        });
        sendbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendbtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setText("Speak");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(tfmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(sendbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sendbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfmessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("  About  ");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu3.setText("  Exit  ");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sendbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendbtnActionPerformed
        // TODO add your handling code here:
        
        
        String msg= tfmessage.getText();
        if(msg.isEmpty()){
            JOptionPane.showMessageDialog(this, "Write Something to Talk.", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            //chotbot Process
            jTextArea1.append("You: " + msg + "." + "\n");
        tfmessage.setText("");
        if(msg.contains("hi")){
            bot("Hey! it's good to see you!");
        }else if(msg.contains("hello")){
            bot("Hey! How can i help you.");
        }else if(msg.contains("hey")){
            bot("Hey! How can i help you.");
        }else if(msg.contains("how are you")){
            bot("I'm feeling great. How are you?");
        }else if(msg.contains("how r u")){
            bot(" Great. How are you?");
        }else if(msg.contains("how are u")){
            bot(" Great. How are you?");
        }else if(msg.contains("how r you")){
            bot(" Great. How are you?");
        }else if(msg.contains("great")){
            bot("that nice");
        }else if(msg.contains("not good")){
            bot("soo sad! how can i help you.");
        }else if(msg.contains("give any random value")){
            bot("value is " + Math.random());
        }else if(msg.contains("thanks")){
                    bot("your WELCOME");
        }else if(msg.contains("thank you")){
        bot("your WELCOME");
        }
        else if(msg.contains("you are")){
            bot("I'm Java Bot. I'm here to help you.");
        } else if(msg.contains("u r")){
            bot("I'm Java Bot. I'm here to help you.");
        } else if(msg.contains("you r")){
            bot("I'm Java Bot. I'm here to help you.");
        } else if(msg.contains("u are")){
            bot("I'm Java Bot. I'm here to help you.");
        } else if(msg.contains("who is your developer")){
            bot("Baban Dhawan developed me.");
        }
        
        else if(msg.contains("bye")){
            bot("bye! Nice to meet you");
            
            Logout lout = new Logout();
            lout.setVisible(true);
            lout.pack();
            lout.setLocationRelativeTo(null);
            lout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        }else if(msg.contains("what going on")){
        bot("I'm just Fetching and Compiling");
         }
        else{
            bot("Soory! I'm in learning mode.");
        }
        
        }
    }//GEN-LAST:event_sendbtnActionPerformed

    private void tfmessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmessageActionPerformed
        // TODO add your handling code here:
        String msg = tfmessage.getText();
        jTextArea1.append("You: " + msg + "." + "\n" );
        tfmessage.setText("");
        
        if(msg.contains("hi")){
            bot("Hey! it's good to see you!");
        }else if(msg.contains("hello")){
            bot("Hey! How can i help you.");
        }else if(msg.contains("how are you")){
            bot("I'm feeling great. How are you?");
        }else if(msg.contains("hey")){
            bot("Hey! How can i help you.");
        }else if(msg.contains("how r u")){
            bot(" Great. How are you?");
        }else if(msg.contains("how are u")){
            bot(" Great. How are you?");
        }else if(msg.contains("how r you")){
            bot(" Great. How are you?");
        }else if(msg.contains("great")){
            bot("that nice");
        }else if(msg.contains("not good")){
            bot("soo sad! how can i help you.");
        }else if(msg.contains("give any random value")){
            bot("value is " + Math.random());
        }else if(msg.contains("thanks")){
                    bot("your WELCOME");
        }else if(msg.contains("thank you")){
        bot("your WELCOME");
        }  else if(msg.contains("you are")){
            bot("I'm Java Bot. I'm here to help you.");
        } else if(msg.contains("u r")){
            bot("I'm Java Bot. I'm here to help you.");
        } else if(msg.contains("you r")){
            bot("I'm Java Bot. I'm here to help you.");
        } else if(msg.contains("u are")){
            bot("I'm Java Bot. I'm here to help you.");
        } else if(msg.contains("who is your developer")){
            bot("Baban Dhawan developed me.");
        }
        else if(msg.contains("bye")){
            bot("bye! Nice to meet you");
            
            Logout lout = new Logout();
            lout.setVisible(true);
            lout.setLocationRelativeTo(null);
            lout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        }else if(msg.contains("what going on")){
        bot("I'm just Fetching and Compiling");
         }
        else{
            bot("Soory! I'm in learning mode.");
        }
        
    }//GEN-LAST:event_tfmessageActionPerformed

     void bot(String string){
            jTextArea1.append("Bot: " + string + "\n");
        }
    
    private void jLabel1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1ComponentAdded

    private void sendbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sendbtnMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
         About abt = new About();
        abt.setVisible(true);
        abt.pack();
        abt.setLocationRelativeTo(null);
        abt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Voice voice;
        VoiceManager vm =  VoiceManager.getInstance();
        voice = vm.getVoice("kevin16");
        voice.allocate();
        voice.speak(jTextArea1.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(bot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bot().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton sendbtn;
    private javax.swing.JTextField tfmessage;
    // End of variables declaration//GEN-END:variables

    private static class Private {

        public Private() {
        }
    }

    private static class jTextArea1 {

        public jTextArea1() {
        }
    }
    private void setIconImage() {
        //To change body of generated methods, choose Tools | Templates
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));

    }
}
