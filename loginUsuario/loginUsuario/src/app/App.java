package app;

import java.util.Scanner;
import negocio.Login;

public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira suas credenciais
        System.out.println("Bem-vindo! Por favor, insira suas credenciais:");
        
       // System.out.print("Nome: ");
        // String nome = scanner.nextLine();
        
        System.out.print("Login: ");
        String login = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        // Tentando autenticar o usuário
        Login loginHandler = new Login();
        if (loginHandler.autenticarUsuario( login, senha)) {
            System.out.println("Login bem-sucedido para o usuário: " + login);
        } else {
            System.out.println("Login falhou. Verifique suas credenciais.");
        }
    }
}
