import java.util.Locale;
import java.util.Scanner;

class ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do Produto: ");
        String nome = sc.nextLine(); 

        System.out.print("Preço do Produto: ");
        Double preco = sc.nextDouble();

        System.out.println("Preço do " + nome + " com 9% de desconto: " + String.format("%.2f", preco * 0.91));

        sc.close();
    }
}