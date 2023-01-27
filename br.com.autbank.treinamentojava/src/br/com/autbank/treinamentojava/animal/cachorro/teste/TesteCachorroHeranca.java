package br.com.autbank.treinamentojava.animal.cachorro.teste;

import br.com.autbank.treinamentojava.animal.cachorro.Boxer;

public class TesteCachorroHeranca {

	public static void main(String[] args) throws Exception {
		String[] vacinas = {"Antirabia", "Gripe"};
		Boxer dog = new Boxer("Julio", "Branco", 11, vacinas);
		
		dog.dormir();
		dog.comer();
		System.out.println(dog.getCor());
//		dog.setCor("Roxo");
		System.out.println(dog.getCor());

	}

}
