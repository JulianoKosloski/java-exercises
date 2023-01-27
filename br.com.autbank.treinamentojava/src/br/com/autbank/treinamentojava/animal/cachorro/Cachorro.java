package br.com.autbank.treinamentojava.animal.cachorro;

import br.com.autbank.treinamentojava.animal.cachorro.dt.FalhaAoCriarCachorroException;

public abstract class Cachorro {
	String nome;
	String cor;
	int idade;
	
	protected Cachorro() {
		
	}
	
	protected Cachorro(String nome, String cor, int idade) throws FalhaAoCriarCachorroException {
		if (cor == "" || cor == null) {
			throw new FalhaAoCriarCachorroException();
		} else {
			this.cor = cor;
		}
		if (nome == "" || nome == null) {
			throw new FalhaAoCriarCachorroException();
		} else {
			this.nome = nome;
		}
		this.idade = idade;
	}
	
	//sobrecarga de metodos permite uma classe mais flexivel
	abstract void latir();
	abstract void latir(String s);
	abstract void latir(String s1, String s2);
	
	abstract String getNome();
	abstract String getCor();
	abstract int getIdade();
	
	void setNome(String nome) throws Exception {
		this.nome = nome;
	};
	void setCor(String cor) throws Exception {
		this.cor = cor;
	};
	void setIdade(int idade) throws Exception {
		if(idade < 0) {
			throw new Exception("Idade invalida!");
		} else {
			this.idade = idade;
		}
	}

	public boolean equals(Cachorro dog) {
		// TODO Auto-generated method stub
		return false;
	}


}
