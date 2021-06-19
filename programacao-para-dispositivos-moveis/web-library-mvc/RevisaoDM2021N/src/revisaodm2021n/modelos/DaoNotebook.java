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

    public DaoNotebook() throws SQLException, ClassNotFoundException {
        this.c = new ConexaoDb().getConnection();
    }

    public Notebook buscar(Notebook notebook) throws SQLException {
        String sql = "select * from notebook WHERE id = ?";
        Notebook retorno;

        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setInt(1, notebook.getId());
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {

                retorno = new Notebook(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6));
            }
        }
        c.close();
        return retorno;
    }

    public Notebook inserir(Notebook notebook) throws SQLException {
        String sql = "insert into notebook (nome, marca, processador, ram, preco) values (?,?,?,?,?)";

        try (PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, notebook.getNome());
            stmt.setString(2, notebook.getMarca());
            stmt.setString(3, notebook.getProcessador());
            stmt.setString(4, notebook.getRam());
            stmt.setString(5, notebook.getPreco());

            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();

            if (rs.next()) {
                int id = rs.getInt(1);
                notebook.setId(id);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
        c.close();
        return notebook;
    }

    public Notebook alterar(Notebook notebook) throws SQLException {
        String sql = "UPDATE notebook SET nome = ?, marca = ?, processador = ?, ram = ?, preco = ? WHERE id = ?";
        System.out.println(notebook);
        try (PreparedStatement stmt = c.prepareStatement(sql)) {

            stmt.setString(1, notebook.getNome());
            stmt.setString(2, notebook.getMarca());
            stmt.setString(3, notebook.getProcessador());
            stmt.setString(4, notebook.getRam());
            stmt.setString(5, notebook.getPreco());
            stmt.setInt(6, notebook.getId());

            stmt.execute();
        }
        System.out.println(notebook);
        return notebook;

    }

    public Notebook excluir(Notebook notebook) throws SQLException {

        String sql = "delete from notebook WHERE id = ?";

        try (PreparedStatement stmt = c.prepareStatement(sql)) {

            stmt.setInt(1, notebook.getId());

            stmt.execute();
        }
        c.close();
        return notebook;
    }

    public List<Notebook> listar(Notebook notebook) throws SQLException {

        List<Notebook> notebookDB = new ArrayList<>();

        String sql = "select * from notebook where nome like ?";

        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {

            stmt.setString(1, "%" + notebook.getNome()+ "%");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Notebook pSaida = new Notebook(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6));

                notebookDB.add(pSaida);
            }

            rs.close();
        }
        return notebookDB;
    }
}
