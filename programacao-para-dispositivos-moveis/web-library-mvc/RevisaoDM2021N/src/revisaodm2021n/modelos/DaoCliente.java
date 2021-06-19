package revisaodm2021n.modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import revisaodm2021n.dados.Cliente;

import revisaodm2021n.util.ConexaoDb;

public class DaoCliente {

    private final Connection c;

    public DaoCliente() throws SQLException, ClassNotFoundException {
        this.c = new ConexaoDb().getConnection();
    }

    public Cliente buscar(Cliente cliente) throws SQLException {
        String sql = "select * from cliente WHERE id = ?";
        Cliente retorno;

        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setInt(1, cliente.getId());
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {

                retorno = new Cliente(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
            }
        }
        c.close();
        return retorno;
    }

    public Cliente inserir(Cliente cliente) throws SQLException {
        String sql = "insert into cliente (nome, cpf, email)" + " values (?,?,?)";

        try (PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getEmail());

            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();

            if (rs.next()) {
                int id = rs.getInt(1);
                cliente.setId(id);
            }
        }
        c.close();
        return cliente;
    }

    public Cliente alterar(Cliente cliente) throws SQLException {
        String sql = "UPDATE cliente SET nome = ?, cpf = ?, email = ? WHERE id = ?";

        try (PreparedStatement stmt = c.prepareStatement(sql)) {

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getEmail());
            stmt.setInt(4, cliente.getId());

            stmt.execute();
        }
        return cliente;

    }

    public Cliente excluir(Cliente cliente) throws SQLException {

        String sql = "delete from cliente WHERE id = ?";

        try (PreparedStatement stmt = c.prepareStatement(sql)) {

            stmt.setInt(1, cliente.getId());

            stmt.execute();
        }
        c.close();
        return cliente;
    }

    public List<Cliente> listar(Cliente cliente) throws SQLException {

        List<Cliente> clienteDB = new ArrayList<>();

        String sql = "select * from cliente where nome like ?";

        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {

            stmt.setString(1, "%" + cliente.getNome()+ "%");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente pSaida = new Cliente(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));

                clienteDB.add(pSaida);
            }

            rs.close();
        }
        return clienteDB;
    }
}
