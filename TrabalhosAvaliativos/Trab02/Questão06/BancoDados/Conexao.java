//package TrabalhosAvaliativos.Trab02.Questão06.BancoDados;
/* 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

        private Connection conn;

        public Conexao () {
            try {
                System.out.println("Conectado com o BD :)");
                this.conn = DriverManager.getConnection("jdbc:mysql://localhost/bd_farmácia-2", "root", "");
            } catch (SQLException ex) {
                throw  new RuntimeException(ex) ;
            }
        }

        public Connection getConexao() {
            return this.conn;
        }
    }
        */

        package TrabalhosAvaliativos.Trab02.Questão06.BancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private Connection conn;

    public Conexao() {
        try {
            // Carregar o driver JDBC do MySQL (não é estritamente necessário a partir da versão 8 do MySQL Connector/J)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Estabelecer a conexão com o banco de dados
            this.conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bd_farmacia", // Corrigido o nome da base de dados e a porta padrão 3306
                "root",
                "" // Substitua por sua senha, se necessário
            );
            System.out.println("Conectado com o BD :)");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver MySQL não encontrado", e);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar com o BD", e);
        }
    }

    public Connection getConexao() {
        return this.conn;
    }

    public void fecharConexao() {
        if (this.conn != null) {
            try {
                this.conn.close();
                System.out.println("Conexão com o BD fechada.");
            } catch (SQLException e) {
                System.err.println("Erro ao fechar a conexão com o BD: " + e.getMessage());
            }
        }
    }
}