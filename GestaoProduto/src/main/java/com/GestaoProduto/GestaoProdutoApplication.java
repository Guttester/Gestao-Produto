package com.GestaoProduto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.GestaoProduto.Model.*;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class GestaoProdutoApplication {
	//public static void main(String[] args) { SpringApplication.run(GestaoProdutoApplication.class, args); }
	
	public static void UserPropriedades(){
		Scanner input = new Scanner(System.in);
		DataBase data= new DataBase();
		ArrayList<User> users= new ArrayList<>();
		User obj;

        System.out.print("\n-----------------------------------\n");
        System.out.print("-------------Cadastro--------------\n");
        System.out.print("-----------------------------------\n");
        
        int index= 7;
        int qtd= 5;
        for(int i=0; i<index;i++){
        	if(i<qtd){
            	obj= new User(i,"Guto"+i,"las"+i);
            	users.add(obj);
            	data.setUserDataBase(users.get(i));
        	}
        	if(i==qtd){
    	        System.out.print("Coloque seu Account: "); 
    	        String acc = input.nextLine();
            	
    	        System.out.print("Coloque seu Password: "); 
    	        String pass = input.nextLine();
    	        obj= new User(i,acc,pass);
            	users.add(obj);
            	data.setUserDataBase(obj);
        	}
        }
        
        System.out.print("\nCompleted register databases! ( Press Enter... )\n"); 
        String ch = input.nextLine();
        
        System.out.print("-----------------------------------\n");
        System.out.print("-------------Databases-------------\n");
        System.out.print("-----------------------------------\n");
        System.out.println(data.getAllUsers());
        
        System.out.print("\n-----------------------------------\n");
        System.out.print("-------------Update----------------\n");
        System.out.print("-----------------------------------\n");		
        
        System.out.print("Digite o usuário que deseja ser alterando: \n");
        String update = input.nextLine();
        data.UpdateUser(update);
        
        System.out.print("-----------------------------------\n");
        System.out.print("-------------Databases-------------\n");
        System.out.print("-----------------------------------\n");
        System.out.println(data.getAllUsers());
        
        System.out.print("\n-----------------------------------\n");
        System.out.print("-------------Delete----------------\n");
        System.out.print("-----------------------------------\n");	
        System.out.print("Coloque seu Account: "); 
        String delete = input.nextLine();
        data.DeleteUser(delete);
        
        System.out.print("\n\n-----------------------------------\n");
        System.out.print("-------------Databases-------------\n");
        System.out.print("-----------------------------------\n");
        System.out.println(data.getAllUsers());
        System.out.print("\nPress Enter..."); 
        String ch1 = input.nextLine();
        
        		
        System.out.print("\n\n-----------------------------------\n");
        System.out.print("--------Entrando no sistema--------\n");
        System.out.print("-----------------------------------\n\n");
        System.out.print("Coloque seu Account: ");
        String account = input.nextLine();

        System.out.print("Coloque seu Password: "); 
        String password = input.nextLine();
        data.Login(account, password);
	}
	public static void ProdutoPropriedades(){
		Scanner input = new Scanner(System.in);
		DataBase data= new DataBase();
		ArrayList<Produto> produtos= new ArrayList<>();
		Produto obj;

        System.out.print("\n-----------------------------------\n");
        System.out.print("-------------Cadastro--------------\n");
        System.out.print("-----------------------------------\n");
        
        int index= 5; // Simular inserção de dados.
        for(int i=0; i<index;i++){
        	if(i==0){ obj= new Produto("0h23","Sabonete Francis",4.35,"Sabonete Barra Francis Hidratante Morango E Baunilha 90G "); produtos.add(obj); data.setProdutoDatabase(produtos.get(i)); }
        	if(i==1){ obj= new Produto("0h104","Shampoo Dove",23.99,"Nutrição + Fusão de Óleos 400 ml");  produtos.add(obj); data.setProdutoDatabase(produtos.get(i)); }
        	if(i==2){ obj= new Produto("1j325","Detergente",8.65,"Detergente é um tensioativo ou mistura usado na remoção de sujeira"); produtos.add(obj); data.setProdutoDatabase(produtos.get(i)); }
        	if(i==3){ obj= new Produto("2k012","Rodo de plástico",25.32,"Peças enroscável para ter mais praticidade"); produtos.add(obj); data.setProdutoDatabase(produtos.get(i)); }
	        if(i>3){
        	System.out.print("Digite o Código do produto: "); 
	        String codigo = input.nextLine();
        	
        	System.out.print("Digite o Nome do produto: "); 
	        String nome = input.nextLine();
        	
        	System.out.print("Digite o Descrição do produto: ");
	        String descricao = input.nextLine();
        	
        	System.out.print("Digite o Preço do produto: ");
	        Double preco = input.nextDouble();
        	
	        obj= new Produto(codigo,nome,preco,descricao);
	        produtos.add(obj);
	        data.setProdutoDatabase(produtos.get(i));   }
        }

        System.out.print("\nCompleted register databases...\n"); 
        String ch = input.nextLine();
        
        System.out.print("-----------------------------------\n");
        System.out.print("-------------Databases-------------\n");
        System.out.print("-----------------------------------\n");
        System.out.println(data.getAllProdutos());
        
        System.out.print("\n-----------------------------------\n");
        System.out.print("-------------Update----------------\n");
        System.out.print("-----------------------------------\n");		
        
        System.out.print("Digite o Codigo do produto que deseja ser alterado: \n");
        String update = input.nextLine();
        data.UpdateProduto(update);
        
        System.out.print("-----------------------------------\n");
        System.out.print("-------------Databases-------------\n");
        System.out.print("-----------------------------------\n");
        System.out.println(data.getAllProdutos());
        
        System.out.print("\n-----------------------------------\n");
        System.out.print("-------------Delete----------------\n");
        System.out.print("-----------------------------------\n");	
        System.out.print("Coloque o Codigo: "); 
        String delete = input.nextLine();
        data.DeleteProduto(delete);
        
        System.out.print("\n\n-----------------------------------\n");
        System.out.print("-------------Databases-------------\n");
        System.out.print("-----------------------------------\n");
        System.out.println(data.getAllProdutos());
        System.out.print("\nPress Enter..."); 
        String ch1 = input.nextLine();
	}
	public static void main(String[] args){
		try {
			UserPropriedades();
			//ProdutoPropriedades();
		} catch(Exception e) {
			System.out.print(e); 
		}
	}
}
