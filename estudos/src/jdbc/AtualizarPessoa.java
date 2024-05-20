package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoa {

	// UPDATE - U
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println("Informe o codigo da pessoa: ");
		int codigo = entrada.nextInt();
		
		String select = "SELECT * FROM pessoas WHERE codigo = ?";
		String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, codigo);
		
		ResultSet resultado = stmt.executeQuery();
		
		if (resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt("codigo"), resultado.getString("nome"));
			
			System.out.println("O nome da pessoa encontrada é: " + p.getNome());
			
			entrada.nextLine();
			
			System.out.println("Informa um novo nome: ");
			String novoNome = entrada.nextLine();
			
			stmt.close();
			
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			
			stmt.execute();
			
			System.out.println("Pessoa alterada");
		} else {
			System.out.println("Pessoa não encontrada");
		}
		
		stmt.close();
		entrada.close();
		conexao.close();
	}
}
