package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;
import entity.Usuario;

public class UsuarioDAO {
    /**
     * Cadastra um novo usuário no banco de dados.
     * 
     * @param usuario o objeto Usuario a ser cadastrado
     */
    public void cadastrarUsuario(Usuario usuario){

        // Consulta SQL para verificar se o login já está em uso
        String sqlVerificarLogin = "SELECT COUNT(*) FROM USUARIO WHERE LOGIN = ?";
        
        // Consulta SQL para inserir um novo usuário no banco de dados
        String sqlInserirUsuario = "INSERT INTO USUARIO (NOME,LOGIN, SENHA) VALUES (?,?,?)";
        
        try {
            // Preparando a consulta para verificar se o login já está em uso
            PreparedStatement psVerificarLogin = Conexao.getConexao().prepareStatement(sqlVerificarLogin);
            psVerificarLogin.setString(1, usuario.getLogin());
            ResultSet rs = psVerificarLogin.executeQuery();
            
            // Verificando se o login já está em uso
            int quantidadeUsuarios = 0;
            if (rs.next()) {
                quantidadeUsuarios = rs.getInt(1);
                if (quantidadeUsuarios > 0) {
                    System.out.println("Erro: Este login já está em uso.");
                    return;
                }
            }
            
            // Preparando a consulta para inserir um novo usuário
            PreparedStatement psInserirUsuario = Conexao.getConexao().prepareStatement(sqlInserirUsuario);
            psInserirUsuario.setString(1, usuario.getNome());
            psInserirUsuario.setString(2, usuario.getLogin());
            psInserirUsuario.setString(3, usuario.getSenha());

            // Executando a consulta para inserir um novo usuário
            int linhasAfetadas = psInserirUsuario.executeUpdate();
            
            // Verificando se o usuário foi cadastrado com sucesso
            if (linhasAfetadas > 0) {
                System.out.println("Usuário cadastrado com sucesso.");
            } else {
                System.out.println("Erro: Nenhum registro foi adicionado. Verifique os dados e tente novamente.");
            }

            // Fechando os PreparedStatement
            psInserirUsuario.close();
            psVerificarLogin.close();
        } catch (SQLException e) {
            // Imprimindo o erro caso ocorra uma exceção SQL
            System.out.println("Erro ao cadastrar usuário: " + e.getMessage());
        } finally {
            // Certifique-se de fechar a conexão após o uso
            try {
                Conexao.getConexao().close();
            } catch (SQLException e) {
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
    }
}
