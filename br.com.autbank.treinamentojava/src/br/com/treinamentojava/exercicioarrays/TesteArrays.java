package br.com.treinamentojava.exercicioarrays;

public class TesteArrays {
	
	static void trataArrays(String[] arr) {
		for (String s : arr) {
			if (s != "" && s != null) {
				System.out.println("String " + s + ": " + s.length());
			} else {
				System.out.println("A string nesta posicao eh nula.");
			}
		}
	}
	
	public static void main(String[] args) {
		String[] myArr = {"melancia", "banana", "framboesa", "", null, "Jaca"};
		
		trataArrays(myArr);
		
	}
}
