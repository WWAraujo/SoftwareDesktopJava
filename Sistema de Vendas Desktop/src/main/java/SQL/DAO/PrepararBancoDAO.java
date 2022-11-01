/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL.DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author T-Gamer
 */
public class PrepararBancoDAO {

    public static String url = "jdbc:mysql://localhost:3306/lojaWRS";
    public static String login = "root";
    public static String senha = "";

    public static boolean CriarBanco() {

        Connection conexao = null;
        boolean retorno = false;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);

            PreparedStatement limparSQL = conexao.prepareStatement("drop database if exists lojaWRS;\n"
                    + "create database lojaWRS;");
            PreparedStatement criarClienteSQL = conexao.prepareStatement("use lojaWRS;\n"
                    + "create table cliente (\n"
                    + "cod_cli int primary key auto_increment,\n"
                    + "nome_cli varchar (40) not null,\n"
                    + "cpf_cli varchar (14) not null unique,\n"
                    + "celular_cli varchar (11),\n"
                    + "endereco_cli varchar (50),\n"
                    + "email_cli varchar (50),\n"
                    + "estadoCivil_cli varchar (10),\n"
                    + "data_nascimento_cli date not null,\n"
                    + "sexo varchar (15) not null\n"
                    + ");");

            int linhasAfetadas = criarClienteSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return retorno;
    }
}
