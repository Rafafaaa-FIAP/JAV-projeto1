package espr;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		System.out.println("Iniciando por aqui...");
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		/*Aluno aluno = new Aluno();
		
		System.out.print("Digite o nome do aluno: ");
		aluno.nome = entrada.next();
		
		System.out.print("Digite o tamanho do aluno: ");
		aluno.tamanho = entrada.nextFloat();
		
		System.out.print("Digite a cor do aluno: ");
		aluno.cor = entrada.next();
		
		System.out.print("Digite a documento do aluno: ");
		aluno.documento = entrada.next();
		
		aluno.estudar();
		aluno.conversar();
		aluno.jogar();
		aluno.imprimirFormatado();
		aluno.conversarGeraArquivo();
		
		String retorno = aluno.retornarAlunoFormatado();
		System.out.println(retorno);
		
		Mesa mesa = aluno.construirMesa();
		System.out.print("Digite a cor da mesa: ");
		mesa.cor = entrada.next();*/
		
		
		
		String cadeira = new String("vermelha");
		String cadeira2 = new String("vermelha");
		System.out.println("Comparaçao com equals: " + cadeira.equals(cadeira2));
		System.out.println("Comparaçao com equalsIgnoreCase: " + cadeira.equalsIgnoreCase(cadeira2));
		System.out.println("Comparacao com ==: " + (cadeira == cadeira2));
		
		entrada.close();
		
		System.out.println("Finalizando");
	}
}
