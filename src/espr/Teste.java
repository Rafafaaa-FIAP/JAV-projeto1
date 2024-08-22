package espr;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		System.out.println("Iniciando por aqui...");
		
		Aluno aluno = new Aluno();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		aluno.nome = entrada.next();
		
		System.out.print("Digite o tamanho do aluno: ");
		aluno.tamanho = entrada.nextFloat();
		
		System.out.print("Digite a cor do aluno: ");
		aluno.cor = entrada.next();
		
		System.out.print("Digite a documento do aluno: ");
		aluno.documento = entrada.next();
		
		aluno.estudar();
		aluno.jogar();
		aluno.conversar();
		
		Mesa mesa = aluno.constroirMesa();
		System.out.print("Digite a cor da mesa: ");
		mesa.cor = entrada.next();
		
		aluno.imprimirFormatado();
		
		entrada.close();
		
		
		System.out.println("Finalizando");
	}
}
