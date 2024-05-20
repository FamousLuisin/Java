package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	// CREATE - C
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		String nome = scanner.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		
		// Cuidado com SQLInjection
		String sql = "INSERT INTO pessoas (nome) VALUES (?);";
		
		// Tratar SQLInjection
		PreparedStatement stmt  = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.execute();
		
		System.out.println("Pessoa adicionada");
		
		conexao.close();
		scanner.close();
	}
}
