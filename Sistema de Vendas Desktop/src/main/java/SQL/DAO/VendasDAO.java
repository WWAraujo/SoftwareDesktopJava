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
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(url, login, senha);

            //Pegando o id do cliente
            PreparedStatement comandoSQL = conexao.prepareStatement("select cpf_cli from cliente where cpf_cli = ?;");
            comandoSQL.setString(1, obj.getCpfCliente());
            
            ArrayList<Venda> lista = new ArrayList<Venda>();
            ResultSet rs = comandoSQL.executeQuery();
            if (rs != null) {
                retorno = true;
                while (rs.next()) {
                    Venda novoObjeto = new Venda();
                    novoObjeto.setIdCliente(rs.getInt("cod_cli"));
                    lista.add(novoObjeto);
                }
            }

            //Salvando a nota 
            comandoSQL = conexao.prepareStatement("insert into pedido (fk_id_cliente, valor_total) values (?,?);", Statement.RETURN_GENERATED_KEYS);
            comandoSQL.setInt(1, obj.getIdCliente());
            comandoSQL.setDouble(2, obj.getValorTotalNota());

            // pegando o id da nota
            rs = comandoSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Venda novoObjeto = new Venda();
                    novoObjeto.setIdNota(rs.getInt("id_pedido"));
                }

            }

            //Salvando a nota complementar
            comandoSQL = conexao.prepareStatement("insert into item_pedido "
                    + "(fk_cod_pedido,fk_cod_prod,quantidade_prod,valor_unitario)\n"
                    + "values (?,?,2,399.99);");
            comandoSQL.setInt(1, obj.getIdNota());
            comandoSQL.setInt(2, obj.getIdProd());
            comandoSQL.setInt(3, obj.getQtdProd());
            comandoSQL.setDouble(4, obj.getValorUnid());

            // 
            rs = comandoSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Venda novoObjeto = new Venda();
                    novoObjeto.setIdNota(rs.getInt("id_pedido"));
                }

            }

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return retorno;
    }

}
