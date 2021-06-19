package revisaodm2021n.telas;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import revisaodm2021n.controles.ControleEmprestimo;
import revisaodm2021n.dados.Emprestimo;

public class ManterEmprestimo {

    static int id;
    static String idLivro;
    static String idCliente;
    static String dataEmprestimo;

    static ControleEmprestimo controle;

    public static void Inserir() throws SQLException, ClassNotFoundException {

        idLivro = JOptionPane.showInputDialog("ID LIVRO");
        idCliente = JOptionPane.showInputDialog("ID CLIENTE");
        dataEmprestimo = JOptionPane.showInputDialog("DATA DE EMPRESTIMO");

        Emprestimo pEntrada = new Emprestimo(idLivro, idCliente, dataEmprestimo);
        controle = new ControleEmprestimo();
        Emprestimo pSaida = controle.inserir(pEntrada);
        JOptionPane.showMessageDialog(null, pSaida.toString());
    }

    public static void Alterar() throws SQLException, ClassNotFoundException {

        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        idLivro = JOptionPane.showInputDialog("ID LIVRO");
        idCliente = JOptionPane.showInputDialog("ID CLIENTE");
        dataEmprestimo = JOptionPane.showInputDialog("DATA DE EMPRESTIMO");

        Emprestimo pEntrada = new Emprestimo(id, idLivro,idCliente, dataEmprestimo);
        controle = new ControleEmprestimo();
        Emprestimo pSaida = controle.alterar(pEntrada);
        JOptionPane.showMessageDialog(null, pSaida.toString());
    }
    
    public static void ListarPorCliente() throws SQLException, ClassNotFoundException {
        idCliente = JOptionPane.showInputDialog("CLIENTE");

        Emprestimo pEntrada = new Emprestimo(idCliente);
        controle = new ControleEmprestimo();
        List<Emprestimo> psSaida = controle.listarPorCliente(pEntrada);

        psSaida.forEach((emprestimo) -> {
            JOptionPane.showMessageDialog(null, emprestimo.toString());
        });
    }

    public static void Buscar() throws SQLException, ClassNotFoundException {

        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        
        Emprestimo pEntrada = new Emprestimo(id);
        controle = new ControleEmprestimo();
        Emprestimo pSaida = controle.buscar(pEntrada);
        JOptionPane.showMessageDialog(null, pSaida.toString());

    }

    public static void Excluir() throws SQLException, ClassNotFoundException {

        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        
        Emprestimo pEntrada = new Emprestimo(id);
        controle = new ControleEmprestimo();
        Emprestimo pSaida = controle.excluir(pEntrada);
        JOptionPane.showMessageDialog(null, pSaida.toString());
    }
}