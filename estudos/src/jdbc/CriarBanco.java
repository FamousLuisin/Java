package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException{
		// url para gerar uma conexão segura, sem precisar verificar o certificado
		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "123456";
		
		// É necessario ter o mysql-connector (No meu caso está na pasta lib)
		// E deve fazer o "Add to Biuld Path"
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		Statement stmt = conexao.createStatement();
		// Criar o banco de dados
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");

		System.out.println("Database criado com sucesso");
		conexao.close();
	}
}
