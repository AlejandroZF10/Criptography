package Cryptography;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PrincipalClass extends javax.swing.JFrame {
    public String pathFile,routeFile,nameFile;
    private final String path_keys;
    private String key_rute;
    private String message;
    private String message_rute;
    private byte[] encrypted;
    private byte[] decrypted;
    private PrivateKey pkl;
    private PublicKey publica;
    
    public PrincipalClass() {
        initComponents();
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Images/Imagen1.png"));
        Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),Image.SCALE_DEFAULT));
        jLabel1.setIcon(fondo1);
        this.setLocationRelativeTo(null);
        jButton4.setEnabled(false);
        this.path_keys = "C:\\Users\\alexz\\Desktop\\";
        this.pkl = null; this.publica = null;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practice 6 - RSA");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT OPTION", "ENCRYPT", "DECRYPT" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 140, 30));

        jButton4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton4.setText("DO IT!");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 100, -1));

        jButton3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton3.setText("SELECT TEXT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 140, -1));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton2.setText("SELECT KEYS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 140, -1));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButton1.setText("GENERATE KEYS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 140, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NO FILE SELECTED");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 300, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Alejandro de Jesús Zepeda Flores");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Practice 6 - RSA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Imagen1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        KeyPair clave;
        try {
            clave = Generator.generarClave();
            this.pkl = clave.getPrivate();
            this.publica = clave.getPublic();
            String pvf = JOptionPane.showInputDialog("Name of the private key file");
            String pvf2 = JOptionPane.showInputDialog("Name of the public key file");
            Files.GuardarLLave(path_keys,pvf2,pvf,clave);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setKeyRute(Files.rute("C:\\Users\\alexz\\Desktop\\","SELECT KEY","key"));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setMessageRute(nameFile = Files.rute("C:\\Users\\alexz\\Desktop\\","SELECT TEXT","txt"));
        try {
            nameFile = nameFile.substring(nameFile.lastIndexOf("Desktop\\"),nameFile.length());
            nameFile = nameFile.substring(8,nameFile.length()); jLabel4.setText(nameFile); 
            nameFile = nameFile.substring(0,nameFile.lastIndexOf("."));
            setMessage(Files.MessageFromFile(getMessageRute())); jButton4.setEnabled(true);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Select a document, please!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        switch(jComboBox1.getSelectedIndex()){
            case 0:
                JOptionPane.showMessageDialog(null,"Select another option, please!");
            break;
            
            case 1: //Encrypt
                PublicKey publickey = null;
                try {
                    publickey = Files.cargarPublica(getKeyRute());
                    try {
                        if(getMessage().length()<128){
                            encrypted = RSA.encrypt(publickey,getMessage());
                            FileWriter file = null; PrintWriter printwriter;
                            try {
                                file = new FileWriter("C:\\Users\\alexz\\Desktop\\"+nameFile+"_encryptRSA.txt");
                                printwriter = new PrintWriter(file);
                                printwriter.write(Arrays.toString((encrypted)));
                            } catch (IOException ex) {
                                Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                            }finally{
                                try {
                                    file.close();
                                } catch (IOException ex) {
                                    Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            JOptionPane.showMessageDialog(null,"Message encrypted successfully");
                        }
                        else
                            JOptionPane.showMessageDialog(null,"Message Length Exceeded!");
                    } catch (Exception ex) {
                        Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (NoSuchAlgorithmException | InvalidKeySpecException ex) {
                    JOptionPane.showMessageDialog(null,"Introduce the public key!");
                }
            break;
            
            case 2: //Decrypt
                PrivateKey privada = null;
                try {
                    privada = Files.cargarPrivada(getKeyRute());
                    try {
                        File file = new File(nameFile = getMessageRute());
                        nameFile = nameFile.substring(nameFile.lastIndexOf("Desktop\\"),nameFile.length());
                        nameFile = nameFile.substring(8,nameFile.length());
                        nameFile = nameFile.substring(0,5);
                        String cadena;
                        StringBuilder cad = new StringBuilder();
                        try (BufferedReader b = new BufferedReader(new InputStreamReader(new FileInputStream(file),StandardCharsets.UTF_8))) {
                            while((cadena = b.readLine())!=null) {
                                cad.append(cadena);
                            }
                        }
                        byte[] aux = fromStringToByte(cad.toString());
                        decrypted = RSA.decrypt(privada,aux);
                    } catch (Exception ex) {
                        Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    FileWriter file = null; PrintWriter printwriter;
                    try {
                        file = new FileWriter("C:\\Users\\alexz\\Desktop\\"+nameFile+"_decryptRSA.txt");
                        printwriter= new PrintWriter(file);
                        printwriter.write(fromByteToString(decrypted));
                    } catch (IOException ex) {
                        Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                    }finally{
                        try {
                            file.close();
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    JOptionPane.showMessageDialog(null,"Message decrypted successfully");
                } catch (NoSuchAlgorithmException | InvalidKeySpecException ex) {
                    JOptionPane.showMessageDialog(null,"Introduce the private key!");
                }
            break;
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    
    public byte[] fromStringToByte(String arreglo){
        String[] items = arreglo.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
        byte[] results = new byte[items.length];       
        for (int i = 0; i < items.length; i++){
            try {
                results[i] = Byte.parseByte(items[i]);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,"Check the format");
            }
        }
        return results;
    }
    
    public String fromByteToString(byte[] array){
        String cad = "";
        for(int i = 0; i < array.length; i++)
            cad += (char)array[i];
        return cad;
    }
    private void setMessage(String msg){this.message = msg;}
    
    private String getMessage(){return this.message;}
    
    private String getKeyRute(){return this.key_rute;};
    
    private void setMessageRute(String message){this.message_rute = message;}
    
    public void setKeyRute(String rute){this.key_rute = rute;}
    
    public String getMessageRute(){return this.message_rute;}
    
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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
