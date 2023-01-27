package br.com.autbank.treinamentojava.classesautbank;

import java.io.IOException;

import br.com.autbank.gen.util.Formatador;
import br.com.autbank.gen.util.ManipulaArquivos;
import br.com.autbank.gen.util.ManipulaJavaUtilDate;
import br.com.autbank.gen.util.MaskedInput;
import br.com.autbank.gen.util.Validador;

public class TestesAutbank {

	public static void main(String[] args) throws IOException {
		
		//Criei um arquivo ExercicioFinal.txt na area de trabalho com as informações do exercicio
		
		String nomeExercicio;
		String nomeEmpresa;
		String enderecoEmpresa;
		String cepEmpresa;
		String telefoneEmpresa;
		
		String[] conteudo = ManipulaArquivos.leArquivo("C:/Users/Juliano/Desktop/ExercicioFinal.txt");
		
		nomeExercicio = conteudo[0];
		nomeEmpresa = conteudo[1];
		enderecoEmpresa = conteudo[2];
		cepEmpresa = conteudo[3];
		telefoneEmpresa = conteudo[4];
		
		String cepMasked = MaskedInput.maskInput(cepEmpresa, "AAAAA-AAA");
		System.out.println(cepMasked);
		
		String telefoneFormatado = MaskedInput.maskInput(telefoneEmpresa, "(55 AA) AAAA AAAA");
		System.out.println(telefoneFormatado);
		
		String diaMesAno = ManipulaJavaUtilDate.getInstance("2014/01/07", ManipulaJavaUtilDate.ANO_MES_DIA).imprimeData(ManipulaJavaUtilDate.DIA_MES_ANO);
		System.out.println(diaMesAno);
		
		String meuNome = "Juliano Kosloski";
		String cpf = "10828787905";
		
		String cpfFormatado = Formatador.aplicaMascaraCPF(cpf);
		
		if (Validador.ehCpfValido(cpf)) {
			System.out.println(cpfFormatado);
		}
		
		String dataFormatada = diaMesAno + " - " + ManipulaJavaUtilDate.getInstance(diaMesAno, ManipulaJavaUtilDate.DIA_MES_ANO).imprimePorExtenso(); 
		String aniversario = ManipulaJavaUtilDate.getInstance("27/05/1997", ManipulaJavaUtilDate.DIA_MES_ANO).imprimeData();
		
		String[] resposta = {nomeExercicio, nomeEmpresa, enderecoEmpresa, cepMasked, telefoneFormatado, dataFormatada, meuNome, aniversario, cpfFormatado};
		
		ManipulaArquivos.criaArquivo("C:/Users/Juliano/Desktop/ExercicioResposta.txt", resposta);
		
	}

}
