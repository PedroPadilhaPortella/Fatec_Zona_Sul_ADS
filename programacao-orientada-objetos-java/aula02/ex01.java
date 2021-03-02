import javax.swing.JOptionPane;

public class ex01 {
    public static void main(String[] args)
    {
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));

        String message = valor % 3 == 0 ? " é multiplo de 3": " não é multiplo de 3";

        JOptionPane.showMessageDialog(null, valor + message);
    }
}