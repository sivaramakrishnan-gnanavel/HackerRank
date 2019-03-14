import java.io.*;
import java.util.*;

public class JavaStringIntroduction{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
 
        System.out.println(A.length()+B.length());
        int n=A.compareTo(B);
        if(n>0) System.out.println("Yes");
        else System.out.println("No");
        char s1= (char)(A.charAt(0)-32);
        char s2= (char)(B.charAt(0)-32);
        System.out.println(s1+A.substring(1)+" "+s2+B.substring(1));
    }
}
