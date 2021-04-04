package controllers;

import java.sql.SQLException;
import java.util.List;

import dao.PessoaDAO;
import models.Pessoa;

public class ControlePessoa {
    
    static PessoaDAO pessoaDAO;
    
    public ControlePessoa() throws SQLException, ClassNotFoundException {
    	pessoaDAO = new PessoaDAO();
    }
   
    public Pessoa inserir (Pessoa pessoa) throws SQLException {
        return pessoaDAO.inserir(pessoa);
    }
  
    public Pessoa alterar (Pessoa pessoa) throws SQLException {
        return pessoaDAO.alterar(pessoa);
    }
 
    public Pessoa excluir (Pessoa pessoa) throws SQLException {
        return pessoaDAO.excluir(pessoa);
    }
 
    public Pessoa buscarPorId (Pessoa pessoa) throws SQLException {
        return pessoaDAO.buscarPorId(pessoa);
    }
    
    public List<Pessoa> listar (Pessoa pessoa) throws SQLException {
        return pessoaDAO.listar(pessoa);
    }
    
    /*
    public PessoaFisica inserir (PessoaFisica pessoa) throws SQLException {
        return pessoaDAO.inserir(pessoa);
    }
  
    public PessoaFisica alterar (PessoaFisica pessoa) throws SQLException {
        return pessoaDAO.alterar(pessoa);
    }
 
    public PessoaFisica excluir (PessoaFisica pessoa) throws SQLException {
        return pessoaDAO.excluir(pessoa);
    }
 
    public PessoaFisica buscar (PessoaFisica pessoa) throws SQLException {
        return pessoaDAO.buscar(pessoa);
    }
    
    public List<PessoaFisica> listar (PessoaFisica pessoa) throws SQLException {
        return pessoaDAO.listar(pessoa);
    }
    */
}
