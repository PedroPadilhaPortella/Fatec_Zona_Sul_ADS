package revisaodm2021n.modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import revisaodm2021n.dados.Emprestimo;

import revisaodm2021n.util.ConexaoDb;

public class DaoEmprestimo {

    private final Connection c;

    public DaoEmprestimo() throws SQLException, ClassNotFoundException {
        this.c = new ConexaoDb().getConnection();
    }

    public Emprestimo buscar(Emprestimo emprestimo) throws SQLException {
        String sql = "select emprestimo.id, cliente.nome, livro.titulo, emprestimo.data_emprestimo "
            + "from cliente, livro, emprestimo "
            + "where cliente.id = emprestimo.id_cliente and emprestimo.id_livro = livro.id "
            + "and emprestimo.id = ?";
        Emprestimo retorno;

        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setInt(1, emprestimo.getId());
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {

                retorno = new Emprestimo(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
            }
        }
        c.close();
        return retorno;
    }

    public Emprestimo inserir(Emprestimo emprestimo) throws SQLException {
        String sql = "insert into emprestimo (id_livro, id_cliente, data_emprestimo)" + " values (?,?,?)";

        try (PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, emprestimo.getIdLivro());
            stmt.setString(2, emprestimo.getIdCliente());
            stmt.setString(3, emprestimo.getDataEmprestimo());

            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();

            if (rs.next()) {
                int id = rs.getInt(1);
                emprestimo.setId(id);
            }
        }
        c.close();
        return emprestimo;
    }

    public Emprestimo alterar(Emprestimo emprestimo) throws SQLException {
        String sql = "UPDATE emprestimo SET id_livro = ?, id_cliente = ?, data_emprestimo = ? WHERE id = ?";

        try (PreparedStatement stmt = c.prepareStatement(sql)) {

            stmt.setString(1, emprestimo.getIdLivro());
            stmt.setString(2, emprestimo.getIdCliente());
            stmt.setString(3, emprestimo.getDataEmprestimo());
            stmt.setInt(4, emprestimo.getId());

            stmt.execute();
        }
        c.close();
        return emprestimo;

    }

    public Emprestimo excluir(Emprestimo emprestimo) throws SQLException {

        String sql = "delete from emprestimo WHERE id = ?";

        try (PreparedStatement stmt = c.prepareStatement(sql)) {

            stmt.setInt(1, emprestimo.getId());

            stmt.execute();
        }
        c.close();
        return emprestimo;
    }
    
    public List<Emprestimo> listarPorCliente(Emprestimo emprestimo) throws SQLException {

        List<Emprestimo> emprestimoLista = new ArrayList<>();

        String sql = "select emprestimo.id, cliente.nome, livro.titulo, emprestimo.data_emprestimo "
            + "from cliente, livro, emprestimo "
            + "where cliente.id = emprestimo.id_cliente and emprestimo.id_livro = livro.id "
            + "and cliente.nome like ?";

        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {

            stmt.setString(1, "%" + emprestimo.getIdCliente()+ "%");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Emprestimo pSaida = new Emprestimo(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));

                emprestimoLista.add(pSaida);
            }

            rs.close();
        }
        return emprestimoLista;
    }
}
