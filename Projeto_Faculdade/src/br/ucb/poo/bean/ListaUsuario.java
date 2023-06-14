package br.ucb.poo.bean;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaUsuario {
	private ArrayList<Usuario> listaUsuarioCliente;
	private ArrayList<Usuario> listaUsuarioVendedor;
	private ArrayList<Login> listaLogin;
	private Usuario admin;
	
	public ListaUsuario(){
		this.listaUsuarioCliente = new ArrayList<>();
		this.listaUsuarioVendedor = new ArrayList<>();
		this.listaLogin = new ArrayList<>();
		this.admin = new Usuario("Admin", "Admin", 3, "A10");
		this.listaLogin.add(new Login("Admin", "Admin", "A10"));
	}
	
	public void Registro() {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome, cpf, codigo, senha;
		int tipoUsuario;
		
		System.out.println("==============================================");
        System.out.println("                   REGISTRO                   ");
        System.out.println("Escolha o perfil de registro:                 ");
        System.out.println("1 - Cliente                                   ");
        System.out.println("2 - vendedor                                  ");
        System.out.println("==============================================");

		tipoUsuario = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Seu nome: ");
		nome = scanner.nextLine();
		
		System.out.println("Seu CPF: ");
		cpf = scanner.nextLine();
		
		System.out.println("Sua senha: ");
		senha = scanner.nextLine();
	
		
		if (tipoUsuario == 1) {
			codigo = "U" + (this.listaUsuarioCliente.size() + 10);
			listaUsuarioCliente.add(new Usuario(nome, cpf, tipoUsuario, codigo));
			listaLogin.add(new Login(cpf, senha, codigo));
		}
		
		else if (tipoUsuario == 2) {
			codigo = "V" + (this.listaUsuarioVendedor.size() + 10);
			listaUsuarioVendedor.add(new Usuario(nome, cpf, tipoUsuario, codigo));
			listaLogin.add(new Login(cpf, senha, codigo));
		}
		
		else {
			System.out.println("Invalido\n");
		}
		
	}
	
	public Usuario Login() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("==============================================");
        System.out.println("                    LOGIN                     ");
        System.out.println("==============================================");
        System.out.println("Escolha o perfil de acesso:                   ");
        System.out.println("1 - Cliente                                   ");
        System.out.println("2 - vendedor                                  ");
        System.out.println("3 - Admin                                     ");
        System.out.println("==============================================");
        
        int opcao = scanner.nextInt();
        scanner.nextLine();
        
        if(opcao < 1 || opcao > 3) {
        	System.out.println("Opcao invalida");
        	return null;
        }
        
		System.out.println("Usuario: ");
		String usuario = scanner.nextLine();
		
		System.out.println("Senha: ");
		String senha = scanner.nextLine();
		String codigo = null;
		
		boolean encontrou=false;
		int i=0;
		
		while (!encontrou && i < listaLogin.size()) {
			if(usuario.equals(listaLogin.get(i).getUsuario()) && senha.equals(listaLogin.get(i).getSenha())) {
				encontrou = true;
				codigo = listaLogin.get(i).getCodigoUsuario();
			}
			else{
				i++;
			}
		}
		
		if(encontrou==false) {
			System.out.println("Usuario nao existe");
			return null;
		}
		
		else {
			if(opcao == 2) {
				for (int j = 0; j < this.listaUsuarioVendedor.size(); j++) {
					if(codigo.equals(this.listaUsuarioVendedor.get(j).getCodigo())) {
						return this.listaUsuarioVendedor.get(j);
					}
				}
				
			}
			
			else if(opcao == 1){
				for (int j = 0; j < this.listaUsuarioCliente.size(); j++) {
					if(codigo.equals(this.listaUsuarioCliente.get(j).getCodigo())) {
						return this.listaUsuarioCliente.get(j);
					}
				}
			}
			
			else if(opcao == 3){
				return this.admin;
			}
		}
		
		System.out.println("Usuario nao cadastrado com a sua opcao");
		return null;
	}

	public ArrayList<Usuario> getListaUsuarioCliente() {
		return listaUsuarioCliente;
	}

	public void setListaUsuarioCliente(ArrayList<Usuario> listaUsuarioCliente) {
		this.listaUsuarioCliente = listaUsuarioCliente;
	}

	public ArrayList<Usuario> getListaUsuarioVendedor() {
		return listaUsuarioVendedor;
	}

	public void setListaUsuarioVendedor(ArrayList<Usuario> listaUsuarioVendedor) {
		this.listaUsuarioVendedor = listaUsuarioVendedor;
	}

	public ArrayList<Login> getListaLogin() {
		return listaLogin;
	}

	public void setListaLogin(ArrayList<Login> listaLogin) {
		this.listaLogin = listaLogin;
	}

	public Usuario getAdmin() {
		return admin;
	}

	public void setAdmin(Usuario admin) {
		this.admin = admin;
	}
}
