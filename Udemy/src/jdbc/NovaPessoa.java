package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class NovaPessoa {
	
	public static void main(String[] args) throws SQLException{
		
		Scanner entrada =  new Scanner(System.in);
		
		System.out.println("Infome o nome: ");
		String nome =  entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "Insert into pessoas(nome) values(?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		
		
		stmt.execute();
		System.out.println("Pessoa incluida com sucesso!");
		entrada.close();
	}

}
