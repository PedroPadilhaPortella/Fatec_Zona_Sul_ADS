package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.Pessoa;
import util.ConexaoDB;

public class PessoaDAO
{   	
	private final Connection connection;
	
	public PessoaDAO() throws SQLException, ClassNotFoundException {
		this.connection = new ConexaoDB().getConnection();
	}
	
	public Pessoa buscarPorId(Pessoa p) throws SQLException {
		String sql = "select * from pessoa where id = ?";
		Pessoa pessoa = null;
		
		try (PreparedStatement stmt = this.connection.prepareStatement(sql))
		{
			stmt.setInt(1, p.getId());
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				pessoa = new Pessoa (
					rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString(4),
					rs.getString(5),
					rs.getString(6));
			}
			rs.close();
		}
		connection.close();
		return pessoa;
	}
	
	public Pessoa inserir(Pessoa pessoa) throws SQLException {
		String sql = "insert into pessoa (nome, idade, genero, peso, altura) values (?, ?, ?, ?, ?)";
		
		try (PreparedStatement stmt = this.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS))
		{
			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, pessoa.getIdade());
			stmt.setString(3, pessoa.getGenero());
			stmt.setString(4, pessoa.getPeso());
			stmt.setString(5, pessoa.getAltura());
			
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				int id = rs.getInt(1);
				pessoa.setId(id);
			}
			rs.close();
		}
		connection.close();
		return pessoa;
	}
	
	public Pessoa alterar(Pessoa pessoa) throws SQLException {
		String sql = "update pessoa set nome = ?, idade = ?, genero = ?, peso = ? , altura = ?";
		
		try (PreparedStatement stmt = this.connection.prepareStatement(sql)) {
			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, pessoa.getIdade());
			stmt.setString(3, pessoa.getGenero());
			stmt.setString(4, pessoa.getPeso());
			stmt.setString(5, pessoa.getAltura());
			stmt.setInt(6, pessoa.getId());
			
			stmt.execute();
		}
		connection.close();
		return pessoa;
	}
	
	public Pessoa excluir (Pessoa pessoa) throws SQLException {
		String sql = "delete from pessoa where id = ?";
		
		try (PreparedStatement stmt = this.connection.prepareStatement(sql)) {
			stmt.setInt(1, pessoa.getId());
			stmt.execute();
		}
		connection.close();
		return pessoa;
	}
	
	public List<Pessoa> listar (Pessoa p) throws SQLException
	{
       List<Pessoa> pessoas = new ArrayList<>();
       String sql = "select * from pessoa where nome like ?";
       
       try (PreparedStatement stmt = this.connection.prepareStatement(sql)) {
    	   
           stmt.setString(1,"%" + p.getNome()+ "%");
           ResultSet rs = stmt.executeQuery();
           
           while (rs.next()) {
               Pessoa pessoa = new Pessoa(
                       rs.getInt(1),
                       rs.getString(2),
                       rs.getString(3),
                       rs.getString(4),
                       rs.getString(5),
                       rs.getString(6));
               
               pessoas.add(pessoa);
           }
           rs.close();
       }
       connection.close();
       return pessoas;
   }
	
}