import javax.swing.JOptionPane;

public class ex04 {
    public static void main(String[] args) {

        try {
            double p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota de P1: "));
            double p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota de P2: ")); 
            double trabalho = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota de Trabalho: ")); 
            
            if(p1 > 10 || p1 < 0 || p2 > 10 || p2 < 0 || trabalho > 10 || trabalho < 0)
                throw new PersonalException("As notas devem ser entre 10 e 0"); 

            double notaFinal = p1 * 0.35 + p2 * 0.5 + trabalho * 0.15;
            JOptionPane.showMessageDialog(null, "Sua nota final é: " + notaFinal);
        }
        catch (PersonalException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro, algo não está correto");
        } 
    }
}