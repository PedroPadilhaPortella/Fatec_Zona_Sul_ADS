package interfaces;

import java.util.List;
import javax.swing.JOptionPane;
import controles.ControleDepartamento;
import dados.Departamento;

public class InterfaceDepartamento
{
    static int id;
    static String nome;
    static String descricao;
    static String centrodecusto;
    
    static ControleDepartamento controleDepartamento = new ControleDepartamento();
    
    public static void Inserir()
    {
        nome = JOptionPane.showInputDialog("NOME");
        descricao = JOptionPane.showInputDialog("DESCRICAO"); 
        centrodecusto = JOptionPane.showInputDialog("CENTRODECUSTO");
        Departamento departamento = new Departamento(nome, descricao, centrodecusto);
        Departamento data = controleDepartamento.inserir(departamento);
        JOptionPane.showMessageDialog(null, data.toString());
    }
    
    public static void Alterar()
    {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        nome = JOptionPane.showInputDialog("NOME");
        descricao = JOptionPane.showInputDialog("DESCRICAO"); 
        centrodecusto = JOptionPane.showInputDialog("CENTRODECUSTO");
        Departamento departamento = new Departamento(id, nome, descricao, centrodecusto);
        Departamento data = controleDepartamento.alterar(departamento);
        JOptionPane.showMessageDialog(null, data.toString());
    }

    public static void Listar()
    {
        nome = JOptionPane.showInputDialog("NOME");
        Departamento departamento = new Departamento(nome);
        List<Departamento> data = controleDepartamento.listar(departamento);
        JOptionPane.showMessageDialog(null, data.get(0).toString());
    }

    public static void Buscar()
    {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Departamento departamento = new Departamento(id);
        Departamento data = controleDepartamento.buscar(departamento);
        JOptionPane.showMessageDialog(null, data.toString());
    }

    public static void Excluir()
    {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Departamento departamento = new Departamento(id);
        Departamento data = controleDepartamento.excluir(departamento);
        JOptionPane.showMessageDialog(null, data.toString());
    }
}