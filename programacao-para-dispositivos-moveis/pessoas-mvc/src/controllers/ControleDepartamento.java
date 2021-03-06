package controllers;

import java.util.List;

import dao.DepartamentoDAO;
import models.Departamento;

public class ControleDepartamento {
    
    static DepartamentoDAO departamentoDAO = new DepartamentoDAO();
    
    public Departamento inserir (Departamento departamento) {
        return departamentoDAO.inserir(departamento);
    }
    
    public Departamento alterar (Departamento departamento) {
        return departamentoDAO.alterar(departamento);
    }

    public Departamento buscar (Departamento departamento) {
        return departamentoDAO.buscar(departamento);
    }

    public Departamento excluir (Departamento departamento) {
        return departamentoDAO.excluir(departamento);
    }

    public List<Departamento> listar (Departamento departamento) {
        return departamentoDAO.listar(departamento);
    }
}