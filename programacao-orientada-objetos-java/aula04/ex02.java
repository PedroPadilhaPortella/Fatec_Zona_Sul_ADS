import javax.swing.JOptionPane;

public class ex02 {
    public static void main(String[] args) {
        try {
            Integer a = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de A:"));
            Integer b = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de B:"));
            Integer c = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de C:"));
            
            Equacao equacao = new Equacao(a, b, c);
            equacao.calcularRaiz();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro, o valor enviado é inválido");
        } 
    }
}