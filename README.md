### **Classe Cadastro**

A classe Cadastro é responsável por realizar operações de cadastro de usuários em um sistema. Ela interage com o banco de dados para inserir novos usuários e verificar a existência de usuários já cadastrados.

### **Funcionalidades Principais:**

- Cadastro de Usuário: Permite cadastrar um novo usuário no sistema, incluindo informações como nome, login e senha.
- Verificação de Usuário Existente: Verifica se um usuário já está cadastrado no sistema com base no login e senha fornecidos.

### **Estrutura da Classe:**

A classe Cadastro é composta pelos seguintes métodos:

- `cadastrarUsuario(Usuario usuario)`: Método responsável por cadastrar um novo usuário no sistema, inserindo as informações na tabela de usuários do banco de dados.
- `verificarUsuarioExistente(String login, String senha)`: Método que verifica se um usuário já está cadastrado no sistema com base no login e senha fornecidos.
  
###  **Utilização:**

Para utilizar a classe Cadastro, basta criar uma instância da classe e chamar os métodos conforme necessário. Por exemplo:

```java
Cadastro cadastro = new Cadastro();
cadastro.cadastrarUsuario(usuario);
boolean usuarioExistente = cadastro.verificarUsuarioExistente(login, senha);

