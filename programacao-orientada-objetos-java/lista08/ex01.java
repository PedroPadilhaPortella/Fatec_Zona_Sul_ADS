import javax.swing.JOptionPane;

import entities.Faturar;

public class ex01 {
    public static void main(String[] args) {
        try {
            int numeroItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero do Item da Fatura:"));
            String descricao = JOptionPane.showInputDialog(null, "Descrição do Produto:");
            int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade:"));
            double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor R$:"));
            Faturar fatura = new Faturar(numeroItem, descricao, quantidade, valor);
            
            System.out.println(fatura);
            JOptionPane.showMessageDialog(null, fatura);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro, verifique a entrada dos dados.");
        }
    }
}
