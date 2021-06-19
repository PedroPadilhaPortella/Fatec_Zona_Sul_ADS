package revisaodm2021n.modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import revisaodm2021n.dados.Notebook;
import revisaodm2021n.dados.Tenis;
import revisaodm2021n.util.ConexaoDb;

public class DaoTenis {

    private final Connection c;

    public DaoTenis() throws SQLException, ClassNotFoundException {
        this.c = new ConexaoDb().getConnection();
    }

    public Tenis buscar(Tenis tenis) throws SQLException {
        String sql = "select * from tenis WHERE id = ?";
        Tenis retorno;

        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setInt(1, tenis.getId());
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {

                retorno = new Tenis(
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

    public Tenis inserir(Tenis tenis) throws SQLException {
        String sql = "insert into tenis (marca, tamanho, cor, origem, preco)" + " values (?,?,?,?,?)";

        try (
                PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, tenis.getMarca());
            stmt.setString(2, tenis.getTamanho());
            stmt.setString(3, tenis.getCor());
            stmt.setString(4, tenis.getOrigem());
            stmt.setString(5, tenis.getPreco());

            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();

            if (rs.next()) {
                int id = rs.getInt(1);
                tenis.setId(id);
            }
        }
        c.close();
        return tenis;
    }

    public Tenis alterar(Tenis tenis) throws SQLException {
        String sql = "UPDATE tenis SET marca = ?, tamanho = ?, cor = ?, origem = ?, preco = ? WHERE id = ?";

        try (PreparedStatement stmt = c.prepareStatement(sql)) {

            stmt.setString(1, tenis.getMarca());
            stmt.setString(2, tenis.getTamanho());
            stmt.setString(3, tenis.getCor());
            stmt.setString(4, tenis.getOrigem());
            stmt.setString(5, tenis.getPreco());
            stmt.setInt(6, tenis.getId());

            stmt.execute();
        }
        return tenis;

    }

    public Tenis excluir(Tenis tenis) throws SQLException {

        String sql = "delete from tenis WHERE id = ?";

        try (PreparedStatement stmt = c.prepareStatement(sql)) {

            stmt.setInt(1, tenis.getId());

            stmt.execute();
        }
        c.close();
        return tenis;
    }

    public List<Tenis> listar(Tenis tenis) throws SQLException {

        List<Tenis> tenisDB = new ArrayList<>();

        String sql = "select * from tenis where marca like ?";

        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {

            stmt.setString(1, "%" + tenis.getMarca()+ "%");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Tenis pSaida = new Tenis(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6));

                tenisDB.add(pSaida);
            }

            rs.close();
        }
        return tenisDB;
    }
}
