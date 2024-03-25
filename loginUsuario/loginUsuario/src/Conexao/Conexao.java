package Conexao ;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

//Dados de conexao com banco
public class Conexao {
    private static final String url ="jdbc:mysql://localhost:3306/cadastro_usuario";
    private static final String usuario = "root";
    private static final String senha = "root123456789";
// Método para obter uma conexão com o banco de dados
    public static Connection getConexao(){
        try {
            return DriverManager.getConnection(url,usuario,senha);

        }catch(SQLException e){
            e.printStackTrace();
            return null; //Retorna null se falhar
    }
}
}