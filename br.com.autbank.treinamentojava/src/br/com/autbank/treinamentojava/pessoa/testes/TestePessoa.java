package br.com.autbank.treinamentojava.pessoa.testes;

import br.com.autbank.treinamentojava.pessoa.impl.Pessoa;

public class TestePessoa {
	
	public static void main(String[] args) {
		
		Pessoa pessoa1;
		pessoa1 = new Pessoa();
		pessoa1.setNome("Marcos");
		pessoa1.setIdade(27);
		pessoa1.setCpf("1010567");
		
		pessoa1.imprimeFicha();
		
		Pessoa pessoa2;
		pessoa2 = new Pessoa("Josualdo", 37, "10324457804");
		
		pessoa2.imprimeFicha();
		
		String msg;
		
		msg = Pessoa.verificaCpf(pessoa1.getCpf()) ? "CPF correto!" : "CPF deve ter 11 digitos!";
		System.out.println(msg);
		
		msg = Pessoa.verificaCpf(pessoa2.getCpf()) ? "CPF correto!" : "CPF deve ter 11 digitos!";
		System.out.println(msg);
		
		// ultimo slide - Exercicios adicionais
		//numa classe publica, o metodoA seria acessivel apenas dentro de seu pacote, por ser default, o metodo public estaria
		//acessivel para qualquer pacote, o protected para classes filhas e o private apenas dentro da classe
		
		//numa classe default, o metodoA seria acessivel apenas dentro do seu pacote, por ser default, o metodo public seria acessivel
		// também apenas dentro do seu pacote (já que a classe eh default), o metodo protected seria acessivel por classes filhas 
		// dentro do mesmo pacote e o metodo private apenas dentro de sua classe
		
	}
}
