package Cryptography;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PrincipalClass extends javax.swing.JFrame {
    public static String pathFile,routeFile,nameFile;
    
    public PrincipalClass() {
        initComponents();
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Images/Imagen1.png"));
        Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),Image.SCALE_DEFAULT));
        jLabel1.setIcon(fondo1);
        this.setLocationRelativeTo(null);
        initConstructor(); 
    }
    private void initConstructor(){
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practice 1 - Caesar Cipher");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setToolTipText("");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 190, 30));

        jButton4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 100, 30));

        jButton3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jButton3.setText("DECRYPT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 90, 30));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jButton2.setText("ENCRYPT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 90, 30));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jButton1.setText("SELECT FILE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 100, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NO FILE SELECTED");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 300, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Alejandro de Jesús Zepeda Flores");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 500, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Practice 1 - Caeser Cipher");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Imagen1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser selectFile = new JFileChooser();
        selectFile.setDialogTitle("Choose your document!");
        selectFile.setCurrentDirectory(new java.io.File("C:\\Users\\alexz\\Desktop"));
        selectFile.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT","txt");
        selectFile.setFileFilter(filtro); 
        int flag = selectFile.showOpenDialog(null);
        if(flag == JFileChooser.APPROVE_OPTION){          
            File archivo = selectFile.getSelectedFile();
            if(archivo.exists()){
                pathFile = archivo.getAbsolutePath();
                routeFile = archivo.getParent();
                nameFile = archivo.getName();
                jLabel4.setText(nameFile);
                jButton2.setEnabled(true);
                jButton3.setEnabled(true);
            } else JOptionPane.showMessageDialog(null,"Doesn't exit the document!");            
        } else JOptionPane.showMessageDialog(null,"Select a document please!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTextField1.getText().length() != 0){
            int shift = Integer.parseInt(jTextField1.getText())%27;
            try {
                String text = readFile(pathFile),cipher = "";
                for(int i=0; i<text.length() ;i++){
                    char letra = text.charAt(i);
                    cipher = cipher + ((char)(((int)letra)+shift));
                }
                writeFile(0,pathFile,cipher,"Encrypt");
            } catch (IOException ex) {
                Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
           JOptionPane.showMessageDialog(null,"Shift is null");         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jTextField1.getText().length() != 0){
            int shift = Integer.parseInt(jTextField1.getText())%27;
            try {
                String text = readFile(pathFile),cipher = "";
                for(int i=0; i<text.length() ;i++){
                    char letra = text.charAt(i);
                    cipher = cipher + ((char)(((int)letra)-shift));
                }
                writeFile(1,pathFile,cipher,"Decrypt");
            } catch (IOException ex) {
                Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
           JOptionPane.showMessageDialog(null,"Shift is null"); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton4ActionPerformed

    public static String readFile(String file) throws FileNotFoundException, IOException{
        String cadena;
        StringBuilder cadenab = new StringBuilder();
        File f = new File(file);
        try(BufferedReader b = new BufferedReader(new InputStreamReader(new FileInputStream(f),StandardCharsets.UTF_8))){
            while((cadena = b.readLine()) != null) 
                cadenab.append(cadena).append("\n");
        }
        cadenab.deleteCharAt(cadenab.length()-1);
        return cadenab.toString();   
    }
    
    public static void writeFile(int opt,String filepath, String fileCipher, String type){
        try {
            BufferedWriter buffer1;
            File file1 = new File(filepath); 
            String namefile = file1.getName();
            namefile = namefile.substring(0,namefile.lastIndexOf("."));
            if(opt == 1)
                namefile = namefile.substring(0,namefile.lastIndexOf(" - Encrypt"));
            buffer1 = new BufferedWriter(new FileWriter(file1.getParentFile()+"\\"+namefile+" - "+type+".txt"));
            buffer1.write(fileCipher);
            buffer1.close();
            File archivo = new File(file1.getParentFile()+"\\"+namefile+" - "+type+".txt");
            if(archivo.exists())
                JOptionPane.showMessageDialog(null,"Success "+type);
            else
                JOptionPane.showMessageDialog(null,"Failed "+type);
        } catch (IOException ex) {
            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
        } 
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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
