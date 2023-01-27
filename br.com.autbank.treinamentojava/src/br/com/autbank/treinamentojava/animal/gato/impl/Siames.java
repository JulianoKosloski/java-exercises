package br.com.autbank.treinamentojava.animal.gato.impl;

import br.com.autbank.treinamentojava.animal.cachorro.dt.Animal;

public class Siames extends Gato implements Animal {
	String nome;
	String cor;
	int idade;
	
	public Siames() {
		
	}
	
	public Siames(String nome, String cor, int idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}
	
	@Override
	public void comer() {
		System.out.println(this.nome + " está comendo!");
	}

	@Override
	public void dormir() {
		System.out.println(this.nome + " está dormindo!");
		
	}

	@Override
	void ronronar() {
		System.out.println(this.nome + " está ronronando! Rrrrrrr");
	}

	@Override
	void miar() {
		System.out.println("Miaaaaau!");
	}
	
}
