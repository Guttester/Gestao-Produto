package com.GestaoProduto.Model;

public class Produto {
	//==================================>[VARIAVEIS]<=============================
	private String codigo;
	private String nome;
	private String descricao; 
	private Double preco;
	//==================================>[CONSTRUTOR]<============================
	public Produto(String CODIGO, String NOME, Double PRECO,String DESCRICAO){
		this.codigo= CODIGO;
		this.nome= NOME;
		this.preco= PRECO;
		this.descricao= DESCRICAO;
	}
	public Produto(){}
	//==================================>[SETS]<==================================
	public void setCodigo(String CODIGO){ this.codigo= CODIGO; }
	public void setNome(String NOME){ this.nome= NOME; }
	public void setDescricao(String DESCRICAO){ this.descricao= DESCRICAO; }
	public void setPreco(Double PRECO){ this.preco= PRECO; }
	//==================================>[GETS]<==================================
	public String getCodigo(){ return codigo; }
	public String getNome(){ return nome; }
	public String getDescricao(){ return descricao; }
	public Double getPreco(){ return preco; }
	@Override
	public String toString() {
		return "[Codigo: "+codigo+" \tNome: "+nome+" \t\tPreço: "+preco+" \tDescrição: "+descricao+" ]\n";
	}
}