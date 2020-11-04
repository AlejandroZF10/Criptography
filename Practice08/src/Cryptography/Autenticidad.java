package Cryptography;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Autenticidad {
    public static String writeFileEncrypt(String filepath, String fileCipher){
        String newPath = null;
        try {
            BufferedWriter buffer1;
            File file1 = new File(filepath); 
            String namefile = file1.getName();
            namefile = namefile.substring(0,namefile.lastIndexOf("."));
            buffer1 = new BufferedWriter(new FileWriter(file1.getParentFile()+"\\"+namefile+"_NewFile.txt"));
            newPath = file1.getParentFile()+"\\"+namefile+"_NewFile.txt";
            buffer1.write(fileCipher);
            buffer1.close();
        } catch (IOException ex) {
            Logger.getLogger(Confidencialidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return newPath;
    }
    public static void writeFile(String filepath, String fileCipher){
        try {
            BufferedWriter buffer1;
            File file1 = new File(filepath); 
            String namefile = file1.getName();
            namefile = namefile.substring(0,namefile.lastIndexOf("."));
            namefile = namefile.substring(0,namefile.lastIndexOf("_NewFile"));
            buffer1 = new BufferedWriter(new FileWriter(file1.getParentFile()+"\\"+namefile+"_FinalText.txt"));
            buffer1.write(fileCipher);
            buffer1.close();
        } catch (IOException ex) {
            Logger.getLogger(Confidencialidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static String leerArchivo(String file) throws FileNotFoundException, IOException{
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
    public static ArrayList ReadTextNDKey(String path) throws IOException{
        ArrayList<String> array = new ArrayList<>();
        String str;
        File file1 = new File(path); 
        try (FileInputStream file2 = new FileInputStream(path)){
            byte[] array1 = new byte[(int)file1.length()];
            file2.read(array1);file2.close();
            str = new String(array1,"UTF-8");            
            String[] mensaje;
            try{
                mensaje = str.split("__DELIMITER__");
                array.add(mensaje[0]);
                array.add(mensaje[1]);
            } catch(HeadlessException e){
                JOptionPane.showMessageDialog(null,"SPLIT DOESN'T WORK");
            }
        }
        return array;
    }
    public static String getHashFromFile(String file,PublicKey key) throws IOException, Exception{
        ArrayList array;
        array = ReadTextNDKey(file);
        String A_key = array.get(1).toString();
        return RSA.fromByteToString(RSA.decrypt(key,RSA.fromStringToByte(A_key)));
    }
}