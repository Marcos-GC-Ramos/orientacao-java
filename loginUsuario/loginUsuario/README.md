## Classe Login

A classe Login é responsável por gerenciar o processo de autenticação de usuários no sistema. Ela oferece funcionalidades para verificar as credenciais de login dos usuários existentes.

### Utilização:

Para utilizar a classe Login em seu projeto, siga os passos abaixo:

1. Integre o código da classe Login ao seu projeto Java.
2. Utilize o método `autenticarUsuario` conforme necessário em seu código.
3. Lembre-se de configurar adequadamente a conexão com o banco de dados antes de utilizar o método da classe Login. Evite expor informações sensíveis como porta e local do banco no código ou no README.

### Funcionalidades:

- **Autenticar Usuário:** Verifica se as credenciais de login fornecidas correspondem a um usuário cadastrado no sistema.

### Estrutura do Código:

```java
package negocio;

import DAO.UsuarioCadastroDAO;

public class Login {
    private UsuarioCadastroDAO usuarioCadastroDAO;

    public Login() {
        this.usuarioCadastroDAO = new UsuarioCadastroDAO();
    }

    /**
     * Autentica um usuário no sistema.
     * 
     * @param login Login do usuário.
     * @param senha Senha do usuário.
     * @return true se as credenciais de login são válidas, false caso contrário.
     */
    public boolean autenticarUsuario(String login, String senha) {
        return usuarioCadastroDAO.verificarUsuario(login, senha);
    }
}
