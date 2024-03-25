package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Conexao.Conexao;

public class UsuarioCadastroDAO {
    /**
     * Verifica se um usuário está cadastrado no banco de dados.
     * 
     * @param login o login do usuário a ser verificado
     * @param senha a senha do usuário a ser verificada
     * @return true se o usuário existe, false caso contrário
     */
    public static boolean verificarUsuario(String login, String senha) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        //Conexão e verificação 
        try {
            conn = Conexao.getConexao();
            String query = "SELECT * FROM cadastro_usuario.usuario WHERE login = ? AND senha = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, login); // Primeiro parâmetro é o login
            stmt.setString(2, senha); // Segundo parâmetro é a senha
           // Executa a consulta SQL
            rs = stmt.executeQuery();
            
            // Se houver algum resultado, significa que o usuário existe
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            // Fecha os recursos (ResultSet, PreparedStatement e Connection)
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                // Imprime qualquer exceção SQL que ocorra ao fechar os recursos
                e.printStackTrace();
            }
        }
    }
}
