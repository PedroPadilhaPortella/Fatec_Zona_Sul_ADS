import javax.swing.JOptionPane;

public class ex03 {
    public static void main(String[] args)
    {
        String nome = JOptionPane.showInputDialog(null, "Qual o nome do Produto?");
        
        double valorCompra = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor de compra do Produto? "));

        double valorVenda = valorCompra < 20.00? valorCompra * 1.45: valorCompra * 1.3;

        JOptionPane.showMessageDialog(null, "O valor de venda do(a) " + nome + " será de R$ " + valorVenda);
    }
}