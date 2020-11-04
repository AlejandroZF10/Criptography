package Cryptography;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Confidencialidad {
    private final static String algorithmAES = "AES";
    private final static String cIAES = "AES/CBC/PKCS5Padding";
    private final static String ivAES = "0123456789ABCDEF";
    
    private final static String algorithmDES = "DES";
    private final static String cIDES = "DES/CBC/PKCS5Padding";
    private final static String ivDES = "01234567";
    
    public static String fillKeyAES(String key){
        for(int i = key.length(); i<16 ;i=i+1)
            key += 'x';
        return key;
    }
    public static String fillKeyDES(String key){
        for(int i = key.length(); i<8 ;i=i+1)
            key += 'x';
        return key;
    }
    public static String getString(String path){
        String str = null;
        File file1 = new File(path);
        try(FileInputStream file2 = new FileInputStream(path)){          
            byte[] array = new byte[(int)file1.length()];
            file2.read(array);file2.close();
            str = new String(array,"UTF-8");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PrincipalClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return str;
    }
    public static String writeFileEncrypt(String filepath, String fileCipher, int mode, int cipher){
        String newPath = null;
        try {
            BufferedWriter buffer1 = null;
            File file1 = new File(filepath); 
            String namefile = file1.getName();
            namefile = namefile.substring(0,namefile.lastIndexOf("."));
            if(mode == 1){
                switch(cipher){
                    case 1:
                        buffer1 = new BufferedWriter(new FileWriter(file1.getParentFile()+"\\"+namefile+"_EncryptAES.txt"));
                        newPath = file1.getParentFile()+"\\"+namefile+"_EncryptAES.txt";
                    break;
                    case 2:
                        namefile = namefile.substring(0,namefile.lastIndexOf("_"));
                        buffer1 = new BufferedWriter(new FileWriter(file1.getParentFile()+"\\"+namefile+"_DecryptAES.txt"));
                        newPath = file1.getParentFile()+"\\"+namefile+"_DecryptAES.txt";
                    break;
                }
            }else{
                switch(cipher){
                    case 1:
                        buffer1 = new BufferedWriter(new FileWriter(file1.getParentFile()+"\\"+namefile+"_EncryptDES.txt"));
                        newPath = file1.getParentFile()+"\\"+namefile+"_EncryptDES.txt";
                    break;
                    case 2:
                        namefile = namefile.substring(0,namefile.lastIndexOf("_"));
                        buffer1 = new BufferedWriter(new FileWriter(file1.getParentFile()+"\\"+namefile+"_DecryptDES.txt"));
                        newPath = file1.getParentFile()+"\\"+namefile+"_DecryptDES.txt";
                    break;
                }
            }
            buffer1.write(fileCipher);
            buffer1.close();
        } catch (IOException ex) {
            Logger.getLogger(Confidencialidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return newPath;
    }
    //AES Algortihm
    public static String encryptAES(String key, String cleartext) throws Exception {
        if(key.length()<16)
            key=fillKeyAES(key);
        Cipher cipher = Cipher.getInstance(cIAES);
        SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(),algorithmAES);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(ivAES.getBytes());
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivParameterSpec);
        byte[] encrypted = cipher.doFinal(cleartext.getBytes());
        return new String(Base64.getEncoder().encode(encrypted));
    }
    public  static String decryptAES(String key, String encrypted) throws Exception {
        if(key.length()<16)
            key=fillKeyAES(key);
        Cipher cipher = Cipher.getInstance(cIAES);
        SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), algorithmAES);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(ivAES.getBytes());
        byte[] enc = Base64.getMimeDecoder().decode(encrypted);
        cipher.init(Cipher.DECRYPT_MODE, skeySpec, ivParameterSpec);
        byte[] decrypted = cipher.doFinal(enc);
        return new String(decrypted);
    }
    //DesAlgorithm
    public  static String encryptDES(String key, String cleartext) throws Exception {
        if(key.length()<8)
            key = fillKeyDES(key);
        Cipher cipher = Cipher.getInstance(cIDES);
        SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), algorithmDES);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(ivDES.getBytes());
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivParameterSpec);
        byte[] encrypted = cipher.doFinal(cleartext.getBytes());
        return new String(Base64.getEncoder().encode(encrypted));
    }
    public  static String decryptDES(String key, String encrypted) throws Exception {
        if(key.length()<8)
            key = fillKeyDES(key);
        Cipher cipher = Cipher.getInstance(cIDES);
        SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), algorithmDES);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(ivDES.getBytes());
        byte[] enc = Base64.getMimeDecoder().decode(encrypted);
        cipher.init(Cipher.DECRYPT_MODE, skeySpec, ivParameterSpec);
        byte[] decrypted = cipher.doFinal(enc);
        return new String(decrypted);
    }
}