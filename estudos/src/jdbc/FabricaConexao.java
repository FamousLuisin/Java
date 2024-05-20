package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

	public static Connection getConexao(){
		try {
			// Carregar arquivo properties -> Externalizar
			Properties arquivo = getProperties();
			// url para gerar uma conexão segura, sem precisar verificar o certificado
			final String url = arquivo.getProperty("banco.url");
			final String usuario = arquivo.getProperty("banco.usuario");
			final String senha = arquivo.getProperty("banco.senha");
					
			// É necessario ter o mysql-connector (No meu caso está na pasta lib)
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	private static Properties getProperties() throws IOException {
		Properties arquivo = new Properties();
		String caminho = "/jdbc/conexao.properties";
		arquivo.load(FabricaConexao.class.getResourceAsStream(caminho));
		return arquivo;
	}
}
