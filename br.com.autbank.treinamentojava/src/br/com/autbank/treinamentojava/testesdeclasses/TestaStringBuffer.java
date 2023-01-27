package br.com.autbank.treinamentojava.testesdeclasses;

public class TestaStringBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Teste");
		sb.append(" de StringBuffer"); //adiciona uma String ao StringBuffer
		System.out.println(sb.toString());
		
		sb.delete(6, 9); //deleta um trecho de caracteres (start,end)
		System.out.println(sb.toString());
		
		sb.insert(5, " de"); //insere uma string na posição informada
		System.out.println(sb.toString());
		
		sb.reverse(); // inverte a String
		System.out.println(sb.toString());
		sb.reverse();
		
		sb.deleteCharAt(-20); // lança uma exception pois esse índice está fora da String
		System.out.println(sb.toString());
	}

}
