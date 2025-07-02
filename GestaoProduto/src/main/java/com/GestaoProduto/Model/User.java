package com.GestaoProduto.Model;

public class User {
	//==================================>[VARIAVEIS]<=============================
	private int id;
	private String account;
	private String password;
	//==================================>[CONSTRUTOR]<============================
	public User(int ID, String ACCOUNT, String PASSWORD){
		this.id= ID;
		this.account= ACCOUNT;
		this.password= PASSWORD;
	}
	public User(){}
	//==================================>[SETS]<==================================
	public void setID(int ID){ this.id= ID; }
	public void setAccount(String ACCOUNT){ this.account= ACCOUNT; }
	public void setPassword(String PASSWORD){ this.password= PASSWORD; }
	//==================================>[GETS]<==================================
	public int getID(){ return id; }
	public String getAccount(){ return account; }
	public String getPassword(){ return password; }
	@Override
	public String toString() {
		return "[ id: "+id+" account: "+account+" password: "+password+" ]\n";
	}
}