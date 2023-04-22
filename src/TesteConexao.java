import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost";
        String usuario = "root";
        String senha = "leticia";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        System.out.println("conexão realizada com sucesso");

        conexao.close();
    }

}
