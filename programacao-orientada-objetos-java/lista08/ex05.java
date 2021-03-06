import javax.swing.JOptionPane;

import entities.Cocker;

public class ex05 {
    public static void main(String[] args) {
        try {
            String nome = JOptionPane.showInputDialog(null, "Qual o nome do Cachorro?");
            String raca = JOptionPane.showInputDialog(null, "Qual a raca do " + nome + "?");
            String tipo = JOptionPane.showInputDialog(null, "Qual o tipo do " + nome + "?");
            String cor = JOptionPane.showInputDialog(null, "Qual a cor do " + nome + "?");
            Cocker cocker = new Cocker(nome, raca, tipo, cor);
            System.out.println(cocker);
            JOptionPane.showMessageDialog(null, cocker);
            
            boolean tosa = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Ele precisa de tosa? [true/false]"));
            cocker.setTosa(tosa);
            JOptionPane.showMessageDialog(null, cocker);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro, verifique a entrada dos dados.");
        }
    }
}
