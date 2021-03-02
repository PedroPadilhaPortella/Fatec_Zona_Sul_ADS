import javax.swing.JOptionPane;

public class ex05 {
    public static void main(String[] args)
    {
        String nome = JOptionPane.showInputDialog(null, "Qual seu nome?");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, nome + ", qual a sua idade?"));
        
        double total = 0;

        if(idade < 11)
            total = 30.0;
        else if(idade >= 11 && idade < 30)
            total = 60.0;
        else if(idade >= 31 && idade < 46)
            total = 120.0;
        else if(idade >= 46 && idade < 60)
            total = 150.0;
        else if(idade >= 60 && idade < 66)
            total = 250.0;
        else if(idade >= 66)
            total = 400.0;

        JOptionPane.showMessageDialog(null, nome + ", o valor de plano medio que você pagará será de R$ " + total);
    }
}