import javax.swing.JOptionPane;
import java.text.MessageFormat;

class ex04 {

    public static double calcRadiano(double grau) {
        double radianos = (grau * Math.PI) / 180;
        return radianos;
    }

    public static void main(String[] args) {
        try {
            double grau = Double.parseDouble(JOptionPane.showInputDialog("Digite o grau!"));
            double radianos = calcRadiano(grau);
            String msg = MessageFormat
            .format("O valor do grau {0, number,#.##} " + "em radianos é igual a {1, number,#.##}", grau, radianos);
            JOptionPane.showMessageDialog(null, msg);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
