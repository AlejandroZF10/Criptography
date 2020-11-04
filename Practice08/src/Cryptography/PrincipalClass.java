package Cryptography;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PrincipalClass extends javax.swing.JFrame {
    public static String pathFile;
    public static String pathPublicKey;
    public static String pathPrivateKey;
    
    public PrincipalClass() {
        initComponents();
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Images/Imagen1.png"));
        Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),Image.SCALE_DEFAULT));
        jLabel1.setIcon(fondo1);
        this.repaint(); this.setTitle("Practice 8");
        this.setLocationRelativeTo(null);
        initConstructor(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Confidentiality = new javax.swing.JRadioButton();
        Integrity = new javax.swing.JRadioButton();
        Authenticity = new javax.swing.JRadioButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextFieldkey = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Confidentiality.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Confidentiality.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Confidentiality.setLabel("Confidentiality");
        Confidentiality.setOpaque(false);
        Confidentiality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfidentialityActionPerformed(evt);
            }
        });
        getContentPane().add(Confidentiality, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 160, -1));

        Integrity.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Integrity.setText("Integrity");
        Integrity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Integrity.setOpaque(false);
        Integrity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntegrityActionPerformed(evt);
            }
        });
        getContentPane().add(Integrity, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 150, -1));

        Authenticity.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Authenticity.setText("Authenticity");
        Authenticity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Authenticity.setOpaque(false);
        Authenticity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthenticityActionPerformed(evt);
            }
        });
        getContentPane().add(Authenticity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 160, -1));

        jComboBox3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select mode", "SIGN", "VERIFY" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 100, 30));

        jComboBox2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select mode", "ENCRYPT", "DECRYPT" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 130, 30));

        jComboBox1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select method", "AES Algorithm", "DES Algorithm" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 130, 30));

        jTextFieldkey.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jTextFieldkey.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldkey.setText("Insert your key");
        jTextFieldkey.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldkeyFocusGained(evt);
            }
        });
        jTextFieldkey.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldkeyKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldkeyKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldkey, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 130, 30));

        jButton6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton6.setText("DO IT!");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 90, -1));

        jButton5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jButton5.setText("SELECT KEY");
        jButton5.setMaximumSize(new java.awt.Dimension(80, 25));
        jButton5.setMinimumSize(new java.awt.Dimension(80, 25));
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 130, 30));

        jButton4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jButton4.setText("CHECK");
        jButton4.setMaximumSize(new java.awt.Dimension(80, 25));
        jButton4.setMinimumSize(new java.awt.Dimension(80, 25));
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 70, 30));

        jButton3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jButton3.setText("HASH");
        jButton3.setMaximumSize(new java.awt.Dimension(80, 25));
        jButton3.setMinimumSize(new java.awt.Dimension(80, 25));
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 70, 30));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jButton2.setText("SELECT KEY");
        jButton2.setMaximumSize(new java.awt.Dimension(80, 25));
        jButton2.setMinimumSize(new java.awt.Dimension(80, 25));
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 100, 30));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jButton1.setText("SELECT FILE");
        jButton1.setMaximumSize(new java.awt.Dimension(80, 25));
        jButton1.setMinimumSize(new java.awt.Dimension(80, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 100, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NO FILE SELECT");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 180, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Alejandro de Jesús Zepeda Flores");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 500, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Practice 8 - Services");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Imagen1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initConstructor(){
        jButton2.setVisible(false);jButton3.setVisible(false);
        jButton4.setVisible(false);jButton5.setVisible(false);
        jButton6.setEnabled(false);jTextFieldkey.setVisible(false);
        jComboBox1.setVisible(false);jComboBox2.setVisible(false);
        jComboBox3.setVisible(false);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser selectFile = new JFileChooser();
        selectFile.setDialogTitle("Choose your document!");
        selectFile.setCurrentDirectory(new java.io.File("C:\\Users\\Alejandro ZF10\\Desktop"));
        selectFile.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT","txt");
        selectFile.setFileFilter(filtro); 
        int flag = selectFile.showOpenDialog(null);
        if(flag == JFileChooser.APPROVE_OPTION){          
            File archivo = selectFile.getSelectedFile();
            if(archivo.exists()){
                pathFile = archivo.getAbsolutePath();
                jLabel4.setText(archivo.getName());
            } else JOptionPane.showMessageDialog(null,"Doesn't exit the document!");            
        } else JOptionPane.showMessageDialog(null,"Select a document please!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser selectFile = new JFileChooser();
        selectFile.setDialogTitle("Choose your document!");
        selectFile.setCurrentDirectory(new java.io.File("C:\\Users\\Alejandro ZF10\\Desktop"));
        selectFile.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int flag = selectFile.showOpenDialog(null);
        if(flag == JFileChooser.APPROVE_OPTION){          
            File archivo = selectFile.getSelectedFile();
            if(archivo.exists())
                pathPrivateKey = archivo.getAbsolutePath();
            else JOptionPane.showMessageDialog(null,"Doesn't exit the document!");            
        } else JOptionPane.showMessageDialog(null,"Select a document please!");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(pathFile != null){
            String str = Integridad.createHash(pathFile);
            Integridad.writeHash(str,pathFile);
        }
        else
            JOptionPane.showMessageDialog(null,"Select a document please!");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(pathFile != null)
            Integridad.checkHASH(pathFile);
        else
            JOptionPane.showMessageDialog(null,"Select a document please!");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JFileChooser selectFile = new JFileChooser();
        selectFile.setDialogTitle("Choose your document!");
        selectFile.setCurrentDirectory(new java.io.File("C:\\Users\\Alejandro ZF10\\Desktop"));
        selectFile.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int flag = selectFile.showOpenDialog(null);
        if(flag == JFileChooser.APPROVE_OPTION){          
            File archivo = selectFile.getSelectedFile();
            if(archivo.exists())
                pathPublicKey = archivo.getAbsolutePath();
            else JOptionPane.showMessageDialog(null,"Doesn't exit the document!");            
        } else JOptionPane.showMessageDialog(null,"Select a document please!");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void AuthenticityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthenticityActionPerformed
        if(Authenticity.isSelected()){
            jButton2.setVisible(true);
            Integrity.setSelected(true);
            jButton3.setVisible(true);
            jButton4.setVisible(true);
            jButton6.setEnabled(true);
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
            jComboBox3.setVisible(true);
        }else{
            Integrity.setSelected(false);
            jButton2.setVisible(false);
            jButton3.setVisible(false);
            jButton4.setVisible(false);
            jButton3.setEnabled(true);
            jButton4.setEnabled(true);
            jComboBox3.setVisible(false);
        }
    }//GEN-LAST:event_AuthenticityActionPerformed

    private void IntegrityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntegrityActionPerformed
        if(Integrity.isSelected()){
            jButton3.setVisible(true);
            jButton4.setVisible(true);
        }else{
            jButton3.setVisible(false);
            jButton4.setVisible(false);
        }
    }//GEN-LAST:event_IntegrityActionPerformed

    private void ConfidentialityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfidentialityActionPerformed
        if(Confidentiality.isSelected()){
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
            jButton5.setVisible(true);
            jComboBox1.setVisible(true);
            jComboBox2.setVisible(true);
            jButton6.setEnabled(true);
            jTextFieldkey.setVisible(true);
        }else{
            jButton3.setEnabled(true);
            jButton4.setEnabled(true);
            jButton5.setVisible(false);
            jComboBox1.setVisible(false);
            jComboBox2.setVisible(false);
            jTextFieldkey.setVisible(false);
        }
    }//GEN-LAST:event_ConfidentialityActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //Confidentiality
        if((!Authenticity.isSelected())&&(!Integrity.isSelected())&&(Confidentiality.isSelected())){
            if(pathFile != null){
                if(jComboBox1.getSelectedIndex() == 1){ //AES
                    if(jComboBox2.getSelectedIndex() == 1){//Encrypt
                        try{
                            String publicKey = jTextFieldkey.getText();
                            String textFile = Confidencialidad.getString(pathFile);
                            if((publicKey.length()>16) && (publicKey != null))
                                JOptionPane.showMessageDialog(null,"Introduce another key!");
                            else{
                                String textEncrypted = Confidencialidad.encryptAES(publicKey,textFile);
                                String cypher_key = RSA.getCypherKey(pathPublicKey,publicKey);
                                if(cypher_key != null){
                                    String new_message = textEncrypted+'\n';
                                    new_message += cypher_key;
                                    Confidencialidad.writeFileEncrypt(pathFile,new_message,1,1);
                                    JOptionPane.showMessageDialog(null,"Encryption File Correct!");       
                                }
                                else
                                    JOptionPane.showMessageDialog(null,"You must introduce a PublicKey!");       
                            }
                        }catch(Exception ex){
                            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                        } 
                    }else if(jComboBox2.getSelectedIndex() == 2){ //Decrypt
                        try{
                            String publicKey = jTextFieldkey.getText();
                            String textFile = Confidencialidad.getString(pathFile);
                            if((publicKey.length()>16) && (publicKey != null))
                                JOptionPane.showMessageDialog(null,"Introduce another key!");
                            else{
                                String[] mensaje;    
                                mensaje = textFile.split("\n");
                                String textDecrypted = Confidencialidad.decryptAES(publicKey,mensaje[0]);
                                Confidencialidad.writeFileEncrypt(pathFile,textDecrypted,1,2);
                                JOptionPane.showMessageDialog(null,"Decryption File Correct!");
                            }
                        }catch(Exception ex){
                            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                else if (jComboBox1.getSelectedIndex() == 2) { //DES
                    if(jComboBox2.getSelectedIndex() == 1){ //Encrypt
                        try{
                            String publicKey = jTextFieldkey.getText();
                            String textFile = Confidencialidad.getString(pathFile);
                            if(publicKey.length()>8)
                                JOptionPane.showMessageDialog(null,"Introduce another key!");
                            else{
                                String textEncrypted = Confidencialidad.encryptDES(publicKey,textFile);
                                String cypher_key = RSA.getCypherKey(pathPublicKey,publicKey);
                                String new_message = textEncrypted+'\n';
                                new_message += cypher_key;
                                Confidencialidad.writeFileEncrypt(pathFile,new_message,2,1);
                                JOptionPane.showMessageDialog(null,"Encryption File Correct!");
                            }
                        }catch(Exception ex){
                            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                        }                        
                    }else if(jComboBox2.getSelectedIndex() == 2){ //Decrypt
                        try{
                            String publicKey = jTextFieldkey.getText();
                            String textFile = Confidencialidad.getString(pathFile);
                            if(publicKey.length()>8)
                                JOptionPane.showMessageDialog(null,"Introduce another key!");
                            else{
                                String[] mensaje;    
                                mensaje = textFile.split("\n");
                                String textEncrypted = Confidencialidad.decryptDES(publicKey,mensaje[0]);
                                Confidencialidad.writeFileEncrypt(pathFile,textEncrypted,2,2);
                                JOptionPane.showMessageDialog(null,"Decryption File Correct!");
                            }
                        }catch(Exception ex){
                            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }        
            }
            else JOptionPane.showMessageDialog(null,"Select a document please!");
        }
        
        //Integrity + Confidentiality
        if((!Authenticity.isSelected())&&(Integrity.isSelected())&&(Confidentiality.isSelected())){
            if(pathFile != null){
                if(jComboBox1.getSelectedIndex() == 1){ //AES
                    if(jComboBox2.getSelectedIndex() == 1){//Encrypt
                        try{
                            String publicKey = jTextFieldkey.getText();
                            String textFile = Integridad.createHash(pathFile);
                            if(publicKey.length()>16)
                                JOptionPane.showMessageDialog(null,"Introduce another key!");
                            else{
                                String textEncrypted = Confidencialidad.encryptAES(publicKey,textFile);
                                String cypher_key = RSA.getCypherKey(pathPublicKey,publicKey);
                                String new_message = textEncrypted+'\n';
                                new_message += cypher_key;
                                Confidencialidad.writeFileEncrypt(pathFile,new_message,1,1);
                                JOptionPane.showMessageDialog(null,"Encryption File Correct!");
                            }
                        }catch(Exception ex){
                            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                        } 
                    }else if(jComboBox2.getSelectedIndex() == 2){ //Decrypt
                        try{
                            String publicKey = jTextFieldkey.getText();
                            String textFile = Confidencialidad.getString(pathFile);
                            if(publicKey.length()>16)
                                JOptionPane.showMessageDialog(null,"Introduce another key!");
                            else{
                                String[] mensaje;    
                                mensaje = textFile.split("\n");
                                try{
                                    String textDecrypted = Confidencialidad.decryptAES(publicKey,mensaje[0]);
                                    String route = Confidencialidad.writeFileEncrypt(pathFile,textDecrypted,1,2);
                                    JOptionPane.showMessageDialog(null,"Decryption File Correct!");
                                    Integridad.checkHASH(route);
                                }catch(Exception ex){
                                    Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                                    JOptionPane.showMessageDialog(null,"FILE'S BEEN MODIFIED!");
                                }
                            }
                        }catch(HeadlessException ex){
                            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                else if (jComboBox1.getSelectedIndex() == 2) { //DES
                    if(jComboBox2.getSelectedIndex() == 1){ //Encrypt
                        try{
                            String publicKey = jTextFieldkey.getText();
                            String textFile = Integridad.createHash(pathFile);
                            if(publicKey.length()>8)
                                JOptionPane.showMessageDialog(null,"Introduce another key!");
                            else{
                                String textEncrypted = null;
                                textEncrypted = Confidencialidad.encryptDES(publicKey,textFile);
                                String cypher_key = RSA.getCypherKey(pathPublicKey,publicKey);
                                String new_message = textEncrypted+'\n';
                                new_message += cypher_key;
                                Confidencialidad.writeFileEncrypt(pathFile,new_message,2,1);
                                JOptionPane.showMessageDialog(null,"Encryption File Correct!");
                            }
                        }catch(Exception ex){
                            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                        }                        
                    }else if(jComboBox2.getSelectedIndex() == 2){ //Decrypt
                        try{
                            String publicKey = jTextFieldkey.getText();
                            String textFile = Confidencialidad.getString(pathFile);
                            if(publicKey.length()>8)
                                JOptionPane.showMessageDialog(null,"Introduce another key!");
                            else{
                                String[] mensaje;
                                mensaje = textFile.split("\n");
                                try{
                                    String textEncrypted = Confidencialidad.decryptDES(publicKey,mensaje[0]);
                                    String route = Confidencialidad.writeFileEncrypt(pathFile,textEncrypted,2,2);
                                    JOptionPane.showMessageDialog(null,"Decryption File Correct!");
                                    Integridad.checkHASH(route);
                                }catch(Exception ex){
                                    Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                                    JOptionPane.showMessageDialog(null,"FILE'S BEEN MODIFIED!");
                                }
                            }
                        }catch(HeadlessException ex){
                            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);                            
                        }
                    }
                }        
            }
            else JOptionPane.showMessageDialog(null,"Select a document please!");
        }

        //Authenticity + Integrity
        if((Authenticity.isSelected())&&(Integrity.isSelected())&&(!Confidentiality.isSelected())){
            if(pathFile != null){
                if(jComboBox3.getSelectedIndex() == 1){
                    try {
                        String message = Confidencialidad.getString(pathFile);
                        String hash = Integridad.getHash(pathFile);
                        String cypher_hash = Arrays.toString(RSA.encrypt(RSA.cargarPrivada(pathPrivateKey),hash));
                        String new_message = message+"__DELIMITER__"+cypher_hash;
                        Autenticidad.writeFileEncrypt(pathFile,new_message);
                        JOptionPane.showMessageDialog(null,"We´re in the endgame now!");
                    } catch (NoSuchAlgorithmException ex) {
                        Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InvalidKeySpecException ex) {
                        Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    if(jComboBox3.getSelectedIndex() == 2){
                        String message = null; String hash = null;
                        try {
                            message = Autenticidad.ReadTextNDKey(pathFile).get(0).toString();
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            hash = Autenticidad.getHashFromFile(pathFile,RSA.cargarPublica(pathPrivateKey));
                        } catch (NoSuchAlgorithmException | InvalidKeySpecException ex) {
                            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (Exception ex) {
                            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        String new_hash = Integridad.convert(Integridad.FunctionHASH(message));
                        if(hash.equals(new_hash))
                            JOptionPane.showMessageDialog(null,"Hash and e-sign correct!");
                        else
                            JOptionPane.showMessageDialog(null,"Hash and e-sign incorrect, File's been modified!");
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Choose an option, please!");
                }    
            }
        }
        
        //Authenticity + Integrity + Confidentiality
        if((Authenticity.isSelected())&&(Integrity.isSelected())&&(Confidentiality.isSelected())){
            if(pathFile != null){
                switch(jComboBox1.getSelectedIndex()){
                    case 1: //AES
                        switch(jComboBox2.getSelectedIndex()){
                            case 1: //Encrypt
                                String publicKey = jTextFieldkey.getText();
                                String textFile = Integridad.createHash(pathFile);
                                if(publicKey.length()>16)
                                    JOptionPane.showMessageDialog(null,"Introduce another key!");
                                else{
                                    try {
                                        String textEncrypted = Confidencialidad.encryptAES(publicKey,textFile);
                                        String cypher_key = RSA.getCypherKey(pathPublicKey,publicKey);
                                        String new_message = textEncrypted+"__FIRST__";
                                        new_message += cypher_key;
                                        JOptionPane.showMessageDialog(null,"Encryption File Correct!");
                                        String hash = Integridad.getHash(pathFile);
                                        String cypher_hash = Arrays.toString(RSA.encrypt(RSA.cargarPrivada(pathPrivateKey),hash));
                                        new_message += "__DELIMITER__"+cypher_hash;
                                        Autenticidad.writeFileEncrypt(pathFile,new_message);
                                        JOptionPane.showMessageDialog(null,"We´re in the endgame now!");
                                    } catch (Exception ex) {
                                        Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            break;
                            case 2: //Decrypt
                                try{
                                    String publicKey1 = jTextFieldkey.getText();
                                    String textFile1 = Confidencialidad.getString(pathFile);
                                    if(publicKey1.length()>16)
                                        JOptionPane.showMessageDialog(null,"Introduce another key!");
                                    else{
                                        String[] mensaje;    
                                        mensaje = textFile1.split("__FIRST__");
                                        try{
                                            String textDecrypted = Confidencialidad.decryptAES(publicKey1,mensaje[0]);
                                            String[] aux1 = mensaje[1].split("__DELIMITER__");
                                            String[] aux2 = textDecrypted.split("__FUNCTION HASH__");
                                            String new_message = aux2[0]+"__DELIMITER__"+aux1[1]; 
                                            JOptionPane.showMessageDialog(null,"Decryption File Correct!");
                                            String route = Autenticidad.writeFileEncrypt(pathFile,new_message);
                                            String message = Autenticidad.ReadTextNDKey(route).get(0).toString();
                                            String hash = hash = Autenticidad.getHashFromFile(route,RSA.cargarPublica(pathPrivateKey));
                                            String new_hash = Integridad.convert(Integridad.FunctionHASH(message));
                                            if(hash.equals(new_hash)){
                                                System.out.println(""+pathFile);
                                                JOptionPane.showMessageDialog(null,"Success complete!");
                                                Autenticidad.writeFile(pathFile,aux2[0]);
                                                File fichero = new File(route);
                                                fichero.delete();
                                            }
                                            else
                                                JOptionPane.showMessageDialog(null,"Error in the process!");
                                        }catch(Exception ex){
                                            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                                            JOptionPane.showMessageDialog(null,"FILE'S BEEN MODIFIED!");
                                        }
                                    }
                                }catch(HeadlessException ex){
                                    Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            break;
                        }
                    break;
                    case 2: //DES
                        switch(jComboBox2.getSelectedIndex()){
                            case 1: //Encrypt
                                String publicKey = jTextFieldkey.getText();
                                String textFile = Integridad.createHash(pathFile);
                                if(publicKey.length()>8)
                                    JOptionPane.showMessageDialog(null,"Introduce another key!");
                                else{
                                    try {
                                        String textEncrypted = Confidencialidad.encryptDES(publicKey,textFile);
                                        String cypher_key = RSA.getCypherKey(pathPublicKey,publicKey);
                                        String new_message = textEncrypted+"__FIRST__";
                                        new_message += cypher_key;
                                        JOptionPane.showMessageDialog(null,"Encryption File Correct!");
                                        String hash = Integridad.getHash(pathFile);
                                        String cypher_hash = Arrays.toString(RSA.encrypt(RSA.cargarPrivada(pathPrivateKey),hash));
                                        new_message += "__DELIMITER__"+cypher_hash;
                                        Autenticidad.writeFileEncrypt(pathFile,new_message);
                                        JOptionPane.showMessageDialog(null,"We´re in the endgame now!");
                                    } catch (Exception ex) {
                                        Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            break;
                            case 2: //Decrypt
                                try{
                                    String publicKey1 = jTextFieldkey.getText();
                                    String textFile1 = Confidencialidad.getString(pathFile);
                                    if(publicKey1.length()>8)
                                        JOptionPane.showMessageDialog(null,"Introduce another key!");
                                    else{
                                        String[] mensaje;    
                                        mensaje = textFile1.split("__FIRST__");
                                        try{
                                            String textDecrypted = Confidencialidad.decryptDES(publicKey1,mensaje[0]);
                                            String[] aux1 = mensaje[1].split("__DELIMITER__");
                                            String[] aux2 = textDecrypted.split("__FUNCTION HASH__");
                                            String new_message = aux2[0]+"__DELIMITER__"+aux1[1]; 
                                            JOptionPane.showMessageDialog(null,"Decryption File Correct!");
                                            String route = Autenticidad.writeFileEncrypt(pathFile,new_message);
                                            String message = Autenticidad.ReadTextNDKey(route).get(0).toString();
                                            String hash = hash = Autenticidad.getHashFromFile(route,RSA.cargarPublica(pathPrivateKey));
                                            String new_hash = Integridad.convert(Integridad.FunctionHASH(message));
                                            if(hash.equals(new_hash)){
                                                System.out.println(""+pathFile);
                                                JOptionPane.showMessageDialog(null,"Success complete!");
                                                Autenticidad.writeFile(pathFile,aux2[0]);
                                                File fichero = new File(route);
                                                fichero.delete();
                                            }
                                            else
                                                JOptionPane.showMessageDialog(null,"Error in the process!");
                                        }catch(Exception ex){
                                            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                                            JOptionPane.showMessageDialog(null,"FILE'S BEEN MODIFIED!");
                                        }
                                    }
                                }catch(HeadlessException ex){
                                    Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            break;
                        }
                    break;
                }
            }
            else JOptionPane.showMessageDialog(null,"Select a document please!");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedIndex() == 1){
           System.out.println("AES");
        }else if (jComboBox1.getSelectedIndex() == 2) {
           System.out.println("DES");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if(jComboBox2.getSelectedIndex() == 1){
           System.out.println("Encrypt");
        }else if (jComboBox2.getSelectedIndex() == 2) {
           System.out.println("Decrypt");
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextFieldkeyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldkeyFocusGained
        jTextFieldkey.setText("");
    }//GEN-LAST:event_jTextFieldkeyFocusGained

    private void jTextFieldkeyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldkeyKeyPressed

    }//GEN-LAST:event_jTextFieldkeyKeyPressed

    private void jTextFieldkeyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldkeyKeyTyped

    }//GEN-LAST:event_jTextFieldkeyKeyTyped
        
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new PrincipalClass().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Authenticity;
    private javax.swing.JRadioButton Confidentiality;
    private javax.swing.JRadioButton Integrity;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextFieldkey;
    // End of variables declaration//GEN-END:variables
}