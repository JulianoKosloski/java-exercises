package br.com.autbank.treinamentojava.testesdeclasses;

import java.util.HashMap;
import java.util.Map;

public class TesteHashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> nomes = new HashMap<String, String>();
		nomes.put("1", "Lara");
		nomes.put("2", "Wesley");
		nomes.put("3", "Fernando");
		nomes.put("4", "Pedro");
		nomes.put("5", "Tiago");
		nomes.put("6", "Juliano");
		
		System.out.println(nomes.get("6"));
		nomes.remove("6");
		
		System.out.println(nomes.toString());
	}

}
