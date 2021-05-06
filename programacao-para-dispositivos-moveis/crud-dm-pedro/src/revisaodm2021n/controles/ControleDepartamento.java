package revisaodm2021n.controles;

import java.sql.SQLException;
import java.util.List;
import revisaodm2021n.dados.Departamento;
import revisaodm2021n.modelos.DaoDepartamento;


public class ControleDepartamento {
    
static DaoDepartamento service;
    
    public ControleDepartamento() throws SQLException, ClassNotFoundException {
    	service = new DaoDepartamento();
    }
    
    public Departamento inserir (Departamento d) throws SQLException {
        return service.inserir(d);
    }
    
    public Departamento alterar (Departamento d) throws SQLException {
        return service.alterar(d);
    }

    public Departamento buscar (Departamento d) throws SQLException {
        return service.buscar(d);
    }

    public Departamento excluir (Departamento d) throws SQLException {
        return service.excluir(d);
    }

    public List<Departamento> listar (Departamento d) throws SQLException {
        return service.listar(d);
    }
}
