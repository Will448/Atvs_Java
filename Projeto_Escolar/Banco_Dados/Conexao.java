package Projeto_Escolar.Banco_Dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private Connection conn;

    public Conexao () {
        try {
            System.out.println("Conectado com o BD :)");
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost/banco de dados 2021", "root", "");
        } catch (SQLException ex) {
            throw  new RuntimeException(ex) ;
        }
    }

    public Connection getConexao() {
        return this.conn;
    }
}
