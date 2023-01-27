package br.com.autbank.treinamentojava.animal.testes;

import br.com.autbank.treinamentojava.animal.cachorro.Boxer;
import br.com.autbank.treinamentojava.animal.cachorro.dt.Animal;
import br.com.autbank.treinamentojava.animal.gato.impl.Siames;
import br.com.autbank.treinamentojava.animal.impl.AnimalUtil;

public class TestePolimorfismo {
	public static void main(String[] args) throws Exception {
		
		Animal a = new Siames();
		
		// todos os metodos definidos na interface animal, na classe Gato e na classe Siames sao acessiveis
		// foi criado um objeto da classe Siames, armazenado em uma referencia da interface Animal
		
		a = new Boxer();
		
		// todos os metodos definidos na interface animal, na classe Cachorro e na classe Boxer podem ser acessados
		// foi criado um objeto da classe Boxer, armazenado em uma referencia da Interface Animal
	
		String[] vacinas = {"Antirabia", "Gripe"};
		Animal dog = new Boxer("Julio", "Branco", 11, vacinas);
		Animal cat = new Siames("Bolinha", "Cinza", 6);
		
		AnimalUtil.verificaAnimal(cat);
		AnimalUtil.verificaAnimal(dog);
	
	
	
	}
}
