package SQL.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Statement;
import cadastro.model.Cliente;
import cadastro.model.Produto;
import cadastro.model.Venda;

/**
 *@author Wallace Wagner, Rafael de Souza, Semaías de Oliveira
 * 
 */

public class VendasDAO {

    public static String url = "jdbc:mysql://localhost:3306/lojaWRS";
    public static String login = "root";
    public static String senha = "P@$$w0rd";

    public static boolean salvarnota(Venda obj) {
        boolean retorno = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(url, login, senha);

            //Pegando o id do cliente
            PreparedStatement comandoSQLid = conexao.prepareStatement("select cod_cli from cliente where cpf_cli = ?;");
            comandoSQLid.setString(1, obj.getCpfCliente());
            
            ArrayList<Venda> lista = new ArrayList<Venda>();
            ResultSet rs = comandoSQLid.executeQuery();
            
            if (rs != null) {
                while(rs.next()){
                    Venda novoObjeto = new Venda();
                    novoObjeto.setIdCliente(rs.getInt("cod_cli"));
                    lista.add(novoObjeto); 
                }
            }

            //Salvando a nota simples
            PreparedStatement comandoSQL = conexao.prepareStatement("insert into pedido (fk_id_cliente, valor_total) values (1,50);", Statement.RETURN_GENERATED_KEYS);
            //comandoSQL.setInt(1, obj.getIdCliente());
            //comandoSQL.setDouble(1, obj.getValorTotalNota());

            //Salvando a nota complementar
            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                rs = comandoSQL.getGeneratedKeys();
                if (rs .next()) {
                    int idNota = rs.getInt(1);
                    for (Venda item : obj.getListaItens()) {
                        PreparedStatement comandoSQLItem = conexao.prepareStatement("insert into item_pedido "
                                + "(fk_cod_pedido,fk_cod_prod,quantidade_prod,valor_unitario)\n" 
                                +"values (?,?,?,?);");
                        comandoSQLItem.setInt(1, idNota);
                        comandoSQLItem.setInt(2, item.getIdProd());
                        comandoSQLItem.setInt(3, item.getQtdProd());
                        comandoSQLItem.setDouble(4,item.getValorUnid());

                        int linhasAfetadasItem = comandoSQLItem.executeUpdate();
                        if(linhasAfetadasItem>0){
                            retorno = true;
                        }
                    }
                }
            }
        

            

            
            

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return retorno;
    }

    public static ArrayList<Venda> listaSintetico (String dtInicio, String dtFinal){
        
        Connection conexao = null;
        boolean retorno = false;
        
        ArrayList<Venda> lista = new ArrayList<Venda>();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url,login,senha);
            
            
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM pedido\n" 
                    +"WHERE data_venda BETWEEN '"+dtInicio+"' AND '"+dtFinal+" 23:59'");
            // Executar o comando
            ResultSet rs = comandoSQL.executeQuery();
            
            if (rs != null) {
                while(rs.next()){
                    Venda novoObjeto = new Venda();
                    novoObjeto.setIdNota(rs.getInt("id_pedido"));
                    novoObjeto.setIdCliente(rs.getInt("fk_id_cliente"));
                    novoObjeto.setValorTotalNota(rs.getDouble("valor_total"));
                    novoObjeto.setDatavenda(rs.getString("data_venda"));
                    
                    lista.add(novoObjeto);
                }
            } 

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
    
    public static ArrayList<Venda> listaAnalitico (Venda obj){
        
        Connection conexao = null;
        boolean retorno = false;
        
        ArrayList<Venda> lista = new ArrayList<Venda>();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url,login,senha);
            
            
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from item_pedido where fk_cod_pedido like ?;" );
            comandoSQL.setInt(1,obj.getIdNota());
            
            // Executar o comando
            ResultSet rs = comandoSQL.executeQuery();
            
            if (rs != null) {
                while(rs.next()){
                    Venda novoObjeto = new Venda();
                    novoObjeto.setIdProd(rs.getInt("fk_cod_prod"));
                    novoObjeto.setQtdProd(rs.getInt("quantidade_prod"));
                    novoObjeto.setValorUnid(rs.getDouble("valor_unitario"));
                    
                    lista.add(novoObjeto);
                }
            } 

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
    
}
