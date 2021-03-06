/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaodm2021n.telas.pessoa;

import java.util.List;
import javax.swing.JOptionPane;
import revisaodm2021n.controles.ControlePessoa;
import revisaodm2021n.dados.PessoaFisica;

/**
 *
 * @author User
 */
public class ManterPessoaFisica { 
    
    static int id;
    static String nome;
    static String cpf;
    static String rg;
    static String tel;
    static String situacao;
    static String email;
    
    static ControlePessoa contPes = new ControlePessoa();
    
    public static void Inserir() {
        nome = JOptionPane.showInputDialog("NOME");
        cpf = JOptionPane.showInputDialog("CPF"); 
        rg = JOptionPane.showInputDialog("RG");
        tel = JOptionPane.showInputDialog("TEL");
        situacao = JOptionPane.showInputDialog("SITUACAO");
        email = JOptionPane.showInputDialog("EMAIL");
        PessoaFisica pEntrada = new PessoaFisica(nome,cpf,rg,tel,situacao,email);
        PessoaFisica pSaida = contPes.inserir(pEntrada);
        JOptionPane.showMessageDialog(null,pSaida.toString());
    }
    
    public static void Alterar() {
        nome = JOptionPane.showInputDialog("NOME");
        cpf = JOptionPane.showInputDialog("CPF"); 
        rg = JOptionPane.showInputDialog("RG");
        tel = JOptionPane.showInputDialog("TEL");
        situacao = JOptionPane.showInputDialog("SITUACAO");
        email = JOptionPane.showInputDialog("EMAIL");
        PessoaFisica pEntrada = new PessoaFisica(id,nome,cpf,rg,tel,situacao,email);
        PessoaFisica pSaida = contPes.alterar(pEntrada);
        JOptionPane.showMessageDialog(null,pSaida.toString());
    }

    public static void Listar() {
        cpf = JOptionPane.showInputDialog("NOME");
        PessoaFisica pEntrada = new PessoaFisica(cpf);
        List<PessoaFisica> psSaida = contPes.listar(pEntrada);
        JOptionPane.showMessageDialog(null,psSaida.get(0).toString());
        
    }

    public static void Buscar() {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        PessoaFisica pEntrada = new PessoaFisica(id);
        PessoaFisica pSaida = contPes.buscar(pEntrada);
        JOptionPane.showMessageDialog(null,pSaida.toString());
        
    }

    public static void Excluir() {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        PessoaFisica pEntrada = new PessoaFisica(id);
        PessoaFisica pSaida = contPes.excluir(pEntrada);
        JOptionPane.showMessageDialog(null,pSaida.toString());
    }

}