package br.com.autbank.treinamentojava.carro.impl;

// Additional exercises (Java Slides 1)

public class Carro {
	protected String nome;
	protected String cor;
	protected int ano;
	protected int potencia;
	protected double km;
	protected Proprietario prop;
//	protected String[] nomeProprietarios;
	protected boolean carroNovo;
	
	private int qtdCriada = 0;
	
	public Carro(String nome, String cor, int ano, int potencia, double km, String[] nomeProp, Proprietario prop, boolean carroNovo) {
		
		if (nome == null || nome == "") {
			this.nome = prop.getNome();
		} else {
			this.nome = nome;
		}
		this.cor = cor;
		this.ano = ano;
		this.potencia = potencia;
		if (carroNovo == true) {
			this.km = 0;
		} else {
			this.km = km;
		}
		
		this.prop = prop;
		this.carroNovo = carroNovo;
		
		qtdCriada++;
	}
	
	public int getPotencia() {
		return this.potencia;
	}
	
	public String getCor( ) {
		return this.cor;
	}
	
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void somaKilometragem(double valor) {
		this.km = this.km + valor;
	}
	
	public void imprimaFicha() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ano: " + this.ano);
		System.out.println("Potencia: " + this.potencia);
		System.out.println("Kilometragem: " + this.km);
//		System.out.println("Proprietarios: " + this.nomeProprietarios[0] + " e " + this.nomeProprietarios[1]);
	}
	
}