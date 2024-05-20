package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletarPessoa {

	// DELETE - D
	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Deseja deletar qual pessoa? ");
		int codigo = entrada.nextInt();
		
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		if (stmt.executeUpdate() > 0) {
			System.out.println("Pessoa excluida com sucesso");
		} else {
			System.out.println("Nada aconteceu");
		}
		
		entrada.close();
		stmt.close();
		conexao.close();
	}
}
