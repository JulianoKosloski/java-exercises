package br.com.autbank.treinamentojava.pessoa.impl;

public class Pessoa {
	String nome;
	int idade;
	String cpf;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int idade, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public static boolean verificaCpf(String cpf) {
		if (cpf.length() == 11) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void imprimeFicha() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("CPF: " + this.cpf);
	}
	
	
}