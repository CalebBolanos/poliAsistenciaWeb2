/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
/**
 *
 * @author alexi
 */
public class cifrados {
    public static String Encriptar(String texto) {
 
        String secretKey = "obedlaoveja"; //llave para encriptar datos
        String base64EncryptedString = "";
 
        try {
 
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
 
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher cipher = Cipher.getInstance("DESede");
            cipher.init(Cipher.ENCRYPT_MODE, key);
 
            byte[] plainTextBytes = texto.getBytes("utf-8");
            byte[] buf = cipher.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.getEncoder().encode(buf);
            base64EncryptedString = new String(base64Bytes);
 
        } catch (Exception ex) {
        }
        return base64EncryptedString;
    }
 
    public static String Desencriptar(String textoEncriptado){
 
        final String secretKey = "obedlaoveja"; //llave para encriptar datos
        String base64EncryptedString = "";
 
        try {
            byte[] message = Base64.getDecoder().decode(textoEncriptado.getBytes("utf-8"));
            String messa = new String(message);
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
 
            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);
 
            byte[] plainText;
            plainText = decipher.doFinal(message);
 
            base64EncryptedString = new String(plainText, "uft-8");
 
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return base64EncryptedString;
    }
    
    

//    public String cifra(String sinCifrar) throws Exception {
//        byte[] bytes = sinCifrar.getBytes("UTF-8");
////        final Cipher aes = obtieneCipher(true);
////        final byte[] cifrado = aes.doFinal(bytes);
//        MessageDigest md = MessageDigest.getInstance("MD5");
//        byte[] thedigest = md.digest(bytes);
//        String cifras = Base64.encode(thedigest);
//        return cifras;
//    }

    public String descifra(byte[] cifrado) throws Exception {
        final Cipher aes = obtieneCipher(false);
        final byte[] bytes = aes.doFinal(cifrado);
        final String sinCifrar = new String(bytes, "UTF-8");
        return sinCifrar;
    }

    private Cipher obtieneCipher(boolean paraCifrar) throws Exception {
        final String frase = "a548y246664a1568x9c78L13578944aC8911o7982m3";
        final MessageDigest digest = MessageDigest.getInstance("MD5");
        digest.update(frase.getBytes("UTF-8"));
        final SecretKeySpec key = new SecretKeySpec(digest.digest(), 0, 16, "MD5");

        final Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
        if (paraCifrar) {
            aes.init(Cipher.ENCRYPT_MODE, key);
        } else {
            aes.init(Cipher.DECRYPT_MODE, key);
        }

        return aes;
    }
}
