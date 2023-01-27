package br.com.autbank.treinamentojava.testesdeclasses;

public class TestaStrings {

	public static void main(String[] args) {
		String s = "Teste de strings    ";
		System.out.println(s);
		
		String sRep = s.replace('e', 'a'); //replaces a character
		System.out.println(sRep);
		
		String sSub = s.substring(2,4); //splits the string into a substring
		System.out.println(sSub);
		
		String sLow = s.toLowerCase(); //all to lowercase
		System.out.println(sLow);
		
		String sUp = s.toUpperCase(); //all to uppercase
		System.out.println(sUp);
		
		String sTrim = s.trim(); //clears leading and trailing spaces
		System.out.println(sTrim);
		
		System.out.println(s.charAt(6)); //returns 'd'
		System.out.println("O tamanho da string é: " + s.length());
		
		// o valor de s não se altera se o metodo for chamado na string pois a string é imutavel
		// por isso utilizei novos objetos para armazenar a string alterada
	}

}
