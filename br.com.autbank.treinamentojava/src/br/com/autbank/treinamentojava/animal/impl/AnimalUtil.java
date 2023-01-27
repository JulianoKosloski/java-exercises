package br.com.autbank.treinamentojava.animal.impl;

import br.com.autbank.treinamentojava.animal.cachorro.Boxer;
import br.com.autbank.treinamentojava.animal.cachorro.Cachorro;
import br.com.autbank.treinamentojava.animal.cachorro.dt.Animal;
import br.com.autbank.treinamentojava.animal.gato.impl.Gato;
import br.com.autbank.treinamentojava.animal.gato.impl.Siames;

public class AnimalUtil {
	
	public static void verificaAnimal(Animal a) {
	
		if (a instanceof Cachorro) {
			System.out.println("Esse animal é um cachorro!");
			latir();
		} else if (a instanceof Gato) {
			System.out.println("Esse animal é um gato!");
			miar();
		} else {
			System.out.println("Não conheço esse animal!");
		}
	}
	
	public static void miar() {
		System.out.println("Miaaaau!");
	}
	
	public static void latir() {
		System.out.println("Au au au!");
	}


}
