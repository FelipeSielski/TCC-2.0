package com.vogella.build.maven.java;

import com.vogella.build.maven.java.persistencia.entidade.Usuario;
import com.vogella.build.maven.java.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
//		testeCadastrar();
//		testeAlterar();
		testeExcluir();
	}
	
	
	public static void testeAlterar(){
		//Criando o usuário
				Usuario usu = new Usuario();
				usu.setId(4);
				usu.setNome("Jãozão da silva sauro");
				usu.setLogin("ajsiis");
				usu.setSenha("123345678");
				//Cadastrando usuário no banco de dados
				UsuarioDAO usuDAO = new UsuarioDAO();
				usuDAO.alterar(usu);
				
				System.out.println("Alterado com sucesso.");
	}
	
	
	public static void testeCadastrar(){
		//Criando o usuário
				Usuario usu = new Usuario();
				usu.setNome("Maria");
				usu.setLogin("maria");
				usu.setSenha("123123");
				//Cadastrando usuário no banco de dados
				UsuarioDAO usuDAO = new UsuarioDAO();
				usuDAO.cadastrar(usu);
				
				System.out.println("cadastrado com sucesso.");
	}
	
	public static void testeExcluir(){
		//Criando o usuário
				Usuario usu = new Usuario();
				usu.setId(4); /*qual id da base vc quer excluir.*/
			//Cadastrando usuário no banco de dados
				UsuarioDAO usuDAO = new UsuarioDAO();
				usuDAO.excluir(usu);
				
				System.out.println("Excluido com sucesso.");
	}
}
