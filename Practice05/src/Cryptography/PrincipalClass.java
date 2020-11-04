package Cryptography;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PrincipalClass extends javax.swing.JFrame {
    Methods met = new Methods();
    public static String pathFile,routeFile,nameFile,name;
    
    public PrincipalClass() {
        initComponents();
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Images/Imagen1.png"));
        Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),Image.SCALE_DEFAULT));
        jLabel1.setIcon(fondo1);
        this.setLocationRelativeTo(null);
        initConstructor(); 
    }
    private void initConstructor(){
        jButton2.setVisible(false);
        jComboBox1.setVisible(false);jComboBox2.setVisible(false);jComboBox3.setVisible(false);
        jTextField1.setVisible(false);jTextField2.setVisible(false); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practice 5 - AES/DES");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Initation vector");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 140, -1));

        jTextField1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Insert your key");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 140, -1));

        jComboBox3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT A MODE", "ECB", "CBC", "OFB", "CFB" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 140, -1));

        jComboBox2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT A CIPHER", "AES", "DES" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 140, -1));

        jComboBox1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT OPTION", "ENCRYPT", "DECRYPT" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton2.setText("DO IT!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton1.setText("SELECT IMAGE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 140, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 310, 200));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NO IMAGE SELECTED");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 140, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Alejandro de Jesús Zepeda Flores");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 430, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Practice 5 - AES / DES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Imagen1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser selectFile = new JFileChooser();
        selectFile.setDialogTitle("Choose your document!");
        selectFile.setCurrentDirectory(new java.io.File("C:\\Users\\alexz\\Desktop"));
        selectFile.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("jpg","png","bmp");
        selectFile.setFileFilter(filtro);
        int flag = selectFile.showOpenDialog(null);
        if(flag == JFileChooser.APPROVE_OPTION){
            File archivo = selectFile.getSelectedFile();
            if(archivo.exists()){
                pathFile = archivo.getAbsolutePath(); //Ruta completa
                routeFile = archivo.getParent(); //Directorio del archivo
                nameFile = archivo.getName(); //Nombre del archivo
                name = nameFile.substring(0,nameFile.lastIndexOf("."));
                jLabel4.setText(nameFile);
                jComboBox1.setVisible(true);jComboBox2.setVisible(true);jComboBox3.setVisible(true);
                jTextField1.setVisible(true);jTextField2.setVisible(true); jButton2.setVisible(true);
                try {
                    met.showImg(pathFile,jLabel5);
                } catch (IOException ex) {
                    Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else JOptionPane.showMessageDialog(null,"Doesn't exit the document!");
        } else JOptionPane.showMessageDialog(null,"Select a document please!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2FocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        switch(jComboBox1.getSelectedIndex()){ //Encrypt / Decrypt
            case 0: //NO option
                JOptionPane.showMessageDialog(null,"Please, select an option!");
            break;
            case 1: //Encrypt
                switch(jComboBox2.getSelectedIndex()){ //AES / DES
                    case 0: //NO option
                        JOptionPane.showMessageDialog(null,"Please, select a method!");
                    break;
                    case 1: //AES
                        if(validateKey_IV(1) == 1){
                            switch(jComboBox3.getSelectedIndex()){ //Mode
                                case 0: //NO option
                                    JOptionPane.showMessageDialog(null,"Please, select a mode!");
                                break;
                                case 1: //ECB
                                    try {
                                        met.encrypt(pathFile,"C:\\Users\\alexz\\Desktop\\"+name+"_AESEncrypt_ECB.bmp","AES","AES/ECB/PKCS5Padding",jTextField1.getText());
                                        JOptionPane.showMessageDialog(this, "Encryption Correct!");
                                    } catch (Exception ex) {
                                        System.err.println(ex.toString());
                                        JOptionPane.showMessageDialog(this, "Encryption Incorrect!");
                                    }
                                break;
                                case 2: //CBC
                                    try {
                                        met.encrypt(pathFile,"C:\\Users\\alexz\\Desktop\\"+name+"_AESEncrypt_CBC.bmp","AES","AES/CBC/PKCS5Padding",jTextField1.getText(),jTextField2.getText());
                                        JOptionPane.showMessageDialog(this, "Encryption Correct!");
                                    } catch (Exception ex) {
                                        System.err.println(ex.toString());
                                        JOptionPane.showMessageDialog(this, "Encryption Incorrect!");
                                    }
                                break;
                                case 3: //OFB
                                    try {
                                        met.encrypt(pathFile,"C:\\Users\\alexz\\Desktop\\"+name+"_AESEncrypt_OFB.bmp","AES","AES/OFB/PKCS5Padding",jTextField1.getText(),jTextField2.getText());
                                        JOptionPane.showMessageDialog(this, "Encryption Correct!");
                                    } catch (Exception ex) {
                                        System.err.println(ex.toString());
                                        JOptionPane.showMessageDialog(this, "Encryption Incorrect!");
                                    }
                                break;
                                case 4: //CFB
                                     try {
                                        met.encrypt(pathFile,"C:\\Users\\alexz\\Desktop\\"+name+"_AESEncrypt_CFB.bmp","AES","AES/CFB/PKCS5Padding",jTextField1.getText(),jTextField2.getText());
                                        JOptionPane.showMessageDialog(this, "Encryption Correct!");
                                    } catch (Exception ex) {
                                        System.err.println(ex.toString());
                                        JOptionPane.showMessageDialog(this, "Encryption Incorrect!");
                                    }
                                break;
                            }
                        }
                    break;
                    case 2: //DES
                        if(validateKey_IV(2) == 1){
                            switch(jComboBox3.getSelectedIndex()){ //Mode
                                case 0: //NO option
                                    JOptionPane.showMessageDialog(null,"Please, select a mode!");
                                break;
                                case 1: //ECB
                                try {
                                    met.encryptDES(pathFile,"C:\\Users\\alexz\\Desktop\\"+name+"_DESEncrypt_ECB.bmp","DES","DES/ECB/PKCS5Padding",jTextField1.getText());
                                    JOptionPane.showMessageDialog(this, "Encryption Correct!");
                                } catch (Exception ex) {
                                    System.err.println(ex.toString());
                                    JOptionPane.showMessageDialog(this, "Encryption Incorrect!");
                                }
                                break;
                                case 2: //CBC
                                try {
                                    met.encryptDES(pathFile,"C:\\Users\\alexz\\Desktop\\"+name+"_DESEncrypt_CBC.bmp","DES","DES/CBC/PKCS5Padding",jTextField1.getText(),jTextField2.getText());
                                    JOptionPane.showMessageDialog(this, "Encryption Correct!");
                                } catch (Exception ex) {
                                    System.err.println(ex.toString());
                                    JOptionPane.showMessageDialog(this, "Encryption Incorrect!");
                                }
                                break;
                                case 3: //OFB
                                try {
                                    met.encryptDES(pathFile,"C:\\Users\\alexz\\Desktop\\"+name+"_DESEncrypt_OFB.bmp","DES","DES/OFB/PKCS5Padding",jTextField1.getText(),jTextField2.getText());
                                    JOptionPane.showMessageDialog(this, "Encryption Correct!");
                                } catch (Exception ex) {
                                    System.err.println(ex.toString());
                                    JOptionPane.showMessageDialog(this, "Encryption Incorrect!");
                                }
                                break;
                                case 4: //CFB
                                    try {
                                        met.encryptDES(pathFile,"C:\\Users\\alexz\\Desktop\\"+name+"_DESEncrypt_CFB.bmp","DES","DES/CFB/PKCS5Padding",jTextField1.getText(),jTextField2.getText());
                                        JOptionPane.showMessageDialog(this, "Encryption Correct!");
                                    } catch (Exception ex) {
                                        System.err.println(ex.toString());
                                        JOptionPane.showMessageDialog(this, "Encryption Incorrect!");
                                    }
                                break;
                            }
                        }
                    break;
                }
            break;
            case 2: //Decrypt
                switch(jComboBox2.getSelectedIndex()){ //AES / DES
                    case 0: //NO option
                        JOptionPane.showMessageDialog(null,"Please, select a method!");
                    break;
                    case 1: //AES
                        name = nameFile.substring(0,nameFile.lastIndexOf("_AESEncrypt"));
                        if(validateKey_IV(1) == 1){
                            switch(jComboBox3.getSelectedIndex()){ //Mode
                                case 0: //NO option
                                    JOptionPane.showMessageDialog(null,"Please, select a mode!");
                                break;
                                case 1: //ECB
                                    try {
                                        met.decrypt(pathFile,"C:\\Users\\alexz\\Desktop\\"+name+"_AESDecrypt_ECB.bmp","AES","AES/ECB/PKCS5Padding",jTextField1.getText());
                                        JOptionPane.showMessageDialog(this, "Decryption Correct!");
                                    } catch (Exception ex) {
                                        System.err.println(ex.toString());
                                        JOptionPane.showMessageDialog(this, "Decryption Incorrect!");
                                    }
                                break;
                                case 2: //CBC
                                    try {
                                        met.decrypt(pathFile,"C:\\Users\\alexz\\Desktop\\"+name+"_AESDecrypt_CBC.bmp","AES","AES/CBC/PKCS5Padding",jTextField1.getText(),jTextField2.getText());
                                        JOptionPane.showMessageDialog(this, "Decryption Correct!");
                                    } catch (Exception ex) {
                                        System.err.println(ex.toString());
                                        JOptionPane.showMessageDialog(this, "Decryption Incorrect!");
                                    }
                                break;
                                case 3: //OFB
                                    try {
                                        met.decrypt(pathFile,"C:\\Users\\alexz\\Desktop\\"+name+"_AESDecrypt_OFB.bmp","AES","AES/OFB/PKCS5Padding", jTextField1.getText(), jTextField2.getText());
                                        JOptionPane.showMessageDialog(this, "Decryption Correct!");
                                    } catch (Exception ex) {
                                        System.err.println(ex.toString());
                                        JOptionPane.showMessageDialog(this, "Decryption Incorrect!");
                                    }
                                break;
                                case 4: //CFB
                                    try {
                                        met.decrypt(pathFile,"C:\\Users\\alexz\\Desktop\\"+name+"_AESDecrypt_CFB.bmp","AES","AES/CFB/PKCS5Padding",jTextField1.getText(), jTextField2.getText());
                                        JOptionPane.showMessageDialog(this, "Decryption Correct!");
                                    } catch (Exception ex) {
                                        System.err.println(ex.toString());
                                        JOptionPane.showMessageDialog(this, "Decryption Incorrect!");
                                    }
                                break;
                            }
                        }
                    break;
                    case 2: //DES
                        name = nameFile.substring(0,nameFile.lastIndexOf("_DESEncrypt"));
                        if(validateKey_IV(2) == 1){
                            switch(jComboBox3.getSelectedIndex()){ //Mode
                                case 0: //NO option
                                    JOptionPane.showMessageDialog(null,"Please, select a mode!");
                                break;
                                case 1: //ECB
                                    try {
                                        met.decryptDES(pathFile, "C:\\Users\\alexz\\Desktop\\"+name+"_DESDecrypt_ECB.bmp","DES","DES/ECB/PKCS5Padding",jTextField1.getText());
                                        JOptionPane.showMessageDialog(this, "Decryption Correct!");
                                    } catch (Exception ex) {
                                        System.err.println(ex.toString());
                                        JOptionPane.showMessageDialog(this, "Decryption Incorrect!");
                                    }
                                break;
                                case 2: //CBC
                                    try {
                                        met.decryptDES(pathFile, "C:\\Users\\alexz\\Desktop\\"+name+"_DESDecrypt_CBC.bmp","DES","DES/CBC/PKCS5Padding",jTextField1.getText(),jTextField2.getText());
                                        JOptionPane.showMessageDialog(this, "Decryption Correct!");
                                    } catch (Exception ex) {
                                        System.err.println(ex.toString());
                                        JOptionPane.showMessageDialog(this, "Decryption Incorrect!");
                                    }
                                break;
                                case 3: //OFB
                                    try {
                                        met.decryptDES(pathFile, "C:\\Users\\alexz\\Desktop\\"+name+"_DESDecrypt_OFB.bmp","DES","DES/OFB/PKCS5Padding",jTextField1.getText(),jTextField2.getText());
                                        JOptionPane.showMessageDialog(this, "Decryption Correct!");
                                    } catch (Exception ex) {
                                        System.err.println(ex.toString());
                                        JOptionPane.showMessageDialog(this, "Decryption Incorrect!");
                                    }
                                break;
                                case 4: //CFB
                                    try {
                                        met.decryptDES(pathFile, "C:\\Users\\alexz\\Desktop\\"+name+"_DESDecrypt_CFB.bmp","DES","DES/CFB/PKCS5Padding",jTextField1.getText(),jTextField2.getText());
                                        JOptionPane.showMessageDialog(this, "Decryption Correct!");
                                    } catch (Exception ex) {
                                        System.err.println(ex.toString());
                                        JOptionPane.showMessageDialog(this, "Decryption Incorrect!");
                                    }
                                break;
                            }
                        }
                }
            break;
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public int validateKey_IV(int mode){
        int option = 0;
        String key = jTextField1.getText();
        String iv = jTextField2.getText();
        switch(mode){
            case 1: //AES
                if((key.length()!= 16) || (iv.length()!= 16))
                    JOptionPane.showMessageDialog(null,"Key and IV must be 16 characters!");
                else
                    option = 1;
            break;
            case 2: //DES
                if((key.length()!= 8) || (iv.length()!= 8))
                    JOptionPane.showMessageDialog(null,"Key and IV must be 8 characters!");
                else
                    option = 1;
            break;
        }
        return option;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
