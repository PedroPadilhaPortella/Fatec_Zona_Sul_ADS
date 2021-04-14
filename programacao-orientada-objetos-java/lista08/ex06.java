import javax.swing.JOptionPane;

import entities.EmpregadoPessoa;

public class ex06 {
    public static void main(String[] args) {
        try {
            String nome = JOptionPane.showInputDialog(null, "Nome: ");
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade: "));
            double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Altura: "));
            String sexo = JOptionPane.showInputDialog(null, "Sexo: ");
            double salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Salario: R$ "));

            EmpregadoPessoa empregado = new EmpregadoPessoa(nome, idade, altura, sexo, salario);

            System.out.println(empregado);
            JOptionPane.showMessageDialog(null, empregado);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro, verifique a entrada dos dados.");
        }
    }
}