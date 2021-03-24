import javax.swing.JOptionPane;

public class ex04 {
    public static void main(String[] args)
    {
        String nome = JOptionPane.showInputDialog(null, "Qual seu nome?");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, nome + ", qual a sua idade?"));
        
        String message = "";

        if(idade < 16)
            message = "Não eleitor";
        else if(idade >= 18 && idade < 65)
            message = "Eleitor obrigatório";
        else
            message = "Eleitor não obrigatório";

        JOptionPane.showMessageDialog(null, nome + ", você é um " + message);
    }
}