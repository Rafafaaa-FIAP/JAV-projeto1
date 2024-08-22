package espr;

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
	
	void imprimirFormatado() {
		System.out.printf("O aluno %s do documento %s tem o tamanho %1.2f e cor %s%n", nome, documento, tamanho, cor);
	}
	
	void jogar() {
		
		System.out.println("O aluno " + nome + " está jogando");
	}
	
	Mesa constroirMesa() {
		
		Mesa mesa = new Mesa();
		mesa.comprimento = 10;
		mesa.largura = 5;
				
		return mesa;
	}
}
