import javax.swing.JOptionPane;

class ex02 {
    public static double media(double x, double y, double z, double w) {
        double media = (x + y + z + w) / 4;
        return media;
    }

    public static void main(String[] args) {
        try {
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota!"));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota!"));
            double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota!"));
            double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota!"));

            double media = media(nota1, nota2, nota3, nota4);
            JOptionPane.showMessageDialog(null, "A média aritmética da soma das notas "
                + nota1 + ", " + nota2 + ", " + nota3 + " e " + nota4 + " é igual a " + media);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
