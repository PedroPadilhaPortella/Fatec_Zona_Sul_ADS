import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Raio: ");
        double raio = sc.nextDouble(); 
        
        System.out.print("Altura: ");
        Double altura = sc.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("Volume da lata de oleo: " + String.format("%.2f", volume) + "cm 2");

        sc.close();
    }
}
