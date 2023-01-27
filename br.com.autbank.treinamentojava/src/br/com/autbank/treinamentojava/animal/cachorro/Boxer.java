package br.com.autbank.treinamentojava.animal.cachorro;

import br.com.autbank.treinamentojava.animal.cachorro.dt.Animal;
import br.com.autbank.treinamentojava.animal.cachorro.dt.FalhaAoCriarCachorroException;

public class Boxer extends Cachorro implements Animal {
	public String nome;
//	private String nome;
//	protected String nome;
//	default String nome;
	public String cor;
	public int idade;
	public String[] vacinas;
	
	public Boxer(String nome, String cor, int idade, String[] vacinas) throws FalhaAoCriarCachorroException  {
		super(nome, cor, idade);
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
		this.vacinas = vacinas;
	}
	
	public Boxer() {
		System.out.println("Dentro do construtor default");
	}
	
	public Boxer(int idade) {
		System.out.println("Dentro do construtor idade");
		this.idade = idade;
	}
	
	public Boxer(String[] vacinas) {
		System.out.println("Dentro do construtor vacinas");
		this.vacinas = vacinas;
	}
	
	public void latir() {
		System.out.println(this.nome + " está latindo! Au au au!");
	}
	
	public void comer() {
		System.out.println(this.nome + " está comendo!");
	}
	
	public void dormir() {
		System.out.println(this.nome + " está dormindo!");
	}
	
	@Override
	public String toString( ) {
		System.out.println("Nome: " + this.nome);
		System.out.println("Cor: " + this.cor);
		System.out.println("Idade: " + this.idade);
		for (String s : this.vacinas) {
			System.out.println("Vacina: " + s);
		}
		
		return this.nome + ", " + this.cor + ", " + this.idade;
	}
	
	@Override
	public boolean equals(Cachorro dog) {
		
		if (this.nome.equals(dog.nome) && this.cor.equals(dog.cor) && this.idade == dog.idade) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public void setNome(String nome) throws Exception {
		if(nome == null || nome == "") {
			throw new Exception("Nome invalido!");
		} else {
			this.nome = nome;
		}
	}
	public void setCor(String cor) throws Exception {
		if (cor == null || cor == "") {
			throw new Exception("Cor invalida!");
		} else {
			this.cor = cor;
		}
	}
	@Override
	public void setIdade(int idade) throws Exception {
		if(idade < 0) {
			throw new Exception("Idade invalida!");
		} else {
			this.idade = idade;
		}	
	}

	public String getNome() {
		return this.nome;
	}

	public String getCor() {
		return this.cor;
	}

	public int getIdade() {
		return this.idade;
	}

	@Override
	public void latir(String s) {
		System.out.println(this.nome + " esta latindo: " + s);
		
	}

	@Override	
	public void latir(String s1, String s2) {
		System.out.println(this.nome + " esta latindo: " + s1);
		System.out.println(this.nome + " esta latindo: " + s2);
	}
	
	public void contar(int i) {
		System.out.println(this.nome + " conta int!");
	}
	
	public void contar(long i) {
		System.out.println(this.nome + " conta long!");
	}
	
	
}