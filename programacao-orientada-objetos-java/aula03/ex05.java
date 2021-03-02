import javax.swing.JOptionPane;

public class ex05 {
    public static void main(String[] args) { 

        try {
            int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite superior"));
            int intervalo = Integer.parseInt(JOptionPane.showInputDialog("Digite o intervalo de números")); 
            String msg = " "; 
        
            if(limite <= 0 || intervalo <= 0)
                throw new Exception("O limite e nem o intervalo pode ser 0 ou menor!"); 
            
            for(int c = 0; c <= limite; c += intervalo)
                msg += " " + c;
            
            JOptionPane.showMessageDialog(null, "Números no intervalo informado:" + msg);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }
}
