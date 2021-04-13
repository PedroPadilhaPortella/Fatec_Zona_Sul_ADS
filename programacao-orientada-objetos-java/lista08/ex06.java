import javax.swing.JOptionPane;

import entities.Cocker;

public class ex06 {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(null, "Qual o nome do Cachorro?");
        String raca = JOptionPane.showInputDialog(null, "Qual a raca do " + nome + "?");
        String tipo = JOptionPane.showInputDialog(null, "Qual o tipo do " + nome + "?");
        String cor = JOptionPane.showInputDialog(null, "Qual a cor do " + nome + "?");
        Cocker cocker = new Cocker(nome, raca, tipo, cor);
        System.out.println(cocker);
        JOptionPane.showMessageDialog(null, cocker);
    }
}