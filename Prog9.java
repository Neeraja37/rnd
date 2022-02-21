import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import java.util.*;
public class DiffieHellman{
  public static void main (String[]args) throws Exception{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 2 global constant values and private keys of A and B:");
    int pValue = sc.nextInt();
    int gValue = sc.nextInt();
    int XaValue = sc.nextInt();
    int XbValue = sc.nextInt();
    BigInteger p = new BigInteger(Integer.toString (pValue));
    BigInteger g = new BigInteger(Integer.toString (gValue));
    BigInteger Xa = new BigInteger(Integer.toString (XaValue));
    BigInteger Xb = new BigInteger(Integer.toString (XbValue));
    createKey();
    int bitLength = 512;
    SecureRandom rnd = new SecureRandom();
    p = BigInteger.probablePrime(bitLength, rnd);
    g = BigInteger.probablePrime(bitLength, rnd);
    createSpecificKey(p, g);
  }
  public static void createKey() throws Exception{
    KeyPairGenerator kpg = KeyPairGenerator.getInstance("DiffieHellman");
    kpg.initialize(512);
    KeyPair kp = kpg.generateKeyPair();
    KeyFactory kfactory = KeyFactory.getInstance("DiffieHellman");
    DHPublicKeySpec kspec =(DHPublicKeySpec)kfactory.getKeySpec(kp.getPublic(),DHPublicKeySpec.class);
    System.out.println("Public key is: " + kspec);
  }
  public static void createSpecificKey(BigInteger p,BigInteger g) throws Exception{
    KeyPairGenerator kpg = KeyPairGenerator.getInstance("DiffieHellman");
    DHParameterSpec param = new DHParameterSpec(p, g);
    kpg.initialize(param);
    KeyPair kp = kpg.generateKeyPair();
    KeyFactory kfactory = KeyFactory.getInstance("DiffieHellman");
    DHPublicKeySpec kspec = (DHPublicKeySpec)kfactory.getKeySpec (kp.getPublic(),DHPublicKeySpec.class);
    System.out.println ("\nPublic key is : " + kspec);
  }
}
