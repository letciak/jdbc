import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost";
        String usuario = "root";
        String senha = "leticia";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        Statement stmt = conexao.createStatement();
        stmt.execute("create database jdbc");

        System.out.println("banco criado com sucesso");
        conexao.close();
    }

}
