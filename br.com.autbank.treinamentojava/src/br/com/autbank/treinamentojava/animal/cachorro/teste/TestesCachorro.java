package br.com.autbank.treinamentojava.animal.cachorro.teste;

import br.com.autbank.treinamentojava.animal.cachorro.Boxer;

public class TestesCachorro {

	public static void main(String[] args) {
		
		// Exercise 2, 3, 4 (Java Slides 1)
//		Boxer dog = new Boxer;
//		Boxer dog = new Boxer(6);	
		
		Boxer dog = new Boxer(6);
		dog.nome = "Rex";
//		dog.idade = 6;
		dog.cor = "Amarelo";
		
		System.out.println("Nome: " + dog.nome);
		System.out.println("Cor: " + dog.cor);
		System.out.println("Idade: " + dog.idade);
		
		dog.latir();
		dog.comer();
		dog.dormir();
		
		//Exercises 5,6 (Java Slides 1)
		String[] vacinas = {"Antirabica", "Gripe", "Coronavirus", "Caxumba"};
		
		Boxer dog2 = new Boxer(vacinas);
		
		for(String vacina : dog2.vacinas) {
			System.out.println(vacina);
		}
		
		// Exercise 6 (Java Slides 1)
		
		// Para acessar variáveis private ou protected, é necessário estabelecer getters/setters 
		// dentro da classe para permitir o acesso por meio de instâncias da classe 
		
		// variáveis private são acesiveis somente dentro da classe
		// variaveis protected sao acessiveis dentro da classe e por classes filhas (inheritance)
		// variaveis default sao acessiveis dentro do pacote que sao estabelecidas
		// variaveis public sao acessiveis dentro do pacote e por pacotes diferentes
		
	}
}