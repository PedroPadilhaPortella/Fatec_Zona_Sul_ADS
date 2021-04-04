package interfaces;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

import controllers.ControlePessoa;
import models.Pessoa;

public class InterfacePessoa 
{    
    static int id;
    static String nome;
    static String idade;
    static String genero;
    static String peso;
    static String altura;
    
    static ControlePessoa controlePessoa;
    
    public InterfacePessoa() throws ClassNotFoundException, SQLException {
    	controlePessoa = new ControlePessoa();
    }
    
    
    public static void Inserir() throws SQLException {
        nome = JOptionPane.showInputDialog("NOME");
        idade = JOptionPane.showInputDialog("IDADE"); 
        genero = JOptionPane.showInputDialog("GENERO");
        peso = JOptionPane.showInputDialog("PESO");
        altura = JOptionPane.showInputDialog("ALTURA");
        Pessoa pEntrada = new Pessoa(nome,idade,genero,peso,altura);
        Pessoa pSaida = controlePessoa.inserir(pEntrada);
        JOptionPane.showMessageDialog(null,pSaida.toString());
    }
    
    public static void Alterar() throws SQLException {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        nome = JOptionPane.showInputDialog("NOME");
        idade = JOptionPane.showInputDialog("IDADE"); 
        genero = JOptionPane.showInputDialog("GENERO");
        peso = JOptionPane.showInputDialog("PESO");
        altura = JOptionPane.showInputDialog("ALTURA");
        Pessoa pEntrada = new Pessoa(id,nome,idade,genero,peso,altura);
        Pessoa pSaida = controlePessoa.alterar(pEntrada);
        JOptionPane.showMessageDialog(null,pSaida.toString());
    }

    public static void Listar() throws SQLException {
        nome = JOptionPane.showInputDialog("NOME");
        Pessoa pEntrada = new Pessoa(nome);
        List<Pessoa> psSaida = controlePessoa.listar(pEntrada);
        JOptionPane.showMessageDialog(null,psSaida.get(1).toString());
    }

    public static void Buscar() throws SQLException {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Pessoa pEntrada = new Pessoa(id);
        Pessoa pSaida = controlePessoa.buscarPorId(pEntrada);
        JOptionPane.showMessageDialog(null,pSaida.toString());
    }

    public static void Excluir() throws SQLException {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Pessoa pEntrada = new Pessoa(id);
        Pessoa pSaida = controlePessoa.excluir(pEntrada);
        JOptionPane.showMessageDialog(null,pSaida.toString());
    }
}