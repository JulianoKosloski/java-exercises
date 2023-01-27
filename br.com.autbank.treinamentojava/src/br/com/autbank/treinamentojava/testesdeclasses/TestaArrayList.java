package br.com.autbank.treinamentojava.testesdeclasses;

import java.util.ArrayList;

public class TestaArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> myArr = new ArrayList<String>();
		
		myArr.add("Girafa");
		myArr.add("Elefante");
		myArr.add("Ocapi");
		myArr.add("Ornitorrinco");
		myArr.add("Hipopotamo");
		myArr.add(5, "Galinha");
		
		String msg = myArr.isEmpty() ? "Array está vazio." : "Array não está vazio";
		System.out.println(msg);
		
		myArr.remove(5);
		myArr.remove(4);
		
		myArr.set(2,  "Leão");
		
		String[] zoo = (String[])myArr.toArray(new String[myArr.size()]);
		
		for (String animal : zoo) {
			System.out.println(animal);
		}

	}

}
