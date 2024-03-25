
## Classe Cadastro

A classe Cadastro é responsável por gerenciar o processo de cadastro de usuários no sistema. Ela oferece funcionalidades para adicionar novos usuários e verificar a existência de usuários já cadastrados.

### Utilização:

Para utilizar a classe Cadastro em seu projeto, siga os passos abaixo:

1. Integre o código da classe Cadastro ao seu projeto Java.
2. Utilize os métodos `cadastrarUsuario` e `verificarUsuarioExistente` conforme necessário em seu código.
3. Lembre-se de configurar adequadamente a conexão com o banco de dados antes de utilizar os métodos da classe Cadastro. Evite expor informações sensíveis como porta e local do banco no código ou no README.


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
Claro, aqui está o texto completo, incluindo o trecho de utilização:

markdown
Copy code
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


