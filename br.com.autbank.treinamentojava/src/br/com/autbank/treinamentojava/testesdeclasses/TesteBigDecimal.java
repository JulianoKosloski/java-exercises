package br.com.autbank.treinamentojava.testesdeclasses;

import java.math.BigDecimal;
import br.com.autbank.gen.util.CalculoMat;

public class TesteBigDecimal {

	public static void main(String[] args) {
		
//		BigDecimal myBig = new BigDecimal("0.006");
//		BigDecimal myBig2 = new BigDecimal("0.716");
		
		
		BigDecimal myBig = CalculoMat.getBigDecimal("35054", 2);
		BigDecimal myBig2 = CalculoMat.getBigDecimal("1631", 2);
	
		
		System.out.println(myBig.toString());
		System.out.println(myBig2.toString());
		if (CalculoMat.ehMaior(myBig, myBig2)) {
			System.out.println("O primeiro é maior que o segundo!");
		} else {
			System.out.println("O primeiro não é maior que o segundo.");
		}
		
		if (CalculoMat.ehMenor(myBig, myBig2)) {
			System.out.println("O primeiro é menor que o segundo!");
		} else {
			System.out.println("O primeiro não é menor que o segundo.");
		}

		System.out.println(CalculoMat.multiplica(myBig, myBig2).toString());
		

	}

}
