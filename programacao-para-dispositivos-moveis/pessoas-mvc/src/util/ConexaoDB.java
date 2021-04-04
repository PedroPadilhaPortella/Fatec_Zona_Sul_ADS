package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB
{
	public Connection getConnection() throws ClassNotFoundException
	{
		try {
			String CLASSE_DRIVER = "com.mysql.jdbc.Driver";
			Class.forName(CLASSE_DRIVER);
			
			String USUARIO = "root";
			String SENHA = "root";
			String URL_SERVIDOR = "jdbc:mysql://localhost:3306/pessoas-mvc-ads?useSSL=false&useTimeZone=true&serverTimeZone=UTC";
		
			Connection connection = DriverManager.getConnection(URL_SERVIDOR, USUARIO, SENHA);
			if(connection != null) System.out.println("STATUS: Conectado cok sucesso.");
			return connection;
		} 
		catch(SQLException e) {
			System.out.println("Não foi possível conectar ao Banco de Dados\nSTATUS ERRO: " + e.getMessage());
			throw new RuntimeException(e);
		}
	}
}
