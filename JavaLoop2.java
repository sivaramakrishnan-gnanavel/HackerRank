import java.util.*;
import java.io.*;

class JavaLoop2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int start = a+b;
            int arg =b,sum=0 ;
            for(int j=0;j<n;j++){
                    System.out.print(start+" ");
                    arg *=2; 
                    start+=arg;                    
                }
            System.out.println();
            }
        in.close();
    }
}
