package Cryptography;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Methods {
    public void showImg(String rute, JLabel label) throws IOException{
        File f = new File(rute);
        Image image = ImageIO.read(f);
        ImageIcon icon = new ImageIcon(image);
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
        label.setText(null);
        label.setIcon(icono);
    }
    public void encrypt(String rute, String output, String method, String mode, String key) throws Exception {
        int nBytes;
        FileOutputStream outputFile;
        try (FileInputStream inputFile = new FileInputStream(rute)) {
            outputFile = new FileOutputStream(output);
            byte[] headerBMP = new byte[58], buffer = new byte[1024], encryptedBlock;
            inputFile.read(headerBMP);
            outputFile.write(headerBMP);
            Cipher cipher = initialize(method, mode, key, 1);
            while ((nBytes = inputFile.read(buffer))!=-1) {            
                encryptedBlock = cipher.update(buffer, 0, nBytes);
                outputFile.write(encryptedBlock);
            }
            encryptedBlock = cipher.doFinal();
            outputFile.write(encryptedBlock);
        }
        outputFile.close();
    }
    public void encrypt(String rute, String output, String method, String mode, String key, String iv) throws Exception {
        int nBytes;
        FileOutputStream outputFile;
        try (FileInputStream inputFile = new FileInputStream(rute)) {
            outputFile = new FileOutputStream(output);
            byte[] headerBMP = new byte[58], buffer = new byte[1024], encryptedBlock;
            inputFile.read(headerBMP);
            outputFile.write(headerBMP);
            Cipher cipher = initialize(method, mode, key, iv, 1);
            while ((nBytes = inputFile.read(buffer))!=-1) {            
                encryptedBlock = cipher.update(buffer, 0, nBytes);
                outputFile.write(encryptedBlock);
            }
            encryptedBlock = cipher.doFinal();
            outputFile.write(encryptedBlock);
        }
        outputFile.close();
    }
    public void decrypt(String rute, String output, String method, String mode, String key) throws Exception {
        int nBytes;
        FileOutputStream outputFile;
        try (FileInputStream inputFile = new FileInputStream(rute)) {
            outputFile = new FileOutputStream(output);
            byte[] headerBMP = new byte[58], buffer = new byte[1024], encryptedBlock;
            inputFile.read(headerBMP);
            outputFile.write(headerBMP);
            Cipher cipher = initialize(method, mode, key, 2);
            while ((nBytes = inputFile.read(buffer))!=-1) {            
                encryptedBlock = cipher.update(buffer, 0, nBytes);
                outputFile.write(encryptedBlock);
            }
            encryptedBlock = cipher.doFinal();
            outputFile.write(encryptedBlock);
        }
        outputFile.close();
    }
    public void decrypt(String rute, String output, String method, String mode, String key, String iv) throws Exception {
        int nBytes;
        FileOutputStream outputFile;
        try (FileInputStream inputFile = new FileInputStream(rute)) {
            outputFile = new FileOutputStream(output);
            byte[] headerBMP = new byte[58], buffer = new byte[1024], encryptedBlock;
            inputFile.read(headerBMP);
            outputFile.write(headerBMP);
            Cipher cipher = initialize(method, mode, key, iv, 2);
            while ((nBytes = inputFile.read(buffer))!=-1) {            
                encryptedBlock = cipher.update(buffer, 0, nBytes);
                outputFile.write(encryptedBlock);
            }
            encryptedBlock = cipher.doFinal();
            outputFile.write(encryptedBlock);
        }
        outputFile.close();
    }
    public Cipher initialize(String method, String mode, String key, int ed) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException{
        Cipher cipher = Cipher.getInstance(mode);
        SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), method);
        switch (ed) {
            case 1:
                cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
                return cipher;
            case 2:
                cipher.init(Cipher.DECRYPT_MODE, skeySpec);
                return cipher;
            default:
                return null;
        }
    }
    public Cipher initialize(String method, String mode, String key, String iv, int ed) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException{
        Cipher cipher = Cipher.getInstance(mode);
        SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), method);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv.getBytes());
        switch (ed) {
            case 1:
                cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivParameterSpec);
                return cipher;
            case 2:
                cipher.init(Cipher.DECRYPT_MODE, skeySpec, ivParameterSpec);
                return cipher;
            default:
                return null;
        }
    }
    public Cipher initializeDES(String method, String mode, String key, String iv, int ed) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, Exception{
        Cipher cipher = Cipher.getInstance(mode);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv.getBytes());
        SecretKey skeySpec = generateKey(key);
        switch (ed) {
            case 1:
                cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivParameterSpec);
                return cipher;
            case 2:
                cipher.init(Cipher.DECRYPT_MODE, skeySpec, ivParameterSpec);
                return cipher;
            default:
                return null;
        }
    }
    public Cipher initializeDES(String method, String mode, String key, int ed) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, Exception{
        Cipher cipher = Cipher.getInstance(mode);
        SecretKey skeySpec = generateKey(key);
        switch (ed) {
            case 1:
                cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
                return cipher;
            case 2:
                cipher.init(Cipher.DECRYPT_MODE, skeySpec);
                return cipher;
            default:
                return null;
        }
    }
    public SecretKey generateKey( String stringKey ) throws Exception{
        SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
        DESKeySpec kspec = new DESKeySpec(stringKey.getBytes());
        SecretKey ks = skf.generateSecret(kspec);
        return ks;
    }
    public void encryptDES(String rute, String output, String method, String mode, String key) throws Exception {
        int nBytes;
        FileOutputStream outputFile;
        try (FileInputStream inputFile = new FileInputStream(rute)) {
            outputFile = new FileOutputStream(output);
            byte[] headerBMP = new byte[58], buffer = new byte[1024], encryptedBlock;
            inputFile.read(headerBMP);
            outputFile.write(headerBMP);
            Cipher cipher = initializeDES(method, mode, key, 1);
            while ((nBytes = inputFile.read(buffer))!=-1) {            
                encryptedBlock = cipher.update(buffer, 0, nBytes);
                outputFile.write(encryptedBlock);
            }
            encryptedBlock = cipher.doFinal();
            outputFile.write(encryptedBlock);
        }
        outputFile.close();
    }
    public void encryptDES(String rute, String output, String method, String mode, String key, String iv) throws Exception {
        int nBytes;
        FileOutputStream outputFile;
        try (FileInputStream inputFile = new FileInputStream(rute)) {
            outputFile = new FileOutputStream(output);
            byte[] headerBMP = new byte[58], buffer = new byte[1024], encryptedBlock;
            inputFile.read(headerBMP);
            outputFile.write(headerBMP);
            Cipher cipher = initializeDES(method, mode, key, iv, 1);
            while ((nBytes = inputFile.read(buffer))!=-1) {            
                encryptedBlock = cipher.update(buffer, 0, nBytes);
                outputFile.write(encryptedBlock);
            }
            encryptedBlock = cipher.doFinal();
            outputFile.write(encryptedBlock);
        }
        outputFile.close();
    }
    public void decryptDES(String rute, String output, String method, String mode, String key) throws Exception {
        int nBytes;
        FileOutputStream outputFile;
        try (FileInputStream inputFile = new FileInputStream(rute)) {
            outputFile = new FileOutputStream(output);
            byte[] headerBMP = new byte[58], buffer = new byte[1024], encryptedBlock;
            inputFile.read(headerBMP);
            outputFile.write(headerBMP);
            Cipher cipher = initializeDES(method, mode, key, 2);
            while ((nBytes = inputFile.read(buffer))!=-1) {            
                encryptedBlock = cipher.update(buffer, 0, nBytes);
                outputFile.write(encryptedBlock);
            }
            encryptedBlock = cipher.doFinal();
            outputFile.write(encryptedBlock);
        }
        outputFile.close();
    }
    public void decryptDES(String rute, String output, String method, String mode, String key, String iv) throws Exception {
        int nBytes;
        FileOutputStream outputFile;
        try (FileInputStream inputFile = new FileInputStream(rute)) {
            outputFile = new FileOutputStream(output);
            byte[] headerBMP = new byte[58], buffer = new byte[1024], encryptedBlock;
            inputFile.read(headerBMP);
            outputFile.write(headerBMP);
            Cipher cipher = initializeDES(method, mode, key, iv, 2);
            while ((nBytes = inputFile.read(buffer))!=-1) {            
                encryptedBlock = cipher.update(buffer, 0, nBytes);
                outputFile.write(encryptedBlock);
            }
            encryptedBlock = cipher.doFinal();
            outputFile.write(encryptedBlock);
        }
        outputFile.close();
    }
}