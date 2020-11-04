package Cryptography;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
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
        jComboBox1.setEnabled(false); 
        jButton2.setEnabled(false); jLabel8.setVisible(false);
        jLabel5.setVisible(false);jLabel6.setVisible(false);jLabel7.setVisible(false);
        jTextField1.setVisible(false);jTextField2.setVisible(false);jTextField3.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practice 4 - Image cipher");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPTIONS", "ENCRYPT", "DECRYPT" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, 30));

        jTextField3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 90, 30));

        jTextField2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 90, 30));

        jTextField1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setToolTipText("");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 90, 30));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton2.setText("DO IT!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton1.setText("SELECT IMAGE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 170, 110));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("B");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 50, 30));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("G");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 50, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("R");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 50, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NO IMAGE SELECTED");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 300, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Alejandro de Jesús Zepeda Flores");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 500, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Practice 4 - Image cipher");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Imagen1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

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
                jLabel4.setText(nameFile);
                jComboBox1.setEnabled(true);
                try {
                    showImg(pathFile,jLabel8);
                } catch (IOException ex) {
                    Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else JOptionPane.showMessageDialog(null,"Doesn't exit the document!");
        } else JOptionPane.showMessageDialog(null,"Select a document please!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        switch(jComboBox1.getSelectedIndex()){
            case 0:
                JOptionPane.showMessageDialog(null,"Select another option!");
            break;
            case 1: //Encrypt
                if((jTextField1.getText().length() == 0)||(jTextField2.getText().length() == 0)||(jTextField3.getText().length() == 0))
                    JOptionPane.showMessageDialog(null,"One field isn't complete!");
                else{
                    int R = Integer.parseInt(jTextField1.getText());
                    int G = Integer.parseInt(jTextField2.getText());
                    int B = Integer.parseInt(jTextField3.getText());
                    try {
                        readImage(R,G,B); JOptionPane.showMessageDialog(null,"Progress complete!");
                    } catch (IOException ex) {
                        Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            break;
            case 2: //Decrypt
                if((jTextField1.getText().length() == 0)||(jTextField2.getText().length() == 0)||(jTextField3.getText().length() == 0))
                    JOptionPane.showMessageDialog(null,"One field isn't complete!");
                else{
                    int R = Integer.parseInt(jTextField1.getText());
                    int G = Integer.parseInt(jTextField2.getText());
                    int B = Integer.parseInt(jTextField3.getText());
                    try {
                        readImage(R,G,B," Decrypted.bmp"); JOptionPane.showMessageDialog(null,"Progress complete!");
                    } catch (IOException ex) {
                        Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            break;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedIndex() == 0){
            jButton2.setEnabled(false); jLabel8.setVisible(false);
            jLabel5.setVisible(false);jLabel6.setVisible(false);jLabel7.setVisible(false);
            jTextField1.setVisible(false);jTextField2.setVisible(false);jTextField3.setVisible(false);
        }else{
            jButton2.setEnabled(true); jLabel8.setVisible(true);
            jLabel5.setVisible(true);jLabel6.setVisible(true);jLabel7.setVisible(true);
            jTextField1.setVisible(true);jTextField2.setVisible(true);jTextField3.setVisible(true);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    public void showImg(String rute, JLabel label) throws IOException{
        File f = new File(rute);
        Image image = ImageIO.read(f);
        ImageIcon icon = new ImageIcon(image);
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
        label.setText(null);
        label.setIcon(icono);
    }
      
    public void readImage(int intR, int intG, int intB) throws FileNotFoundException, IOException{
        String namefile = nameFile;
        String substring = namefile.substring(0,namefile.lastIndexOf("."));
        String path = routeFile+"\\"+substring+" Encrypted.bmp";
        BufferedImage newImage = null;
        File selectImage = new File(pathFile);
        newImage = ImageIO.read(selectImage);
        int height = newImage.getHeight(); 
        int width = newImage.getWidth();
        for(int x = 0; x<width ;x=x+1){
            for(int y = 0; y<height ;y=y+1){
                Color c = new Color(newImage.getRGB(x,y));
                int valR = (c.getRed()+intR)%256;
                int valG = (c.getGreen()+intG)%256;
                int valB = (c.getBlue()+intB)%256;
                Color nuevo = new Color(valR,valG,valB);
                newImage.setRGB(x,y,nuevo.getRGB());
            }
        }
        ImageIO.write(newImage,"bmp",new File(path));
        showImg(path,jLabel8);
    }
    public void readImage(int intR, int intG, int intB, String complement) throws FileNotFoundException, IOException{
        String namefile = nameFile;
        String substring = namefile.substring(0,namefile.lastIndexOf("."));
        substring = namefile.substring(0,namefile.lastIndexOf(" Encrypted.bmp"));
        String path = routeFile+"\\"+substring+complement;
        BufferedImage newImage = null;
        File selectImage = new File(pathFile);
        newImage = ImageIO.read(selectImage);
        int height = newImage.getHeight(); int width = newImage.getWidth();
        int R = 0, G = 0, B = 0;
        for(int i = 0; i<256 ;i=i+1){
            if((intR+i)%256==0) R = i;
            if((intG+i)%256==0) G = i;
            if((intB+i)%256==0) B = i;
        }
        for(int x = 0; x<width ;x=x+1){
            for(int y = 0; y<height ;y=y+1){
                Color c = new Color(newImage.getRGB(x,y));
                int valR = (c.getRed()+R)%256;
                int valG = (c.getGreen()+G)%256;
                int valB = (c.getBlue()+B)%256;
                //int nuevocolor = (valR<<16)|(valG<<8)|(valB);
                Color nuevo = new Color(valR,valG,valB);
                newImage.setRGB(x,y,nuevo.getRGB());
            }
        }
        ImageIO.write(newImage,"bmp",new File(path));
        showImg(path,jLabel8);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
