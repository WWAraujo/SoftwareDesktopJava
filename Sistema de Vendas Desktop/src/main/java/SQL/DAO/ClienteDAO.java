package SQL.DAO;

import cadastro.model.Cliente;
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

    public static String url = "jdbc:mysql://localhost:3306/lojaWRS";
    public static String login = "root";
    public static String senha = "";

    public static boolean salvar(Cliente obj) {

        Connection conexao = null;
        boolean retorno = false;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url,login,senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO lojawrs.cliente "
                    + "(nome_cli,cpf_cli,data_nascimento_cli,celular_cli,estadoCivil_cli,sexo_cli,endereco_cli,email_cli) "
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
    
    public static boolean pesquisar(Cliente obj){
        
        Connection conexao = null;
        boolean retorno = false;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url,login,senha);
            
            
            PreparedStatement comandoSQL = conexao.prepareStatement("call procurar_cli ('?'); ");
            comandoSQL.setString(1,obj.getNomeCliente());
           // comandoSQL.setString(1,obj.getCPFCliente());
            
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
    
    public static ArrayList<Cliente> pesquisar(String nomeCliente, String cpfCliente) {

        Connection conexao = null;
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        
        try {
            //Chamar o acesso ao banco
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Entrar no banco
            conexao = DriverManager.getConnection(url, login, senha);

            //Comando sql
            PreparedStatement comandoSQL = conexao.prepareStatement("call nome_cli ('wal%');");
            
            // Executar o comando
            ResultSet rs = comandoSQL.executeQuery();
            //Validar o comando
            if (rs != null) {
                while(rs.next()){
                    Cliente novoObjeto = new Cliente();
                    novoObjeto.setIdCliente(rs.getInt("cod_cli"));
                    novoObjeto.setCPFCliente(rs.getString("cpf_cli"));
                    novoObjeto.setNomeCliente(rs.getString("nome_cli"));
                    
                    lista.add(novoObjeto);
                }
            }

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return lista;
    }
}
