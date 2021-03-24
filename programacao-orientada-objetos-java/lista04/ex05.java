import javax.swing.JOptionPane;

class Main {
    public static void showGreater(int num1, int num2) {
        int greater = (num1 > num2) ? num1 : num2;
        JOptionPane.showMessageDialog(null, "O numero maior entre " + num1 + " e " + num2 + " é o: " + greater);
    }

    public static void main(String[] args) {

        try {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
            showGreater(num1, num2);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
