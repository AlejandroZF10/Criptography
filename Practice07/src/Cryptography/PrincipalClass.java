package Cryptography;

import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PrincipalClass extends javax.swing.JFrame {
    public String pathFile,routeFile,nameFile;
    
    public PrincipalClass() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practice 7 - HASH");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT OPTION", "HASH", "CHECK" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 30));

        jButton3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 70, -1));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton2.setText("DO IT!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton1.setText("SELECT TEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 130, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NO FILE SELECTED");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 150, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Alejandro de Jesús Zepeda Flores");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Practice 7 - HASH");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Imagen1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 400, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser selectFile = new JFileChooser();
        selectFile.setDialogTitle("Choose your document!");
        selectFile.setCurrentDirectory(new java.io.File("C:\\Users\\alexz\\Desktop"));
        selectFile.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("txt","TXT");
        selectFile.setFileFilter(filtro); 
        int flag = selectFile.showOpenDialog(null);
        if(flag == JFileChooser.APPROVE_OPTION){          
            File archivo = selectFile.getSelectedFile();
            if(archivo.exists()){
                pathFile = archivo.getAbsolutePath(); //Ruta completa
                routeFile = archivo.getParent(); //Directorio del archivo
                nameFile = archivo.getName(); //Nombre del archivo
                jLabel4.setText(nameFile);
                jButton2.setEnabled(true);
                jButton3.setEnabled(true);
            } else JOptionPane.showMessageDialog(null,"Doesn't exit the document!");            
        } else JOptionPane.showMessageDialog(null,"Select a document please!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BufferedWriter buffer1;
        String hash,str,namefile;
        switch(jComboBox1.getSelectedIndex()){
            case 0:
                JOptionPane.showMessageDialog(null,"Select another option, please!");
            break;
            
            case 1:
                File file1 = new File(pathFile); namefile = file1.getName();
                namefile = namefile.substring(0,namefile.lastIndexOf("."));
                try(FileInputStream file2 = new FileInputStream(pathFile)){      
                    buffer1 = new BufferedWriter(new FileWriter(file1.getParentFile()+"\\"+namefile+"_HASH.txt"));
                    byte[] array = new byte[(int)file1.length()];
                    file2.read(array);file2.close();
                    str = new String(array,"UTF-8");
                    hash = convert(FunctionHASH(str));
                    str += "__FUNCTION HASH__"+hash;
                    buffer1.write(str);buffer1.close();
                    JOptionPane.showMessageDialog(null,"Generate HASH Correct");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                }
            break;
            
            case 2:
                File aux = new File(pathFile); 
                try (FileInputStream file2 = new FileInputStream(pathFile)){
                    byte[] array = new byte[(int)aux.length()];
                    file2.read(array);file2.close();
                    str = new String(array,"UTF-8");            
                    String[] mensaje;
                    try{
                        String aux1 = null, aux2 = null;
                        mensaje = str.split("__FUNCTION HASH__");
                        if(mensaje.length < 2)
                            JOptionPane.showMessageDialog(null,"This text doesn't have a hash :(");
                        else{
                            if(mensaje.length == 2){
                                aux1 = mensaje[0];
                                aux2 = mensaje[1];
                            }else{
                                aux1 = mensaje[0];
                                for(int i = 1; i<mensaje.length-1 ;i=i+1){                            
                                    aux1 += "__FUNCTION HASH__";
                                    aux1 += mensaje[i];
                                }   
                                aux2 = mensaje[mensaje.length-1];
                            }
                        }
                        hash = convert(FunctionHASH(aux1));
                        if(hash.equals(aux2))
                            JOptionPane.showMessageDialog(null,"HASH CORRECT");
                        else
                            JOptionPane.showMessageDialog(null,"HASH INCORRECT");
                    } catch(HeadlessException e){
                        JOptionPane.showMessageDialog(null,"SPLIT DOESN'T WORK");
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                }
            break;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private byte[] FunctionHASH(String Cadena){
        byte[] resumen = null;
        try{
            MessageDigest messageDigest;
            messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(Cadena.getBytes());
            resumen = messageDigest.digest();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resumen;
    }
    
    private String convert(byte[] resumen){
        String mensaje = "";
        for (int i = 0; i < resumen.length; i++){
            mensaje += Integer.toHexString((resumen[i] >> 4) & 0xf);
            mensaje += Integer.toHexString(resumen[i] & 0xf);
        }
        return mensaje;
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
