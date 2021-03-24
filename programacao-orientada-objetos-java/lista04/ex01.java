import javax.swing.JOptionPane;

class ex01 {

    public static int DobraInteiro(int value) {
        int raio = value * 2;
        return raio;
    }

    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor!"));
            int dobro = DobraInteiro(num);
            JOptionPane.showMessageDialog(null, "O dobro de " + num + " é igual a " + dobro);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
