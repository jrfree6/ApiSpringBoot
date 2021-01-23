package br.com.springbootapi.entity;

import java.math.BigDecimal;

public class PessoaEntity {
	
	private long id;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	private String nome;
	
	private int idade;
	
	private String cpf;
	
	private int dependentes;
	
	private BigDecimal renda;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getDependentes() {
		return dependentes;
	}
	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}
	public BigDecimal getRenda() {
		return renda;
	}
	public void setRenda(BigDecimal renda) {
		this.renda = renda;
	}
	
	
	

}
