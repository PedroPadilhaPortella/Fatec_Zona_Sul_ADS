import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("valor 1: ");
        double valor1 = sc.nextDouble(); 
        
        System.out.print("valor 2: ");
        Double valor2 = sc.nextDouble();

        double media = (valor1  + valor2) / 2;

        System.out.println("Média: " + String.format("%.2f", media));

        sc.close();
    }
}
