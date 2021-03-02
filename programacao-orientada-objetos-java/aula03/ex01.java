import javax.swing.JOptionPane;
public class ex01 {
    public static void main(String[] args) {

        try {
            int valorInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inicial"));
            int valorFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor final")); 
            String msg = " ";
        
            if(valorInicial > valorFinal)
                throw new Exception("Valor inicial deve ser menor que o final.");

            for(int i = valorInicial; i <= valorFinal; i++){
                if(i % 2 == 0)
                    msg += " " + i;
            }
            JOptionPane.showMessageDialog(null, "Números pares no intervalo informado: " + msg);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }
}
