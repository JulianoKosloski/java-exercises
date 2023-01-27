package br.com.autbank.treinamentojava.animal.cachorro.teste;

import br.com.autbank.treinamentojava.animal.cachorro.Boxer;

public class TesteCachorroEstruturaRepeticao {
	public static void main (String[] args) throws Exception {
		
		Boxer myDog;
		Boxer yourDog;
		
		String[] listaVacinas = {"Antirabica", "Gripe", "Coronavirus"}; 
		
		myDog = new Boxer("Rex", "Laranja", 5, listaVacinas);
		yourDog = new Boxer("Max", "Preto", 2, listaVacinas);
		
		//percorrer vacinas com while, dowhile e for
		System.out.println("For -----");
		for (String s : myDog.vacinas) {
			System.out.println(s);
		}
		
		System.out.println("While -----");
		int i = 0;
		while (i < yourDog.vacinas.length) { 
			System.out.println(yourDog.vacinas[i]);
			i++;
		}
		
		System.out.println("Do/While -----");
		int j = 0;
		do {
			System.out.println(yourDog.vacinas[j]);
			j++;
		} while (j < myDog.vacinas.length);
		
		myDog.toString();
		yourDog.toString();
		
	}
}
