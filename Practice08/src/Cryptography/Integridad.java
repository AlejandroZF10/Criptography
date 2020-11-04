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
import javax.swing.JOptionPane;

public class Integridad {
    public static byte[] FunctionHASH(String Cadena){
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
    public static String convert(byte[] resumen){
        String mensaje = "";
        for (int i = 0; i < resumen.length; i++){
            mensaje += Integer.toHexString((resumen[i] >> 4) & 0xf);
            mensaje += Integer.toHexString(resumen[i] & 0xf);
        }
        return mensaje;
    }
    public static String getHash(String path){
        String hash = null; String str = null;    
        try(FileInputStream file2 = new FileInputStream(path)){      
            File file1 = new File(path);
            byte[] array = new byte[(int)file1.length()];
            file2.read(array);file2.close();
            str = new String(array,"UTF-8");
            hash = convert(FunctionHASH(str));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hash;
    }
    public static String createHash(String path){
        String hash; String str = null;    
        try(FileInputStream file2 = new FileInputStream(path)){      
            File file1 = new File(path);
            byte[] array = new byte[(int)file1.length()];
            file2.read(array);file2.close();
            str = new String(array,"UTF-8");
            hash = convert(FunctionHASH(str));
            str += "__FUNCTION HASH__"+hash;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return str;
    }
    public static void checkHASH(String path){
        String hash; String str;
        File file1 = new File(path); 
        try (FileInputStream file2 = new FileInputStream(path)){
            byte[] array = new byte[(int)file1.length()];
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
                    JOptionPane.showMessageDialog(null,"Hash correct!");
                else
                    JOptionPane.showMessageDialog(null,"Hash incorrect, File's been modified!");
            } catch(HeadlessException e){
                JOptionPane.showMessageDialog(null,"SPLIT DOESN'T WORK");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void writeHash(String textfile,String path){
        try {
            BufferedWriter buffer1;
            File file1 = new File(path); String namefile = file1.getName();
            namefile = namefile.substring(0,namefile.lastIndexOf("."));
            buffer1 = new BufferedWriter(new FileWriter(file1.getParentFile()+"\\"+namefile+"_HASH.txt"));
            buffer1.write(textfile);
            buffer1.close();
            JOptionPane.showMessageDialog(null,"Generate HASH Correct");
        } catch (IOException ex) {
            Logger.getLogger(Integridad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}