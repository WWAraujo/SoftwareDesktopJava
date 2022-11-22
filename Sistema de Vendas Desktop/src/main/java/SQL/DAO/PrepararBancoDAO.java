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
 *@author Wallace Wagner, Rafael de Souza, Semaías de Oliveira
 * 
 */

public class PrepararBancoDAO {

    public static String url = "jdbc:mysql://localhost:3306/lojaWRS";
    public static String login = "root";
    public static String senha = "";

    public static boolean CriarBancoCliente() {

        Connection conexao = null;
        boolean retorno = false;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);

            PreparedStatement limparSQL = conexao.prepareStatement("drop database if exists lojaWRS;\n"
                    + "create database lojaWRS;");
            PreparedStatement criarClienteSQL = conexao.prepareStatement("use lojaWRS;\n"
                    + "create table cliente (cod_cli int primary key auto_increment,\n"
                    + "nome_cli varchar (40) not null,\n"
                    + "cpf_cli varchar (14) not null unique,\n"
                    + "celular_cli varchar (15),\n"
                    + "endereco_cli varchar (50),\n"
                    + "email_cli varchar (50),\n"
                    + "estadoCivil_cli varchar (10),\n"
                    + "data_nascimento_cli date not null,\n"
                    + "sexo_cli varchar (15));");

            int linhasAfetadas = criarClienteSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return retorno;
    }

    public static boolean CriarBancoProduto() {

        Connection conexao = null;
        boolean retorno = false;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);

            PreparedStatement limparSQL = conexao.prepareStatement(""
                    + "drop table if exists produto;\n"
                    + "use lojaWRS;\n");
            PreparedStatement criarClienteSQL = conexao.prepareStatement("create table produto ("
                    + "cod_prod int primary key auto_increment,\n"
                    + "nome_prod varchar (30) not null,\n"
                    + "preco_prod int not null,\n"
                    + "tipo_prod varchar (20) not null,\n"
                    + "tamanho_prod varchar (3) not null,\n"
                    + "marca_prod varchar (30),\n"
                    + "quantidade_prod int,\n"
                    + "descricao_prod varchar (30));");

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
