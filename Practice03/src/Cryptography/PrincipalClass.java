package Cryptography;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PrincipalClass extends javax.swing.JFrame {
    String pathFile, routeFile, nameFile;
    
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
        jComboBox1.setEnabled(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practice 3 - Affine cipher");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 100, -1));

        jTextField1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 100, -1));

        jComboBox1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPTIONS", "ENCRYPT", "DECRYPT" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 90, 30));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton2.setText("DO IT!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 80, -1));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton1.setText("SELECT FILE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 110, 30));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ALPHA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 100, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BETA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 100, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NO FILE SELECTED");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 300, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Alejandro de Jesús Zepeda Flores");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 500, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Practice 3 - Affine cipher");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Imagen1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 230));

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
                pathFile = archivo.getAbsolutePath(); //Ruta completa
                routeFile = archivo.getParent(); //Directorio del archivo
                nameFile = archivo.getName(); //Nombre del archivo
                jLabel4.setText(nameFile);
                jComboBox1.setEnabled(true);
            } else JOptionPane.showMessageDialog(null,"Doesn't exit the document!");
        } else JOptionPane.showMessageDialog(null,"Select a document please!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int alphabet = 256;
        int alpha = Integer.parseInt(jTextField1.getText());
        int beta = Integer.parseInt(jTextField2.getText());
        switch(jComboBox1.getSelectedIndex()){
            case 0:
                JOptionPane.showMessageDialog(null,"Select another option!");
            break;
            case 1: //Encrypt function
                int aux = validateAlpha(alpha,alphabet);
                String cadena = "", finalstring = ""; char caracter;
                if(aux == 1){
                    try {
                        cadena = readFile(pathFile);
                        if(cadena != null){
                            for(int i=0; i<cadena.length() ;i++){
                                caracter = cadena.charAt(i);
                                caracter = (char)((((int)(caracter))*alpha)+beta);
                                caracter = (char)(((int)(caracter))%alphabet);
                                finalstring += caracter;
                            }
                            writeFile(pathFile,finalstring);
                            JOptionPane.showMessageDialog(null,"Encryption correct!");
                        }
                        else
                            JOptionPane.showMessageDialog(null,"Can't read the file, try again!");
                    } catch (IOException ex) {
                        Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                    JOptionPane.showMessageDialog(null,"Alpha is incorrect!");
            break;
            case 2: //Decrypt function
                try {
                    int i = 0; String resultante = "";
                    String textCipher = readFile(pathFile);
                    int aditive = getInverseAditive(beta,alphabet);
                    int multiplicative = getInverseMultiplicative(alpha,alphabet);
                    while(i != textCipher.length()) {
                        char result = textCipher.charAt(i++);
                        result = (char)(result+aditive);
                        result = (char)((multiplicative*result));
                        result = (char)((result%256));
                        resultante += result;
                    }
                    writeFile(pathFile,resultante,"File Decrypted");
                } catch (IOException ex) {
                    Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                }
            break;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        switch(jComboBox1.getSelectedIndex()){
            case 0:
                jTextField1.setVisible(false); jTextField2.setVisible(false);
                jLabel5.setVisible(false); jLabel6.setVisible(false); jButton2.setEnabled(false);
            break;
            case 1:
                jTextField1.setVisible(true); jTextField2.setVisible(true);
                jLabel5.setVisible(true); jLabel6.setVisible(true); jButton2.setEnabled(true);
            break;
            case 2:
                 jTextField1.setVisible(true); jTextField2.setVisible(true);
                jLabel5.setVisible(true); jLabel6.setVisible(true); jButton2.setEnabled(true);
            break;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    public static String readFile(String file) throws FileNotFoundException, IOException{
        String cadena; File f = new File(file);
        StringBuilder cadenab = new StringBuilder();
        try(BufferedReader b = new BufferedReader(new InputStreamReader(new FileInputStream(f),StandardCharsets.UTF_8))){
            while((cadena = b.readLine()) != null) 
                cadenab.append(cadena).append("\n");
        }
        cadenab.deleteCharAt(cadenab.length()-1);
        return cadenab.toString();   
    }

    public static void writeFile(String filepath, String fileWrite){
        try {
            BufferedWriter buffer1;
            File file1 = new File(filepath); 
            String namefile = file1.getName();
            namefile = namefile.substring(0,namefile.lastIndexOf("."));
            buffer1 = new BufferedWriter(new FileWriter(file1.getParentFile()+"\\"+namefile+" File Encrypted.txt"));
            buffer1.write(fileWrite);
            buffer1.close();
        } catch (IOException ex) {
            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void writeFile(String filepath, String fileWrite, String complement){
        try {
            BufferedWriter buffer1;
            File file1 = new File(filepath); 
            String namefile = file1.getName();
            namefile = namefile.substring(0,namefile.lastIndexOf("."));
            namefile = namefile.substring(0,namefile.lastIndexOf(" File Encrypted"));
            buffer1 = new BufferedWriter(new FileWriter(file1.getParentFile()+"\\"+namefile+complement+".txt"));
            buffer1.write(fileWrite);
            buffer1.close();
        } catch (IOException ex) {
            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int validateAlpha(int alpha,int shift){
        while(shift != 0){
            int aux = shift;
            shift = alpha % shift;
            alpha = aux;
        }
        return alpha;
    }
    
    public int getInverseAditive(int beta,int alphabet){
        for(int i=0; i<alphabet ;i++) {
            if(((beta+i)%alphabet)==0)
		beta = i;
        }
        return beta;
    }
    public int getInverseMultiplicative(int alpha,int alphabet){
        for(int i=1; i<alphabet ;i++) {
            if(((alpha*i)%alphabet)==1)
                alpha = i;
	}
        return alpha;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}