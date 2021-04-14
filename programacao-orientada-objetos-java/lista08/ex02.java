import javax.swing.JOptionPane;

import entities.Empregado;

public class ex02 {
    public static void main(String[] args) {
        try {
            JOptionPane.showMessageDialog(null, "Cadastro de Empregados");
            String nome = JOptionPane.showInputDialog(null, "Nome:");
            String sobrenome = JOptionPane.showInputDialog(null, "Sobrenome:");
            double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario R$:"));
            Empregado empregado = new Empregado(nome, sobrenome, salario);
            
            System.out.println(empregado);
            JOptionPane.showMessageDialog(null, empregado);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro, verifique a entrada dos dados.");
        }
    }
}
