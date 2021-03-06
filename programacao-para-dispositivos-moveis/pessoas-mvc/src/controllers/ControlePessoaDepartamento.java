package controllers;

import java.util.List;

import dao.PessoaDepartamentoDAO;
import models.Departamento;
import models.Pessoa;
import models.PessoaDepartamento;

public class ControlePessoaDepartamento {
    
    PessoaDepartamentoDAO pessoaDepartamentoDAO = new PessoaDepartamentoDAO();
    ControleDepartamento controleDepartamentp = new ControleDepartamento();
    ControlePessoa controlePessoa = new ControlePessoa();

    public List<PessoaDepartamento> listar (PessoaDepartamento pessoaDepartamento) {
        List<PessoaDepartamento> pessoasDepartamentos =  pessoaDepartamentoDAO.listar(pessoaDepartamento);
        Departamento departamento = new Departamento(pessoasDepartamentos.get(0).getId());
        Pessoa pessoa = new Pessoa(pessoasDepartamentos.get(0).getPessoaId());
        pessoasDepartamentos.get(0).setDepartamento(controleDepartamentp.buscar(departamento));
        pessoasDepartamentos.get(0).setPessoa(controlePessoa.buscar(pessoa));
        return pessoasDepartamentos;
    }
}
