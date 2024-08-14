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
	
	void jogar() {
		
		System.out.println("O aluno " + nome + " está jogando");
		
	}
}
