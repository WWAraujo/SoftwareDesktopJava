
package SQL.DAO;

import cadastro.model.Produto;
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
 * @author wallace.waraujo
 */
public class ProdutoDAO {
    
    public static String url = "jdbc:mysql://localhost:3306/lojaWRS";
    public static String login = "root";
    public static String senha = "";

    public static boolean salvar(Produto obj) {
        
        Connection conexao = null;
        boolean retorno = false;
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url,login,senha);
            
            //nomeCliente, cpfCliente, dataNascimentoFormatada, celularCliente, estadoCivil, 
    //sexoCliente, enderecoCliente, emailCliente
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO lojawrs.produto "
                    + "(nome_prod,preco_prod,tipo_prod,tamanho_prod,marca_prod,quantidade_prod,descricao_prod) "
                    + "VALUES(?,?,?,?,?,?,?)");
            comandoSQL.setString(1,obj.getNomeProd());
            comandoSQL.setDouble(2,obj.getPrecoProd());
            comandoSQL.setString(3,obj.getTipoProd());
            comandoSQL.setString(4,obj.getTamanhoProd());
            comandoSQL.setString(5,obj.getMarcaProd());
            comandoSQL.setInt(6,obj.getQuantidadeProd());
            comandoSQL.setString(7,obj.getDescricaoProd());
            
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){
               retorno = true;
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return retorno;
    }
    
    public static ArrayList<Produto> pesquisarID(int id) {
        
        Connection conexao = null;
        boolean retorno = false;
        
        ArrayList<Produto> lista = new ArrayList<Produto>();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url,login,senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from produto where cod_prod = "+id+";");
            
            ResultSet rs = comandoSQL.executeQuery();
            if(rs != null){
               retorno = true;
               while(rs.next()){
                    Produto novoObjeto = new Produto();
                    novoObjeto.setIdProd(rs.getInt("cod_prod"));
                    novoObjeto.setNomeProd(rs.getString("nome_prod"));
                    novoObjeto.setQuantidadeProd(rs.getInt("quantidade_prod"));
                    novoObjeto.setPrecoProd(rs.getDouble("preco_prod"));
                    
                    lista.add(novoObjeto);
                }
                
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return lista;
    }
    
    public static Produto pesquisarPorID(int id) {
        
        Connection conexao = null;
        Produto produtoRetorno = null;
        
        ArrayList<Produto> lista = new ArrayList<Produto>();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url,login,senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from produto where cod_prod = "+id+";");
            
            ResultSet rs = comandoSQL.executeQuery();
            if(rs != null){
               if(rs.next()){
                    produtoRetorno = new Produto();
                    produtoRetorno.setIdProd(rs.getInt("cod_prod"));
                    produtoRetorno.setNomeProd(rs.getString("nome_prod"));
                    produtoRetorno.setQuantidadeProd(rs.getInt("quantidade_prod"));
                    produtoRetorno.setPrecoProd(rs.getDouble("preco_prod"));
                }
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return produtoRetorno;
    }
    
    public static ArrayList<Produto> pesquisartodos() {
        
        Connection conexao = null;
        
        ArrayList<Produto> lista = new ArrayList<Produto>();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url,login,senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from produto;");
            
            ResultSet rs = comandoSQL.executeQuery();
            if(rs != null){
               while(rs.next()){
                    Produto novoObjeto = new Produto();
                    novoObjeto.setIdProd(rs.getInt("cod_prod"));
                    novoObjeto.setNomeProd(rs.getString("nome_prod"));
                    novoObjeto.setPrecoProd(rs.getDouble("preco_prod"));
                    novoObjeto.setQuantidadeProd(rs.getInt("quantidade_prod"));
                    
                    lista.add(novoObjeto);
                }
                
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return lista;
    }
    
}
