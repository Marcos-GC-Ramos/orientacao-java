package entity;

public class Usuario {
    // Variável para armazenar o ID do usuário
    private int id;
    
    // Variável para armazenar o login do usuário
    private String login;
    
    // Variável para armazenar a senha do usuário
    private String senha;

    // Método para obter o ID do usuário
    public int getId() {
        return id;
    }

    // Método para definir o ID do usuário
    public void setId(int id) {
        this.id = id;
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
