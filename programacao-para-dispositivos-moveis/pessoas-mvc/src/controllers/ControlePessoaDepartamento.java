package controllers;

import java.sql.SQLException;
import java.util.List;

import dao.PessoaDepartamentoDAO;
import models.Departamento;
import models.Pessoa;
import models.PessoaDepartamento;

public class ControlePessoaDepartamento {
    
    PessoaDepartamentoDAO pessoaDepartamentoDAO;
    ControleDepartamento controleDepartamentp;
    ControlePessoa controlePessoa;
    
    public ControlePessoaDepartamento() throws ClassNotFoundException, SQLException {
    	pessoaDepartamentoDAO = new PessoaDepartamentoDAO();
    	controleDepartamentp = new ControleDepartamento();
    	controlePessoa = new ControlePessoa();
    }

    public List<PessoaDepartamento> listar (PessoaDepartamento pessoaDepartamento) throws SQLException {
        List<PessoaDepartamento> pessoasDepartamentos =  pessoaDepartamentoDAO.listar(pessoaDepartamento);
        Departamento departamento = new Departamento(pessoasDepartamentos.get(0).getId());
        Pessoa pessoa = new Pessoa(pessoasDepartamentos.get(0).getPessoaId());
        pessoasDepartamentos.get(0).setDepartamento(controleDepartamentp.buscar(departamento));
        pessoasDepartamentos.get(0).setPessoa(controlePessoa.buscarPorId(pessoa));
        return pessoasDepartamentos;
    }
}
