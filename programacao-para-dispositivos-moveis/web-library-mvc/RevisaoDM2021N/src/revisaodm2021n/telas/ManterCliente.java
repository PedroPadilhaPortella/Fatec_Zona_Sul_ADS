package revisaodm2021n.telas;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import revisaodm2021n.controles.ControleCliente;
import revisaodm2021n.dados.Cliente;

public class ManterCliente {

    static int id;
    static String nome;
    static String cpf;
    static String email;

    static ControleCliente controle;

    public static void Inserir() throws SQLException, ClassNotFoundException {

        nome = JOptionPane.showInputDialog("NOME");
        cpf = JOptionPane.showInputDialog("CPF");
        email = JOptionPane.showInputDialog("EMAIL");

        Cliente pEntrada = new Cliente(nome, cpf, email);
        controle = new ControleCliente();
        Cliente pSaida = controle.inserir(pEntrada);
        JOptionPane.showMessageDialog(null, pSaida.toString());
    }

    public static void Alterar() throws SQLException, ClassNotFoundException {

        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        nome = JOptionPane.showInputDialog("NOME");
        cpf = JOptionPane.showInputDialog("CPF");
        email = JOptionPane.showInputDialog("EMAIL");

        Cliente pEntrada = new Cliente(id, nome, cpf, email);
        controle = new ControleCliente();
        Cliente pSaida = controle.alterar(pEntrada);
        JOptionPane.showMessageDialog(null, pSaida.toString());
    }

    public static void Listar() throws SQLException, ClassNotFoundException {
        nome = JOptionPane.showInputDialog("NOME");

        Cliente pEntrada = new Cliente(nome);
        controle = new ControleCliente();
        List<Cliente> psSaida = controle.listar(pEntrada);

        psSaida.forEach((cliente) -> {
            JOptionPane.showMessageDialog(null, cliente.toString());
        });
    }

    public static void Buscar() throws SQLException, ClassNotFoundException {

        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Cliente pEntrada = new Cliente(id);
        controle = new ControleCliente();
        Cliente pSaida = controle.buscar(pEntrada);
        JOptionPane.showMessageDialog(null, pSaida.toString());

    }

    public static void Excluir() throws SQLException, ClassNotFoundException {

        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Cliente pEntrada = new Cliente(id);
        controle = new ControleCliente();
        Cliente pSaida = controle.excluir(pEntrada);
        JOptionPane.showMessageDialog(null, pSaida.toString());
    }
}