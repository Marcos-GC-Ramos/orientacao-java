import java.util.Scanner;
import DAO.UsuarioDAO;
import entity.Usuario;

public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        // Criando um novo objeto Usuario para armazenar as informações fornecidas pelo usuário
        Usuario usuario = new Usuario();

        // Solicitando ao usuário que insira suas informações
        System.out.println("Bem-vindo! Por favor, insira suas informações:");
        System.out.print("Nome: ");
        usuario.setNome(scanner.nextLine());

        System.out.print("Login: ");
        usuario.setLogin(scanner.nextLine());

        System.out.print("Senha: ");
        usuario.setSenha(scanner.nextLine());

        // Cadastrando o usuário com as informações fornecidas
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.cadastrarUsuario(usuario);

        // Exibindo mensagem de confirmação de cadastro
       // System.out.println("Cadastro realizado com sucesso para o usuário: " + usuario.getNome());
    }
}
