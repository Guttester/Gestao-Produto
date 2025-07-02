package com.GestaoProduto.Model;

import java.util.ArrayList;
import java.util.Scanner;

public class DataBase {
	//==================================>[VARIAVEIS]<=============================
	private ArrayList<User> users= new ArrayList<>();
	private ArrayList<Produto> produtos= new ArrayList<>();
	//==================================>[USER]<==================================
	public ArrayList <User> getAllUsers(){ return users; }
	public void setUserDataBase(User OBJ){
		int index= users.size();
		String account;	String password; String password1;
		for(int i= 0; i < users.size();i++) {
			account= users.get(i).getAccount();
			if(account.equals(OBJ.getAccount())){
				throw new IllegalArgumentException(
						"Erro!! Já existe um USER com o nome: ["+users.get(i).getAccount()+"], já cadastrado!!");
			}
		}
		account= OBJ.getAccount();
		if(account.equals(OBJ.getPassword())) {
			throw new IllegalArgumentException(
					"Erro!! Não é possível cadastrar, com [account] e [password] semelhantes.");
		}
		
		String senha= OBJ.getPassword();
		if(senha.length()<4){ throw new IllegalArgumentException("Erro!! A senha não deve conter menos que 4 digitos."); }
		
		if(senha.startsWith(" ") || senha.endsWith(" ")){
			throw new IllegalArgumentException("Erro!! A senha não deve conter espaços no inicio e nem no final!");
		}
		
		this.users.add(OBJ); // [GRAVA AO PASSAR POR TODAS RESTRIÇÕES!]

		
	}
	public void UpdateUser(String OBJ){
		int index= users.size();
		String account; 
		Scanner input = new Scanner(System.in);
		for(int i= 0; i<users.size(); i++){
			account= users.get(i).getAccount();
			if(account.equals(OBJ)){
		        System.out.print("Atualize seu Account: "); 
		        String acc = input.nextLine();
		        users.get(i).setAccount(acc);
		        System.out.print("Atualize seu Password: "); 
		        String pass = input.nextLine();
		        users.get(i).setPassword(pass); break;
			} else { if(i==(index-1)){ throw new IllegalArgumentException("Erro!! Não existe nenhum account com esse registro!"); }}
		}
	}
	public void DeleteUser(String ACCOUNT){
		String account; 
		int index= users.size(); int i=0;
		while(i<=index){
			account= users.get(i).getAccount();
			if(account.equals(ACCOUNT)){
				this.users.remove(i); break;
			} else{ if(i==(index-1)){ throw new IllegalArgumentException(
					"Erro!! Não existe esse usuário para ser Deletado!!"); } } i++;
		}
	}
	public void Login(String Account, String Password){
		String account; String password;
		int index= users.size();
		for(int i= 0; i < users.size();i++) {
			account= users.get(i).getAccount();
			password= users.get(i).getPassword();
			if(account.equals(Account) && password.equals(Password)){ 
				System.out.println("\nVocê ENTROU, no sistema!!");
			} else { if(i==(index-1)){ throw new IllegalArgumentException("Usuário inexistente ou senha Inválida!"); } }
		} 
	}
	//==================================>[PRODUTO]<===============================
	public ArrayList <Produto> getAllProdutos(){ return produtos; }
	public void setProdutoDatabase(Produto OBJ){
		int index= produtos.size();
		String account;
		for(int i= 0; i < produtos.size();i++) {
			account= produtos.get(i).getCodigo();
			if(account.equals(OBJ.getCodigo())){
				throw new IllegalArgumentException("Erro!! Já existe um CODIGO com: ["+produtos.get(i).getCodigo()+"], já cadastrado!!");
			}
		}
		int tam= OBJ.getNome().length();
		if(tam<=0){ throw new IllegalArgumentException("Erro!! O NOME não pode ser vazio."); }
		int tam1= OBJ.getDescricao().length();
		if(tam1>=200){ throw new IllegalArgumentException("Erro!! A descrição não pode ultrapassar 200 caracteres."); }
		if(OBJ.getPreco()<=0){ throw new IllegalArgumentException("Erro!! O PREÇO não pode ser igual e nem menor que 0."); }
			
		this.produtos.add(OBJ);
	}
	public void UpdateProduto(String OBJ){
		int index= produtos.size();
		String codigo; 
		Scanner input = new Scanner(System.in);
		for(int i= 0; i<produtos.size(); i++){
			codigo= produtos.get(i).getCodigo();
			if(codigo.equals(OBJ)){
		        System.out.print("Atualize Nome do produto:: "); 
		        String nome = input.nextLine();
		        produtos.get(i).setNome(nome);
		        
		        System.out.print("Atualize Descrição do produto : "); 
		        String pass = input.nextLine();
		        produtos.get(i).setDescricao(pass);
		        
		        System.out.print("Atualize Preço do produto: ");
		        Double preco = input.nextDouble();
		        produtos.get(i).setPreco(preco); break;
			} else { if(i==(index-1)){ throw new IllegalArgumentException("Erro!! Não existe nenhum codigo com esse registro!"); }}
		}
	}
	public void DeleteProduto(String CODIGO){
		String produto; 
		int index= produtos.size();
		int i=0;
		while(i<index){
			produto= produtos.get(i).getCodigo();
			if(produto.equals(CODIGO)){
				this.produtos.remove(i); break;
			} else{ if(i==(index-1)){ throw new IllegalArgumentException(
					"Erro!! Não existe esse produto para ser Deletado!!"); } } i++;
		}
	}
}

