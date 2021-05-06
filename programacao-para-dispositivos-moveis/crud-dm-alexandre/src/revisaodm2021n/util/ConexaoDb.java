package revisaodm2021n.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoDb {
    
    public Connection getConnection() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String serverName = "localhost";    
            String mydatabase ="bittencourt";        
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?useTimezone=true&serverTimezone=UTC&useSSL=false";
            String username = "root";        
            String password = "root";
            Connection c = DriverManager.getConnection(url, username, password);
            if (c != null) System.out.println("STATUS--->Conectado com sucesso!");
            return c;
            
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            System.out.println("STATUS---> Erro " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
