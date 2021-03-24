import javax.swing.JOptionPane;

public class ex02
{
    static long fibo(int n){
        if(n < 2)
            return n;
        else
            return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {

        try {
            int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos termos Fibonacci deseja"));
            String msg = " ";

            if (valor1 <= 0)
                throw new PersonalException("O valor deve ser maior que 0!");

            for (int i = 0; i < valor1; i++)
                msg += fibo(i + 1) + " ";

          JOptionPane.showMessageDialog(null, "Sequência de Fibonacci até o " + valor1 + "º termo:" + msg);
        }
        catch (PersonalException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro, algo não está correto");
        }
    }
}
