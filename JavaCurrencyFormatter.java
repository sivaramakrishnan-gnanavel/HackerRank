import java.util.*;
import java.text.*;

public class JavaCurrencyFormatter{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale india= new Locale("en", "IN");
        Locale china= new Locale("zh", "CN");
        Locale france= new Locale("fr","FR");

        NumberFormat US = NumberFormat.getCurrencyInstance();
        NumberFormat INDIA = NumberFormat.getCurrencyInstance(india);
        NumberFormat CHINA = NumberFormat.getCurrencyInstance(china);
        NumberFormat FRANCE = NumberFormat.getCurrencyInstance(france);
        
        System.out.println("US: " + US.format(payment));
        System.out.println("India: " + INDIA.format(payment));
        System.out.println("China: " + CHINA.format(payment));
        System.out.println("France: " + FRANCE.format(payment));
    }
}
