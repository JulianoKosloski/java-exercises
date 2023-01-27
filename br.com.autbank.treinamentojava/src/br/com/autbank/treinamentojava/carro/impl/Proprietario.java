package br.com.autbank.treinamentojava.carro.impl;

public class Proprietario {
	private String nome;
	private int idade;
	private char sexo;
	private int anoHabilitacao;
	
	public Proprietario(String nome, int idade, char sexo, int ano) {
		
		if (nome == null || nome == "") {
			this.nome = "Nome não informado";
		} else {
			this.nome = nome;
		}
		
		if (idade <= 18 || ano < 1920 || ano > 2014) {
			this.idade = 18;
			this.anoHabilitacao = 1920;
		} else {
			this.idade = idade;
			this.anoHabilitacao = ano;
		}
		
		if (sexo == 'M' || sexo == 'm' || sexo == 'F' || sexo == 'f') {
			this.sexo = sexo;
		} else {
			this.sexo = 'M';
		}
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public void setAnoHabilitacao(int ano) {
		this.anoHabilitacao = ano;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public char getSexo() {
		return this.sexo;
	}
	
	public int getAnoHabilitacao() {
		return this.anoHabilitacao;
	}
}
