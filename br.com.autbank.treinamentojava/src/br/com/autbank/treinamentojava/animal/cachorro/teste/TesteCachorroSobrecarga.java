package br.com.autbank.treinamentojava.animal.cachorro.teste;

import br.com.autbank.treinamentojava.animal.cachorro.Boxer;
import br.com.autbank.treinamentojava.animal.cachorro.dt.FalhaAoCriarCachorroException;

public class TesteCachorroSobrecarga {

	public static void main(String[] args) throws FalhaAoCriarCachorroException {
		String[] vacinas = {"Antirabica", "Gripe", "Coronavirus", "Caxumba"};
		
		Boxer myDog = new Boxer("Tobi", "Azul", 8, vacinas);
		
		// sobreescrita na classe Boxer
		myDog.latir();
		myDog.latir("Ow ow ow");
		myDog.latir("of oof", "asda dasdas");

		myDog.contar(1234); //escolhe o metodo int
		myDog.contar(306939L); //escolhe o metodo long
	}

}
