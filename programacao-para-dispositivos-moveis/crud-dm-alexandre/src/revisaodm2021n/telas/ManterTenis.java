package revisaodm2021n.telas;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import revisaodm2021n.controles.ControleTenis;
import revisaodm2021n.dados.Tenis;

public class ManterTenis { 

	static int id;
	static String marca;
	static String cor;
	static int tamanho;
	static double preco;
    
    static ControleTenis controle;
    
    public static void Inserir() throws SQLException, ClassNotFoundException {
    	
    	marca = JOptionPane.showInputDialog("MARCA"); 
    	cor = JOptionPane.showInputDialog("COR");
    	tamanho = Integer.parseInt(JOptionPane.showInputDialog("TAMANHO"));
    	preco = Double.parseDouble(JOptionPane.showInputDialog("PRECO"));
    	
        Tenis pEntrada = new Tenis(marca, tamanho, cor, preco);
        controle = new ControleTenis();
        Tenis pSaida = controle.inserir(pEntrada);
        JOptionPane.showMessageDialog(null, pSaida.toString());
    }
    
    public static void Alterar() throws SQLException, ClassNotFoundException {
    	
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
    	marca = JOptionPane.showInputDialog("MARCA"); 
    	cor = JOptionPane.showInputDialog("COR");
    	tamanho = Integer.parseInt(JOptionPane.showInputDialog("TAMANHO"));
    	preco = Double.parseDouble(JOptionPane.showInputDialog("PRECO"));
    	
    	Tenis pEntrada = new Tenis(id, marca, tamanho, cor, preco);
        controle = new ControleTenis();
        Tenis pSaida = controle.alterar(pEntrada);
        JOptionPane.showMessageDialog(null, pSaida.toString());
    }

    public static void Listar() throws SQLException, ClassNotFoundException {
    	
    	marca = JOptionPane.showInputDialog("MARCA");
        
    	Tenis pEntrada = new Tenis(marca);
        controle = new ControleTenis();
        List<Tenis> psSaida = controle.listar(pEntrada);
        
        psSaida.forEach((tenis) -> {
            JOptionPane.showMessageDialog(null, tenis.toString());
        });
    }

    public static void Buscar() throws SQLException, ClassNotFoundException {
    	
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Tenis pEntrada = new Tenis(id);
        controle = new ControleTenis();
        Tenis pSaida = controle.buscar(pEntrada);
        JOptionPane.showMessageDialog(null,pSaida.toString());
        
    }

    public static void Excluir() throws SQLException, ClassNotFoundException {
    	
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Tenis pEntrada = new Tenis(id);
        controle = new ControleTenis();
        Tenis pSaida = controle.excluir(pEntrada);
        JOptionPane.showMessageDialog(null,pSaida.toString());
    }
}
