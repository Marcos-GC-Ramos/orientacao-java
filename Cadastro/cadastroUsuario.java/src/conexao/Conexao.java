package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    // URL de conexão com o banco de dados MySQL
    private static final String url = "jdbc:mysql://localhost:3306/cadastro_usuario";
    
    // Nome de usuário do banco de dados
    private static final String usuario = "root";
    
    // Senha do banco de dados
    private static final String senha = "root123456789";

    // Variável para armazenar a conexão com o banco de dados
    private static Connection coon;

    // Método para obter uma conexão com o banco de dados
    public static Connection getConexao() {
        try {
            // Verifica se a conexão está nula ou fechada
            if (coon == null || coon.isClosed()) {
                // Registro do driver JDBC
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Estabelece uma nova conexão com o banco de dados
                coon = DriverManager.getConnection(url, usuario, senha);
                return coon;
            } else {
                // Retorna a conexão existente se não estiver nula ou fechada
                return coon;
            }
        } catch (SQLException | ClassNotFoundException e) {
            // Imprime qualquer exceção SQL ou ClassNotFoundException que ocorra
            e.printStackTrace();
            return null;
        }
    }
}