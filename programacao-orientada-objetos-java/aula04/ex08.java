import javax.swing.JOptionPane;

class ex08 {
    public static String numeroPrimo(int c) {
        String msg = "";
        for (int d = 2; d <= c; d++) {
            if (c % d == 0) {
                if (c == 2)
                    msg = c + " é um número primo";
                msg = c + " não é um número primo";
                break;
            }
            if (d == c - 1) {
                msg = c + " é um número primo";
                break;
            }
        }
        return msg;
    }

    public static void main(String[] args) {
        try {

            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            String primo = numeroPrimo(num);
            JOptionPane.showMessageDialog(null, "O número " + primo);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
