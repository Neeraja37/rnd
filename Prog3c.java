import java.util.*;

public class Main {
    
    static float[][] en=new float[3][1];
	static float[][] de=new float[3][1];
	static float[][] msg=new float[3][1];
	static float[][] a=new float[3][3];       
	static float[][] b=new float[3][3];
	static Scanner sc=new Scanner(System.in);
	
	public static void getKey(){
	    System.out.println("Enter a 3x3 matxix(inversible):");
	    for(int i=0;i<3;i++){
	        for(int j=0;j<3;j++){
	            a[i][j]=sc.nextFloat();
	        }
	    }
	    for(int i=0;i<3;i++){
	        for(int j=0;j<3;j++){
	            System.out.print(a[i][j]+" ");
	        }
	        System.out.println();
	    }
	    System.out.print("Enter a 3 letter string: ");
	    String s=sc.next();
	    for(int i=0;i<3;i++){
	        msg[i][0]=s.charAt(i)-97;
	    }
	}
	
	public static void inverse(){
	    float p,q;
	    float[][] c=a;
	    for(int i=0;i<3;i++){
	        for(int j=0;j<3;j++){
	            if(i==j)
	                b[i][j]=1;
	            else
	                b[i][j]=0;
	        }
	    }
	    for(int k=0;k<3;k++){
	        for(int i=0;i<3;i++){
	            p=c[i][k];
	            q=c[k][k];
	            for(int j=0;j<3;j++){
	                if(i!=k){
	                    c[i][j]=c[i][j]*q-p*c[k][j];
	                    b[i][j]=b[i][j]*q-p*b[k][j];
	                }
	            }
	        }
	    }
	    for(int i=0;i<3;i++){
	        for(int j=0;j<3;j++){
	            b[i][j]/=c[i][i];
	        }
	    }
	    for(int i=0;i<3;i++){
	        for(int j=0;j<3;j++){
	            System.out.print(b[i][j]+" ");
	        }
	        System.out.println();
	    }
	        
	}
	
	public static void main(String[] args) {
	    getKey();
	    for(int i=0;i<3;i++){
	        for(int j=0;j<1;j++){
	            for(int k=0;k<3;k++){
	                en[i][j]=en[i][j]+a[i][k]*msg[k][j];
	            }
	        }
	    }
	    System.out.println("\nEncrypted String:");
	    for(int i=0;i<3;i++){
	        System.out.print((char)(en[i][0]%26+97));
	        en[i][0]=en[i][0];
	    }
	    System.out.println("\n");
	    inverse();
		for(int i=0;i<3;i++){
	        for(int j=0;j<1;j++){
	            for(int k=0;k<3;k++){
	                de[i][j]=de[i][j]+b[i][k]*en[k][j];
	            }
	        }
	    }
	    System.out.println("\nDecrypted String:");
	    for(int i=0;i<3;i++){
	        System.out.print((char)(de[i][0]%26+97));
	    }
	}
}
