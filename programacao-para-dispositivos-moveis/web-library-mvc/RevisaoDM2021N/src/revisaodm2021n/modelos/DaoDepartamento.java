package revisaodm2021n.modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import revisaodm2021n.dados.Departamento;
import revisaodm2021n.util.ConexaoDb;

public class DaoDepartamento {
    
	private final Connection c;
	   
    public DaoDepartamento() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDb().getConnection();
    }
   
    public Departamento buscar (Departamento departamento) throws SQLException {
        String sql = "select * from dep_departamento WHERE dep_id = ?";
        Departamento retorno;
        
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setInt(1, departamento.getId());
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {
            	
                retorno = new Departamento(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
            }
        }
        c.close();
        return retorno;
    }

    public Departamento inserir (Departamento departamento) throws SQLException {
        String sql = "insert into dep_departamento (dep_nome, dep_desc, dep_cencusto)" + " values (?,?,?)";
   
        try (
            PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
            
            stmt.setString(1, departamento.getNome());
            stmt.setString(2, departamento.getDescricao());
            stmt.setString(3, departamento.getCentrodecusto());
            
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            
            if (rs.next()) {
                int id = rs.getInt(1);
                departamento.setId(id);
            }
        }
        c.close();
        return departamento;
    }

    public Departamento alterar (Departamento departamento) throws SQLException {
        String sql = "UPDATE dep_departamento SET dep_nome = ?, dep_desc = ?, dep_cencusto = ? WHERE dep_id = ?";

        try (PreparedStatement stmt = c.prepareStatement(sql)) {
        	
            stmt.setString(1, departamento.getNome());
            stmt.setString(2, departamento.getDescricao());
            stmt.setString(3, departamento.getCentrodecusto());
            
            stmt.setInt(4, departamento.getId());

            stmt.execute();
        }
        return departamento;

    }

    public Departamento excluir (Departamento departamento) throws SQLException {
    	
         String sql = "delete from dep_departamento WHERE dep_id = ?";

        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            
            stmt.setInt(1, departamento.getId());
            
            stmt.execute();
        }
        c.close();
        return departamento;
    }

    public List<Departamento> listar (Departamento departamento) throws SQLException {
    	
        List<Departamento> departamentoDB = new ArrayList<>();
       
        String sql = "select * from dep_departamento where dep_nome like ?";
        
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
        	
            stmt.setString(1,"%" + departamento.getNome()+ "%");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {

            	Departamento pSaida = new Departamento(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
                
            	departamentoDB.add(pSaida);
            }
            
            rs.close();
        }
        return departamentoDB;
    }
}