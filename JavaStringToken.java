import java.io.*;
import java.util.*;

public class JavaStringToken{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringTokenizer str = new StringTokenizer(s," .,!?_@'"); 
        System.out.println(str.countTokens());
        while(str.hasMoreTokens()==true){
            System.out.println(str.nextToken());
        }
        scan.close();
    }
}
