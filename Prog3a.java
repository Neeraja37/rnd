import java.util.*;

public class Main {
    public static String encrypt(String s,int key){
        String en="";
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i);
            if(ch>=65 && ch<=90){
                ch+=(key%26);
                if(ch>'Z')
                    ch-=26;
            }else if(ch>=97 && ch<=122){
                ch+=(key%26);
                if(ch>'z')
                    ch-=26;
            }
            en+=(char) ch;
        }
        return en;
    }
    
    public static String decrypt(String s,int key){
        String de="";
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i);
            if(ch>=65 && ch<=90){
                ch-=(key%26);
                if(ch<'A')
                    ch+=26;
            }else if(ch>=97 && ch<=122){
                ch-=(key%26);
                if(ch<'a')
                    ch+=26;
            }
            de+=(char) ch;
        }
        return de;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter String: ");
	    String s=sc.nextLine();
	    System.out.println("Enter Key: ");
	    int key=sc.nextInt();
	    String en=encrypt(s,key);
	    System.out.println("Encrypted String: "+en);
	    String de=decrypt(en,key);
	    System.out.println("Decrypted String: "+de);
		
	}
}
