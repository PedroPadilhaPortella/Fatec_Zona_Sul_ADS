import javax.swing.JOptionPane;

import entities.Calculadora;

public class ex03 {
    public static void main(String[] args) {
        try {
            JOptionPane.showMessageDialog(null, "Calculadora");
            double valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor 1:"));
            String operador = JOptionPane.showInputDialog(null, "Operação:");
            double valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor 2:"));

            Calculadora calculo = new Calculadora(valor1, valor2, operador);
            JOptionPane.showMessageDialog(null, "Resultado: " + calculo.calcular());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro, verifique a entrada dos dados.");
        }
    }
}
