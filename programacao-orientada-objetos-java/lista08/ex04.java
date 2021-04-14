import javax.swing.JOptionPane;

import entities.Data;

public class ex04 {
    public static void main(String[] args) {
        try {
            int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Dia:"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Mês:"));
            int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano:"));

            Data data = new Data(dia, mes, ano);
            JOptionPane.showMessageDialog(null, "Data " + data.displayData());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}