package espr;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Aluno {
	String cor;
	float tamanho;
	String nome;
	String documento;

	void estudar() {
		System.out.println("O aluno " + nome + " do documento " + documento + " tem o tamanho " + tamanho + " e cor " + cor);
	}
	
	void conversar() {
		System.out.println("O aluno " + nome + " está conversando");
	}
	
	void jogar() {
		System.out.println("O aluno " + nome + " está jogando");
	}
	
	void imprimirFormatado() {
		System.out.printf("O aluno %s do documento %s tem o tamanho %1.2f e cor %s%n", nome, documento, tamanho, cor);
	}
	
	void conversarGeraArquivo() {
		try {
			PrintWriter arquivo = new PrintWriter(new FileWriter("aluno.txt"));
			arquivo.println("Arquivo gerado! O aluno " + nome + " está conversando");
			arquivo.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	String retornarAlunoFormatado() {
		// String formatada com o pacote String utils
		String retorno = String.format("O aluno %s do documento %s tem o tamanho %1.2f e cor %s. %n ", nome, documento, tamanho, cor);
		
		// Deixa em caixa alta
		retorno = retorno.toUpperCase();
		
		// Deixa em caixa baixa
		retorno = retorno.toLowerCase();
		
		// Faz um recorte da string
		//retorno = retorno.substring(retorno.indexOf("evando"), retorno.indexOf("tem")-1);
		
		return retorno;
	}
	
	Mesa construirMesa() {
		Mesa mesa = new Mesa();
		mesa.comprimento = 10;
		mesa.largura = 5;
				
		return mesa;
	}
}
