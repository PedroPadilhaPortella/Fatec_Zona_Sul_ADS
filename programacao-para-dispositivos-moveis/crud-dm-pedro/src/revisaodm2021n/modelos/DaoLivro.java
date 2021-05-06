package revisaodm2021n.modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import revisaodm2021n.dados.Livro;
import revisaodm2021n.util.ConexaoDb;

public class DaoLivro {

    private final Connection c;
   
    public DaoLivro() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDb().getConnection();
    }
   
    public Livro buscar (Livro livro) throws SQLException {
        String sql = "select * from livros WHERE id = ?";
        Livro retorno;
        
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setInt(1, livro.getId());
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {
            	
                retorno = new Livro(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getDouble(6));
            }
        }
        c.close();
        return retorno;
    }

    public Livro inserir (Livro livro) throws SQLException {
        String sql = "insert into livro" + " (titulo, autor, editora, genero, preco)" + " values (?,?,?,?,?)";
   
        try (
            PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
            
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setString(3, livro.getEditora());
            stmt.setString(4, livro.getGenero());
            stmt.setDouble(5, livro.getPreco());
            
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            
            if (rs.next()) {
                int id = rs.getInt(1);
                livro.setId(id);
            }
        }
        c.close();
        return livro;
    }

    public Livro alterar (Livro livro) throws SQLException {
        String sql = "UPDATE livro SET titulo = ?, autor = ?, editora = ?, genero = ?, preco = ? WHERE id = ?";

        try (PreparedStatement stmt = c.prepareStatement(sql)) {
        	
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setString(3, livro.getEditora());
            stmt.setString(4, livro.getGenero());
            stmt.setDouble(5, livro.getPreco());
            stmt.setInt(6, livro.getId());

            stmt.execute();
        }
        return livro;

    }

    public Livro excluir (Livro livro) throws SQLException {
    	
         String sql = "delete from livro WHERE id = ?";

        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            
            stmt.setInt(1, livro.getId());
            
            stmt.execute();
        }
        c.close();
        return livro;
    }

    public List<Livro> listar (Livro livro) throws SQLException {
    	
        List<Livro> livroDB = new ArrayList<>();
       
        String sql = "select * from livro where titulo like ?";
        
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
        	
            stmt.setString(1,"%" + livro.getTitulo()+ "%");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {

                Livro pSaida = new Livro(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getDouble(6));
                
                livroDB.add(pSaida);
            }
            
            rs.close();
        }
        return livroDB;
    }
}
