import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.*;
public class Blowfish{
  public static void main(String args[]) throws Exception{
    Scanner sc=new Scanner(System.in);
    KeyGenerator kgen = KeyGenerator.getInstance("Blowfish");
    SecretKey skey = kgen.generateKey();
    Cipher cipher = Cipher.getInstance("Blowfish");
    cipher.init(Cipher.ENCRYPT_MODE, skey);
    System.out.print("Enter any String: ");
    String inputText = sc.nextLine();
    byte[] encrypted = cipher.doFinal(inputText.getBytes());
    cipher.init(Cipher.DECRYPT_MODE, skey);
    byte[] decrypted = cipher.doFinal(encrypted);
    System.out.println("\nEncrypted text: "+new String(encrypted)+"\n"+"\nDecrypted text: "+new String(decrypted));
  }
}

