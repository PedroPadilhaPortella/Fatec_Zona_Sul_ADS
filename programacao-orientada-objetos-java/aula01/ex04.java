import java.util.Locale;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura em Celcius: ");
        double c = sc.nextDouble();

        Double f = (9 * c  + 160) / 5;

        System.out.println("Temperatura em Fahrenheit: " + String.format("%.2f", f));

        sc.close();
    }
}
