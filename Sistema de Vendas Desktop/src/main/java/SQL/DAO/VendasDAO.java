
package SQL.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import cadastro.model.Venda;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author wallace.waraujo
 */
public class VendasDAO {
    
    public static String url = "jdbc:mysql://localhost:3306/lojaWRS";
    public static String login = "root";
    public static String senha = "";
    
   public static boolean salvarnota(Venda obj) {
        boolean retorno = false;
        String cpf ="";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(url, login, senha);
            
            //Pegando o id do cliente
            PreparedStatement comandoSQL = conexao.prepareStatement("select cpf_cli from cliente where cpf_cli = ?;");
            comandoSQL.setString(1, obj.getCpfCliente());
            ResultSet id = comandoSQL.executeQuery();
            
            
            comandoSQL = conexao.prepareStatement("INSERT INTO NotaFiscal (numeroNota,valorNota) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);
            comandoSQL.setInt(1, obj.getNumeroNota());
            comandoSQL.setDouble(2, obj.getValorNota());
            
            ResultSet rs = comandoSQL.executeQuery();
            if(rs != null){
               while(rs.next()){
                    Venda novoObjeto = new Venda();
                    novoObjeto.setIdProd(rs.getInt("cod_prod"));
                    novoObjeto.valorNota(rs.getString("nome_prod"));
                    novoObjeto.setPrecoProd(rs.getDouble("preco_prod"));
                    novoObjeto.setQuantidadeProd(rs.getInt("quantidade_prod"));
                    
                    lista.add(novoObjeto);
                }
                
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return retorno;
    }

    
}
