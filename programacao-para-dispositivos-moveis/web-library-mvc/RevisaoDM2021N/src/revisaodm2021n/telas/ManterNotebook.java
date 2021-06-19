package revisaodm2021n.telas;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import revisaodm2021n.controles.ControleNotebook;
import revisaodm2021n.dados.Notebook;

public class ManterNotebook {

    static int id;
    static String nome;
    static String marca;
    static String processador;
    static String ram;
    static String preco;

    static ControleNotebook controle;

    public static void Inserir() throws SQLException, ClassNotFoundException {

        nome = JOptionPane.showInputDialog("NOME");
        marca = JOptionPane.showInputDialog("MARCA");
        processador = JOptionPane.showInputDialog("PROCESSADOR");
        ram = JOptionPane.showInputDialog("RAM");
        preco = JOptionPane.showInputDialog("PRECO");

        Notebook pEntrada = new Notebook(nome, marca, processador, ram, preco);
        controle = new ControleNotebook();
        Notebook pSaida = controle.inserir(pEntrada);
        JOptionPane.showMessageDialog(null, pSaida.toString());
    }

    public static void Alterar() throws SQLException, ClassNotFoundException {

        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        nome = JOptionPane.showInputDialog("NOME");
        marca = JOptionPane.showInputDialog("MARCA");
        processador = JOptionPane.showInputDialog("PROCESSADOR");
        ram = JOptionPane.showInputDialog("RAM");
        preco = JOptionPane.showInputDialog("PRECO");

        Notebook pEntrada = new Notebook(id, nome, marca, processador, ram, preco);
        controle = new ControleNotebook();
        Notebook pSaida = controle.alterar(pEntrada);
        JOptionPane.showMessageDialog(null, pSaida.toString());
    }

    public static void Listar() throws SQLException, ClassNotFoundException {
        nome = JOptionPane.showInputDialog("NOME");

        Notebook pEntrada = new Notebook(nome);
        controle = new ControleNotebook();
        List<Notebook> psSaida = controle.listar(pEntrada);

        psSaida.forEach((note) -> {
            JOptionPane.showMessageDialog(null, note.toString());
        });
    }

    public static void Buscar() throws SQLException, ClassNotFoundException {

        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Notebook pEntrada = new Notebook(id);
        controle = new ControleNotebook();
        Notebook pSaida = controle.buscar(pEntrada);
        JOptionPane.showMessageDialog(null, pSaida.toString());

    }

    public static void Excluir() throws SQLException, ClassNotFoundException {

        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Notebook pEntrada = new Notebook(id);
        controle = new ControleNotebook();
        Notebook pSaida = controle.excluir(pEntrada);
        JOptionPane.showMessageDialog(null, pSaida.toString());
    }
}