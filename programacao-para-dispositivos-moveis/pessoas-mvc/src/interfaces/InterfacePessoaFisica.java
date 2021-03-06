package interfaces;

import java.util.List;

import javax.swing.JOptionPane;

import controllers.ControlePessoa;
import models.PessoaFisica;

public class InterfacePessoaFisica
{
	 static int id;
    static String nome;
    static String cpf;
    static String rg;
    static String telefone;
    static String situacao;
    static String email;
    
    static ControlePessoa controlePessoa = new ControlePessoa();
    
    public static void Inserir() {
        nome = JOptionPane.showInputDialog("NOME");
        cpf = JOptionPane.showInputDialog("CPF"); 
        rg = JOptionPane.showInputDialog("RG");
        telefone = JOptionPane.showInputDialog("TELEFONE");
        situacao = JOptionPane.showInputDialog("SITUACAO");
        email = JOptionPane.showInputDialog("EMAIL");
        PessoaFisica data = new PessoaFisica(nome, cpf, rg, telefone, situacao, email);
        PessoaFisica dominio = controlePessoa.inserir(data);
        JOptionPane.showMessageDialog(null,dominio.toString());
    }
    
    public static void Alterar() {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        nome = JOptionPane.showInputDialog("NOME");
        cpf = JOptionPane.showInputDialog("CPF"); 
        rg = JOptionPane.showInputDialog("RG");
        situacao = JOptionPane.showInputDialog("SITUACAO");
        email = JOptionPane.showInputDialog("EMAIL");
        PessoaFisica data = new PessoaFisica(nome, cpf, rg, telefone, situacao, email);
        PessoaFisica dominio = controlePessoa.alterar(data);
        JOptionPane.showMessageDialog(null,dominio.toString());
    }

    public static void Listar() {
        nome = JOptionPane.showInputDialog("NOME");
        PessoaFisica data = new PessoaFisica(nome);
        List<PessoaFisica> psSaida = controlePessoa.listar(data);
        JOptionPane.showMessageDialog(null,psSaida.get(1).toString());
    }

    public static void Buscar() {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        PessoaFisica data = new PessoaFisica(id);
        PessoaFisica dominio = controlePessoa.buscar(data);
        JOptionPane.showMessageDialog(null,dominio.toString());
    }

    public static void Excluir() {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        PessoaFisica data = new PessoaFisica(id);
        PessoaFisica dominio = controlePessoa.excluir(data);
        JOptionPane.showMessageDialog(null,dominio.toString());
    }
}
