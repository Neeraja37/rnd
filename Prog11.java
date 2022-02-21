import java.security.*;
import java.util.*;
public class Md5{
  public static void main(String[] a) {
  Scanner sc = new Scanner(System.in);
  try{
  MessageDigest md = MessageDigest.getInstance("MD5");
  System.out.println("Message digest object info: ");
  System.out.println("Algorithm = " +md.getAlgorithm());
  System.out.println("Provider = " +md.getProvider());
  System.out.println("ToString = " +md.toString());
  System.out.print("Enter input String: ");
  String input =sc.nextLine();
  md.update(input.getBytes());
  byte[] output = md.digest();
  System.out.println();
  System.out.println("MD5(\""+input+"\") = " +bytesToHex(output));
  }
  catch (Exception e){
  System.out.println("Exception: " +e);
  }
}
public static String bytesToHex(byte[] b) {
   char hexDigit[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
   StringBuffer buf = new StringBuffer(); 
   for(int j=0; j<b.length; j++){
   buf.append(hexDigit[(b[j] >> 4) & 0x0f]);
   buf.append(hexDigit[b[j] & 0x0f]); }
   return buf.toString();
   }
}