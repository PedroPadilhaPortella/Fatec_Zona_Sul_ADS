import javax.swing.JOptionPane;

class ex06 {
    public static void mes(int num) {
        switch (num) {
            case 1:
                JOptionPane.showMessageDialog(null, "Janeiro");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Fevereiro");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Março");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Mês inválido");
        }
    }

    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de um mês do primeiro trimestre"));
            mes(num);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
