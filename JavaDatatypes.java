import java.util.*;
import java.io.*;

class JavaDatatypes{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        byte b1=-128,b2=127;
        short s1=-32768,s2=32767;
        int i1=-2147483648,i2=2147483647;
        long l1=-9223372036854775808L,l2=9223372036854775807L;

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=b1 && x<=b2){
                    System.out.println("* byte");}
                if(x>=s1 && x<=s2) {
                    System.out.println("* short");}
                if(x>=i1 && x<=i2){

                    System.out.println("* int");}
                if(x>=l1 && x<=l2){
                    System.out.println("* long");}
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
