import javax.swing.JOptionPane;

public class ex01 {
    public static void main(String[] args) {

        try {
            double base = Integer.parseInt(JOptionPane.showInputDialog("Base do triângulo"));
            double altura = Integer.parseInt(JOptionPane.showInputDialog("Altura do triângulo"));

            Triangulo t = new Triangulo(base, altura);
            double area = t.calcularArea();

            JOptionPane.showMessageDialog(null, "Área do triângulo: " + area);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro, o valor enviado é inválido");
        }
    }
}