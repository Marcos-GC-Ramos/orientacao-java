package negocio;

import DAO.UsuarioCadastroDAO;

public class Login {
    /**
     * Autentica um usuário com base no login e senha fornecidos.
     * 
     * @param login o login do usuário a ser autenticado
     * @param senha a senha do usuário a ser autenticada
     * @return true se o usuário for autenticado com sucesso, false caso contrário
     */
    @SuppressWarnings("static-access")
    public boolean autenticarUsuario(String login, String senha) {
        // Criando uma instância de UsuarioCadastroDAO para verificar a autenticação do usuário
        UsuarioCadastroDAO usuarioCadastroDAO = new UsuarioCadastroDAO();

        // Verificando se o usuário existe na tabela usuario_cadastro
        if (usuarioCadastroDAO.verificarUsuario(login, senha)) {
            return true;
        } else {
            return false;
        }
    }
}
