import javax.swing.JOptionPane;

public class ex03 {
    public static void main(String[] args) {

        try {
            int valorInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inicial"));
            int valorFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor final"));
            String msg = " ";

            if (valorInicial > valorFinal)
                throw new PersonalException("O valor inicial deve ser menor que o final.");

            for (int c = valorInicial; c <= valorFinal; c++) {
                if (c < 2)
                    continue;

                for (int d = 2; d <= c; d++) {
                    if (c % d == 0) {
                        if (c == 2)
                            msg += " " + c;
                        break;
                    }
                    if (d == c - 1) {
                        msg += " " + c;
                        break;
                    }
                }
            }

            JOptionPane.showMessageDialog(null, "Números primos no intervalo informado:" + msg);
        } catch (PersonalException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro, algo não está correto");
        }
    }
}
