package interfaces;

import java.util.List;

import javax.swing.JOptionPane;

import controllers.ControleProduto;
import models.Produto;

public class InterfaceProduto
{
    static int id;
    static String nome;
    static String preco;
    static String quantidade;  
    
    static ControleProduto controleProduto = new ControleProduto();
    
    public static void Inserir()
    {
        nome = JOptionPane.showInputDialog("NOME"); 
        preco = JOptionPane.showInputDialog("PRECO");
        quantidade = JOptionPane.showInputDialog("QUANTIDADE");
        Produto data = new Produto(nome, preco, quantidade);
        Produto dominio = controleProduto.inserir(data);
        JOptionPane.showMessageDialog(null, dominio.toString());
    }
    
    public static void Alterar()
    {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        nome = JOptionPane.showInputDialog("NOME"); 
        preco = JOptionPane.showInputDialog("PRECO");
        quantidade = JOptionPane.showInputDialog("QUANTIDADE");
        Produto data = new Produto(id, nome, preco, quantidade);
        Produto dominio = controleProduto.alterar(data);
        JOptionPane.showMessageDialog(null, dominio.toString());
    }

    public static void Listar()
    {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Produto data = new Produto(id);
        List<Produto> dominios = controleProduto.listar(data);
        JOptionPane.showMessageDialog(null, dominios.get(1).toString());
    }

    public static void Buscar()
    {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Produto data = new Produto(id);
        Produto dominio = controleProduto.buscar(data);
        JOptionPane.showMessageDialog(null, dominio.toString());
    }

    public static void Excluir()
    {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Produto data = new Produto(id);
        Produto dominio = controleProduto.excluir(data);
        JOptionPane.showMessageDialog(null, dominio.toString());
    }
}
