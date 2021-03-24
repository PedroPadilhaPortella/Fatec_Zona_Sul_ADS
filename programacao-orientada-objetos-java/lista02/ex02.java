import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class ex02 {
    public static void main(String[] args)
    {    
        List<Integer> valores = new ArrayList<Integer>();

        int valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro valor: "));
        valores.add(valor1);
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo valor: "));
        valores.add(valor2);
        int valor3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ultimo valor: "));
        valores.add(valor3);

        Collections.sort(valores);

        JOptionPane.showMessageDialog(null, "Os Números em Ordem Crescente são:\n" + 
            valores.toString());
    }
}