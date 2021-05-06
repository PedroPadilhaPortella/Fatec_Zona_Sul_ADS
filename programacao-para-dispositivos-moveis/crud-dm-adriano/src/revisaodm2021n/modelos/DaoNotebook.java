package revisaodm2021n.modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import revisaodm2021n.dados.Notebook;
import revisaodm2021n.util.ConexaoDb;

public class DaoNotebook {

    private final Connection c;
   
    public DaoNotebook() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDb().getConnection();
    }
   
    public Notebook buscar (Notebook note) throws SQLException {
        String sql = "select * from notebook WHERE id = ?";
        Notebook retorno;
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setInt(1, note.getId());
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {
            	
                retorno = new Notebook(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getDouble(6));
            }
        }
        c.close();
        return retorno;
    }

    public Notebook inserir (Notebook note) throws SQLException {
        String sql = "insert into notebook" + " (nome, marca, processador, ram, preco)" + " values (?,?,?,?,?)";
   
        try (
            PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
            
            stmt.setString(1, note.getNome());
            stmt.setString(2, note.getMarca());
            stmt.setString(3, note.getProcessador());
            stmt.setInt(4, note.getRam());
            stmt.setDouble(5, note.getPreco());
            
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            
            if (rs.next()) {
                int id = rs.getInt(1);
                note.setId(id);
            }
        }
        c.close();
        return note;
    }

    public Notebook alterar (Notebook note) throws SQLException {
        String sql = "UPDATE notebook SET nome = ?, marca = ?, processador = ?, ram = ?, preco = ? WHERE id = ?";

        try (PreparedStatement stmt = c.prepareStatement(sql)) {
        	
            stmt.setString(1, note.getNome());
            stmt.setString(2, note.getMarca());
            stmt.setString(3, note.getProcessador());
            stmt.setInt(4, note.getRam());
            stmt.setDouble(5, note.getPreco());
            
            stmt.setInt(6, note.getId());

            stmt.execute();
        }
        return note;

    }

    public Notebook excluir (Notebook note) throws SQLException {
    	
         String sql = "delete from notebook WHERE id = ?";

        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            
            stmt.setInt(1, note.getId());
            
            stmt.execute();
        }
        c.close();
        return note;
    }

    public List<Notebook> listar (Notebook note) throws SQLException {
    	
        List<Notebook> noteBD = new ArrayList<>();
       
        String sql = "select * from notebook where nome like ?";
        
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
        	
            stmt.setString(1, "%" + note.getNome()+ "%");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {

                Notebook pSaida = new Notebook(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getDouble(6));
                
                noteBD.add(pSaida);
            }
            
            rs.close();
        }
        return noteBD;
    }
}
