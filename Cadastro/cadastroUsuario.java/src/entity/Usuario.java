package entity;

public class Usuario {
    // Variável para armazenar o código do usuário
    private int codigo;
    
    // Variável para armazenar o nome do usuário
    private String nome;
    
    // Variável para armazenar o login do usuário
    private String login;
    
    // Variável para armazenar a senha do usuário
    private String senha;

    // Método para obter o código do usuário
    public int getCodigo() {
        return codigo;
    }

    // Método para definir o código do usuário
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    // Método para obter o nome do usuário
    public String getNome() {
        return nome;
    }

    // Método para definir o nome do usuário
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para obter o login do usuário
    public String getLogin() {
        return login;
    }

    // Método para definir o login do usuário
    public void setLogin(String login) {
        this.login = login;
    }

    // Método para obter a senha do usuário
    public String getSenha() {
        return senha;
    }

    // Método para definir a senha do usuário
    public void setSenha(String senha) {
        this.senha = senha;
    }
}