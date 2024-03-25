## Classe Cadastro

A classe Cadastro é responsável por gerenciar o processo de cadastro de usuários no sistema. Ela oferece funcionalidades para adicionar novos usuários e verificar a existência de usuários já cadastrados.

### Funcionalidades:

- **Cadastrar Usuário:** Permite adicionar um novo usuário ao sistema, incluindo informações como nome, login e senha.
- **Verificar Usuário Existente:** Verifica se um usuário já está cadastrado no sistema com base no login fornecido.

### Estrutura do Código:

```java
public class Cadastro {
    
    /**
     * Cadastra um novo usuário no sistema.
     * 
     * @param usuario Objeto contendo as informações do usuário a ser cadastrado.
     */
    public void cadastrarUsuario(Usuario usuario) {
        // Implementação do método para cadastrar usuário no sistema
    }
    
    /**
     * Verifica se um usuário já está cadastrado no sistema.
     * 
     * @param login Login do usuário a ser verificado.
     * @return true se o usuário já está cadastrado, false caso contrário.
     */
    public boolean verificarUsuarioExistente(String login) {
        // Implementação do método para verificar se usuário existe no sistema
        return false; // Exemplo: sempre retorna falso, implementação real depende da lógica desejada
    }
}
