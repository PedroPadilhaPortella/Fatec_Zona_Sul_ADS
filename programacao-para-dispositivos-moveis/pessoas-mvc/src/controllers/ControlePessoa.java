package controllers;

import java.util.List;

import dao.PessoaDAO;
import models.Pessoa;
import models.PessoaFisica;

public class ControlePessoa {
    
    static PessoaDAO pessoaDAO = new PessoaDAO();
   
    public Pessoa inserir (Pessoa pessoa) {
        return pessoaDAO.inserir(pessoa);
    }
  
    public Pessoa alterar (Pessoa pessoa) {
        return pessoaDAO.alterar(pessoa);
    }
 
    public Pessoa excluir (Pessoa pessoa) {
        return pessoaDAO.excluir(pessoa);
    }
 
    public Pessoa buscar (Pessoa pessoa) {
        return pessoaDAO.buscar(pessoa);
    }
    
    public List<Pessoa> listar (Pessoa pessoa) {
        return pessoaDAO.listar(pessoa);
    }
    
    
    public PessoaFisica inserir (PessoaFisica pessoa) {
        return pessoaDAO.inserir(pessoa);
    }
  
    public PessoaFisica alterar (PessoaFisica pessoa) {
        return pessoaDAO.alterar(pessoa);
    }
 
    public PessoaFisica excluir (PessoaFisica pessoa) {
        return pessoaDAO.excluir(pessoa);
    }
 
    public PessoaFisica buscar (PessoaFisica pessoa) {
        return pessoaDAO.buscar(pessoa);
    }
    
    public List<PessoaFisica> listar (PessoaFisica pessoa) {
        return pessoaDAO.listar(pessoa);
    }
    
}
