import java.util.*;

public class Main {
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String alph="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String ralph="zyxwvutsrqponmlkjihgfedcbaZYXWVUTSRQPONMLKJIHGFEDCBA";
	    System.out.print("Enter String: ");
	    String s=sc.nextLine();
	    String en="";
	    char ch;
	    for(int i=0;i<s.length();i++){
	        ch=s.charAt(i);
	        if(ch==' '){
	            en+=' ';
	            continue;
	        }
	        int idx=alph.indexOf(ch);
	        en+=ralph.charAt(idx);
	        
	    }
	    System.out.println("Encrypted String: "+en);
	    String de="";
	    for(int i=0;i<en.length();i++){
	        ch=en.charAt(i);
	         if(ch==' '){
	            de+=' ';
	            continue;
	        }
	        int idx=ralph.indexOf(ch);
	        de+=alph.charAt(idx);
	    }
	    System.out.println("Decrypted String: "+de);
		
	}
}
