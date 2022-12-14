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
 * Todas a interação no banco sobre o cliente são feitas nessa classe atravez de conexão com o mysql
 *@author Wallace Wagner, Rafael de Souza, Semaías de Oliveira
 * 
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
    
    public static boolean alterarCliente(Cliente obj, int id){
        
        Connection conexao = null;
        boolean retorno = false;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url,login,senha);
            PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE cliente SET "
                    + "nome_cli=?, "
 //                 + "cpf_cli=?, "
                    + "celular_cli=?, "
                    + "endereco_cli=?, "
                    + "email_cli=?, "
                    + "estadoCivil_cli=?, "
                    + "data_nascimento_cli=?, "
                    + "sexo_cli=? "
                    + "where cod_cli = "+id+"");
            comandoSQL.setString(1,obj.getNomeCliente());
//            comandoSQL.setString(2,obj.getCPFCliente());
            comandoSQL.setString(2,obj.getCelularCliente());
            comandoSQL.setString(3,obj.getEnderecoCliente());
            comandoSQL.setString(4,obj.getEmailCliente());
            comandoSQL.setString(5,obj.getEstadoCivil());
            comandoSQL.setString(6,obj.getAniverCliente());
            comandoSQL.setString(7,obj.getSexoCliente());
            
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){
               retorno = true;
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
            
        }
        
        return retorno;
    }
    
    public static ArrayList<Cliente> pesquisarNome(String nome){
        
        Connection conexao = null;
        boolean retorno = false;
        
        ArrayList<Cliente> lista = new ArrayList<Cliente>();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url,login,senha);
            
            
            PreparedStatement comandoSQL = conexao.prepareStatement("call procurar_nome_cli ('"+nome+"%');");
            // Executar o comando
            ResultSet rs = comandoSQL.executeQuery();
            
            if (rs != null) {
                while(rs.next()){
                    Cliente novoObjeto = new Cliente();
                    novoObjeto.setIdCliente(rs.getInt("cod_cli"));
                    novoObjeto.setNomeCliente(rs.getString("nome_cli"));
                    novoObjeto.setCPFCliente(rs.getString("cpf_cli"));
                    novoObjeto.setCelularCliente(rs.getString("celular_cli"));
                    novoObjeto.setEnderecoCliente(rs.getString("endereco_cli"));
                    novoObjeto.setEmailCliente(rs.getString("email_cli"));
                    novoObjeto.setEstadoCivil(rs.getString("estadoCivil_cli"));
                    novoObjeto.setAniverCliente(rs.getString("data_nascimento_cli"));
                    novoObjeto.setSexoCliente(rs.getString("sexo_cli"));
                    
                    lista.add(novoObjeto);
                }
            } 

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return lista;
    }

    public static int pesquisarCPF(String cpf) {

        Connection conexao = null;
        int retorno = 0;
        
        try {
            //Chamar o acesso ao banco
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Entrar no banco
            conexao = DriverManager.getConnection(url, login, senha);

            //Comando sql
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from cliente where cpf_cli like ?;");
            comandoSQL.setString(1, cpf);
            
            // Executar o comando e verificar se encontou o cpfd
            ResultSet rs = comandoSQL.executeQuery();
            if(rs != null){
                while (rs.next()) {
                    System.out.println(rs.getString("cod_cli"));
                    retorno = rs.getInt("cod_cli");
                }
            }else{
                retorno = 0;
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
            
        }
        
        return retorno;
    }
    
    public static boolean excluir(int id){
        
        Connection conexao = null;
        boolean retorno = false;
        
        try {
            //Chamar o acesso ao banco
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Entrar no banco
            conexao = DriverManager.getConnection(url, login, senha);

            //Comando sql
            PreparedStatement comandoSQL = conexao.prepareStatement("delete from cliente where cod_cli = ?;");
            comandoSQL.setInt(1,id);  
            
            // Executar o comando
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
