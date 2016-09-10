package com.vogella.build.maven.java.persistencia.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.PreparedStatement;
import com.vogella.build.maven.java.persistencia.entidade.Usuario;

public class UsuarioDAO {
	private Connection con = ConexaoFactory.getConnection();
	
	public void cadastrar(Usuario usu) {
		String sql = "insert into usuario (nome, login, senha) values (?,?,?)";
		
		try (java.sql.PreparedStatement preparador =  con.prepareStatement(sql)){
			
			preparador.setString(1, usu.getNome()); //substitui o ? pelo dado do usuário
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
//			Executando o comando SQL no banco
			preparador.execute();
////			fechando o statement (objetio preparador)
//			
//			preparador.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void alterar(Usuario usu) {
//		Comando que vai ser dado no SQL
String sql = "update usuario set nome=?, login=?, senha=? where id=?";
		
		try (java.sql.PreparedStatement preparador =  con.prepareStatement(sql)){
			
			preparador.setString(1, usu.getNome()); //substitui o ? pelo dado do usuário
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			preparador.setInt(4, usu.getId());
//			Executando o comando SQL no banco
			preparador.execute();
////			fechando o statement (objetio preparador)
//			
//			preparador.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void excluir(Usuario usu) {
String sql = "delete from usuario where id=?";
		
		try (java.sql.PreparedStatement preparador =  con.prepareStatement(sql)){
			
			preparador.setInt(1, usu.getId());
//			Executando o comando SQL no banco
			preparador.execute();
////			fechando o statement (objetio preparador)
//			
//			preparador.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
