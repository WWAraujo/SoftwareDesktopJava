package cadastroCliente.DAO;

import cadastroCliente.model.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-Gamer
 */
public class ClienteDAO {

    public static String url = "jdbc:mysql://localhost:3306/cliente";
    public static String login = "root";
    public static String senha = "Rafa140794";

    public static boolean salvar(Cliente obj) {

        Connection conexao = null;
        boolean retorno = false;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url,login,senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO cliente (nome_cli,cpf_cli) VALUES(?,?)");
            comandoSQL.setString(1,obj.getNomeCliente());
            comandoSQL.setString(2,obj.getCPFCliente());
            
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){
               retorno = true;
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return retorno;
    }

    public static boolean atualizarNome(Cliente obj){
        
        Connection conexao = null;
        boolean retorno = false;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url,login,senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE cliente SET nome_cli=?, WHERE cod_cli = ?, cpf_cliente = ?");
            comandoSQL.setString(1,obj.getNomeCliente());
            comandoSQL.setInt(2,obj.getIdCliente());
            comandoSQL.setString(2,obj.getCPFCliente());
            
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){
               retorno = true;
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return retorno;
    }
}
