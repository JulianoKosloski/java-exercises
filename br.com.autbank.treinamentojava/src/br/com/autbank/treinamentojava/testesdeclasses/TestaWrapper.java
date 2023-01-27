package br.com.autbank.treinamentojava.testesdeclasses;

public class TestaWrapper {

	public static void main(String[] args) {
		
		int i = 10;

		String dez = Integer.valueOf(i).toString();
		System.out.println("String from int: " + dez);
		
		Float fl = Float.valueOf(dez);
		System.out.println("Float from String: " + fl.toString());
		
		Double dbl = Double.valueOf(fl);
		System.out.println("Double from Float: " + dbl.toString());
		
		double dblP = dbl.doubleValue();
		System.out.println("double from Double: " + dblP);
		
		String strDouble = Double.valueOf(dblP).toString();
		System.out.println("String from double: " + strDouble);
		
		int dezz = Double.valueOf(strDouble).intValue();
		System.out.println("Int from String: " + dezz);
	}

}
