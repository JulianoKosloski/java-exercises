package br.com.autbank.treinamentojava.testes;

import br.com.autbank.treinamentojava.animal.cachorro.Boxer;
import br.com.autbank.treinamentojava.animal.cachorro.Cachorro;
import br.com.autbank.treinamentojava.animal.cachorro.dt.FalhaAoCriarCachorroException;

public class TesteCachorroException {

	public static void main(String[] args) throws Exception {
		
		String[] vacinas = {"Gripe"};
		Boxer dog = new Boxer("Zuko", "Branco", 6, vacinas);
		try {
			dog.setIdade(-5); // execução para se não lidar com a Exception
		} catch (FalhaAoCriarCachorroException e) {
			e.printStackTrace();
			System.out.println("Exception capturada!");
			System.out.println("Insira uma idade valida!");
		} 
		try {
			Boxer newDog = new Boxer("", "", 8, vacinas);
		} catch(FalhaAoCriarCachorroException e) {
			e.printStackTrace();
			System.out.println("Invalid name or color");
		}
		
		// seria possivel adicionar um parametro message à classe FalhaAoCriarCachorroException para mostrar mensagens
		
	}

}
