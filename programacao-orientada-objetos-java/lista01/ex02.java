import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Salário Minimo: ");
        double salarioMinimo = sc.nextDouble(); 

        System.out.print("Salário do Funcionário: ");
        Double salario = sc.nextDouble();

        double base = salario / salarioMinimo;

        System.out.println("O funcionário recebe o equivalente à " + String.format("%.2f", base) + " salários minimos");

        sc.close();
    }
}
