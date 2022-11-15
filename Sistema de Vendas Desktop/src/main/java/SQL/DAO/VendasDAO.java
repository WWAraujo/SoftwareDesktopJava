
package SQL.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author wallace.waraujo
 */
public class VendasDAO {
    
    public static String url = "jdbc:mysql://localhost:3306/lojaWRS";
    public static String login = "root";
    public static String senha = "";
    
    public static boolean buscarCPF(vendas obj) {
        
        Connection conexao = null;
        boolean retorno = false;

         try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url,login,senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO lojawrs.cliente "
                    + "(nome_cli,"
                    + "cpf_cli,"
                    + "data_nascimento_cli,"
                    + "celular_cli,"
                    + "estadoCivil_cli,"
                    + "sexo_cli,"
                    + "endereco_cli,"
                    + "email_cli) "
                    + "VALUES(?,?,?,?,?,?,?,?)");
            comandoSQL.setString(1,obj.getNomeCliente());
            comandoSQL.setString(2,obj.getCPFCliente());
            comandoSQL.setString(3,obj.getAniverCliente());
            comandoSQL.setString(4,obj.getCelularCliente());
            comandoSQL.setString(5,obj.getEstadoCivil());
            comandoSQL.setString(6,obj.getSexoCliente());
            comandoSQL.setString(7,obj.getEnderecoCliente());
            comandoSQL.setString(8,obj.getEmailCliente());
            
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
